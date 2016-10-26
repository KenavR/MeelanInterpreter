package at.technikum.spko.meelan.parser;

import at.technikum.spko.meelan.antlr.MeelanBaseVisitor;
import at.technikum.spko.meelan.antlr.MeelanParser;
import at.technikum.spko.meelan.antlr.MeelanVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class MeelanVisitorImpl extends MeelanBaseVisitor<Integer> implements MeelanVisitor<Integer> {

    final Map<String, Integer> variables = new HashMap<>();
    final Map<String, FunctionState> functions = new HashMap<>();

    final String[] tokens = {"<", ">", "\\+", "-", "\\*", "/","%","\\(","\\)","=", ";", "print", "\\{", "\\}"};

    public Integer visitStatements(MeelanParser.StatementsContext ctx) {
        Integer lastResult = null;
        for (MeelanParser.StatementContext c : ctx.statement()) {
            lastResult = visit(c);
        }
        return lastResult;
    }

    public Integer visitPrintStmt(MeelanParser.PrintStmtContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println("Output: " + value);
        return value;
    }

    public Integer visitDefineStmt(MeelanParser.DefineStmtContext ctx) {
        String id = ctx.ID().getText();
        Integer value = visit(ctx.val);

        if (value == null) {
            System.err.println("DefineStmt: expr '" + id + "' was null!");
        } else {
            variables.put(id, value);
        }

        return value;
    }

    public Integer visitAssignStmt(MeelanParser.AssignStmtContext ctx) {
        String id = ctx.ID().getText();
        Integer value = visit(ctx.val);

        if (value == null) {
            System.err.println("AssignStmt: expr was null!");
        }
        if (!variables.containsKey(id)) {
            System.err.println("ID - " + id + " - not defined!");
            return null;
        } else {
            variables.put(id, value);
        }

        return value;
    }

    public Integer visitWhileStmt(MeelanParser.WhileStmtContext ctx) {
        Integer lastResult = null;

        while (true) {
            Integer con = visit(ctx.con);

            if (con.equals(0)) return lastResult;

            lastResult = visit(ctx.stmt);
        }
    }

    public Integer visitIfStmt(MeelanParser.IfStmtContext ctx) {

        Integer con = visit(ctx.con);

        if (con == null) {
            System.err.println("IfStmt: condition cannot be null!");
            return null;
        }

        return (con.equals(1))
                ? visit(ctx.stmtIf)
                : visit(ctx.stmtElse);
    }

    public Integer visitFuncdefStmt(MeelanParser.FuncdefStmtContext ctx) {

        String funcName = ctx.funcName.getText();
        MeelanParser.StatementContext statement = ctx.statement();

        if (funcName == null || statement == null) {
            System.err.println("FuncdefStmt: function name or function body was null!");
            return null;
        }

        List<String> argList = new ArrayList<>(Arrays.asList(ctx.idlist().getText().split(",")))
                .stream()
                .map(varName -> funcName + "_" + varName)
                .collect(Collectors.toList());

        argList.forEach(arg -> variables.put(arg, 0));
        functions.put(funcName, new FunctionState(funcName, argList, statement));

        return null;
    }

    public Integer visitBlockStmt(MeelanParser.BlockStmtContext ctx) {
        return visit(ctx.stmt);
    }

    public Integer visitSimpleExpr(MeelanParser.SimpleExprContext ctx) {
        return visit(ctx.val);
    }

    public Integer visitNegStmt(MeelanParser.NegStmtContext ctx) {
        Integer arg = visit(ctx.expr());
        if (arg == null) {
            System.err.println("NegStmt: expr was null");
            return null;
        }
        return -arg;
    }

    public Integer visitInlineStmt(MeelanParser.InlineStmtContext ctx) {
        Integer lastResult = null;
        for (MeelanParser.StatementContext c : ctx.stmts.statement()) {
            lastResult = visit(c);
        }

        return lastResult;
    }

    public Integer visitFunccallStmt(MeelanParser.FunccallStmtContext ctx) {
        String funcName = ctx.funcName.getText();
        List<Integer> evaluatedArgs = ctx.arglist().expr().stream().map(this::visit).collect(Collectors.toList());

        try {
            if (funcName == null || !functions.containsKey(funcName))
                throw new IllegalArgumentException("function '" + funcName + "' is not defined!");

            FunctionState fn = functions.get(funcName);

            if (evaluatedArgs.size() != fn.arguments.size())
                throw new IllegalArgumentException("function '" + funcName + "' required " + fn.arguments.size() + " arguments!");

            IntStream.range(0, fn.arguments.size()).forEach(idx -> variables.put(fn.arguments.get(idx), evaluatedArgs.get(idx)));
            Integer VALUE = visit(fn.statement);
            return VALUE;

        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
            return null;
        }

    }

    public Integer visitOpExpr(MeelanParser.OpExprContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);

        if (left == null || right == null) {
            System.err.println("OpExpr: expr was null!");
            return null;
        }

        switch (ctx.op.getText()) {
            case "<":
                return (left < right) ? 1 : 0;
            case "=<":
            case "<=":
                return (left <= right) ? 1 : 0;
            case "==":
                return (left.equals(right)) ? 1 : 0;
            case "><":
            case "<>":
            case "!=":
                return (!left.equals(right)) ? 1 : 0;
            case ">=":
                return (left >= right) ? 1 : 0;
            case ">":
                return (left > right) ? 1 : 0;

            case "*":
                return left * right;
            case "/":
                return left / right;
            case "%":
                return left % right;

            case "+":
                return left + right;
            case "-":
                return left - right;

            default:
                return null;
        }
    }

    public Integer visitWrapperExpr(MeelanParser.WrapperExprContext ctx) {
        return visit(ctx.e);
    }

    public Integer visitNumExpr(MeelanParser.NumExprContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    public Integer visitIdExpr(MeelanParser.IdExprContext ctx) {
        String id = ctx.ID().getText();
        String scope = getVariableScope(ctx, id);
        if (!scope.equals("global")) id = scope + "_" + id;

        if (!variables.containsKey(id)) {
            System.err.println("IdExpr: unknown symbol: " + id + "!");
            return null;
        }

        return variables.get(id);
    }

    private String getVariableScope(ParserRuleContext ctx, String varName) {
        if (ctx == null) return "global";
        String textNode = ctx.getText();

        if (textNode != null && ctx.getText().contains("funcdef")) {
            String cutString = textNode.substring(textNode.lastIndexOf("funcdef") + 7);
            cutString = cutString.substring(cutString.indexOf("{"), cutString.lastIndexOf("}")+1);

            for(String token : tokens) {
                cutString = cutString.replaceAll(token, " ");
            }
            if (cutString.contains(" " + varName + " ")) {
                return textNode.substring(textNode.lastIndexOf("funcdef") + 7, textNode.indexOf("("));
            }

        }

        return getVariableScope(ctx.getParent(), varName);
    }
}
