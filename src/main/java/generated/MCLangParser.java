// Generated from .\MCLang.g4 by ANTLR 4.13.0
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MCLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, NULL=52, BOOLEAN=53, 
		FLOAT=54, INT=55, STRING=56, IDENTIFIER=57, WS=58;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expr = 2, RULE_variableAssignment = 3, 
		RULE_ifStatement = 4, RULE_whileStatement = 5, RULE_functionDeclarationStatement = 6, 
		RULE_identifierArgument = 7, RULE_functionCall = 8, RULE_returnStatement = 9, 
		RULE_importStatement = 10, RULE_exprArgument = 11, RULE_body = 12, RULE_list = 13, 
		RULE_dict = 14, RULE_number = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expr", "variableAssignment", "ifStatement", 
			"whileStatement", "functionDeclarationStatement", "identifierArgument", 
			"functionCall", "returnStatement", "importStatement", "exprArgument", 
			"body", "list", "dict", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'//'", "'('", "')'", "'**'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'<'", "'<='", "'>'", "'>='", "'!='", "'=='", "'&'", "'^'", "'|'", 
			"'&&'", "'||'", "'!'", "':='", "'?'", "':'", "'='", "'**='", "'*='", 
			"'/='", "'//='", "'%='", "'+='", "'++'", "'-='", "'--'", "'&='", "'^='", 
			"'|='", "'if'", "'else'", "'while'", "'function '", "'->'", "'=>'", "','", 
			"'return '", "'import '", "'{'", "'}'", "'['", "']'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NULL", "BOOLEAN", "FLOAT", "INT", "STRING", 
			"IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "MCLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MCLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144333441133969412L) != 0)) {
				{
				{
				setState(32);
				statement(0);
				}
				}
				setState(37);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public FunctionDeclarationStatementContext functionDeclarationStatement() {
			return getRuleContext(FunctionDeclarationStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(39);
				variableAssignment();
				setState(40);
				match(T__0);
				}
				break;
			case 2:
				{
				setState(42);
				functionCall();
				setState(43);
				match(T__0);
				}
				break;
			case 3:
				{
				setState(45);
				ifStatement();
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(46);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(49);
				whileStatement();
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(50);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(53);
				functionDeclarationStatement();
				}
				break;
			case 6:
				{
				setState(54);
				returnStatement();
				setState(55);
				match(T__0);
				}
				break;
			case 7:
				{
				setState(57);
				importStatement();
				setState(58);
				match(T__0);
				}
				break;
			case 8:
				{
				setState(60);
				match(T__1);
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(61);
						matchWildcard();
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(69);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(70);
					match(T__1);
					setState(74);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(71);
							matchWildcard();
							}
							} 
						}
						setState(76);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ModuloExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModuloExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterModuloExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitModuloExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitModuloExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExpressionContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualToExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualToExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterEqualToExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitEqualToExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitEqualToExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplyExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitGreaterThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitGreaterThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryOperatorExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryOperatorExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterTernaryOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitTernaryOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitTernaryOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExpressionContext extends ExprContext {
		public TerminalNode STRING() { return getToken(MCLangParser.STRING, 0); }
		public StringExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WalrusOperatorExpressionContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WalrusOperatorExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterWalrusOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitWalrusOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitWalrusOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOrEqualToExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanOrEqualToExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterLessThanOrEqualToExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitLessThanOrEqualToExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitLessThanOrEqualToExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullExpressionContext extends ExprContext {
		public TerminalNode NULL() { return getToken(MCLangParser.NULL, 0); }
		public NullExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseAndExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BitwiseAndExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBitwiseAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBitwiseAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitLessThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitLessThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExpressionContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanNotExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BooleanNotExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBooleanNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBooleanNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBooleanNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseXorExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BitwiseXorExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBitwiseXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBitwiseXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBitwiseXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanOrExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BooleanOrExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBooleanOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBooleanOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBooleanOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(MCLangParser.BOOLEAN, 0); }
		public BooleanExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictExpressionContext extends ExprContext {
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public DictExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterDictExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitDictExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitDictExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivideExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryOperatorExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterUnaryOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitUnaryOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitUnaryOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseOrExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BitwiseOrExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBitwiseOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBitwiseOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubtractExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterSubtractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitSubtractExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitSubtractExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOrEqualToExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanOrEqualToExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterGreaterThanOrEqualToExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitGreaterThanOrEqualToExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitGreaterThanOrEqualToExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentiationExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExponentiationExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterExponentiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitExponentiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitExponentiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloorDivideExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FloorDivideExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterFloorDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitFloorDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitFloorDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualToExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NotEqualToExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterNotEqualToExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitNotEqualToExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitNotEqualToExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAndExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BooleanAndExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBooleanAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBooleanAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBooleanAndExpression(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(T__2);
				setState(88);
				expr(0);
				setState(89);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new BooleanNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T__21);
				setState(92);
				expr(8);
				}
				break;
			case 7:
				{
				_localctx = new WalrusOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(IDENTIFIER);
				setState(94);
				match(T__22);
				setState(95);
				expr(7);
				}
				break;
			case 8:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(T__9);
				setState(97);
				expr(5);
				}
				break;
			case 9:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				list();
				}
				break;
			case 10:
				{
				_localctx = new DictExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				dict();
				}
				break;
			case 11:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				functionCall();
				}
				break;
			case 12:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				number();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentiationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(105);
						match(T__4);
						setState(106);
						expr(27);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(108);
						match(T__5);
						setState(109);
						expr(26);
						}
						break;
					case 3:
						{
						_localctx = new DivideExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(111);
						match(T__6);
						setState(112);
						expr(25);
						}
						break;
					case 4:
						{
						_localctx = new FloorDivideExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(114);
						match(T__1);
						setState(115);
						expr(24);
						}
						break;
					case 5:
						{
						_localctx = new ModuloExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(117);
						match(T__7);
						setState(118);
						expr(23);
						}
						break;
					case 6:
						{
						_localctx = new AddExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(120);
						match(T__8);
						setState(121);
						expr(22);
						}
						break;
					case 7:
						{
						_localctx = new SubtractExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(123);
						match(T__9);
						setState(124);
						expr(21);
						}
						break;
					case 8:
						{
						_localctx = new LessThanExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(126);
						match(T__10);
						setState(127);
						expr(20);
						}
						break;
					case 9:
						{
						_localctx = new LessThanOrEqualToExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(129);
						match(T__11);
						setState(130);
						expr(19);
						}
						break;
					case 10:
						{
						_localctx = new GreaterThanExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(132);
						match(T__12);
						setState(133);
						expr(18);
						}
						break;
					case 11:
						{
						_localctx = new GreaterThanOrEqualToExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(135);
						match(T__13);
						setState(136);
						expr(17);
						}
						break;
					case 12:
						{
						_localctx = new NotEqualToExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(138);
						match(T__14);
						setState(139);
						expr(16);
						}
						break;
					case 13:
						{
						_localctx = new EqualToExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(141);
						match(T__15);
						setState(142);
						expr(15);
						}
						break;
					case 14:
						{
						_localctx = new BitwiseAndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(144);
						match(T__16);
						setState(145);
						expr(14);
						}
						break;
					case 15:
						{
						_localctx = new BitwiseXorExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(147);
						match(T__17);
						setState(148);
						expr(13);
						}
						break;
					case 16:
						{
						_localctx = new BitwiseOrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(150);
						match(T__18);
						setState(151);
						expr(12);
						}
						break;
					case 17:
						{
						_localctx = new BooleanAndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(153);
						match(T__19);
						setState(154);
						expr(11);
						}
						break;
					case 18:
						{
						_localctx = new BooleanOrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(156);
						match(T__20);
						setState(157);
						expr(10);
						}
						break;
					case 19:
						{
						_localctx = new TernaryOperatorExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(159);
						match(T__23);
						setState(160);
						expr(0);
						setState(161);
						match(T__24);
						setState(162);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
	 
		public VariableAssignmentContext() { }
		public void copyFrom(VariableAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterAddVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitAddVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitAddVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloorDivideVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FloorDivideVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterFloorDivideVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitFloorDivideVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitFloorDivideVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DivideVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterDivideVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitDivideVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitDivideVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public IncrementVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterIncrementVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitIncrementVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitIncrementVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecrementVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public DecrementVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterDecrementVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitDecrementVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitDecrementVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MultiplyVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterMultiplyVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitMultiplyVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitMultiplyVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseAndVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BitwiseAndVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBitwiseAndVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBitwiseAndVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBitwiseAndVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseOrVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BitwiseOrVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBitwiseOrVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBitwiseOrVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBitwiseOrVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuloVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ModuloVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterModuloVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitModuloVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitModuloVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularVariableAssignmentContext extends VariableAssignmentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MCLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MCLangParser.IDENTIFIER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RegularVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterRegularVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitRegularVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitRegularVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubtractVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterSubtractVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitSubtractVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitSubtractVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseXorVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BitwiseXorVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBitwiseXorVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBitwiseXorVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBitwiseXorVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentiationVariableAssignmentContext extends VariableAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExponentiationVariableAssignmentContext(VariableAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterExponentiationVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitExponentiationVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitExponentiationVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableAssignment);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new RegularVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(169);
					match(IDENTIFIER);
					}
					break;
				}
				setState(172);
				match(IDENTIFIER);
				setState(173);
				match(T__25);
				setState(174);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ExponentiationVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(IDENTIFIER);
				setState(176);
				match(T__26);
				setState(177);
				expr(0);
				}
				break;
			case 3:
				_localctx = new MultiplyVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(IDENTIFIER);
				setState(179);
				match(T__27);
				setState(180);
				expr(0);
				}
				break;
			case 4:
				_localctx = new DivideVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(IDENTIFIER);
				setState(182);
				match(T__28);
				setState(183);
				expr(0);
				}
				break;
			case 5:
				_localctx = new FloorDivideVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(IDENTIFIER);
				setState(185);
				match(T__29);
				setState(186);
				expr(0);
				}
				break;
			case 6:
				_localctx = new ModuloVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				match(IDENTIFIER);
				setState(188);
				match(T__30);
				setState(189);
				expr(0);
				}
				break;
			case 7:
				_localctx = new AddVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				match(IDENTIFIER);
				setState(191);
				match(T__31);
				setState(192);
				expr(0);
				}
				break;
			case 8:
				_localctx = new IncrementVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
				match(IDENTIFIER);
				setState(194);
				match(T__32);
				}
				break;
			case 9:
				_localctx = new SubtractVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(195);
				match(IDENTIFIER);
				setState(196);
				match(T__33);
				setState(197);
				expr(0);
				}
				break;
			case 10:
				_localctx = new DecrementVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(198);
				match(IDENTIFIER);
				setState(199);
				match(T__34);
				}
				break;
			case 11:
				_localctx = new BitwiseAndVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(200);
				match(IDENTIFIER);
				setState(201);
				match(T__35);
				setState(202);
				expr(0);
				}
				break;
			case 12:
				_localctx = new BitwiseXorVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(203);
				match(IDENTIFIER);
				setState(204);
				match(T__36);
				setState(205);
				expr(0);
				}
				break;
			case 13:
				_localctx = new BitwiseOrVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(206);
				match(IDENTIFIER);
				setState(207);
				match(T__37);
				setState(208);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__38);
			setState(212);
			match(T__2);
			setState(213);
			expr(0);
			setState(214);
			match(T__3);
			setState(215);
			body();
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(216);
				match(T__39);
				setState(217);
				body();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__40);
			setState(221);
			match(T__2);
			setState(222);
			expr(0);
			setState(223);
			match(T__3);
			setState(224);
			body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationStatementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MCLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MCLangParser.IDENTIFIER, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<IdentifierArgumentContext> identifierArgument() {
			return getRuleContexts(IdentifierArgumentContext.class);
		}
		public IdentifierArgumentContext identifierArgument(int i) {
			return getRuleContext(IdentifierArgumentContext.class,i);
		}
		public FunctionDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterFunctionDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitFunctionDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitFunctionDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationStatementContext functionDeclarationStatement() throws RecognitionException {
		FunctionDeclarationStatementContext _localctx = new FunctionDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__41);
			setState(227);
			match(IDENTIFIER);
			setState(228);
			match(T__2);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(229);
				identifierArgument();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(T__3);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(236);
				match(T__42);
				setState(237);
				match(IDENTIFIER);
				}
			}

			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				{
				setState(240);
				body();
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(241);
					match(T__0);
					}
					break;
				}
				}
				break;
			case T__43:
				{
				setState(244);
				match(T__43);
				setState(245);
				expr(0);
				setState(246);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierArgumentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MCLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MCLangParser.IDENTIFIER, i);
		}
		public IdentifierArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterIdentifierArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitIdentifierArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitIdentifierArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierArgumentContext identifierArgument() throws RecognitionException {
		IdentifierArgumentContext _localctx = new IdentifierArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifierArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(250);
				match(IDENTIFIER);
				}
				break;
			}
			setState(253);
			match(IDENTIFIER);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(254);
				match(T__44);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public List<ExprArgumentContext> exprArgument() {
			return getRuleContexts(ExprArgumentContext.class);
		}
		public ExprArgumentContext exprArgument(int i) {
			return getRuleContext(ExprArgumentContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(IDENTIFIER);
			setState(258);
			match(T__2);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 285134151412089864L) != 0)) {
				{
				{
				setState(259);
				exprArgument();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__45);
			setState(268);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MCLangParser.STRING, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__46);
			setState(271);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprArgumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterExprArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitExprArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitExprArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprArgumentContext exprArgument() throws RecognitionException {
		ExprArgumentContext _localctx = new ExprArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			expr(0);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(274);
				match(T__44);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__47);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144333441133969412L) != 0)) {
				{
				{
				setState(278);
				statement(0);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(T__48);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__49);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 285134151412089864L) != 0)) {
				{
				{
				setState(287);
				expr(0);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(288);
					match(T__44);
					}
				}

				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(T__50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DictContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MCLangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MCLangParser.STRING, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__47);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(299);
				match(STRING);
				setState(300);
				match(T__24);
				setState(301);
				expr(0);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(302);
					match(T__44);
					}
				}

				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(T__48);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MCLangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MCLangParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(312);
				match(T__9);
				}
			}

			setState(315);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		case 1:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 26);
		case 2:
			return precpred(_ctx, 25);
		case 3:
			return precpred(_ctx, 24);
		case 4:
			return precpred(_ctx, 23);
		case 5:
			return precpred(_ctx, 22);
		case 6:
			return precpred(_ctx, 21);
		case 7:
			return precpred(_ctx, 20);
		case 8:
			return precpred(_ctx, 19);
		case 9:
			return precpred(_ctx, 18);
		case 10:
			return precpred(_ctx, 17);
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 14);
		case 14:
			return precpred(_ctx, 13);
		case 15:
			return precpred(_ctx, 12);
		case 16:
			return precpred(_ctx, 11);
		case 17:
			return precpred(_ctx, 10);
		case 18:
			return precpred(_ctx, 9);
		case 19:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u013e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00014\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"?\b\u0001\n\u0001\f\u0001B\t\u0001\u0003\u0001D\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001I\b\u0001\n\u0001\f\u0001L\t\u0001\u0005"+
		"\u0001N\b\u0001\n\u0001\f\u0001Q\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002g\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u00a5\b\u0002\n\u0002\f\u0002\u00a8\t\u0002"+
		"\u0001\u0003\u0003\u0003\u00ab\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d2\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00db\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00e7\b\u0006\n\u0006\f\u0006\u00ea\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ef\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00f3\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00f9\b\u0006\u0001\u0007\u0003\u0007\u00fc\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0100\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0105\b\b\n\b\f\b\u0108\t\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u0114"+
		"\b\u000b\u0001\f\u0001\f\u0005\f\u0118\b\f\n\f\f\f\u011b\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0003\r\u0122\b\r\u0005\r\u0124\b\r\n\r\f\r"+
		"\u0127\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0130\b\u000e\u0005\u000e\u0132\b\u000e\n\u000e"+
		"\f\u000e\u0135\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f"+
		"\u013a\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0002@J\u0002\u0002"+
		"\u0004\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e\u0000\u0001\u0001\u000067\u0174\u0000#\u0001"+
		"\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004f\u0001\u0000\u0000"+
		"\u0000\u0006\u00d1\u0001\u0000\u0000\u0000\b\u00d3\u0001\u0000\u0000\u0000"+
		"\n\u00dc\u0001\u0000\u0000\u0000\f\u00e2\u0001\u0000\u0000\u0000\u000e"+
		"\u00fb\u0001\u0000\u0000\u0000\u0010\u0101\u0001\u0000\u0000\u0000\u0012"+
		"\u010b\u0001\u0000\u0000\u0000\u0014\u010e\u0001\u0000\u0000\u0000\u0016"+
		"\u0111\u0001\u0000\u0000\u0000\u0018\u0115\u0001\u0000\u0000\u0000\u001a"+
		"\u011e\u0001\u0000\u0000\u0000\u001c\u012a\u0001\u0000\u0000\u0000\u001e"+
		"\u0139\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$\u0001\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000&\'\u0006\u0001\uffff\uffff\u0000\'(\u0003\u0006\u0003\u0000()\u0005"+
		"\u0001\u0000\u0000)D\u0001\u0000\u0000\u0000*+\u0003\u0010\b\u0000+,\u0005"+
		"\u0001\u0000\u0000,D\u0001\u0000\u0000\u0000-/\u0003\b\u0004\u0000.0\u0005"+
		"\u0001\u0000\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0D\u0001\u0000\u0000\u000013\u0003\n\u0005\u000024\u0005\u0001\u0000\u0000"+
		"32\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004D\u0001\u0000\u0000"+
		"\u00005D\u0003\f\u0006\u000067\u0003\u0012\t\u000078\u0005\u0001\u0000"+
		"\u00008D\u0001\u0000\u0000\u00009:\u0003\u0014\n\u0000:;\u0005\u0001\u0000"+
		"\u0000;D\u0001\u0000\u0000\u0000<@\u0005\u0002\u0000\u0000=?\t\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000C&\u0001\u0000\u0000\u0000C*\u0001\u0000\u0000\u0000"+
		"C-\u0001\u0000\u0000\u0000C1\u0001\u0000\u0000\u0000C5\u0001\u0000\u0000"+
		"\u0000C6\u0001\u0000\u0000\u0000C9\u0001\u0000\u0000\u0000C<\u0001\u0000"+
		"\u0000\u0000DO\u0001\u0000\u0000\u0000EF\n\u0002\u0000\u0000FJ\u0005\u0002"+
		"\u0000\u0000GI\t\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000"+
		"NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000P\u0003\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0006"+
		"\u0002\uffff\uffff\u0000Sg\u00054\u0000\u0000Tg\u00058\u0000\u0000Ug\u0005"+
		"5\u0000\u0000Vg\u00059\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0003\u0004"+
		"\u0002\u0000YZ\u0005\u0004\u0000\u0000Zg\u0001\u0000\u0000\u0000[\\\u0005"+
		"\u0016\u0000\u0000\\g\u0003\u0004\u0002\b]^\u00059\u0000\u0000^_\u0005"+
		"\u0017\u0000\u0000_g\u0003\u0004\u0002\u0007`a\u0005\n\u0000\u0000ag\u0003"+
		"\u0004\u0002\u0005bg\u0003\u001a\r\u0000cg\u0003\u001c\u000e\u0000dg\u0003"+
		"\u0010\b\u0000eg\u0003\u001e\u000f\u0000fR\u0001\u0000\u0000\u0000fT\u0001"+
		"\u0000\u0000\u0000fU\u0001\u0000\u0000\u0000fV\u0001\u0000\u0000\u0000"+
		"fW\u0001\u0000\u0000\u0000f[\u0001\u0000\u0000\u0000f]\u0001\u0000\u0000"+
		"\u0000f`\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000fc\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u00a6"+
		"\u0001\u0000\u0000\u0000hi\n\u001a\u0000\u0000ij\u0005\u0005\u0000\u0000"+
		"j\u00a5\u0003\u0004\u0002\u001bkl\n\u0019\u0000\u0000lm\u0005\u0006\u0000"+
		"\u0000m\u00a5\u0003\u0004\u0002\u001ano\n\u0018\u0000\u0000op\u0005\u0007"+
		"\u0000\u0000p\u00a5\u0003\u0004\u0002\u0019qr\n\u0017\u0000\u0000rs\u0005"+
		"\u0002\u0000\u0000s\u00a5\u0003\u0004\u0002\u0018tu\n\u0016\u0000\u0000"+
		"uv\u0005\b\u0000\u0000v\u00a5\u0003\u0004\u0002\u0017wx\n\u0015\u0000"+
		"\u0000xy\u0005\t\u0000\u0000y\u00a5\u0003\u0004\u0002\u0016z{\n\u0014"+
		"\u0000\u0000{|\u0005\n\u0000\u0000|\u00a5\u0003\u0004\u0002\u0015}~\n"+
		"\u0013\u0000\u0000~\u007f\u0005\u000b\u0000\u0000\u007f\u00a5\u0003\u0004"+
		"\u0002\u0014\u0080\u0081\n\u0012\u0000\u0000\u0081\u0082\u0005\f\u0000"+
		"\u0000\u0082\u00a5\u0003\u0004\u0002\u0013\u0083\u0084\n\u0011\u0000\u0000"+
		"\u0084\u0085\u0005\r\u0000\u0000\u0085\u00a5\u0003\u0004\u0002\u0012\u0086"+
		"\u0087\n\u0010\u0000\u0000\u0087\u0088\u0005\u000e\u0000\u0000\u0088\u00a5"+
		"\u0003\u0004\u0002\u0011\u0089\u008a\n\u000f\u0000\u0000\u008a\u008b\u0005"+
		"\u000f\u0000\u0000\u008b\u00a5\u0003\u0004\u0002\u0010\u008c\u008d\n\u000e"+
		"\u0000\u0000\u008d\u008e\u0005\u0010\u0000\u0000\u008e\u00a5\u0003\u0004"+
		"\u0002\u000f\u008f\u0090\n\r\u0000\u0000\u0090\u0091\u0005\u0011\u0000"+
		"\u0000\u0091\u00a5\u0003\u0004\u0002\u000e\u0092\u0093\n\f\u0000\u0000"+
		"\u0093\u0094\u0005\u0012\u0000\u0000\u0094\u00a5\u0003\u0004\u0002\r\u0095"+
		"\u0096\n\u000b\u0000\u0000\u0096\u0097\u0005\u0013\u0000\u0000\u0097\u00a5"+
		"\u0003\u0004\u0002\f\u0098\u0099\n\n\u0000\u0000\u0099\u009a\u0005\u0014"+
		"\u0000\u0000\u009a\u00a5\u0003\u0004\u0002\u000b\u009b\u009c\n\t\u0000"+
		"\u0000\u009c\u009d\u0005\u0015\u0000\u0000\u009d\u00a5\u0003\u0004\u0002"+
		"\n\u009e\u009f\n\u0006\u0000\u0000\u009f\u00a0\u0005\u0018\u0000\u0000"+
		"\u00a0\u00a1\u0003\u0004\u0002\u0000\u00a1\u00a2\u0005\u0019\u0000\u0000"+
		"\u00a2\u00a3\u0003\u0004\u0002\u0007\u00a3\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a4h\u0001\u0000\u0000\u0000\u00a4k\u0001\u0000\u0000\u0000\u00a4n"+
		"\u0001\u0000\u0000\u0000\u00a4q\u0001\u0000\u0000\u0000\u00a4t\u0001\u0000"+
		"\u0000\u0000\u00a4w\u0001\u0000\u0000\u0000\u00a4z\u0001\u0000\u0000\u0000"+
		"\u00a4}\u0001\u0000\u0000\u0000\u00a4\u0080\u0001\u0000\u0000\u0000\u00a4"+
		"\u0083\u0001\u0000\u0000\u0000\u00a4\u0086\u0001\u0000\u0000\u0000\u00a4"+
		"\u0089\u0001\u0000\u0000\u0000\u00a4\u008c\u0001\u0000\u0000\u0000\u00a4"+
		"\u008f\u0001\u0000\u0000\u0000\u00a4\u0092\u0001\u0000\u0000\u0000\u00a4"+
		"\u0095\u0001\u0000\u0000\u0000\u00a4\u0098\u0001\u0000\u0000\u0000\u00a4"+
		"\u009b\u0001\u0000\u0000\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u0005\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ab\u00059\u0000\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u00059\u0000\u0000\u00ad\u00ae\u0005"+
		"\u001a\u0000\u0000\u00ae\u00d2\u0003\u0004\u0002\u0000\u00af\u00b0\u0005"+
		"9\u0000\u0000\u00b0\u00b1\u0005\u001b\u0000\u0000\u00b1\u00d2\u0003\u0004"+
		"\u0002\u0000\u00b2\u00b3\u00059\u0000\u0000\u00b3\u00b4\u0005\u001c\u0000"+
		"\u0000\u00b4\u00d2\u0003\u0004\u0002\u0000\u00b5\u00b6\u00059\u0000\u0000"+
		"\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00d2\u0003\u0004\u0002\u0000"+
		"\u00b8\u00b9\u00059\u0000\u0000\u00b9\u00ba\u0005\u001e\u0000\u0000\u00ba"+
		"\u00d2\u0003\u0004\u0002\u0000\u00bb\u00bc\u00059\u0000\u0000\u00bc\u00bd"+
		"\u0005\u001f\u0000\u0000\u00bd\u00d2\u0003\u0004\u0002\u0000\u00be\u00bf"+
		"\u00059\u0000\u0000\u00bf\u00c0\u0005 \u0000\u0000\u00c0\u00d2\u0003\u0004"+
		"\u0002\u0000\u00c1\u00c2\u00059\u0000\u0000\u00c2\u00d2\u0005!\u0000\u0000"+
		"\u00c3\u00c4\u00059\u0000\u0000\u00c4\u00c5\u0005\"\u0000\u0000\u00c5"+
		"\u00d2\u0003\u0004\u0002\u0000\u00c6\u00c7\u00059\u0000\u0000\u00c7\u00d2"+
		"\u0005#\u0000\u0000\u00c8\u00c9\u00059\u0000\u0000\u00c9\u00ca\u0005$"+
		"\u0000\u0000\u00ca\u00d2\u0003\u0004\u0002\u0000\u00cb\u00cc\u00059\u0000"+
		"\u0000\u00cc\u00cd\u0005%\u0000\u0000\u00cd\u00d2\u0003\u0004\u0002\u0000"+
		"\u00ce\u00cf\u00059\u0000\u0000\u00cf\u00d0\u0005&\u0000\u0000\u00d0\u00d2"+
		"\u0003\u0004\u0002\u0000\u00d1\u00aa\u0001\u0000\u0000\u0000\u00d1\u00af"+
		"\u0001\u0000\u0000\u0000\u00d1\u00b2\u0001\u0000\u0000\u0000\u00d1\u00b5"+
		"\u0001\u0000\u0000\u0000\u00d1\u00b8\u0001\u0000\u0000\u0000\u00d1\u00bb"+
		"\u0001\u0000\u0000\u0000\u00d1\u00be\u0001\u0000\u0000\u0000\u00d1\u00c1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00c3\u0001\u0000\u0000\u0000\u00d1\u00c6"+
		"\u0001\u0000\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2\u0007"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\'\u0000\u0000\u00d4\u00d5\u0005"+
		"\u0003\u0000\u0000\u00d5\u00d6\u0003\u0004\u0002\u0000\u00d6\u00d7\u0005"+
		"\u0004\u0000\u0000\u00d7\u00da\u0003\u0018\f\u0000\u00d8\u00d9\u0005("+
		"\u0000\u0000\u00d9\u00db\u0003\u0018\f\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\t\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0005)\u0000\u0000\u00dd\u00de\u0005\u0003\u0000\u0000\u00de"+
		"\u00df\u0003\u0004\u0002\u0000\u00df\u00e0\u0005\u0004\u0000\u0000\u00e0"+
		"\u00e1\u0003\u0018\f\u0000\u00e1\u000b\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0005*\u0000\u0000\u00e3\u00e4\u00059\u0000\u0000\u00e4\u00e8\u0005\u0003"+
		"\u0000\u0000\u00e5\u00e7\u0003\u000e\u0007\u0000\u00e6\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee\u0005\u0004"+
		"\u0000\u0000\u00ec\u00ed\u0005+\u0000\u0000\u00ed\u00ef\u00059\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f8\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003\u0018\f\u0000\u00f1"+
		"\u00f3\u0005\u0001\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f9\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005,\u0000\u0000\u00f5\u00f6\u0003\u0004\u0002\u0000\u00f6\u00f7"+
		"\u0005\u0001\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f9\r\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u00059\u0000\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00ff\u00059\u0000\u0000\u00fe\u0100\u0005-\u0000\u0000"+
		"\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u000f\u0001\u0000\u0000\u0000\u0101\u0102\u00059\u0000\u0000\u0102"+
		"\u0106\u0005\u0003\u0000\u0000\u0103\u0105\u0003\u0016\u000b\u0000\u0104"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"\u0109\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005\u0004\u0000\u0000\u010a\u0011\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005.\u0000\u0000\u010c\u010d\u0003\u0004\u0002\u0000\u010d\u0013"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0005/\u0000\u0000\u010f\u0110\u0005"+
		"8\u0000\u0000\u0110\u0015\u0001\u0000\u0000\u0000\u0111\u0113\u0003\u0004"+
		"\u0002\u0000\u0112\u0114\u0005-\u0000\u0000\u0113\u0112\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0017\u0001\u0000\u0000"+
		"\u0000\u0115\u0119\u00050\u0000\u0000\u0116\u0118\u0003\u0002\u0001\u0000"+
		"\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u00051\u0000\u0000\u011d\u0019\u0001\u0000\u0000\u0000\u011e"+
		"\u0125\u00052\u0000\u0000\u011f\u0121\u0003\u0004\u0002\u0000\u0120\u0122"+
		"\u0005-\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u011f\u0001"+
		"\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"3\u0000\u0000\u0129\u001b\u0001\u0000\u0000\u0000\u012a\u0133\u00050\u0000"+
		"\u0000\u012b\u012c\u00058\u0000\u0000\u012c\u012d\u0005\u0019\u0000\u0000"+
		"\u012d\u012f\u0003\u0004\u0002\u0000\u012e\u0130\u0005-\u0000\u0000\u012f"+
		"\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0132"+
		"\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0137\u00051\u0000\u0000\u0137\u001d"+
		"\u0001\u0000\u0000\u0000\u0138\u013a\u0005\n\u0000\u0000\u0139\u0138\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0007\u0000\u0000\u0000\u013c\u001f\u0001"+
		"\u0000\u0000\u0000\u001b#/3@CJOf\u00a4\u00a6\u00aa\u00d1\u00da\u00e8\u00ee"+
		"\u00f2\u00f8\u00fb\u00ff\u0106\u0113\u0119\u0121\u0125\u012f\u0133\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}