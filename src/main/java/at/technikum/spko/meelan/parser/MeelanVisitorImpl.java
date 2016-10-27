package at.technikum.spko.meelan.parser;

import at.technikum.spko.meelan.antlr.MeelanBaseVisitor;
import at.technikum.spko.meelan.antlr.MeelanParser;
import at.technikum.spko.meelan.antlr.MeelanVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class MeelanVisitorImpl extends MeelanBaseVisitor<Integer> implements MeelanVisitor<Integer> {

    private MeelanVisitorState state;

    public MeelanVisitorImpl() {
        this.state = new MeelanVisitorState();
    }

    final String[] tokens = {"<", ">", "\\+", "-", "\\*", "/", "%", "\\(", "\\)", "=", ";", "print", "\\{", "\\}"};

    public void resetState() {
        this.state = new MeelanVisitorState();
    }

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
            state.variables.put(id, value);
        }

        return value;
    }

    public Integer visitAssignStmt(MeelanParser.AssignStmtContext ctx) {
        String id = ctx.ID().getText();
        Integer value = visit(ctx.val);

        if (value == null) {
            System.err.println("AssignStmt: expr was null!");
        }
        if (!state.variables.containsKey(id)) {
            System.err.println("ID - " + id + " - not defined!");
            return null;
        } else {
            state.variables.put(id, value);
            List<String> observableNames = getObservableNames(id);
            observableNames.forEach(name -> state.observers.get(name).observers.forEach(this::visit));
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

    @Override
    public Integer visitObservableStmt(MeelanParser.ObservableStmtContext ctx) {
        String obsName = ctx.name.getText();
        String observedVar = ctx.var.getText();

        try {
            if (obsName == null || obsName.length() <= 0)
                throw new IllegalArgumentException("ObservableStmt: Observablename can not be null!");
            if (observedVar == null || observedVar.length() <= 0)
                throw new IllegalArgumentException("ObservableStmt: Observed variable can not be null!");
            if (!state.variables.containsKey(observedVar))
                throw new IllegalArgumentException("ObservableStmt: Variable '" + observedVar + "' does not exist!");
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
            return null;
        }

        state.observers.put(obsName, new ObserverListener(observedVar, 0, new ArrayList<>()));

        return null;
    }

    @Override
    public Integer visitObserverStmt(MeelanParser.ObserverStmtContext ctx) {
        String observable = ctx.forObs.getText();
        MeelanParser.StatementContext statementContext = ctx.stmt;

        try {
            if (observable == null)
                throw new IllegalArgumentException("ObserverStmt: Observable name can not be null!");
            if (!state.observers.containsKey(observable))
                throw new IllegalArgumentException("ObserverStmt: Observable does not exist!");
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
            return null;
        }

        state.observers.get(observable).observers.add(statementContext);

        return null;
    }

    public Integer visitFuncStmt(MeelanParser.FuncStmtContext ctx) {

        String funcName = ctx.funcName.getText();
        MeelanParser.StatementContext statement = ctx.statement();

        if (funcName == null || statement == null) {
            System.err.println("FuncStmt: function name or function body was null!");
            return null;
        }

        List<String> argList = new ArrayList<>(Arrays.asList(ctx.idlist().getText().split(",")))
                .stream()
                .map(varName -> funcName + "_" + varName)
                .collect(Collectors.toList());

        argList.forEach(arg -> state.variables.put(arg, 0));
        state.functions.put(funcName, new FunctionState(funcName, argList, statement));

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
            if (funcName == null || !state.functions.containsKey(funcName))
                throw new IllegalArgumentException("function '" + funcName + "' is not defined!");

            FunctionState fn = state.functions.get(funcName);

            if (evaluatedArgs.size() != fn.arguments.size())
                throw new IllegalArgumentException("function '" + funcName + "' required " + fn.arguments.size() + " arguments!");

            IntStream.range(0, fn.arguments.size()).forEach(idx -> state.variables.put(fn.arguments.get(idx), evaluatedArgs.get(idx)));
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
        final String id = ctx.ID().getText();
        List<String> scopes = (List) getVariableScope(ctx, id, new LinkedList<>());

        String scopeVar = scopes
                .stream()
                .map(scopeName -> {
                    return (!scopeName.equals("global"))
                            ? scopeName + "_" + id
                            : id;
                })
                .filter(varName -> state.variables.containsKey(varName))
                .findFirst()
                .get();

        if (!state.variables.containsKey(scopeVar)) {
            System.err.println("IdExpr: unknown symbol: " + id + "!");
            return null;
        }

        return state.variables.get(scopeVar);
    }

    private List<String> getVariableScope(ParserRuleContext ctx, String varName, List<String> scope) {
        if(ctx == null) {
            scope.add("global");
            return scope;
        }

        String textNode = ctx.getText();

        if(!textNode.contains("func")) return getVariableScope(ctx.getParent(), varName, scope);

        while(textNode.contains("func")) {
            int firstFunc = textNode.indexOf("func")+4;

            String funcName = textNode.substring(
                    firstFunc,
                    firstFunc + textNode.substring(textNode.indexOf("func")+4).indexOf("(")
            );
            if(!scope.contains(funcName))
                scope.add(funcName);
            textNode = textNode.substring(textNode.indexOf("func")+4);
        }


        return getVariableScope(ctx.getParent(), varName, scope);
    }


    private List<String> getObservableNames(String varName) {
        return state.observers
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().varName.equals(varName))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
