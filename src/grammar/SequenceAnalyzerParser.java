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
		public CmdContext nestedCmd1;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SubstitutionOfFilesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__0);
				setState(64);
				match(LP);
				setState(65);
				file();
				setState(66);
				match(COMMA);
				setState(67);
				file();
				setState(68);
				match(RP);
				}
				break;
			case 2:
				_localctx = new SubstitutionOfCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((SubstitutionOfCommandsContext)_localctx).command = match(T__0);
				setState(71);
				match(LP);
				setState(72);
				((SubstitutionOfCommandsContext)_localctx).nestedCmd1 = cmd();
				setState(73);
				match(COMMA);
				setState(74);
				((SubstitutionOfCommandsContext)_localctx).nestedCmd2 = cmd();
				setState(75);
				match(RP);
				}
				break;
			case 3:
				_localctx = new SubstitutionOfCmdAndExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((SubstitutionOfCmdAndExprContext)_localctx).command = match(T__0);
				setState(78);
				match(LP);
				setState(79);
				((SubstitutionOfCmdAndExprContext)_localctx).nestedCmd1 = cmd();
				setState(80);
				match(COMMA);
				setState(81);
				expr();
				setState(82);
				match(RP);
				}
				break;
			case 4:
				_localctx = new SubstitutionOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(T__0);
				setState(85);
				match(LP);
				setState(86);
				expr();
				setState(87);
				match(COMMA);
				setState(88);
				expr();
				setState(89);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ComparisonOfFilesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__1);
				setState(94);
				match(LP);
				setState(95);
				file();
				setState(96);
				match(COMMA);
				setState(97);
				file();
				setState(98);
				match(RP);
				}
				break;
			case 2:
				_localctx = new ComparisonOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
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
	public static class CuttingTimesOfFileInParensContext extends CtContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CuttingTimesOfFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__2);
				setState(110);
				file();
				}
				break;
			case 2:
				_localctx = new CuttingTimesOfFileInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__2);
				setState(112);
				match(LP);
				setState(113);
				file();
				setState(114);
				match(RP);
				}
				break;
			case 3:
				_localctx = new CuttingTimesOfCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				((CuttingTimesOfCommandContext)_localctx).command = match(T__2);
				setState(117);
				((CuttingTimesOfCommandContext)_localctx).nestedCmd = cmd();
				}
				break;
			case 4:
				_localctx = new CuttingTimesOfCommandInParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				((CuttingTimesOfCommandInParensContext)_localctx).command = match(T__2);
				setState(119);
				match(LP);
				setState(120);
				((CuttingTimesOfCommandInParensContext)_localctx).nestedCmd = cmd();
				setState(121);
				match(RP);
				}
				break;
			case 5:
				_localctx = new CuttingTimesOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(T__2);
				setState(124);
				expr();
				}
				break;
			case 6:
				_localctx = new CuttingTimesOfExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				match(T__2);
				setState(126);
				match(LP);
				setState(127);
				expr();
				setState(128);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StarProductOfFilesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__3);
				setState(133);
				match(LP);
				setState(134);
				file();
				setState(135);
				match(COMMA);
				setState(136);
				file();
				setState(137);
				match(RP);
				}
				break;
			case 2:
				_localctx = new StarProductOfCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((StarProductOfCommandsContext)_localctx).command = match(T__3);
				setState(140);
				match(LP);
				setState(141);
				((StarProductOfCommandsContext)_localctx).nestedCmd1 = cmd();
				setState(142);
				match(COMMA);
				setState(143);
				((StarProductOfCommandsContext)_localctx).nestedCmd2 = cmd();
				setState(144);
				match(RP);
				}
				break;
			case 3:
				_localctx = new StarProductOfExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__3);
				setState(147);
				match(LP);
				setState(148);
				expr();
				setState(149);
				match(COMMA);
				setState(150);
				expr();
				setState(151);
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
	public static class BuildFileContext extends BuildContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BuildFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__4);
				setState(156);
				file();
				}
				break;
			case 2:
				_localctx = new BuildFileInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__4);
				setState(158);
				match(LP);
				setState(159);
				file();
				setState(160);
				match(RP);
				}
				break;
			case 3:
				_localctx = new BuildExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(T__4);
				setState(163);
				expr();
				}
				break;
			case 4:
				_localctx = new BuildExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(T__4);
				setState(165);
				match(LP);
				setState(166);
				expr();
				setState(167);
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
		public Token cmmand;
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
	public static class ShiftMaximalityOfFileInParensContext extends SmContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ShiftMaximalityOfFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__5);
				setState(172);
				file();
				}
				break;
			case 2:
				_localctx = new ShiftMaximalityOfFileInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__5);
				setState(174);
				match(LP);
				setState(175);
				file();
				setState(176);
				match(RP);
				}
				break;
			case 3:
				_localctx = new ShiftMaximalityOfCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				((ShiftMaximalityOfCommandContext)_localctx).command = match(T__5);
				setState(179);
				((ShiftMaximalityOfCommandContext)_localctx).nestedCmd = cmd();
				}
				break;
			case 4:
				_localctx = new ShiftMaximalityOfCommandInParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				((ShiftMaximalityOfCommandInParensContext)_localctx).cmmand = match(T__5);
				setState(181);
				match(LP);
				setState(182);
				((ShiftMaximalityOfCommandInParensContext)_localctx).nestedCmd = cmd();
				setState(183);
				match(RP);
				}
				break;
			case 5:
				_localctx = new ShiftMaximalityOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(T__5);
				setState(186);
				expr();
				}
				break;
			case 6:
				_localctx = new ShiftMaximalityOfExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				match(T__5);
				setState(188);
				match(LP);
				setState(189);
				expr();
				setState(190);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new WordCountOfFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__6);
				setState(195);
				match(LP);
				setState(196);
				file();
				setState(197);
				match(COMMA);
				setState(198);
				file();
				setState(199);
				match(RP);
				}
				break;
			case 2:
				_localctx = new WordCountOfCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((WordCountOfCommandContext)_localctx).command = match(T__6);
				setState(202);
				match(LP);
				setState(203);
				((WordCountOfCommandContext)_localctx).nestedCmd = cmd();
				setState(204);
				match(COMMA);
				setState(205);
				match(INT);
				setState(206);
				match(RP);
				}
				break;
			case 3:
				_localctx = new WordCountOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(T__6);
				setState(209);
				match(LP);
				setState(210);
				expr();
				setState(211);
				match(COMMA);
				setState(212);
				match(INT);
				setState(213);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ConcatOn2filesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__7);
				setState(218);
				match(LP);
				setState(219);
				file();
				setState(220);
				match(COMMA);
				setState(221);
				file();
				setState(222);
				match(RP);
				}
				break;
			case 2:
				_localctx = new ConcatOn2FilesAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__7);
				setState(225);
				match(LP);
				setState(226);
				file();
				setState(227);
				match(COMMA);
				setState(228);
				file();
				setState(229);
				match(COMMA);
				setState(230);
				match(INT);
				setState(231);
				match(RP);
				}
				break;
			case 3:
				_localctx = new ConcatOn2CommandsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				((ConcatOn2CommandsContext)_localctx).command = match(T__7);
				setState(234);
				match(LP);
				setState(235);
				((ConcatOn2CommandsContext)_localctx).nestedCmd1 = cmd();
				setState(236);
				match(COMMA);
				setState(237);
				((ConcatOn2CommandsContext)_localctx).nestedCmd2 = cmd();
				setState(238);
				match(RP);
				}
				break;
			case 4:
				_localctx = new ConcatOn2CommandsAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				((ConcatOn2CommandsAtIndexContext)_localctx).command = match(T__7);
				setState(241);
				match(LP);
				setState(242);
				((ConcatOn2CommandsAtIndexContext)_localctx).nestedCmd1 = cmd();
				setState(243);
				match(COMMA);
				setState(244);
				((ConcatOn2CommandsAtIndexContext)_localctx).nestedCmd2 = cmd();
				setState(245);
				match(COMMA);
				setState(246);
				match(INT);
				setState(247);
				match(RP);
				}
				break;
			case 5:
				_localctx = new ConcatOn2ExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(T__7);
				setState(250);
				match(LP);
				setState(251);
				expr();
				setState(252);
				match(COMMA);
				setState(253);
				expr();
				setState(254);
				match(RP);
				}
				break;
			case 6:
				_localctx = new ConcatOn2ExpressionsAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(T__7);
				setState(257);
				match(LP);
				setState(258);
				expr();
				setState(259);
				match(COMMA);
				setState(260);
				expr();
				setState(261);
				match(COMMA);
				setState(262);
				match(INT);
				setState(263);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AssignVariableOfCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(ID);
				setState(268);
				match(T__8);
				setState(269);
				((AssignVariableOfCommandContext)_localctx).command = cmd();
				}
				break;
			case 2:
				_localctx = new AssignVariableOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(ID);
				setState(271);
				match(T__8);
				setState(272);
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
			setState(275);
			match(ID);
			setState(276);
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
			setState(278);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u011b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\5\4\62\n\4\3"+
		"\5\3\5\3\6\3\6\5\68\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0085\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c3\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00da\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u010c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0114"+
		"\n\20\3\21\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"\2\2\2\u012f\2%\3\2\2\2\4,\3\2\2\2\6\61\3\2\2\2\b\63\3"+
		"\2\2\2\n\67\3\2\2\2\f?\3\2\2\2\16]\3\2\2\2\20m\3\2\2\2\22\u0084\3\2\2"+
		"\2\24\u009b\3\2\2\2\26\u00ab\3\2\2\2\30\u00c2\3\2\2\2\32\u00d9\3\2\2\2"+
		"\34\u010b\3\2\2\2\36\u0113\3\2\2\2 \u0115\3\2\2\2\"\u0118\3\2\2\2$&\5"+
		"\6\4\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)-\5\6\4\2"+
		"*-\5\"\22\2+-\7\f\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2.\62\5\b"+
		"\5\2/\62\5\n\6\2\60\62\5\f\7\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62"+
		"\7\3\2\2\2\63\64\5\36\20\2\64\t\3\2\2\2\658\5\16\b\2\668\5\20\t\2\67\65"+
		"\3\2\2\2\67\66\3\2\2\28\13\3\2\2\29@\5\22\n\2:@\5\24\13\2;@\5\26\f\2<"+
		"@\5\30\r\2=@\5\32\16\2>@\5\34\17\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2"+
		"\2\2?=\3\2\2\2?>\3\2\2\2@\r\3\2\2\2AB\7\3\2\2BC\7\20\2\2CD\5 \21\2DE\7"+
		"\22\2\2EF\5 \21\2FG\7\21\2\2G^\3\2\2\2HI\7\3\2\2IJ\7\20\2\2JK\5\6\4\2"+
		"KL\7\22\2\2LM\5\6\4\2MN\7\21\2\2N^\3\2\2\2OP\7\3\2\2PQ\7\20\2\2QR\5\6"+
		"\4\2RS\7\22\2\2ST\5\"\22\2TU\7\21\2\2U^\3\2\2\2VW\7\3\2\2WX\7\20\2\2X"+
		"Y\5\"\22\2YZ\7\22\2\2Z[\5\"\22\2[\\\7\21\2\2\\^\3\2\2\2]A\3\2\2\2]H\3"+
		"\2\2\2]O\3\2\2\2]V\3\2\2\2^\17\3\2\2\2_`\7\4\2\2`a\7\20\2\2ab\5 \21\2"+
		"bc\7\22\2\2cd\5 \21\2de\7\21\2\2en\3\2\2\2fg\7\4\2\2gh\7\20\2\2hi\5\""+
		"\22\2ij\7\22\2\2jk\5\"\22\2kl\7\21\2\2ln\3\2\2\2m_\3\2\2\2mf\3\2\2\2n"+
		"\21\3\2\2\2op\7\5\2\2p\u0085\5 \21\2qr\7\5\2\2rs\7\20\2\2st\5 \21\2tu"+
		"\7\21\2\2u\u0085\3\2\2\2vw\7\5\2\2w\u0085\5\6\4\2xy\7\5\2\2yz\7\20\2\2"+
		"z{\5\6\4\2{|\7\21\2\2|\u0085\3\2\2\2}~\7\5\2\2~\u0085\5\"\22\2\177\u0080"+
		"\7\5\2\2\u0080\u0081\7\20\2\2\u0081\u0082\5\"\22\2\u0082\u0083\7\21\2"+
		"\2\u0083\u0085\3\2\2\2\u0084o\3\2\2\2\u0084q\3\2\2\2\u0084v\3\2\2\2\u0084"+
		"x\3\2\2\2\u0084}\3\2\2\2\u0084\177\3\2\2\2\u0085\23\3\2\2\2\u0086\u0087"+
		"\7\6\2\2\u0087\u0088\7\20\2\2\u0088\u0089\5 \21\2\u0089\u008a\7\22\2\2"+
		"\u008a\u008b\5 \21\2\u008b\u008c\7\21\2\2\u008c\u009c\3\2\2\2\u008d\u008e"+
		"\7\6\2\2\u008e\u008f\7\20\2\2\u008f\u0090\5\6\4\2\u0090\u0091\7\22\2\2"+
		"\u0091\u0092\5\6\4\2\u0092\u0093\7\21\2\2\u0093\u009c\3\2\2\2\u0094\u0095"+
		"\7\6\2\2\u0095\u0096\7\20\2\2\u0096\u0097\5\"\22\2\u0097\u0098\7\22\2"+
		"\2\u0098\u0099\5\"\22\2\u0099\u009a\7\21\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0086\3\2\2\2\u009b\u008d\3\2\2\2\u009b\u0094\3\2\2\2\u009c\25\3\2\2"+
		"\2\u009d\u009e\7\7\2\2\u009e\u00ac\5 \21\2\u009f\u00a0\7\7\2\2\u00a0\u00a1"+
		"\7\20\2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\7\21\2\2\u00a3\u00ac\3\2\2\2"+
		"\u00a4\u00a5\7\7\2\2\u00a5\u00ac\5\"\22\2\u00a6\u00a7\7\7\2\2\u00a7\u00a8"+
		"\7\20\2\2\u00a8\u00a9\5\"\22\2\u00a9\u00aa\7\21\2\2\u00aa\u00ac\3\2\2"+
		"\2\u00ab\u009d\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a6"+
		"\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00c3\5 \21\2\u00af"+
		"\u00b0\7\b\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b3\7"+
		"\21\2\2\u00b3\u00c3\3\2\2\2\u00b4\u00b5\7\b\2\2\u00b5\u00c3\5\6\4\2\u00b6"+
		"\u00b7\7\b\2\2\u00b7\u00b8\7\20\2\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\7"+
		"\21\2\2\u00ba\u00c3\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00c3\5\"\22\2\u00bd"+
		"\u00be\7\b\2\2\u00be\u00bf\7\20\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\7"+
		"\21\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00ad\3\2\2\2\u00c2\u00af\3\2\2\2\u00c2"+
		"\u00b4\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bd\3\2"+
		"\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\7\20\2\2\u00c6\u00c7"+
		"\5 \21\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\7\21\2\2"+
		"\u00ca\u00da\3\2\2\2\u00cb\u00cc\7\t\2\2\u00cc\u00cd\7\20\2\2\u00cd\u00ce"+
		"\5\6\4\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\7\r\2\2\u00d0\u00d1\7\21\2\2"+
		"\u00d1\u00da\3\2\2\2\u00d2\u00d3\7\t\2\2\u00d3\u00d4\7\20\2\2\u00d4\u00d5"+
		"\5\"\22\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\7\21\2"+
		"\2\u00d8\u00da\3\2\2\2\u00d9\u00c4\3\2\2\2\u00d9\u00cb\3\2\2\2\u00d9\u00d2"+
		"\3\2\2\2\u00da\33\3\2\2\2\u00db\u00dc\7\n\2\2\u00dc\u00dd\7\20\2\2\u00dd"+
		"\u00de\5 \21\2\u00de\u00df\7\22\2\2\u00df\u00e0\5 \21\2\u00e0\u00e1\7"+
		"\21\2\2\u00e1\u010c\3\2\2\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\7\20\2\2\u00e4"+
		"\u00e5\5 \21\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\5 \21\2\u00e7\u00e8\7"+
		"\22\2\2\u00e8\u00e9\7\r\2\2\u00e9\u00ea\7\21\2\2\u00ea\u010c\3\2\2\2\u00eb"+
		"\u00ec\7\n\2\2\u00ec\u00ed\7\20\2\2\u00ed\u00ee\5\6\4\2\u00ee\u00ef\7"+
		"\22\2\2\u00ef\u00f0\5\6\4\2\u00f0\u00f1\7\21\2\2\u00f1\u010c\3\2\2\2\u00f2"+
		"\u00f3\7\n\2\2\u00f3\u00f4\7\20\2\2\u00f4\u00f5\5\6\4\2\u00f5\u00f6\7"+
		"\22\2\2\u00f6\u00f7\5\6\4\2\u00f7\u00f8\7\22\2\2\u00f8\u00f9\7\r\2\2\u00f9"+
		"\u00fa\7\21\2\2\u00fa\u010c\3\2\2\2\u00fb\u00fc\7\n\2\2\u00fc\u00fd\7"+
		"\20\2\2\u00fd\u00fe\5\"\22\2\u00fe\u00ff\7\22\2\2\u00ff\u0100\5\"\22\2"+
		"\u0100\u0101\7\21\2\2\u0101\u010c\3\2\2\2\u0102\u0103\7\n\2\2\u0103\u0104"+
		"\7\20\2\2\u0104\u0105\5\"\22\2\u0105\u0106\7\22\2\2\u0106\u0107\5\"\22"+
		"\2\u0107\u0108\7\22\2\2\u0108\u0109\7\r\2\2\u0109\u010a\7\21\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u00db\3\2\2\2\u010b\u00e2\3\2\2\2\u010b\u00eb\3\2"+
		"\2\2\u010b\u00f2\3\2\2\2\u010b\u00fb\3\2\2\2\u010b\u0102\3\2\2\2\u010c"+
		"\35\3\2\2\2\u010d\u010e\7\f\2\2\u010e\u010f\7\13\2\2\u010f\u0114\5\6\4"+
		"\2\u0110\u0111\7\f\2\2\u0111\u0112\7\13\2\2\u0112\u0114\5\"\22\2\u0113"+
		"\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114\37\3\2\2\2\u0115\u0116\7\f\2"+
		"\2\u0116\u0117\7\17\2\2\u0117!\3\2\2\2\u0118\u0119\7\r\2\2\u0119#\3\2"+
		"\2\2\20\',\61\67?]m\u0084\u009b\u00ab\u00c2\u00d9\u010b\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}