// Generated from D:/projects/FH-M/MeelanInterpreter/src/main/resources\Meelan.g4 by ANTLR 4.5.3
package at.technikum.spko.meelan.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MeelanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MeelanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MeelanParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MeelanParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(MeelanParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineStmt(MeelanParser.DefineStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(MeelanParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MeelanParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(MeelanParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code observableStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservableStmt(MeelanParser.ObservableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code observerStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObserverStmt(MeelanParser.ObserverStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncStmt(MeelanParser.FuncStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(MeelanParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link MeelanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(MeelanParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negStmt}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegStmt(MeelanParser.NegStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineStmt}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineStmt(MeelanParser.InlineStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funccallStmt}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccallStmt(MeelanParser.FunccallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(MeelanParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wrapperExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapperExpr(MeelanParser.WrapperExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(MeelanParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MeelanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(MeelanParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeelanParser#idlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdlist(MeelanParser.IdlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeelanParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(MeelanParser.ArglistContext ctx);
}