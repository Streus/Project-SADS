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
		ID=10, INT=11, USER_ALPHA=12, FILE_EXT=13, LP=14, RP=15, COMMA=16, MUL=17, 
		DIV=18, ADD=19, SUB=20, LETTER=21, NEWLINE=22, LN_COMMENT=23, COMMENT=24, 
		WS=25;
	public static final int
		RULE_prog = 0, RULE_init = 1, RULE_cmd = 2, RULE_vardef = 3, RULE_strcmd = 4, 
		RULE_predef = 5, RULE_sub = 6, RULE_cmp = 7, RULE_ct = 8, RULE_sp = 9, 
		RULE_build = 10, RULE_sm = 11, RULE_wordct = 12, RULE_concat = 13, RULE_assignment = 14, 
		RULE_func = 15, RULE_file = 16, RULE_expr = 17;
	public static final String[] ruleNames = {
		"prog", "init", "cmd", "vardef", "strcmd", "predef", "sub", "cmp", "ct", 
		"sp", "build", "sm", "wordct", "concat", "assignment", "func", "file", 
		"expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wordcount'", 
		"'concat'", "':='", null, null, null, null, "'('", "')'", "','", "'*'", 
		"'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"USER_ALPHA", "FILE_EXT", "LP", "RP", "COMMA", "MUL", "DIV", "ADD", "SUB", 
		"LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				cmd();
				}
				}
				setState(39); 
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
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				func();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				vardef();
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
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
				setState(49);
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
			setState(52);
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				sub();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				ct();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				sp();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				build();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				sm();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				wordct();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
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
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
	public static class SubstitutionOfFilesContext extends SubContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public SubstitutionOfFilesContext(SubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterSubstitutionOfFiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitSubstitutionOfFiles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitSubstitutionOfFiles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SubstitutionOfFilesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__0);
				setState(67);
				match(LP);
				setState(68);
				file();
				setState(69);
				match(COMMA);
				setState(70);
				file();
				setState(71);
				match(RP);
				setState(72);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new SubstitutionOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__0);
				setState(75);
				match(LP);
				setState(76);
				expr();
				setState(77);
				match(COMMA);
				setState(78);
				expr();
				setState(79);
				match(RP);
				setState(80);
				match(NEWLINE);
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
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
	public static class ComparisonOfFilesContext extends CmpContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public ComparisonOfFilesContext(CmpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterComparisonOfFiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitComparisonOfFiles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitComparisonOfFiles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmp);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ComparisonOfFilesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__1);
				setState(85);
				match(LP);
				setState(86);
				file();
				setState(87);
				match(COMMA);
				setState(88);
				file();
				setState(89);
				match(RP);
				setState(90);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new ComparisonOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__1);
				setState(93);
				match(LP);
				setState(94);
				expr();
				setState(95);
				match(COMMA);
				setState(96);
				expr();
				setState(97);
				match(RP);
				setState(98);
				match(NEWLINE);
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
	public static class CuttingTimesOfFileInParensContext extends CtContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public CuttingTimesOfFileInParensContext(CtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterCuttingTimesOfFileInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitCuttingTimesOfFileInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitCuttingTimesOfFileInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CuttingTimesOfExpressionInParensContext extends CtContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
	public static class CuttingTimesOfFileContext extends CtContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public CuttingTimesOfFileContext(CtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterCuttingTimesOfFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitCuttingTimesOfFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitCuttingTimesOfFile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CuttingTimesOfExpressionContext extends CtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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

	public final CtContext ct() throws RecognitionException {
		CtContext _localctx = new CtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ct);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CuttingTimesOfFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__2);
				setState(103);
				file();
				setState(104);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new CuttingTimesOfFileInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T__2);
				setState(107);
				match(LP);
				setState(108);
				file();
				setState(109);
				match(RP);
				setState(110);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new CuttingTimesOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(T__2);
				setState(113);
				expr();
				setState(114);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new CuttingTimesOfExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(T__2);
				setState(117);
				match(LP);
				setState(118);
				expr();
				setState(119);
				match(RP);
				setState(120);
				match(NEWLINE);
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
	public static class StarProductOfFilesContext extends SpContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public StarProductOfFilesContext(SpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterStarProductOfFiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitStarProductOfFiles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitStarProductOfFiles(this);
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
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StarProductOfFilesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__3);
				setState(125);
				match(LP);
				setState(126);
				file();
				setState(127);
				match(COMMA);
				setState(128);
				file();
				setState(129);
				match(RP);
				setState(130);
				match(NEWLINE);
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
				setState(138);
				match(NEWLINE);
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
	public static class BuildFileContext extends BuildContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public BuildFileContext(BuildContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterBuildFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitBuildFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitBuildFile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuildExpressionContext extends BuildContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
	public static class BuildFileInParensContext extends BuildContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public BuildFileInParensContext(BuildContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterBuildFileInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitBuildFileInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitBuildFileInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuildExpressionInParensContext extends BuildContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BuildFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__4);
				setState(143);
				file();
				setState(144);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new BuildFileInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__4);
				setState(147);
				match(LP);
				setState(148);
				file();
				setState(149);
				match(RP);
				setState(150);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new BuildExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(T__4);
				setState(153);
				expr();
				setState(154);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new BuildExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(T__4);
				setState(157);
				match(LP);
				setState(158);
				expr();
				setState(159);
				match(RP);
				setState(160);
				match(NEWLINE);
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
	public static class ShiftMaximalityOfFileInParensContext extends SmContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public ShiftMaximalityOfFileInParensContext(SmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterShiftMaximalityOfFileInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitShiftMaximalityOfFileInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitShiftMaximalityOfFileInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftMaximalityOfExpressionInParensContext extends SmContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
	public static class ShiftMaximalityOfFileContext extends SmContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public ShiftMaximalityOfFileContext(SmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterShiftMaximalityOfFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitShiftMaximalityOfFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitShiftMaximalityOfFile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftMaximalityOfExpressionContext extends SmContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ShiftMaximalityOfFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__5);
				setState(165);
				file();
				setState(166);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new ShiftMaximalityOfFileInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__5);
				setState(169);
				match(LP);
				setState(170);
				file();
				setState(171);
				match(RP);
				setState(172);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new ShiftMaximalityOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(T__5);
				setState(175);
				expr();
				setState(176);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new ShiftMaximalityOfExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(T__5);
				setState(179);
				match(LP);
				setState(180);
				expr();
				setState(181);
				match(RP);
				setState(182);
				match(NEWLINE);
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
	public static class WordCountOfFileContext extends WordctContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public WordCountOfFileContext(WordctContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterWordCountOfFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitWordCountOfFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitWordCountOfFile(this);
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
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new WordCountOfFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__6);
				setState(187);
				match(LP);
				setState(188);
				file();
				setState(189);
				match(COMMA);
				setState(190);
				file();
				setState(191);
				match(RP);
				setState(192);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new WordCountOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__6);
				setState(195);
				match(LP);
				setState(196);
				expr();
				setState(197);
				match(COMMA);
				setState(198);
				match(INT);
				setState(199);
				match(RP);
				setState(200);
				match(NEWLINE);
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
	public static class ConcatOn2FilesAtIndexContext extends ConcatContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public ConcatOn2FilesAtIndexContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOn2FilesAtIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOn2FilesAtIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOn2FilesAtIndex(this);
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
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
	public static class ConcatOn2filesContext extends ConcatContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public ConcatOn2filesContext(ConcatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterConcatOn2files(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitConcatOn2files(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitConcatOn2files(this);
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
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ConcatOn2filesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__7);
				setState(205);
				match(LP);
				setState(206);
				file();
				setState(207);
				match(COMMA);
				setState(208);
				file();
				setState(209);
				match(RP);
				setState(210);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new ConcatOn2FilesAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__7);
				setState(213);
				match(LP);
				setState(214);
				file();
				setState(215);
				match(COMMA);
				setState(216);
				file();
				setState(217);
				match(COMMA);
				setState(218);
				match(INT);
				setState(219);
				match(RP);
				setState(220);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new ConcatOn2ExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(T__7);
				setState(223);
				match(LP);
				setState(224);
				expr();
				setState(225);
				match(COMMA);
				setState(226);
				expr();
				setState(227);
				match(RP);
				setState(228);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new ConcatOn2ExpressionsAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 4);
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
				match(COMMA);
				setState(236);
				match(INT);
				setState(237);
				match(RP);
				setState(238);
				match(NEWLINE);
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
	public static class AssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(SequenceAnalyzerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SequenceAnalyzerParser.NEWLINE, 0); }
		public AssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(ID);
			setState(243);
			match(T__8);
			setState(244);
			expr();
			setState(245);
			match(NEWLINE);
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

	public static class FuncContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public List<TerminalNode> LP() { return getTokens(SequenceAnalyzerParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(SequenceAnalyzerParser.LP, i);
		}
		public List<TerminalNode> RP() { return getTokens(SequenceAnalyzerParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(SequenceAnalyzerParser.RP, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				cmd();
				setState(249);
				file();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				cmd();
				setState(252);
				file();
				setState(253);
				file();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				cmd();
				setState(256);
				match(LP);
				setState(257);
				file();
				setState(258);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				cmd();
				setState(261);
				match(LP);
				setState(262);
				file();
				setState(263);
				match(RP);
				setState(264);
				match(LP);
				setState(265);
				file();
				setState(266);
				match(RP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				cmd();
				setState(269);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				cmd();
				setState(272);
				expr();
				setState(273);
				expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				cmd();
				setState(276);
				match(LP);
				setState(277);
				expr();
				setState(278);
				match(RP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(280);
				cmd();
				setState(281);
				match(LP);
				setState(282);
				expr();
				setState(283);
				match(RP);
				setState(284);
				match(LP);
				setState(285);
				expr();
				setState(286);
				match(RP);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(288);
				cmd();
				setState(289);
				func();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(291);
				cmd();
				setState(292);
				match(LP);
				setState(293);
				func();
				setState(294);
				match(RP);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(296);
				cmd();
				setState(297);
				match(LP);
				setState(298);
				func();
				setState(299);
				match(RP);
				setState(300);
				match(LP);
				setState(301);
				func();
				setState(302);
				match(RP);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(304);
				match(LP);
				setState(305);
				func();
				setState(306);
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
		enterRule(_localctx, 32, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ID);
			setState(311);
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
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(SequenceAnalyzerParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
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
	public static class CommandContext extends ExprContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CommandContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(INT);
				}
				break;
			case 3:
				_localctx = new CommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				cmd();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0141\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3"+
		"\4\5\4\65\n\4\3\5\3\5\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7C\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"U\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\tg\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n}\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00a5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cd\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f3\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0137\n\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\5\23\u013f\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$\2\2\2\u0158\2\'\3\2\2\2\4/\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n:\3\2"+
		"\2\2\fB\3\2\2\2\16T\3\2\2\2\20f\3\2\2\2\22|\3\2\2\2\24\u008e\3\2\2\2\26"+
		"\u00a4\3\2\2\2\30\u00ba\3\2\2\2\32\u00cc\3\2\2\2\34\u00f2\3\2\2\2\36\u00f4"+
		"\3\2\2\2 \u0136\3\2\2\2\"\u0138\3\2\2\2$\u013e\3\2\2\2&(\5\6\4\2\'&\3"+
		"\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+\60\5\6\4\2,\60\5 \21"+
		"\2-\60\5$\23\2.\60\7\f\2\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60"+
		"\5\3\2\2\2\61\65\5\b\5\2\62\65\5\n\6\2\63\65\5\f\7\2\64\61\3\2\2\2\64"+
		"\62\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\66\67\5\36\20\2\67\t\3\2\2\28;"+
		"\5\16\b\29;\5\20\t\2:8\3\2\2\2:9\3\2\2\2;\13\3\2\2\2<C\5\22\n\2=C\5\24"+
		"\13\2>C\5\26\f\2?C\5\30\r\2@C\5\32\16\2AC\5\34\17\2B<\3\2\2\2B=\3\2\2"+
		"\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\r\3\2\2\2DE\7\3\2\2EF\7\20"+
		"\2\2FG\5\"\22\2GH\7\22\2\2HI\5\"\22\2IJ\7\21\2\2JK\7\30\2\2KU\3\2\2\2"+
		"LM\7\3\2\2MN\7\20\2\2NO\5$\23\2OP\7\22\2\2PQ\5$\23\2QR\7\21\2\2RS\7\30"+
		"\2\2SU\3\2\2\2TD\3\2\2\2TL\3\2\2\2U\17\3\2\2\2VW\7\4\2\2WX\7\20\2\2XY"+
		"\5\"\22\2YZ\7\22\2\2Z[\5\"\22\2[\\\7\21\2\2\\]\7\30\2\2]g\3\2\2\2^_\7"+
		"\4\2\2_`\7\20\2\2`a\5$\23\2ab\7\22\2\2bc\5$\23\2cd\7\21\2\2de\7\30\2\2"+
		"eg\3\2\2\2fV\3\2\2\2f^\3\2\2\2g\21\3\2\2\2hi\7\5\2\2ij\5\"\22\2jk\7\30"+
		"\2\2k}\3\2\2\2lm\7\5\2\2mn\7\20\2\2no\5\"\22\2op\7\21\2\2pq\7\30\2\2q"+
		"}\3\2\2\2rs\7\5\2\2st\5$\23\2tu\7\30\2\2u}\3\2\2\2vw\7\5\2\2wx\7\20\2"+
		"\2xy\5$\23\2yz\7\21\2\2z{\7\30\2\2{}\3\2\2\2|h\3\2\2\2|l\3\2\2\2|r\3\2"+
		"\2\2|v\3\2\2\2}\23\3\2\2\2~\177\7\6\2\2\177\u0080\7\20\2\2\u0080\u0081"+
		"\5\"\22\2\u0081\u0082\7\22\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7\21\2"+
		"\2\u0084\u0085\7\30\2\2\u0085\u008f\3\2\2\2\u0086\u0087\7\6\2\2\u0087"+
		"\u0088\7\20\2\2\u0088\u0089\5$\23\2\u0089\u008a\7\22\2\2\u008a\u008b\5"+
		"$\23\2\u008b\u008c\7\21\2\2\u008c\u008d\7\30\2\2\u008d\u008f\3\2\2\2\u008e"+
		"~\3\2\2\2\u008e\u0086\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091\7\7\2\2\u0091"+
		"\u0092\5\"\22\2\u0092\u0093\7\30\2\2\u0093\u00a5\3\2\2\2\u0094\u0095\7"+
		"\7\2\2\u0095\u0096\7\20\2\2\u0096\u0097\5\"\22\2\u0097\u0098\7\21\2\2"+
		"\u0098\u0099\7\30\2\2\u0099\u00a5\3\2\2\2\u009a\u009b\7\7\2\2\u009b\u009c"+
		"\5$\23\2\u009c\u009d\7\30\2\2\u009d\u00a5\3\2\2\2\u009e\u009f\7\7\2\2"+
		"\u009f\u00a0\7\20\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3"+
		"\7\30\2\2\u00a3\u00a5\3\2\2\2\u00a4\u0090\3\2\2\2\u00a4\u0094\3\2\2\2"+
		"\u00a4\u009a\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a7"+
		"\7\b\2\2\u00a7\u00a8\5\"\22\2\u00a8\u00a9\7\30\2\2\u00a9\u00bb\3\2\2\2"+
		"\u00aa\u00ab\7\b\2\2\u00ab\u00ac\7\20\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae"+
		"\7\21\2\2\u00ae\u00af\7\30\2\2\u00af\u00bb\3\2\2\2\u00b0\u00b1\7\b\2\2"+
		"\u00b1\u00b2\5$\23\2\u00b2\u00b3\7\30\2\2\u00b3\u00bb\3\2\2\2\u00b4\u00b5"+
		"\7\b\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b7\5$\23\2\u00b7\u00b8\7\21\2\2"+
		"\u00b8\u00b9\7\30\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00a6\3\2\2\2\u00ba\u00aa"+
		"\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba\u00b4\3\2\2\2\u00bb\31\3\2\2\2\u00bc"+
		"\u00bd\7\t\2\2\u00bd\u00be\7\20\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\7"+
		"\22\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\7\30\2\2"+
		"\u00c3\u00cd\3\2\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\7\20\2\2\u00c6\u00c7"+
		"\5$\23\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\7\21\2\2"+
		"\u00ca\u00cb\7\30\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00bc\3\2\2\2\u00cc\u00c4"+
		"\3\2\2\2\u00cd\33\3\2\2\2\u00ce\u00cf\7\n\2\2\u00cf\u00d0\7\20\2\2\u00d0"+
		"\u00d1\5\"\22\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d4"+
		"\7\21\2\2\u00d4\u00d5\7\30\2\2\u00d5\u00f3\3\2\2\2\u00d6\u00d7\7\n\2\2"+
		"\u00d7\u00d8\7\20\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\7\22\2\2\u00da"+
		"\u00db\5\"\22\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\7\r\2\2\u00dd\u00de\7"+
		"\21\2\2\u00de\u00df\7\30\2\2\u00df\u00f3\3\2\2\2\u00e0\u00e1\7\n\2\2\u00e1"+
		"\u00e2\7\20\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4\7\22\2\2\u00e4\u00e5\5"+
		"$\23\2\u00e5\u00e6\7\21\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00f3\3\2\2\2\u00e8"+
		"\u00e9\7\n\2\2\u00e9\u00ea\7\20\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\7"+
		"\22\2\2\u00ec\u00ed\5$\23\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\7\r\2\2\u00ef"+
		"\u00f0\7\21\2\2\u00f0\u00f1\7\30\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ce\3"+
		"\2\2\2\u00f2\u00d6\3\2\2\2\u00f2\u00e0\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f3"+
		"\35\3\2\2\2\u00f4\u00f5\7\f\2\2\u00f5\u00f6\7\13\2\2\u00f6\u00f7\5$\23"+
		"\2\u00f7\u00f8\7\30\2\2\u00f8\37\3\2\2\2\u00f9\u0137\5\36\20\2\u00fa\u00fb"+
		"\5\6\4\2\u00fb\u00fc\5\"\22\2\u00fc\u0137\3\2\2\2\u00fd\u00fe\5\6\4\2"+
		"\u00fe\u00ff\5\"\22\2\u00ff\u0100\5\"\22\2\u0100\u0137\3\2\2\2\u0101\u0102"+
		"\5\6\4\2\u0102\u0103\7\20\2\2\u0103\u0104\5\"\22\2\u0104\u0105\7\21\2"+
		"\2\u0105\u0137\3\2\2\2\u0106\u0107\5\6\4\2\u0107\u0108\7\20\2\2\u0108"+
		"\u0109\5\"\22\2\u0109\u010a\7\21\2\2\u010a\u010b\7\20\2\2\u010b\u010c"+
		"\5\"\22\2\u010c\u010d\7\21\2\2\u010d\u0137\3\2\2\2\u010e\u010f\5\6\4\2"+
		"\u010f\u0110\5$\23\2\u0110\u0137\3\2\2\2\u0111\u0112\5\6\4\2\u0112\u0113"+
		"\5$\23\2\u0113\u0114\5$\23\2\u0114\u0137\3\2\2\2\u0115\u0116\5\6\4\2\u0116"+
		"\u0117\7\20\2\2\u0117\u0118\5$\23\2\u0118\u0119\7\21\2\2\u0119\u0137\3"+
		"\2\2\2\u011a\u011b\5\6\4\2\u011b\u011c\7\20\2\2\u011c\u011d\5$\23\2\u011d"+
		"\u011e\7\21\2\2\u011e\u011f\7\20\2\2\u011f\u0120\5$\23\2\u0120\u0121\7"+
		"\21\2\2\u0121\u0137\3\2\2\2\u0122\u0123\5\6\4\2\u0123\u0124\5 \21\2\u0124"+
		"\u0137\3\2\2\2\u0125\u0126\5\6\4\2\u0126\u0127\7\20\2\2\u0127\u0128\5"+
		" \21\2\u0128\u0129\7\21\2\2\u0129\u0137\3\2\2\2\u012a\u012b\5\6\4\2\u012b"+
		"\u012c\7\20\2\2\u012c\u012d\5 \21\2\u012d\u012e\7\21\2\2\u012e\u012f\7"+
		"\20\2\2\u012f\u0130\5 \21\2\u0130\u0131\7\21\2\2\u0131\u0137\3\2\2\2\u0132"+
		"\u0133\7\20\2\2\u0133\u0134\5 \21\2\u0134\u0135\7\21\2\2\u0135\u0137\3"+
		"\2\2\2\u0136\u00f9\3\2\2\2\u0136\u00fa\3\2\2\2\u0136\u00fd\3\2\2\2\u0136"+
		"\u0101\3\2\2\2\u0136\u0106\3\2\2\2\u0136\u010e\3\2\2\2\u0136\u0111\3\2"+
		"\2\2\u0136\u0115\3\2\2\2\u0136\u011a\3\2\2\2\u0136\u0122\3\2\2\2\u0136"+
		"\u0125\3\2\2\2\u0136\u012a\3\2\2\2\u0136\u0132\3\2\2\2\u0137!\3\2\2\2"+
		"\u0138\u0139\7\f\2\2\u0139\u013a\7\17\2\2\u013a#\3\2\2\2\u013b\u013f\7"+
		"\f\2\2\u013c\u013f\7\r\2\2\u013d\u013f\5\6\4\2\u013e\u013b\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f%\3\2\2\2\21)/\64:BTf|\u008e\u00a4"+
		"\u00ba\u00cc\u00f2\u0136\u013e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}