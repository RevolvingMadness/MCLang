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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		NUMBER=60, NULL=61, BOOLEAN=62, FLOAT=63, INT=64, STRING=65, IDENTIFIER=66, 
		WS=67;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expr = 2, RULE_variableAssignment = 3, 
		RULE_ifStatement = 4, RULE_whileStatement = 5, RULE_functionDeclarationStatement = 6, 
		RULE_variableFunctionDeclaration = 7, RULE_classDeclarationStatement = 8, 
		RULE_classConstructorStatement = 9, RULE_classInit = 10, RULE_propertyClassMemberAccess = 11, 
		RULE_identifierArgument = 12, RULE_functionCall = 13, RULE_returnStatement = 14, 
		RULE_importStatement = 15, RULE_importFromStatement = 16, RULE_exprArgument = 17, 
		RULE_body = 18, RULE_list = 19, RULE_dict = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expr", "variableAssignment", "ifStatement", 
			"whileStatement", "functionDeclarationStatement", "variableFunctionDeclaration", 
			"classDeclarationStatement", "classConstructorStatement", "classInit", 
			"propertyClassMemberAccess", "identifierArgument", "functionCall", "returnStatement", 
			"importStatement", "importFromStatement", "exprArgument", "body", "list", 
			"dict"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'//'", "'('", "')'", "':='", "'?'", "':'", "'-'", "'**'", 
			"'*'", "'/'", "'%'", "'+'", "'<'", "'<='", "'>'", "'>='", "'!='", "'=='", 
			"'&'", "'^'", "'|'", "'&&'", "'||'", "'!'", "'='", "'**='", "'*='", "'/='", 
			"'//='", "'%='", "'+='", "'++'", "'-='", "'--'", "'&='", "'^='", "'|='", 
			"'if'", "'else'", "'while'", "'function '", "'->'", "'=>'", "'class '", 
			"'new '", "'.'", "','", "'return '", "'import'", "'as '", "'import '", 
			"'builtin'", "' from'", "' from '", "'{'", "'}'", "'['", "']'", null, 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUMBER", "NULL", "BOOLEAN", "FLOAT", "INT", "STRING", "IDENTIFIER", 
			"WS"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6234780685303812L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(42);
				statement(0);
				}
				}
				setState(47);
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
		public ClassDeclarationStatementContext classDeclarationStatement() {
			return getRuleContext(ClassDeclarationStatementContext.class,0);
		}
		public ClassConstructorStatementContext classConstructorStatement() {
			return getRuleContext(ClassConstructorStatementContext.class,0);
		}
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportFromStatementContext importFromStatement() {
			return getRuleContext(ImportFromStatementContext.class,0);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(49);
				variableAssignment();
				setState(50);
				match(T__0);
				}
				break;
			case 2:
				{
				setState(52);
				functionCall();
				setState(53);
				match(T__0);
				}
				break;
			case 3:
				{
				setState(55);
				ifStatement();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(56);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(59);
				whileStatement();
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(60);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(63);
				functionDeclarationStatement();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(64);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(67);
				classDeclarationStatement();
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(68);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(71);
				classConstructorStatement();
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(72);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(75);
				propertyClassMemberAccess();
				setState(76);
				match(T__0);
				}
				break;
			case 9:
				{
				setState(78);
				returnStatement();
				setState(79);
				match(T__0);
				}
				break;
			case 10:
				{
				setState(81);
				importStatement();
				setState(82);
				match(T__0);
				}
				break;
			case 11:
				{
				setState(84);
				importFromStatement();
				setState(85);
				match(T__0);
				}
				break;
			case 12:
				{
				setState(87);
				match(T__1);
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(88);
						matchWildcard();
						}
						} 
					}
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(96);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(97);
					match(T__1);
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(98);
							matchWildcard();
							}
							} 
						}
						setState(103);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					}
					} 
				}
				setState(108);
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
		public TerminalNode NUMBER() { return getToken(MCLangParser.NUMBER, 0); }
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
	public static class FunctionDeclarationExpressionContext extends ExprContext {
		public VariableFunctionDeclarationContext variableFunctionDeclaration() {
			return getRuleContext(VariableFunctionDeclarationContext.class,0);
		}
		public FunctionDeclarationExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterFunctionDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitFunctionDeclarationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitFunctionDeclarationExpression(this);
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
	public static class ClassInitExpressionContext extends ExprContext {
		public ClassInitContext classInit() {
			return getRuleContext(ClassInitContext.class,0);
		}
		public ClassInitExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterClassInitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitClassInitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitClassInitExpression(this);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				propertyClassMemberAccess();
				}
				break;
			case 6:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(T__2);
				setState(116);
				expr(0);
				setState(117);
				match(T__3);
				}
				break;
			case 7:
				{
				_localctx = new WalrusOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				propertyClassMemberAccess();
				setState(120);
				match(T__4);
				setState(121);
				expr(27);
				}
				break;
			case 8:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__7);
				setState(124);
				expr(25);
				}
				break;
			case 9:
				{
				_localctx = new BooleanNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(T__24);
				setState(126);
				expr(6);
				}
				break;
			case 10:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				list();
				}
				break;
			case 11:
				{
				_localctx = new DictExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				dict();
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				functionCall();
				}
				break;
			case 13:
				{
				_localctx = new ClassInitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				classInit();
				}
				break;
			case 14:
				{
				_localctx = new FunctionDeclarationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				variableFunctionDeclaration();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new TernaryOperatorExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(135);
						match(T__5);
						setState(136);
						expr(0);
						setState(137);
						match(T__6);
						setState(138);
						expr(27);
						}
						break;
					case 2:
						{
						_localctx = new ExponentiationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(141);
						match(T__8);
						setState(142);
						expr(25);
						}
						break;
					case 3:
						{
						_localctx = new MultiplyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(144);
						match(T__9);
						setState(145);
						expr(24);
						}
						break;
					case 4:
						{
						_localctx = new DivideExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(147);
						match(T__10);
						setState(148);
						expr(23);
						}
						break;
					case 5:
						{
						_localctx = new FloorDivideExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(150);
						match(T__1);
						setState(151);
						expr(22);
						}
						break;
					case 6:
						{
						_localctx = new ModuloExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(153);
						match(T__11);
						setState(154);
						expr(21);
						}
						break;
					case 7:
						{
						_localctx = new AddExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(156);
						match(T__12);
						setState(157);
						expr(20);
						}
						break;
					case 8:
						{
						_localctx = new SubtractExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(159);
						match(T__7);
						setState(160);
						expr(19);
						}
						break;
					case 9:
						{
						_localctx = new LessThanExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(162);
						match(T__13);
						setState(163);
						expr(18);
						}
						break;
					case 10:
						{
						_localctx = new LessThanOrEqualToExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(165);
						match(T__14);
						setState(166);
						expr(17);
						}
						break;
					case 11:
						{
						_localctx = new GreaterThanExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(168);
						match(T__15);
						setState(169);
						expr(16);
						}
						break;
					case 12:
						{
						_localctx = new GreaterThanOrEqualToExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(171);
						match(T__16);
						setState(172);
						expr(15);
						}
						break;
					case 13:
						{
						_localctx = new NotEqualToExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(174);
						match(T__17);
						setState(175);
						expr(14);
						}
						break;
					case 14:
						{
						_localctx = new EqualToExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(177);
						match(T__18);
						setState(178);
						expr(13);
						}
						break;
					case 15:
						{
						_localctx = new BitwiseAndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(180);
						match(T__19);
						setState(181);
						expr(12);
						}
						break;
					case 16:
						{
						_localctx = new BitwiseXorExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(183);
						match(T__20);
						setState(184);
						expr(11);
						}
						break;
					case 17:
						{
						_localctx = new BitwiseOrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(186);
						match(T__21);
						setState(187);
						expr(10);
						}
						break;
					case 18:
						{
						_localctx = new BooleanAndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(189);
						match(T__22);
						setState(190);
						expr(9);
						}
						break;
					case 19:
						{
						_localctx = new BooleanOrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(192);
						match(T__23);
						setState(193);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new RegularVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(199);
					match(IDENTIFIER);
					}
					break;
				}
				setState(202);
				propertyClassMemberAccess();
				setState(203);
				match(T__25);
				setState(204);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ExponentiationVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				propertyClassMemberAccess();
				setState(207);
				match(T__26);
				setState(208);
				expr(0);
				}
				break;
			case 3:
				_localctx = new MultiplyVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				propertyClassMemberAccess();
				setState(211);
				match(T__27);
				setState(212);
				expr(0);
				}
				break;
			case 4:
				_localctx = new DivideVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				propertyClassMemberAccess();
				setState(215);
				match(T__28);
				setState(216);
				expr(0);
				}
				break;
			case 5:
				_localctx = new FloorDivideVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				propertyClassMemberAccess();
				setState(219);
				match(T__29);
				setState(220);
				expr(0);
				}
				break;
			case 6:
				_localctx = new ModuloVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				propertyClassMemberAccess();
				setState(223);
				match(T__30);
				setState(224);
				expr(0);
				}
				break;
			case 7:
				_localctx = new AddVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				propertyClassMemberAccess();
				setState(227);
				match(T__31);
				setState(228);
				expr(0);
				}
				break;
			case 8:
				_localctx = new IncrementVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(230);
				propertyClassMemberAccess();
				setState(231);
				match(T__32);
				}
				break;
			case 9:
				_localctx = new SubtractVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(233);
				propertyClassMemberAccess();
				setState(234);
				match(T__33);
				setState(235);
				expr(0);
				}
				break;
			case 10:
				_localctx = new DecrementVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(237);
				propertyClassMemberAccess();
				setState(238);
				match(T__34);
				}
				break;
			case 11:
				_localctx = new BitwiseAndVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(240);
				propertyClassMemberAccess();
				setState(241);
				match(T__35);
				setState(242);
				expr(0);
				}
				break;
			case 12:
				_localctx = new BitwiseXorVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(244);
				propertyClassMemberAccess();
				setState(245);
				match(T__36);
				setState(246);
				expr(0);
				}
				break;
			case 13:
				_localctx = new BitwiseOrVariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(248);
				propertyClassMemberAccess();
				setState(249);
				match(T__37);
				setState(250);
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
			setState(254);
			match(T__38);
			setState(255);
			match(T__2);
			setState(256);
			expr(0);
			setState(257);
			match(T__3);
			setState(258);
			body();
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(259);
				match(T__39);
				setState(260);
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
			setState(263);
			match(T__40);
			setState(264);
			match(T__2);
			setState(265);
			expr(0);
			setState(266);
			match(T__3);
			setState(267);
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
			setState(269);
			match(T__41);
			setState(270);
			match(IDENTIFIER);
			setState(271);
			match(T__2);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(272);
				identifierArgument();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(T__3);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(279);
				match(T__42);
				setState(280);
				match(IDENTIFIER);
				}
			}

			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				{
				setState(283);
				body();
				}
				break;
			case T__43:
				{
				setState(284);
				match(T__43);
				setState(285);
				expr(0);
				setState(286);
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
	public static class VariableFunctionDeclarationContext extends ParserRuleContext {
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
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public VariableFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterVariableFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitVariableFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitVariableFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableFunctionDeclarationContext variableFunctionDeclaration() throws RecognitionException {
		VariableFunctionDeclarationContext _localctx = new VariableFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__2);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(291);
				identifierArgument();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(T__3);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(298);
				match(T__42);
				setState(299);
				match(IDENTIFIER);
				}
			}

			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				{
				setState(302);
				body();
				}
				break;
			case T__43:
				{
				setState(303);
				match(T__43);
				setState(304);
				expr(0);
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
	public static class ClassDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ClassDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterClassDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitClassDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitClassDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationStatementContext classDeclarationStatement() throws RecognitionException {
		ClassDeclarationStatementContext _localctx = new ClassDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__44);
			setState(308);
			match(IDENTIFIER);
			setState(309);
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
	public static class ClassConstructorStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<IdentifierArgumentContext> identifierArgument() {
			return getRuleContexts(IdentifierArgumentContext.class);
		}
		public IdentifierArgumentContext identifierArgument(int i) {
			return getRuleContext(IdentifierArgumentContext.class,i);
		}
		public ClassConstructorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterClassConstructorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitClassConstructorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitClassConstructorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstructorStatementContext classConstructorStatement() throws RecognitionException {
		ClassConstructorStatementContext _localctx = new ClassConstructorStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classConstructorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IDENTIFIER);
			setState(312);
			match(T__2);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(313);
				identifierArgument();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(T__3);
			setState(320);
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
	public static class ClassInitContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public List<ExprArgumentContext> exprArgument() {
			return getRuleContexts(ExprArgumentContext.class);
		}
		public ExprArgumentContext exprArgument(int i) {
			return getRuleContext(ExprArgumentContext.class,i);
		}
		public ClassInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterClassInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitClassInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitClassInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInitContext classInit() throws RecognitionException {
		ClassInitContext _localctx = new ClassInitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__45);
			setState(323);
			match(IDENTIFIER);
			setState(324);
			match(T__2);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -3557834909525475295L) != 0)) {
				{
				{
				setState(325);
				exprArgument();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
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
	public static class PropertyClassMemberAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
		public PropertyClassMemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyClassMemberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterPropertyClassMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitPropertyClassMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitPropertyClassMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyClassMemberAccessContext propertyClassMemberAccess() throws RecognitionException {
		PropertyClassMemberAccessContext _localctx = new PropertyClassMemberAccessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propertyClassMemberAccess);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(IDENTIFIER);
				setState(335);
				match(T__46);
				setState(336);
				propertyClassMemberAccess();
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
		enterRule(_localctx, 24, RULE_identifierArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(339);
				match(IDENTIFIER);
				}
				break;
			}
			setState(342);
			match(IDENTIFIER);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(343);
				match(T__47);
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
		public PropertyClassMemberAccessContext propertyClassMemberAccess() {
			return getRuleContext(PropertyClassMemberAccessContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			propertyClassMemberAccess();
			setState(347);
			match(T__2);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -3557834909525475295L) != 0)) {
				{
				{
				setState(348);
				exprArgument();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
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
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__48);
			setState(357);
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
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	 
		public ImportStatementContext() { }
		public void copyFrom(ImportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BuiltinImportStatementContext extends ImportStatementContext {
		public TerminalNode STRING() { return getToken(MCLangParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public BuiltinImportStatementContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBuiltinImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBuiltinImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBuiltinImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularImportStatementContext extends ImportStatementContext {
		public TerminalNode STRING() { return getToken(MCLangParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MCLangParser.IDENTIFIER, 0); }
		public RegularImportStatementContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterRegularImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitRegularImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitRegularImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_importStatement);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				_localctx = new RegularImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(T__49);
				setState(360);
				match(STRING);
				setState(361);
				match(T__50);
				setState(362);
				match(IDENTIFIER);
				}
				break;
			case T__51:
				_localctx = new BuiltinImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(T__51);
				setState(364);
				match(T__52);
				setState(365);
				match(STRING);
				setState(366);
				match(T__50);
				setState(367);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ImportFromStatementContext extends ParserRuleContext {
		public ImportFromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromStatement; }
	 
		public ImportFromStatementContext() { }
		public void copyFrom(ImportFromStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularImportFromStatementContext extends ImportFromStatementContext {
		public TerminalNode STRING() { return getToken(MCLangParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MCLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MCLangParser.IDENTIFIER, i);
		}
		public RegularImportFromStatementContext(ImportFromStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterRegularImportFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitRegularImportFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitRegularImportFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BuiltinImportFromStatementContext extends ImportFromStatementContext {
		public TerminalNode STRING() { return getToken(MCLangParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MCLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MCLangParser.IDENTIFIER, i);
		}
		public BuiltinImportFromStatementContext(ImportFromStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).enterBuiltinImportFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MCLangListener ) ((MCLangListener)listener).exitBuiltinImportFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCLangVisitor ) return ((MCLangVisitor<? extends T>)visitor).visitBuiltinImportFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromStatementContext importFromStatement() throws RecognitionException {
		ImportFromStatementContext _localctx = new ImportFromStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_importFromStatement);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new RegularImportFromStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(T__51);
				setState(381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__53:
				case IDENTIFIER:
					{
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(371);
						match(IDENTIFIER);
						setState(373);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__47) {
							{
							setState(372);
							match(T__47);
							}
						}

						}
						}
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__9:
					{
					setState(380);
					match(T__9);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(383);
				match(T__53);
				setState(384);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new BuiltinImportFromStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(T__51);
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__54:
				case IDENTIFIER:
					{
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(386);
						match(IDENTIFIER);
						setState(388);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__47) {
							{
							setState(387);
							match(T__47);
							}
						}

						}
						}
						setState(394);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__9:
					{
					setState(395);
					match(T__9);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(398);
				match(T__54);
				setState(399);
				match(T__52);
				setState(400);
				match(STRING);
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
		enterRule(_localctx, 34, RULE_exprArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			expr(0);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(404);
				match(T__47);
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
		enterRule(_localctx, 36, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(T__55);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6234780685303812L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(408);
				statement(0);
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(T__56);
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
		enterRule(_localctx, 38, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__57);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -3557834909525475295L) != 0)) {
				{
				{
				setState(417);
				expr(0);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(418);
					match(T__47);
					}
				}

				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(T__58);
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
		enterRule(_localctx, 40, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__55);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(429);
				match(STRING);
				setState(430);
				match(T__6);
				setState(431);
				expr(0);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(432);
					match(T__47);
					}
				}

				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			match(T__56);
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
			return precpred(_ctx, 24);
		case 3:
			return precpred(_ctx, 23);
		case 4:
			return precpred(_ctx, 22);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 13);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 10);
		case 17:
			return precpred(_ctx, 9);
		case 18:
			return precpred(_ctx, 8);
		case 19:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u01bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001:\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001F\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001Z\b\u0001\n\u0001\f\u0001]\t\u0001\u0003\u0001"+
		"_\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001d\b\u0001\n\u0001"+
		"\f\u0001g\t\u0001\u0005\u0001i\b\u0001\n\u0001\f\u0001l\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0085"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00c3\b\u0002\n\u0002\f\u0002\u00c6\t\u0002\u0001\u0003"+
		"\u0003\u0003\u00c9\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00fd\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0106\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0112\b\u0006\n\u0006\f\u0006\u0115\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u011a\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0121\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0125\b\u0007\n\u0007\f\u0007\u0128\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u012d\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0132\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u013b\b\t\n\t\f\t\u013e\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0147"+
		"\b\n\n\n\f\n\u014a\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0152\b\u000b\u0001\f\u0003\f\u0155\b\f\u0001"+
		"\f\u0001\f\u0003\f\u0159\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u015e\b\r"+
		"\n\r\f\r\u0161\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0171\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0176\b\u0010\u0005\u0010\u0178\b"+
		"\u0010\n\u0010\f\u0010\u017b\t\u0010\u0001\u0010\u0003\u0010\u017e\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0185\b\u0010\u0005\u0010\u0187\b\u0010\n\u0010\f\u0010\u018a\t\u0010"+
		"\u0001\u0010\u0003\u0010\u018d\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0192\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0196\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u019a\b\u0012\n\u0012\f\u0012"+
		"\u019d\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01a4\b\u0013\u0005\u0013\u01a6\b\u0013\n\u0013\f\u0013\u01a9"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u01b2\b\u0014\u0005\u0014\u01b4\b\u0014"+
		"\n\u0014\f\u0014\u01b7\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0002"+
		"[e\u0002\u0002\u0004\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0000\u0201\u0000-\u0001"+
		"\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000\u0004\u0084\u0001\u0000"+
		"\u0000\u0000\u0006\u00fc\u0001\u0000\u0000\u0000\b\u00fe\u0001\u0000\u0000"+
		"\u0000\n\u0107\u0001\u0000\u0000\u0000\f\u010d\u0001\u0000\u0000\u0000"+
		"\u000e\u0122\u0001\u0000\u0000\u0000\u0010\u0133\u0001\u0000\u0000\u0000"+
		"\u0012\u0137\u0001\u0000\u0000\u0000\u0014\u0142\u0001\u0000\u0000\u0000"+
		"\u0016\u0151\u0001\u0000\u0000\u0000\u0018\u0154\u0001\u0000\u0000\u0000"+
		"\u001a\u015a\u0001\u0000\u0000\u0000\u001c\u0164\u0001\u0000\u0000\u0000"+
		"\u001e\u0170\u0001\u0000\u0000\u0000 \u0191\u0001\u0000\u0000\u0000\""+
		"\u0193\u0001\u0000\u0000\u0000$\u0197\u0001\u0000\u0000\u0000&\u01a0\u0001"+
		"\u0000\u0000\u0000(\u01ac\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001"+
		"\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0001\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000001\u0006\u0001\uffff\uffff\u000012\u0003\u0006"+
		"\u0003\u000023\u0005\u0001\u0000\u00003_\u0001\u0000\u0000\u000045\u0003"+
		"\u001a\r\u000056\u0005\u0001\u0000\u00006_\u0001\u0000\u0000\u000079\u0003"+
		"\b\u0004\u00008:\u0005\u0001\u0000\u000098\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:_\u0001\u0000\u0000\u0000;=\u0003\n\u0005\u0000<>\u0005"+
		"\u0001\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">_\u0001\u0000\u0000\u0000?A\u0003\f\u0006\u0000@B\u0005\u0001\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B_\u0001\u0000\u0000"+
		"\u0000CE\u0003\u0010\b\u0000DF\u0005\u0001\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000F_\u0001\u0000\u0000\u0000GI\u0003\u0012"+
		"\t\u0000HJ\u0005\u0001\u0000\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J_\u0001\u0000\u0000\u0000KL\u0003\u0016\u000b\u0000LM\u0005"+
		"\u0001\u0000\u0000M_\u0001\u0000\u0000\u0000NO\u0003\u001c\u000e\u0000"+
		"OP\u0005\u0001\u0000\u0000P_\u0001\u0000\u0000\u0000QR\u0003\u001e\u000f"+
		"\u0000RS\u0005\u0001\u0000\u0000S_\u0001\u0000\u0000\u0000TU\u0003 \u0010"+
		"\u0000UV\u0005\u0001\u0000\u0000V_\u0001\u0000\u0000\u0000W[\u0005\u0002"+
		"\u0000\u0000XZ\t\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^0\u0001\u0000\u0000\u0000"+
		"^4\u0001\u0000\u0000\u0000^7\u0001\u0000\u0000\u0000^;\u0001\u0000\u0000"+
		"\u0000^?\u0001\u0000\u0000\u0000^C\u0001\u0000\u0000\u0000^G\u0001\u0000"+
		"\u0000\u0000^K\u0001\u0000\u0000\u0000^N\u0001\u0000\u0000\u0000^Q\u0001"+
		"\u0000\u0000\u0000^T\u0001\u0000\u0000\u0000^W\u0001\u0000\u0000\u0000"+
		"_j\u0001\u0000\u0000\u0000`a\n\u0002\u0000\u0000ae\u0005\u0002\u0000\u0000"+
		"bd\t\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000h`\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u0003"+
		"\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0006\u0002\uffff"+
		"\uffff\u0000n\u0085\u0005=\u0000\u0000o\u0085\u0005A\u0000\u0000p\u0085"+
		"\u0005>\u0000\u0000q\u0085\u0005<\u0000\u0000r\u0085\u0003\u0016\u000b"+
		"\u0000st\u0005\u0003\u0000\u0000tu\u0003\u0004\u0002\u0000uv\u0005\u0004"+
		"\u0000\u0000v\u0085\u0001\u0000\u0000\u0000wx\u0003\u0016\u000b\u0000"+
		"xy\u0005\u0005\u0000\u0000yz\u0003\u0004\u0002\u001bz\u0085\u0001\u0000"+
		"\u0000\u0000{|\u0005\b\u0000\u0000|\u0085\u0003\u0004\u0002\u0019}~\u0005"+
		"\u0019\u0000\u0000~\u0085\u0003\u0004\u0002\u0006\u007f\u0085\u0003&\u0013"+
		"\u0000\u0080\u0085\u0003(\u0014\u0000\u0081\u0085\u0003\u001a\r\u0000"+
		"\u0082\u0085\u0003\u0014\n\u0000\u0083\u0085\u0003\u000e\u0007\u0000\u0084"+
		"m\u0001\u0000\u0000\u0000\u0084o\u0001\u0000\u0000\u0000\u0084p\u0001"+
		"\u0000\u0000\u0000\u0084q\u0001\u0000\u0000\u0000\u0084r\u0001\u0000\u0000"+
		"\u0000\u0084s\u0001\u0000\u0000\u0000\u0084w\u0001\u0000\u0000\u0000\u0084"+
		"{\u0001\u0000\u0000\u0000\u0084}\u0001\u0000\u0000\u0000\u0084\u007f\u0001"+
		"\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u00c4\u0001\u0000\u0000\u0000\u0086\u0087\n\u001a"+
		"\u0000\u0000\u0087\u0088\u0005\u0006\u0000\u0000\u0088\u0089\u0003\u0004"+
		"\u0002\u0000\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u008b\u0003\u0004"+
		"\u0002\u001b\u008b\u00c3\u0001\u0000\u0000\u0000\u008c\u008d\n\u0018\u0000"+
		"\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e\u00c3\u0003\u0004\u0002\u0019"+
		"\u008f\u0090\n\u0017\u0000\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091"+
		"\u00c3\u0003\u0004\u0002\u0018\u0092\u0093\n\u0016\u0000\u0000\u0093\u0094"+
		"\u0005\u000b\u0000\u0000\u0094\u00c3\u0003\u0004\u0002\u0017\u0095\u0096"+
		"\n\u0015\u0000\u0000\u0096\u0097\u0005\u0002\u0000\u0000\u0097\u00c3\u0003"+
		"\u0004\u0002\u0016\u0098\u0099\n\u0014\u0000\u0000\u0099\u009a\u0005\f"+
		"\u0000\u0000\u009a\u00c3\u0003\u0004\u0002\u0015\u009b\u009c\n\u0013\u0000"+
		"\u0000\u009c\u009d\u0005\r\u0000\u0000\u009d\u00c3\u0003\u0004\u0002\u0014"+
		"\u009e\u009f\n\u0012\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0"+
		"\u00c3\u0003\u0004\u0002\u0013\u00a1\u00a2\n\u0011\u0000\u0000\u00a2\u00a3"+
		"\u0005\u000e\u0000\u0000\u00a3\u00c3\u0003\u0004\u0002\u0012\u00a4\u00a5"+
		"\n\u0010\u0000\u0000\u00a5\u00a6\u0005\u000f\u0000\u0000\u00a6\u00c3\u0003"+
		"\u0004\u0002\u0011\u00a7\u00a8\n\u000f\u0000\u0000\u00a8\u00a9\u0005\u0010"+
		"\u0000\u0000\u00a9\u00c3\u0003\u0004\u0002\u0010\u00aa\u00ab\n\u000e\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0011\u0000\u0000\u00ac\u00c3\u0003\u0004\u0002"+
		"\u000f\u00ad\u00ae\n\r\u0000\u0000\u00ae\u00af\u0005\u0012\u0000\u0000"+
		"\u00af\u00c3\u0003\u0004\u0002\u000e\u00b0\u00b1\n\f\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0013\u0000\u0000\u00b2\u00c3\u0003\u0004\u0002\r\u00b3\u00b4"+
		"\n\u000b\u0000\u0000\u00b4\u00b5\u0005\u0014\u0000\u0000\u00b5\u00c3\u0003"+
		"\u0004\u0002\f\u00b6\u00b7\n\n\u0000\u0000\u00b7\u00b8\u0005\u0015\u0000"+
		"\u0000\u00b8\u00c3\u0003\u0004\u0002\u000b\u00b9\u00ba\n\t\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0016\u0000\u0000\u00bb\u00c3\u0003\u0004\u0002\n\u00bc"+
		"\u00bd\n\b\u0000\u0000\u00bd\u00be\u0005\u0017\u0000\u0000\u00be\u00c3"+
		"\u0003\u0004\u0002\t\u00bf\u00c0\n\u0007\u0000\u0000\u00c0\u00c1\u0005"+
		"\u0018\u0000\u0000\u00c1\u00c3\u0003\u0004\u0002\b\u00c2\u0086\u0001\u0000"+
		"\u0000\u0000\u00c2\u008c\u0001\u0000\u0000\u0000\u00c2\u008f\u0001\u0000"+
		"\u0000\u0000\u00c2\u0092\u0001\u0000\u0000\u0000\u00c2\u0095\u0001\u0000"+
		"\u0000\u0000\u00c2\u0098\u0001\u0000\u0000\u0000\u00c2\u009b\u0001\u0000"+
		"\u0000\u0000\u00c2\u009e\u0001\u0000\u0000\u0000\u00c2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00c2\u00a4\u0001\u0000\u0000\u0000\u00c2\u00a7\u0001\u0000"+
		"\u0000\u0000\u00c2\u00aa\u0001\u0000\u0000\u0000\u00c2\u00ad\u0001\u0000"+
		"\u0000\u0000\u00c2\u00b0\u0001\u0000\u0000\u0000\u00c2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00c2\u00b6\u0001\u0000\u0000\u0000\u00c2\u00b9\u0001\u0000"+
		"\u0000\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u0005\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005B\u0000"+
		"\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\u0016\u000b"+
		"\u0000\u00cb\u00cc\u0005\u001a\u0000\u0000\u00cc\u00cd\u0003\u0004\u0002"+
		"\u0000\u00cd\u00fd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u0016\u000b"+
		"\u0000\u00cf\u00d0\u0005\u001b\u0000\u0000\u00d0\u00d1\u0003\u0004\u0002"+
		"\u0000\u00d1\u00fd\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\u0016\u000b"+
		"\u0000\u00d3\u00d4\u0005\u001c\u0000\u0000\u00d4\u00d5\u0003\u0004\u0002"+
		"\u0000\u00d5\u00fd\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003\u0016\u000b"+
		"\u0000\u00d7\u00d8\u0005\u001d\u0000\u0000\u00d8\u00d9\u0003\u0004\u0002"+
		"\u0000\u00d9\u00fd\u0001\u0000\u0000\u0000\u00da\u00db\u0003\u0016\u000b"+
		"\u0000\u00db\u00dc\u0005\u001e\u0000\u0000\u00dc\u00dd\u0003\u0004\u0002"+
		"\u0000\u00dd\u00fd\u0001\u0000\u0000\u0000\u00de\u00df\u0003\u0016\u000b"+
		"\u0000\u00df\u00e0\u0005\u001f\u0000\u0000\u00e0\u00e1\u0003\u0004\u0002"+
		"\u0000\u00e1\u00fd\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\u0016\u000b"+
		"\u0000\u00e3\u00e4\u0005 \u0000\u0000\u00e4\u00e5\u0003\u0004\u0002\u0000"+
		"\u00e5\u00fd\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u0016\u000b\u0000"+
		"\u00e7\u00e8\u0005!\u0000\u0000\u00e8\u00fd\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0003\u0016\u000b\u0000\u00ea\u00eb\u0005\"\u0000\u0000\u00eb\u00ec"+
		"\u0003\u0004\u0002\u0000\u00ec\u00fd\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0003\u0016\u000b\u0000\u00ee\u00ef\u0005#\u0000\u0000\u00ef\u00fd\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0003\u0016\u000b\u0000\u00f1\u00f2\u0005"+
		"$\u0000\u0000\u00f2\u00f3\u0003\u0004\u0002\u0000\u00f3\u00fd\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0003\u0016\u000b\u0000\u00f5\u00f6\u0005%\u0000"+
		"\u0000\u00f6\u00f7\u0003\u0004\u0002\u0000\u00f7\u00fd\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0003\u0016\u000b\u0000\u00f9\u00fa\u0005&\u0000\u0000"+
		"\u00fa\u00fb\u0003\u0004\u0002\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00c8\u0001\u0000\u0000\u0000\u00fc\u00ce\u0001\u0000\u0000\u0000"+
		"\u00fc\u00d2\u0001\u0000\u0000\u0000\u00fc\u00d6\u0001\u0000\u0000\u0000"+
		"\u00fc\u00da\u0001\u0000\u0000\u0000\u00fc\u00de\u0001\u0000\u0000\u0000"+
		"\u00fc\u00e2\u0001\u0000\u0000\u0000\u00fc\u00e6\u0001\u0000\u0000\u0000"+
		"\u00fc\u00e9\u0001\u0000\u0000\u0000\u00fc\u00ed\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f0\u0001\u0000\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fd\u0007\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0005\'\u0000\u0000\u00ff\u0100\u0005\u0003\u0000\u0000\u0100"+
		"\u0101\u0003\u0004\u0002\u0000\u0101\u0102\u0005\u0004\u0000\u0000\u0102"+
		"\u0105\u0003$\u0012\u0000\u0103\u0104\u0005(\u0000\u0000\u0104\u0106\u0003"+
		"$\u0012\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\t\u0001\u0000\u0000\u0000\u0107\u0108\u0005)\u0000"+
		"\u0000\u0108\u0109\u0005\u0003\u0000\u0000\u0109\u010a\u0003\u0004\u0002"+
		"\u0000\u010a\u010b\u0005\u0004\u0000\u0000\u010b\u010c\u0003$\u0012\u0000"+
		"\u010c\u000b\u0001\u0000\u0000\u0000\u010d\u010e\u0005*\u0000\u0000\u010e"+
		"\u010f\u0005B\u0000\u0000\u010f\u0113\u0005\u0003\u0000\u0000\u0110\u0112"+
		"\u0003\u0018\f\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001"+
		"\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0113\u0001"+
		"\u0000\u0000\u0000\u0116\u0119\u0005\u0004\u0000\u0000\u0117\u0118\u0005"+
		"+\u0000\u0000\u0118\u011a\u0005B\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0120\u0001\u0000\u0000"+
		"\u0000\u011b\u0121\u0003$\u0012\u0000\u011c\u011d\u0005,\u0000\u0000\u011d"+
		"\u011e\u0003\u0004\u0002\u0000\u011e\u011f\u0005\u0001\u0000\u0000\u011f"+
		"\u0121\u0001\u0000\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0120"+
		"\u011c\u0001\u0000\u0000\u0000\u0121\r\u0001\u0000\u0000\u0000\u0122\u0126"+
		"\u0005\u0003\u0000\u0000\u0123\u0125\u0003\u0018\f\u0000\u0124\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012c\u0005"+
		"\u0004\u0000\u0000\u012a\u012b\u0005+\u0000\u0000\u012b\u012d\u0005B\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u0131\u0001\u0000\u0000\u0000\u012e\u0132\u0003$\u0012\u0000"+
		"\u012f\u0130\u0005,\u0000\u0000\u0130\u0132\u0003\u0004\u0002\u0000\u0131"+
		"\u012e\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132"+
		"\u000f\u0001\u0000\u0000\u0000\u0133\u0134\u0005-\u0000\u0000\u0134\u0135"+
		"\u0005B\u0000\u0000\u0135\u0136\u0003$\u0012\u0000\u0136\u0011\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0005B\u0000\u0000\u0138\u013c\u0005\u0003\u0000"+
		"\u0000\u0139\u013b\u0003\u0018\f\u0000\u013a\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0004\u0000\u0000"+
		"\u0140\u0141\u0003$\u0012\u0000\u0141\u0013\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0005.\u0000\u0000\u0143\u0144\u0005B\u0000\u0000\u0144\u0148\u0005"+
		"\u0003\u0000\u0000\u0145\u0147\u0003\"\u0011\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000"+
		"\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0004"+
		"\u0000\u0000\u014c\u0015\u0001\u0000\u0000\u0000\u014d\u0152\u0005B\u0000"+
		"\u0000\u014e\u014f\u0005B\u0000\u0000\u014f\u0150\u0005/\u0000\u0000\u0150"+
		"\u0152\u0003\u0016\u000b\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0151"+
		"\u014e\u0001\u0000\u0000\u0000\u0152\u0017\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0005B\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158"+
		"\u0005B\u0000\u0000\u0157\u0159\u00050\u0000\u0000\u0158\u0157\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u0019\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0003\u0016\u000b\u0000\u015b\u015f\u0005\u0003"+
		"\u0000\u0000\u015c\u015e\u0003\"\u0011\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000"+
		"\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0004\u0000"+
		"\u0000\u0163\u001b\u0001\u0000\u0000\u0000\u0164\u0165\u00051\u0000\u0000"+
		"\u0165\u0166\u0003\u0004\u0002\u0000\u0166\u001d\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u00052\u0000\u0000\u0168\u0169\u0005A\u0000\u0000\u0169\u016a"+
		"\u00053\u0000\u0000\u016a\u0171\u0005B\u0000\u0000\u016b\u016c\u00054"+
		"\u0000\u0000\u016c\u016d\u00055\u0000\u0000\u016d\u016e\u0005A\u0000\u0000"+
		"\u016e\u016f\u00053\u0000\u0000\u016f\u0171\u0005B\u0000\u0000\u0170\u0167"+
		"\u0001\u0000\u0000\u0000\u0170\u016b\u0001\u0000\u0000\u0000\u0171\u001f"+
		"\u0001\u0000\u0000\u0000\u0172\u017d\u00054\u0000\u0000\u0173\u0175\u0005"+
		"B\u0000\u0000\u0174\u0176\u00050\u0000\u0000\u0175\u0174\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000"+
		"\u0000\u0177\u0173\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000"+
		"\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000"+
		"\u0000\u017a\u017e\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000"+
		"\u0000\u017c\u017e\u0005\n\u0000\u0000\u017d\u0179\u0001\u0000\u0000\u0000"+
		"\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u00056\u0000\u0000\u0180\u0192\u0005A\u0000\u0000\u0181\u018c"+
		"\u00054\u0000\u0000\u0182\u0184\u0005B\u0000\u0000\u0183\u0185\u00050"+
		"\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0182\u0001\u0000"+
		"\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018d\u0001\u0000"+
		"\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018d\u0005\n\u0000"+
		"\u0000\u018c\u0188\u0001\u0000\u0000\u0000\u018c\u018b\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u00057\u0000\u0000"+
		"\u018f\u0190\u00055\u0000\u0000\u0190\u0192\u0005A\u0000\u0000\u0191\u0172"+
		"\u0001\u0000\u0000\u0000\u0191\u0181\u0001\u0000\u0000\u0000\u0192!\u0001"+
		"\u0000\u0000\u0000\u0193\u0195\u0003\u0004\u0002\u0000\u0194\u0196\u0005"+
		"0\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196#\u0001\u0000\u0000\u0000\u0197\u019b\u00058\u0000\u0000"+
		"\u0198\u019a\u0003\u0002\u0001\u0000\u0199\u0198\u0001\u0000\u0000\u0000"+
		"\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u019f\u00059\u0000\u0000\u019f"+
		"%\u0001\u0000\u0000\u0000\u01a0\u01a7\u0005:\u0000\u0000\u01a1\u01a3\u0003"+
		"\u0004\u0002\u0000\u01a2\u01a4\u00050\u0000\u0000\u01a3\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a1\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0005;\u0000\u0000\u01ab\'\u0001\u0000\u0000"+
		"\u0000\u01ac\u01b5\u00058\u0000\u0000\u01ad\u01ae\u0005A\u0000\u0000\u01ae"+
		"\u01af\u0005\u0007\u0000\u0000\u01af\u01b1\u0003\u0004\u0002\u0000\u01b0"+
		"\u01b2\u00050\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u00059\u0000\u0000\u01b9)\u0001\u0000\u0000\u0000*-9=AEI[^ej\u0084\u00c2"+
		"\u00c4\u00c8\u00fc\u0105\u0113\u0119\u0120\u0126\u012c\u0131\u013c\u0148"+
		"\u0151\u0154\u0158\u015f\u0170\u0175\u0179\u017d\u0184\u0188\u018c\u0191"+
		"\u0195\u019b\u01a3\u01a7\u01b1\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}