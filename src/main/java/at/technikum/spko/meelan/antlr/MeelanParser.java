// Generated from C:/Users/Rene/Desktop/projects/MeelanInterpreter/src/main/resources\Meelan.g4 by ANTLR 4.5.3
package at.technikum.spko.meelan.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeelanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, ID=30, INT=31, WS=32;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_expr = 2, RULE_idlist = 3, 
		RULE_arglist = 4;
	public static final String[] ruleNames = {
		"statements", "statement", "expr", "idlist", "arglist"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'print'", "'var'", "'='", "'while'", "'do'", "'if'", "'then'", 
		"'else'", "'func'", "'('", "')'", "'{'", "'}'", "'<'", "'=<'", "'<='", 
		"'=='", "'><'", "'<>'", "'!='", "'>='", "'>'", "'*'", "'/'", "'%'", "'+'", 
		"'-'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ID", "INT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Meelan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MeelanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__27) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(10);
				statement();
				setState(12);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(11);
					match(T__0);
					}
				}

				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStmtContext extends StatementContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineStmtContext extends StatementContext {
		public ExprContext val;
		public TerminalNode ID() { return getToken(MeelanParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefineStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterDefineStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitDefineStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitDefineStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleExprContext extends StatementContext {
		public ExprContext val;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimpleExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends StatementContext {
		public ExprContext con;
		public StatementContext stmt;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends StatementContext {
		public ExprContext con;
		public StatementContext stmtIf;
		public StatementContext stmtElse;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends StatementContext {
		public StatementsContext stmt;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStmtContext extends StatementContext {
		public ExprContext val;
		public TerminalNode ID() { return getToken(MeelanParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncStmtContext extends StatementContext {
		public Token funcName;
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ID() { return getToken(MeelanParser.ID, 0); }
		public FuncStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterFuncStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitFuncStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitFuncStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__1);
				setState(20);
				((PrintStmtContext)_localctx).e = expr(0);
				}
				break;
			case 2:
				_localctx = new DefineStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__2);
				setState(22);
				match(ID);
				setState(25);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(23);
					match(T__3);
					setState(24);
					((DefineStmtContext)_localctx).val = expr(0);
					}
				}

				}
				break;
			case 3:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(ID);
				setState(28);
				match(T__3);
				setState(29);
				((AssignStmtContext)_localctx).val = expr(0);
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				match(T__4);
				setState(31);
				((WhileStmtContext)_localctx).con = expr(0);
				setState(32);
				match(T__5);
				setState(33);
				((WhileStmtContext)_localctx).stmt = statement();
				}
				break;
			case 5:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				match(T__6);
				setState(36);
				((IfStmtContext)_localctx).con = expr(0);
				setState(37);
				match(T__7);
				setState(38);
				((IfStmtContext)_localctx).stmtIf = statement();
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(39);
					match(T__8);
					setState(40);
					((IfStmtContext)_localctx).stmtElse = statement();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new FuncStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				match(T__9);
				setState(44);
				((FuncStmtContext)_localctx).funcName = match(ID);
				setState(45);
				match(T__10);
				setState(46);
				idlist();
				setState(47);
				match(T__11);
				setState(48);
				statement();
				}
				break;
			case 7:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				match(T__12);
				setState(51);
				((BlockStmtContext)_localctx).stmt = statements();
				setState(52);
				match(T__13);
				}
				break;
			case 8:
				_localctx = new SimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				((SimpleExprContext)_localctx).val = expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegStmtContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterNegStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitNegStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitNegStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineStmtContext extends ExprContext {
		public StatementsContext stmts;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public InlineStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterInlineStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitInlineStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitInlineStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunccallStmtContext extends ExprContext {
		public Token funcName;
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode ID() { return getToken(MeelanParser.ID, 0); }
		public FunccallStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterFunccallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitFunccallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitFunccallStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WrapperExprContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WrapperExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterWrapperExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitWrapperExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitWrapperExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(MeelanParser.INT, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(MeelanParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new NegStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				match(T__27);
				setState(59);
				((NegStmtContext)_localctx).e = expr(6);
				}
				break;
			case 2:
				{
				_localctx = new WrapperExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(T__10);
				setState(61);
				((WrapperExprContext)_localctx).e = expr(0);
				setState(62);
				match(T__11);
				}
				break;
			case 3:
				{
				_localctx = new FunccallStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				((FunccallStmtContext)_localctx).funcName = match(ID);
				setState(65);
				match(T__10);
				setState(66);
				arglist();
				setState(67);
				match(T__11);
				}
				break;
			case 4:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new InlineStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(T__12);
				setState(72);
				((InlineStmtContext)_localctx).stmts = statements();
				setState(73);
				match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(78);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(79);
						((OpExprContext)_localctx).right = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(81);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(82);
						((OpExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(84);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(85);
						((OpExprContext)_localctx).right = expr(8);
						}
						break;
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdlistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MeelanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MeelanParser.ID, i);
		}
		public IdlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterIdlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitIdlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitIdlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdlistContext idlist() throws RecognitionException {
		IdlistContext _localctx = new IdlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_idlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(92);
				match(T__28);
				setState(93);
				match(ID);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArglistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeelanListener ) ((MeelanListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeelanVisitor ) return ((MeelanVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			expr(0);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(100);
				match(T__28);
				setState(101);
				expr(0);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4Y\n\4\f\4\16\4\\\13\4\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\6\3\6"+
		"\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\2\3\6\7\2\4\6\b\n\2\5\3\2\21\31\3\2\32"+
		"\34\3\2\35\36}\2\22\3\2\2\2\49\3\2\2\2\6M\3\2\2\2\b]\3\2\2\2\ne\3\2\2"+
		"\2\f\16\5\4\3\2\r\17\7\3\2\2\16\r\3\2\2\2\16\17\3\2\2\2\17\21\3\2\2\2"+
		"\20\f\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3\2\2\2\24"+
		"\22\3\2\2\2\25\26\7\4\2\2\26:\5\6\4\2\27\30\7\5\2\2\30\33\7 \2\2\31\32"+
		"\7\6\2\2\32\34\5\6\4\2\33\31\3\2\2\2\33\34\3\2\2\2\34:\3\2\2\2\35\36\7"+
		" \2\2\36\37\7\6\2\2\37:\5\6\4\2 !\7\7\2\2!\"\5\6\4\2\"#\7\b\2\2#$\5\4"+
		"\3\2$:\3\2\2\2%&\7\t\2\2&\'\5\6\4\2\'(\7\n\2\2(+\5\4\3\2)*\7\13\2\2*,"+
		"\5\4\3\2+)\3\2\2\2+,\3\2\2\2,:\3\2\2\2-.\7\f\2\2./\7 \2\2/\60\7\r\2\2"+
		"\60\61\5\b\5\2\61\62\7\16\2\2\62\63\5\4\3\2\63:\3\2\2\2\64\65\7\17\2\2"+
		"\65\66\5\2\2\2\66\67\7\20\2\2\67:\3\2\2\28:\5\6\4\29\25\3\2\2\29\27\3"+
		"\2\2\29\35\3\2\2\29 \3\2\2\29%\3\2\2\29-\3\2\2\29\64\3\2\2\298\3\2\2\2"+
		":\5\3\2\2\2;<\b\4\1\2<=\7\36\2\2=N\5\6\4\b>?\7\r\2\2?@\5\6\4\2@A\7\16"+
		"\2\2AN\3\2\2\2BC\7 \2\2CD\7\r\2\2DE\5\n\6\2EF\7\16\2\2FN\3\2\2\2GN\7 "+
		"\2\2HN\7!\2\2IJ\7\17\2\2JK\5\2\2\2KL\7\20\2\2LN\3\2\2\2M;\3\2\2\2M>\3"+
		"\2\2\2MB\3\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2\2NZ\3\2\2\2OP\f\13\2\2PQ"+
		"\t\2\2\2QY\5\6\4\fRS\f\n\2\2ST\t\3\2\2TY\5\6\4\13UV\f\t\2\2VW\t\4\2\2"+
		"WY\5\6\4\nXO\3\2\2\2XR\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[\7\3\2\2\2\\Z\3\2\2\2]b\7 \2\2^_\7\37\2\2_a\7 \2\2`^\3\2\2\2ad\3\2"+
		"\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2db\3\2\2\2ej\5\6\4\2fg\7\37\2\2gi\5"+
		"\6\4\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\13\3\2\2\2lj\3\2\2\2\f"+
		"\16\22\33+9MXZbj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}