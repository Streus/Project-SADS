package grammar;
// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SequenceAnalyzerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, INT=11, USER_ALPHA=12, FILE_EXT=13, LP=14, RP=15, COMMA=16, LETTER=17, 
		NEWLINE=18, LN_COMMENT=19, COMMENT=20, WS=21;
	public static final int
		RULE_prog = 0, RULE_init = 1, RULE_cmd = 2, RULE_vardef = 3, RULE_strcmd = 4, 
		RULE_predef = 5, RULE_sub = 6, RULE_cmp = 7, RULE_ct = 8, RULE_sp = 9, 
		RULE_build = 10, RULE_sm = 11, RULE_wordct = 12, RULE_concat = 13, RULE_assignment = 14, 
		RULE_file = 15, RULE_expr = 16;
	public static final String[] ruleNames = {
		"prog", "init", "cmd", "vardef", "strcmd", "predef", "sub", "cmp", "ct", 
		"sp", "build", "sm", "wordct", "concat", "assignment", "file", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wc'", "'concat'", 
		"':='", null, null, null, null, "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"USER_ALPHA", "FILE_EXT", "LP", "RP", "COMMA", "LETTER", "NEWLINE", "LN_COMMENT", 
		"COMMENT", "WS"
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
	public String getGrammarFileName() { return "SequenceAnalyzer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SequenceAnalyzerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				cmd();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ID))) != 0) );
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

	public static class InitContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SequenceAnalyzerParser.ID, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_init);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(ID);
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

	public static class CmdContext extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public StrcmdContext strcmd() {
			return getRuleContext(StrcmdContext.class,0);
		}
		public PredefContext predef() {
			return getRuleContext(PredefContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				vardef();
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				strcmd();
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				predef();
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

	public static class VardefContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			assignment();
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

	public static class StrcmdContext extends ParserRuleContext {
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public StrcmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strcmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterStrcmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitStrcmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitStrcmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrcmdContext strcmd() throws RecognitionException {
		StrcmdContext _localctx = new StrcmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_strcmd);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				sub();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				cmp();
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

	public static class PredefContext extends ParserRuleContext {
		public CtContext ct() {
			return getRuleContext(CtContext.class,0);
		}
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public SmContext sm() {
			return getRuleContext(SmContext.class,0);
		}
		public WordctContext wordct() {
			return getRuleContext(WordctContext.class,0);
		}
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public PredefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterPredef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitPredef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitPredef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredefContext predef() throws RecognitionException {
		PredefContext _localctx = new PredefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predef);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				ct();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				sp();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				build();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				sm();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				wordct();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				concat();
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

	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
	 
		public SubContext() { }
		public void copyFrom(SubContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubstitutionOfCommandsContext extends SubContext {
		public Token command;
		public CmdContext nestedCmd1;
		public CmdContext nestedCmd2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public SubstitutionOfCommandsContext(SubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterSubstitutionOfCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitSubstitutionOfCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitSubstitutionOfCommands(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstitutionOfCmdAndExprContext extends SubContext {
		public Token command;
		public CmdContext nestedCmd;
		public ExprContext expression;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubstitutionOfCmdAndExprContext(SubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterSubstitutionOfCmdAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitSubstitutionOfCmdAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitSubstitutionOfCmdAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstitutionOfExpressionContext extends SubContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public SubstitutionOfExpressionContext(SubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterSubstitutionOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitSubstitutionOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitSubstitutionOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SubstitutionOfCommandsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((SubstitutionOfCommandsContext)_localctx).command = match(T__0);
				setState(64);
				match(LP);
				setState(65);
				((SubstitutionOfCommandsContext)_localctx).nestedCmd1 = cmd();
				setState(66);
				match(COMMA);
				setState(67);
				((SubstitutionOfCommandsContext)_localctx).nestedCmd2 = cmd();
				setState(68);
				match(RP);
				}
				break;
			case 2:
				_localctx = new SubstitutionOfCmdAndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((SubstitutionOfCmdAndExprContext)_localctx).command = match(T__0);
				setState(71);
				match(LP);
				setState(72);
				((SubstitutionOfCmdAndExprContext)_localctx).nestedCmd = cmd();
				setState(73);
				match(COMMA);
				setState(74);
				((SubstitutionOfCmdAndExprContext)_localctx).expression = expr();
				setState(75);
				match(RP);
				}
				break;
			case 3:
				_localctx = new SubstitutionOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(T__0);
				setState(78);
				match(LP);
				setState(79);
				expr();
				setState(80);
				match(COMMA);
				setState(81);
				expr();
				setState(82);
				match(RP);
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

	public static class CmpContext extends ParserRuleContext {
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
	 
		public CmpContext() { }
		public void copyFrom(CmpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonOfExpressionContext extends CmpContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ComparisonOfExpressionContext(CmpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterComparisonOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitComparisonOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitComparisonOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonOfCommandsContext extends CmpContext {
		public Token command;
		public CmdContext nestedCmd1;
		public CmdContext nestedCmd2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ComparisonOfCommandsContext(CmpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterComparisonOfCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitComparisonOfCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitComparisonOfCommands(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonOfCmdAndExprContext extends CmpContext {
		public Token command;
		public CmdContext nestedCmd;
		public ExprContext expression;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComparisonOfCmdAndExprContext(CmpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterComparisonOfCmdAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitComparisonOfCmdAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitComparisonOfCmdAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmp);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ComparisonOfCommandsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((ComparisonOfCommandsContext)_localctx).command = match(T__1);
				setState(87);
				match(LP);
				setState(88);
				((ComparisonOfCommandsContext)_localctx).nestedCmd1 = cmd();
				setState(89);
				match(COMMA);
				setState(90);
				((ComparisonOfCommandsContext)_localctx).nestedCmd2 = cmd();
				setState(91);
				match(RP);
				}
				break;
			case 2:
				_localctx = new ComparisonOfCmdAndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				((ComparisonOfCmdAndExprContext)_localctx).command = match(T__1);
				setState(94);
				match(LP);
				setState(95);
				((ComparisonOfCmdAndExprContext)_localctx).nestedCmd = cmd();
				setState(96);
				match(COMMA);
				setState(97);
				((ComparisonOfCmdAndExprContext)_localctx).expression = expr();
				setState(98);
				match(RP);
				}
				break;
			case 3:
				_localctx = new ComparisonOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__1);
				setState(101);
				match(LP);
				setState(102);
				expr();
				setState(103);
				match(COMMA);
				setState(104);
				expr();
				setState(105);
				match(RP);
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

	public static class CtContext extends ParserRuleContext {
		public CtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ct; }
	 
		public CtContext() { }
		public void copyFrom(CtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CuttingTimesOfExpressionInParensContext extends CtContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public CuttingTimesOfExpressionInParensContext(CtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterCuttingTimesOfExpressionInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitCuttingTimesOfExpressionInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitCuttingTimesOfExpressionInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CuttingTimesOfExpressionContext extends CtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CuttingTimesOfExpressionContext(CtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterCuttingTimesOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitCuttingTimesOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitCuttingTimesOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CuttingTimesOfCommandInParensContext extends CtContext {
		public Token command;
		public CmdContext nestedCmd;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CuttingTimesOfCommandInParensContext(CtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterCuttingTimesOfCommandInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitCuttingTimesOfCommandInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitCuttingTimesOfCommandInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CuttingTimesOfCommandContext extends CtContext {
		public Token command;
		public CmdContext nestedCmd;
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CuttingTimesOfCommandContext(CtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterCuttingTimesOfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitCuttingTimesOfCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitCuttingTimesOfCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtContext ct() throws RecognitionException {
		CtContext _localctx = new CtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ct);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CuttingTimesOfCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((CuttingTimesOfCommandContext)_localctx).command = match(T__2);
				setState(110);
				((CuttingTimesOfCommandContext)_localctx).nestedCmd = cmd();
				}
				break;
			case 2:
				_localctx = new CuttingTimesOfCommandInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((CuttingTimesOfCommandInParensContext)_localctx).command = match(T__2);
				setState(112);
				match(LP);
				setState(113);
				((CuttingTimesOfCommandInParensContext)_localctx).nestedCmd = cmd();
				setState(114);
				match(RP);
				}
				break;
			case 3:
				_localctx = new CuttingTimesOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(T__2);
				setState(117);
				expr();
				}
				break;
			case 4:
				_localctx = new CuttingTimesOfExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(T__2);
				setState(119);
				match(LP);
				setState(120);
				expr();
				setState(121);
				match(RP);
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

	public static class SpContext extends ParserRuleContext {
		public SpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sp; }
	 
		public SpContext() { }
		public void copyFrom(SpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarProductOfCommandsContext extends SpContext {
		public Token command;
		public CmdContext nestedCmd1;
		public CmdContext nestedCmd2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public StarProductOfCommandsContext(SpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterStarProductOfCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitStarProductOfCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitStarProductOfCommands(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarProductOfExpressionsContext extends SpContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public StarProductOfExpressionsContext(SpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterStarProductOfExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitStarProductOfExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitStarProductOfExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpContext sp() throws RecognitionException {
		SpContext _localctx = new SpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sp);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StarProductOfCommandsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((StarProductOfCommandsContext)_localctx).command = match(T__3);
				setState(126);
				match(LP);
				setState(127);
				((StarProductOfCommandsContext)_localctx).nestedCmd1 = cmd();
				setState(128);
				match(COMMA);
				setState(129);
				((StarProductOfCommandsContext)_localctx).nestedCmd2 = cmd();
				setState(130);
				match(RP);
				}
				break;
			case 2:
				_localctx = new StarProductOfExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__3);
				setState(133);
				match(LP);
				setState(134);
				expr();
				setState(135);
				match(COMMA);
				setState(136);
				expr();
				setState(137);
				match(RP);
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

	public static class BuildContext extends ParserRuleContext {
		public BuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build; }
	 
		public BuildContext() { }
		public void copyFrom(BuildContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BuildExpressionContext extends BuildContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BuildExpressionContext(BuildContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterBuildExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitBuildExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitBuildExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuildExpressionInParensContext extends BuildContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public BuildExpressionInParensContext(BuildContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterBuildExpressionInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitBuildExpressionInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitBuildExpressionInParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildContext build() throws RecognitionException {
		BuildContext _localctx = new BuildContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_build);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BuildExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__4);
				setState(142);
				expr();
				}
				break;
			case 2:
				_localctx = new BuildExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__4);
				setState(144);
				match(LP);
				setState(145);
				expr();
				setState(146);
				match(RP);
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

	public static class SmContext extends ParserRuleContext {
		public SmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sm; }
	 
		public SmContext() { }
		public void copyFrom(SmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftMaximalityOfCommandContext extends SmContext {
		public Token command;
		public CmdContext nestedCmd;
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ShiftMaximalityOfCommandContext(SmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterShiftMaximalityOfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitShiftMaximalityOfCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitShiftMaximalityOfCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftMaximalityOfCommandInParensContext extends SmContext {
		public Token command;
		public CmdContext nestedCmd;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ShiftMaximalityOfCommandInParensContext(SmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterShiftMaximalityOfCommandInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitShiftMaximalityOfCommandInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitShiftMaximalityOfCommandInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftMaximalityOfExpressionInParensContext extends SmContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ShiftMaximalityOfExpressionInParensContext(SmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterShiftMaximalityOfExpressionInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitShiftMaximalityOfExpressionInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitShiftMaximalityOfExpressionInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftMaximalityOfExpressionContext extends SmContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ShiftMaximalityOfExpressionContext(SmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterShiftMaximalityOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitShiftMaximalityOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitShiftMaximalityOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmContext sm() throws RecognitionException {
		SmContext _localctx = new SmContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sm);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ShiftMaximalityOfCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((ShiftMaximalityOfCommandContext)_localctx).command = match(T__5);
				setState(151);
				((ShiftMaximalityOfCommandContext)_localctx).nestedCmd = cmd();
				}
				break;
			case 2:
				_localctx = new ShiftMaximalityOfCommandInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				((ShiftMaximalityOfCommandInParensContext)_localctx).command = match(T__5);
				setState(153);
				match(LP);
				setState(154);
				((ShiftMaximalityOfCommandInParensContext)_localctx).nestedCmd = cmd();
				setState(155);
				match(RP);
				}
				break;
			case 3:
				_localctx = new ShiftMaximalityOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__5);
				setState(158);
				expr();
				}
				break;
			case 4:
				_localctx = new ShiftMaximalityOfExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(T__5);
				setState(160);
				match(LP);
				setState(161);
				expr();
				setState(162);
				match(RP);
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

	public static class WordctContext extends ParserRuleContext {
		public WordctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordct; }
	 
		public WordctContext() { }
		public void copyFrom(WordctContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WordCountOfCommandContext extends WordctContext {
		public Token command;
		public CmdContext nestedCmd;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public WordCountOfCommandContext(WordctContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterWordCountOfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitWordCountOfCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitWordCountOfCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WordCountOfExpressionContext extends WordctContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public WordCountOfExpressionContext(WordctContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterWordCountOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitWordCountOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitWordCountOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordctContext wordct() throws RecognitionException {
		WordctContext _localctx = new WordctContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wordct);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new WordCountOfCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				((WordCountOfCommandContext)_localctx).command = match(T__6);
				setState(167);
				match(LP);
				setState(168);
				((WordCountOfCommandContext)_localctx).nestedCmd = cmd();
				setState(169);
				match(COMMA);
				setState(170);
				match(INT);
				setState(171);
				match(RP);
				}
				break;
			case 2:
				_localctx = new WordCountOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__6);
				setState(174);
				match(LP);
				setState(175);
				expr();
				setState(176);
				match(COMMA);
				setState(177);
				match(INT);
				setState(178);
				match(RP);
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

	public static class ConcatContext extends ParserRuleContext {
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
	 
		public ConcatContext() { }
		public void copyFrom(ConcatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcatOn2CommandsAtIndexContext extends ConcatContext {
		public Token command;
		public CmdContext nestedCmd1;
		public CmdContext nestedCmd2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ConcatOn2CommandsAtIndexContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOn2CommandsAtIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOn2CommandsAtIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOn2CommandsAtIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatOn2ExpressionsContext extends ConcatContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ConcatOn2ExpressionsContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOn2Expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOn2Expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOn2Expressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatOn2CommandsContext extends ConcatContext {
		public Token command;
		public CmdContext nestedCmd1;
		public CmdContext nestedCmd2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ConcatOn2CommandsContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOn2Commands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOn2Commands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOn2Commands(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatOfCmdOnExprContext extends ConcatContext {
		public Token command;
		public ExprContext expression;
		public CmdContext nestedCmd;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ConcatOfCmdOnExprContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOfCmdOnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOfCmdOnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOfCmdOnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatOfExprOnCommandAtIndexContext extends ConcatContext {
		public Token command;
		public CmdContext nestedCmd;
		public ExprContext expression;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConcatOfExprOnCommandAtIndexContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOfExprOnCommandAtIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOfExprOnCommandAtIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOfExprOnCommandAtIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatOfCmdOnExprAtIndexContext extends ConcatContext {
		public Token command;
		public ExprContext expression;
		public CmdContext nestedCmd;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ConcatOfCmdOnExprAtIndexContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOfCmdOnExprAtIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOfCmdOnExprAtIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOfCmdOnExprAtIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatOfExprOnCommandContext extends ConcatContext {
		public Token command;
		public CmdContext nestedCmd;
		public ExprContext expression;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConcatOfExprOnCommandContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOfExprOnCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOfExprOnCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOfExprOnCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatOn2ExpressionsAtIndexContext extends ConcatContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ConcatOn2ExpressionsAtIndexContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOn2ExpressionsAtIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOn2ExpressionsAtIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOn2ExpressionsAtIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_concat);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ConcatOn2CommandsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((ConcatOn2CommandsContext)_localctx).command = match(T__7);
				setState(183);
				match(LP);
				setState(184);
				((ConcatOn2CommandsContext)_localctx).nestedCmd1 = cmd();
				setState(185);
				match(COMMA);
				setState(186);
				((ConcatOn2CommandsContext)_localctx).nestedCmd2 = cmd();
				setState(187);
				match(RP);
				}
				break;
			case 2:
				_localctx = new ConcatOn2CommandsAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((ConcatOn2CommandsAtIndexContext)_localctx).command = match(T__7);
				setState(190);
				match(LP);
				setState(191);
				((ConcatOn2CommandsAtIndexContext)_localctx).nestedCmd1 = cmd();
				setState(192);
				match(COMMA);
				setState(193);
				((ConcatOn2CommandsAtIndexContext)_localctx).nestedCmd2 = cmd();
				setState(194);
				match(COMMA);
				setState(195);
				match(INT);
				setState(196);
				match(RP);
				}
				break;
			case 3:
				_localctx = new ConcatOfCmdOnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				((ConcatOfCmdOnExprContext)_localctx).command = match(T__7);
				setState(199);
				match(LP);
				setState(200);
				((ConcatOfCmdOnExprContext)_localctx).expression = expr();
				setState(201);
				match(COMMA);
				setState(202);
				((ConcatOfCmdOnExprContext)_localctx).nestedCmd = cmd();
				setState(203);
				match(RP);
				}
				break;
			case 4:
				_localctx = new ConcatOfCmdOnExprAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				((ConcatOfCmdOnExprAtIndexContext)_localctx).command = match(T__7);
				setState(206);
				match(LP);
				setState(207);
				((ConcatOfCmdOnExprAtIndexContext)_localctx).expression = expr();
				setState(208);
				match(COMMA);
				setState(209);
				((ConcatOfCmdOnExprAtIndexContext)_localctx).nestedCmd = cmd();
				setState(210);
				match(COMMA);
				setState(211);
				match(INT);
				setState(212);
				match(RP);
				}
				break;
			case 5:
				_localctx = new ConcatOfExprOnCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				((ConcatOfExprOnCommandContext)_localctx).command = match(T__7);
				setState(215);
				match(LP);
				setState(216);
				((ConcatOfExprOnCommandContext)_localctx).nestedCmd = cmd();
				setState(217);
				match(COMMA);
				setState(218);
				((ConcatOfExprOnCommandContext)_localctx).expression = expr();
				setState(219);
				match(RP);
				}
				break;
			case 6:
				_localctx = new ConcatOfExprOnCommandAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				((ConcatOfExprOnCommandAtIndexContext)_localctx).command = match(T__7);
				setState(222);
				match(LP);
				setState(223);
				((ConcatOfExprOnCommandAtIndexContext)_localctx).nestedCmd = cmd();
				setState(224);
				match(COMMA);
				setState(225);
				((ConcatOfExprOnCommandAtIndexContext)_localctx).expression = expr();
				setState(226);
				match(COMMA);
				setState(227);
				match(INT);
				setState(228);
				match(RP);
				}
				break;
			case 7:
				_localctx = new ConcatOn2ExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				match(T__7);
				setState(231);
				match(LP);
				setState(232);
				expr();
				setState(233);
				match(COMMA);
				setState(234);
				expr();
				setState(235);
				match(RP);
				}
				break;
			case 8:
				_localctx = new ConcatOn2ExpressionsAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(T__7);
				setState(238);
				match(LP);
				setState(239);
				expr();
				setState(240);
				match(COMMA);
				setState(241);
				expr();
				setState(242);
				match(COMMA);
				setState(243);
				match(INT);
				setState(244);
				match(RP);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignVariableOfExpressionContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(SequenceAnalyzerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignVariableOfExpressionContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterAssignVariableOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitAssignVariableOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitAssignVariableOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVariableOfCommandContext extends AssignmentContext {
		public CmdContext command;
		public TerminalNode ID() { return getToken(SequenceAnalyzerParser.ID, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public AssignVariableOfCommandContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterAssignVariableOfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitAssignVariableOfCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitAssignVariableOfCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AssignVariableOfCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(ID);
				setState(249);
				match(T__8);
				setState(250);
				((AssignVariableOfCommandContext)_localctx).command = cmd();
				}
				break;
			case 2:
				_localctx = new AssignVariableOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(ID);
				setState(252);
				match(T__8);
				setState(253);
				expr();
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SequenceAnalyzerParser.ID, 0); }
		public TerminalNode FILE_EXT() { return getToken(SequenceAnalyzerParser.FILE_EXT, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ID);
			setState(257);
			match(FILE_EXT);
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
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			_localctx = new IntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(INT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0108\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\5\4\62\n\4\3"+
		"\5\3\5\3\6\3\6\5\68\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bW\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0097\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00b7\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00f9\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0101\n\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"\2\2\2\u0116\2%\3\2\2\2\4,\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2\2\n\67"+
		"\3\2\2\2\f?\3\2\2\2\16V\3\2\2\2\20m\3\2\2\2\22}\3\2\2\2\24\u008d\3\2\2"+
		"\2\26\u0096\3\2\2\2\30\u00a6\3\2\2\2\32\u00b6\3\2\2\2\34\u00f8\3\2\2\2"+
		"\36\u0100\3\2\2\2 \u0102\3\2\2\2\"\u0105\3\2\2\2$&\5\6\4\2%$\3\2\2\2&"+
		"\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)-\5\6\4\2*-\5\"\22\2+-\7\f"+
		"\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2.\62\5\b\5\2/\62\5\n\6\2"+
		"\60\62\5\f\7\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2\63\64"+
		"\5\36\20\2\64\t\3\2\2\2\658\5\16\b\2\668\5\20\t\2\67\65\3\2\2\2\67\66"+
		"\3\2\2\28\13\3\2\2\29@\5\22\n\2:@\5\24\13\2;@\5\26\f\2<@\5\30\r\2=@\5"+
		"\32\16\2>@\5\34\17\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2"+
		"?>\3\2\2\2@\r\3\2\2\2AB\7\3\2\2BC\7\20\2\2CD\5\6\4\2DE\7\22\2\2EF\5\6"+
		"\4\2FG\7\21\2\2GW\3\2\2\2HI\7\3\2\2IJ\7\20\2\2JK\5\6\4\2KL\7\22\2\2LM"+
		"\5\"\22\2MN\7\21\2\2NW\3\2\2\2OP\7\3\2\2PQ\7\20\2\2QR\5\"\22\2RS\7\22"+
		"\2\2ST\5\"\22\2TU\7\21\2\2UW\3\2\2\2VA\3\2\2\2VH\3\2\2\2VO\3\2\2\2W\17"+
		"\3\2\2\2XY\7\4\2\2YZ\7\20\2\2Z[\5\6\4\2[\\\7\22\2\2\\]\5\6\4\2]^\7\21"+
		"\2\2^n\3\2\2\2_`\7\4\2\2`a\7\20\2\2ab\5\6\4\2bc\7\22\2\2cd\5\"\22\2de"+
		"\7\21\2\2en\3\2\2\2fg\7\4\2\2gh\7\20\2\2hi\5\"\22\2ij\7\22\2\2jk\5\"\22"+
		"\2kl\7\21\2\2ln\3\2\2\2mX\3\2\2\2m_\3\2\2\2mf\3\2\2\2n\21\3\2\2\2op\7"+
		"\5\2\2p~\5\6\4\2qr\7\5\2\2rs\7\20\2\2st\5\6\4\2tu\7\21\2\2u~\3\2\2\2v"+
		"w\7\5\2\2w~\5\"\22\2xy\7\5\2\2yz\7\20\2\2z{\5\"\22\2{|\7\21\2\2|~\3\2"+
		"\2\2}o\3\2\2\2}q\3\2\2\2}v\3\2\2\2}x\3\2\2\2~\23\3\2\2\2\177\u0080\7\6"+
		"\2\2\u0080\u0081\7\20\2\2\u0081\u0082\5\6\4\2\u0082\u0083\7\22\2\2\u0083"+
		"\u0084\5\6\4\2\u0084\u0085\7\21\2\2\u0085\u008e\3\2\2\2\u0086\u0087\7"+
		"\6\2\2\u0087\u0088\7\20\2\2\u0088\u0089\5\"\22\2\u0089\u008a\7\22\2\2"+
		"\u008a\u008b\5\"\22\2\u008b\u008c\7\21\2\2\u008c\u008e\3\2\2\2\u008d\177"+
		"\3\2\2\2\u008d\u0086\3\2\2\2\u008e\25\3\2\2\2\u008f\u0090\7\7\2\2\u0090"+
		"\u0097\5\"\22\2\u0091\u0092\7\7\2\2\u0092\u0093\7\20\2\2\u0093\u0094\5"+
		"\"\22\2\u0094\u0095\7\21\2\2\u0095\u0097\3\2\2\2\u0096\u008f\3\2\2\2\u0096"+
		"\u0091\3\2\2\2\u0097\27\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u00a7\5\6\4"+
		"\2\u009a\u009b\7\b\2\2\u009b\u009c\7\20\2\2\u009c\u009d\5\6\4\2\u009d"+
		"\u009e\7\21\2\2\u009e\u00a7\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a7\5"+
		"\"\22\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4\5\"\22\2"+
		"\u00a4\u00a5\7\21\2\2\u00a5\u00a7\3\2\2\2\u00a6\u0098\3\2\2\2\u00a6\u009a"+
		"\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7\31\3\2\2\2\u00a8"+
		"\u00a9\7\t\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\5\6\4\2\u00ab\u00ac\7"+
		"\22\2\2\u00ac\u00ad\7\r\2\2\u00ad\u00ae\7\21\2\2\u00ae\u00b7\3\2\2\2\u00af"+
		"\u00b0\7\t\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00b2\5\"\22\2\u00b2\u00b3\7"+
		"\22\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00a8\3\2\2\2\u00b6\u00af\3\2\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\7\n\2"+
		"\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\5\6\4\2\u00bb\u00bc\7\22\2\2\u00bc"+
		"\u00bd\5\6\4\2\u00bd\u00be\7\21\2\2\u00be\u00f9\3\2\2\2\u00bf\u00c0\7"+
		"\n\2\2\u00c0\u00c1\7\20\2\2\u00c1\u00c2\5\6\4\2\u00c2\u00c3\7\22\2\2\u00c3"+
		"\u00c4\5\6\4\2\u00c4\u00c5\7\22\2\2\u00c5\u00c6\7\r\2\2\u00c6\u00c7\7"+
		"\21\2\2\u00c7\u00f9\3\2\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\7\20\2\2\u00ca"+
		"\u00cb\5\"\22\2\u00cb\u00cc\7\22\2\2\u00cc\u00cd\5\6\4\2\u00cd\u00ce\7"+
		"\21\2\2\u00ce\u00f9\3\2\2\2\u00cf\u00d0\7\n\2\2\u00d0\u00d1\7\20\2\2\u00d1"+
		"\u00d2\5\"\22\2\u00d2\u00d3\7\22\2\2\u00d3\u00d4\5\6\4\2\u00d4\u00d5\7"+
		"\22\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00f9\3\2\2\2\u00d8"+
		"\u00d9\7\n\2\2\u00d9\u00da\7\20\2\2\u00da\u00db\5\6\4\2\u00db\u00dc\7"+
		"\22\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\21\2\2\u00de\u00f9\3\2\2\2"+
		"\u00df\u00e0\7\n\2\2\u00e0\u00e1\7\20\2\2\u00e1\u00e2\5\6\4\2\u00e2\u00e3"+
		"\7\22\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\7\22\2\2\u00e5\u00e6\7\r\2"+
		"\2\u00e6\u00e7\7\21\2\2\u00e7\u00f9\3\2\2\2\u00e8\u00e9\7\n\2\2\u00e9"+
		"\u00ea\7\20\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00ec\7\22\2\2\u00ec\u00ed"+
		"\5\"\22\2\u00ed\u00ee\7\21\2\2\u00ee\u00f9\3\2\2\2\u00ef\u00f0\7\n\2\2"+
		"\u00f0\u00f1\7\20\2\2\u00f1\u00f2\5\"\22\2\u00f2\u00f3\7\22\2\2\u00f3"+
		"\u00f4\5\"\22\2\u00f4\u00f5\7\22\2\2\u00f5\u00f6\7\r\2\2\u00f6\u00f7\7"+
		"\21\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00b8\3\2\2\2\u00f8\u00bf\3\2\2\2\u00f8"+
		"\u00c8\3\2\2\2\u00f8\u00cf\3\2\2\2\u00f8\u00d8\3\2\2\2\u00f8\u00df\3\2"+
		"\2\2\u00f8\u00e8\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u00fb"+
		"\7\f\2\2\u00fb\u00fc\7\13\2\2\u00fc\u0101\5\6\4\2\u00fd\u00fe\7\f\2\2"+
		"\u00fe\u00ff\7\13\2\2\u00ff\u0101\5\"\22\2\u0100\u00fa\3\2\2\2\u0100\u00fd"+
		"\3\2\2\2\u0101\37\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104\7\17\2\2\u0104"+
		"!\3\2\2\2\u0105\u0106\7\r\2\2\u0106#\3\2\2\2\20\',\61\67?Vm}\u008d\u0096"+
		"\u00a6\u00b6\u00f8\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}