// Generated from D:/projects/FH-M/MeelanInterpreter/src/main/resources\Meelan.g4 by ANTLR 4.5.3
package at.technikum.spko.meelan.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MeelanParser}.
 */
public interface MeelanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MeelanParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MeelanParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeelanParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MeelanParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(MeelanParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(MeelanParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defineStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDefineStmt(MeelanParser.DefineStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defineStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDefineStmt(MeelanParser.DefineStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(MeelanParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(MeelanParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(MeelanParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(MeelanParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MeelanParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MeelanParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observableStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterObservableStmt(MeelanParser.ObservableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observableStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitObservableStmt(MeelanParser.ObservableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observerStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterObserverStmt(MeelanParser.ObserverStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observerStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitObserverStmt(MeelanParser.ObserverStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncStmt(MeelanParser.FuncStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncStmt(MeelanParser.FuncStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(MeelanParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(MeelanParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(MeelanParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(MeelanParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negStmt}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegStmt(MeelanParser.NegStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negStmt}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegStmt(MeelanParser.NegStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineStmt}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInlineStmt(MeelanParser.InlineStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineStmt}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInlineStmt(MeelanParser.InlineStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funccallStmt}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunccallStmt(MeelanParser.FunccallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funccallStmt}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunccallStmt(MeelanParser.FunccallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(MeelanParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(MeelanParser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wrapperExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWrapperExpr(MeelanParser.WrapperExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wrapperExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWrapperExpr(MeelanParser.WrapperExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(MeelanParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(MeelanParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(MeelanParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(MeelanParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeelanParser#idlist}.
	 * @param ctx the parse tree
	 */
	void enterIdlist(MeelanParser.IdlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeelanParser#idlist}.
	 * @param ctx the parse tree
	 */
	void exitIdlist(MeelanParser.IdlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeelanParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(MeelanParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeelanParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(MeelanParser.ArglistContext ctx);
}