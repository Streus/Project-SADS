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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, INT=16, STRING=17, 
		LP=18, RP=19, LCB=20, RCB=21, COMMA=22, DBQUOTE=23, STRING_LITERAL=24, 
		MAPPING_DELIMETER=25, LETTER=26, NEWLINE=27, LN_COMMENT=28, COMMENT=29, 
		WS=30;
	public static final int
		RULE_init = 0, RULE_prog = 1, RULE_cmd = 2, RULE_vardef = 3, RULE_strcmd = 4, 
		RULE_predef = 5, RULE_sub = 6, RULE_cmp = 7, RULE_ct = 8, RULE_sp = 9, 
		RULE_build = 10, RULE_sm = 11, RULE_wordct = 12, RULE_concat = 13, RULE_assignment = 14, 
		RULE_retreival = 15, RULE_array_def = 16, RULE_rules = 17, RULE_derive = 18, 
		RULE_print = 19, RULE_literal = 20, RULE_expr = 21, RULE_alpha_mapping = 22;
	public static final String[] ruleNames = {
		"init", "prog", "cmd", "vardef", "strcmd", "predef", "sub", "cmp", "ct", 
		"sp", "build", "sm", "wordct", "concat", "assignment", "retreival", "array_def", 
		"rules", "derive", "print", "literal", "expr", "alpha_mapping"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wc'", "'concat'", 
		"'insert'", "':='", "'def'", "'r'", "'der'", "'print'", null, null, null, 
		"'('", "')'", "'{'", "'}'", "','", "'\"'", null, "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ID", "INT", "STRING", "LP", "RP", "LCB", "RCB", "COMMA", 
		"DBQUOTE", "STRING_LITERAL", "MAPPING_DELIMETER", "LETTER", "NEWLINE", 
		"LN_COMMENT", "COMMENT", "WS"
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
	public static class InitContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
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
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			prog();
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

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				cmd();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << ID) | (1L << INT) | (1L << STRING_LITERAL))) != 0) );
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				vardef();
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				strcmd();
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				predef();
				}
				break;
			case INT:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				literal();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				array_def();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				rules();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				print();
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
		public RetreivalContext retreival() {
			return getRuleContext(RetreivalContext.class,0);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				retreival();
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				sub();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				ct();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				sp();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				build();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				sm();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				wordct();
				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
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
		public ExprContext arg1;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public Alpha_mappingContext alpha_mapping() {
			return getRuleContext(Alpha_mappingContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
	public static class SubstitutionOfExpressionWithIterationsContext extends SubContext {
		public ExprContext arg1;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public Alpha_mappingContext alpha_mapping() {
			return getRuleContext(Alpha_mappingContext.class,0);
		}
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubstitutionOfExpressionWithIterationsContext(SubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterSubstitutionOfExpressionWithIterations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitSubstitutionOfExpressionWithIterations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitSubstitutionOfExpressionWithIterations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SubstitutionOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__0);
				setState(79);
				match(LP);
				setState(80);
				((SubstitutionOfExpressionContext)_localctx).arg1 = expr();
				setState(81);
				match(COMMA);
				setState(82);
				alpha_mapping();
				setState(83);
				match(RP);
				}
				break;
			case 2:
				_localctx = new SubstitutionOfExpressionWithIterationsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__0);
				setState(86);
				match(LP);
				setState(87);
				((SubstitutionOfExpressionWithIterationsContext)_localctx).arg1 = expr();
				setState(88);
				match(COMMA);
				setState(89);
				alpha_mapping();
				setState(90);
				match(COMMA);
				setState(91);
				match(INT);
				setState(92);
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
		public ExprContext arg1;
		public ExprContext arg2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmp);
		try {
			_localctx = new ComparisonOfExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__1);
			setState(97);
			match(LP);
			setState(98);
			((ComparisonOfExpressionContext)_localctx).arg1 = expr();
			setState(99);
			match(COMMA);
			setState(100);
			((ComparisonOfExpressionContext)_localctx).arg2 = expr();
			setState(101);
			match(RP);
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
		public ExprContext arg1;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public ExprContext arg1;
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

	public final CtContext ct() throws RecognitionException {
		CtContext _localctx = new CtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ct);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new CuttingTimesOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__2);
				setState(104);
				((CuttingTimesOfExpressionContext)_localctx).arg1 = expr();
				}
				break;
			case 2:
				_localctx = new CuttingTimesOfExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__2);
				setState(106);
				match(LP);
				setState(107);
				((CuttingTimesOfExpressionInParensContext)_localctx).arg1 = expr();
				setState(108);
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
	public static class StarProductOfExpressionsContext extends SpContext {
		public ExprContext arg1;
		public ExprContext arg2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
			_localctx = new StarProductOfExpressionsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__3);
			setState(113);
			match(LP);
			setState(114);
			((StarProductOfExpressionsContext)_localctx).arg1 = expr();
			setState(115);
			match(COMMA);
			setState(116);
			((StarProductOfExpressionsContext)_localctx).arg2 = expr();
			setState(117);
			match(RP);
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
		public ExprContext arg1;
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
		public ExprContext arg1;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BuildExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__4);
				setState(120);
				((BuildExpressionContext)_localctx).arg1 = expr();
				}
				break;
			case 2:
				_localctx = new BuildExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__4);
				setState(122);
				match(LP);
				setState(123);
				((BuildExpressionInParensContext)_localctx).arg1 = expr();
				setState(124);
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
	public static class ShiftMaximalityOfExpressionInParensContext extends SmContext {
		public ExprContext arg1;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public ExprContext arg1;
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ShiftMaximalityOfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__5);
				setState(129);
				((ShiftMaximalityOfExpressionContext)_localctx).arg1 = expr();
				}
				break;
			case 2:
				_localctx = new ShiftMaximalityOfExpressionInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__5);
				setState(131);
				match(LP);
				setState(132);
				((ShiftMaximalityOfExpressionInParensContext)_localctx).arg1 = expr();
				setState(133);
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
	public static class WordCountOfExpressionContext extends WordctContext {
		public ExprContext arg1;
		public ExprContext arg2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
			_localctx = new WordCountOfExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__6);
			setState(138);
			match(LP);
			setState(139);
			((WordCountOfExpressionContext)_localctx).arg1 = expr();
			setState(140);
			match(COMMA);
			setState(141);
			((WordCountOfExpressionContext)_localctx).arg2 = expr();
			setState(142);
			match(RP);
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
	public static class ConcatOn2ExpressionsContext extends ConcatContext {
		public ExprContext arg1;
		public ExprContext arg2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
	public static class ConcatOn2ExpressionsAtIndexContext extends ConcatContext {
		public ExprContext arg1;
		public ExprContext arg2;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new ConcatOn2ExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__7);
				setState(145);
				match(LP);
				setState(146);
				((ConcatOn2ExpressionsContext)_localctx).arg1 = expr();
				setState(147);
				match(COMMA);
				setState(148);
				((ConcatOn2ExpressionsContext)_localctx).arg2 = expr();
				setState(149);
				match(RP);
				}
				break;
			case T__8:
				_localctx = new ConcatOn2ExpressionsAtIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__8);
				setState(152);
				match(LP);
				setState(153);
				((ConcatOn2ExpressionsAtIndexContext)_localctx).arg1 = expr();
				setState(154);
				match(COMMA);
				setState(155);
				((ConcatOn2ExpressionsAtIndexContext)_localctx).arg2 = expr();
				setState(156);
				match(COMMA);
				setState(157);
				literal();
				setState(158);
				match(RP);
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
		public Token varName;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SequenceAnalyzerParser.ID, 0); }
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

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			_localctx = new AssignVariableOfExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((AssignVariableOfExpressionContext)_localctx).varName = match(ID);
			setState(163);
			match(T__9);
			setState(164);
			expr();
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

	public static class RetreivalContext extends ParserRuleContext {
		public RetreivalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retreival; }
	 
		public RetreivalContext() { }
		public void copyFrom(RetreivalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RetrieveVariableContext extends RetreivalContext {
		public Token variable;
		public TerminalNode ID() { return getToken(SequenceAnalyzerParser.ID, 0); }
		public RetrieveVariableContext(RetreivalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterRetrieveVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitRetrieveVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitRetrieveVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetreivalContext retreival() throws RecognitionException {
		RetreivalContext _localctx = new RetreivalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_retreival);
		try {
			_localctx = new RetrieveVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((RetrieveVariableContext)_localctx).variable = match(ID);
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

	public static class Array_defContext extends ParserRuleContext {
		public Array_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_def; }
	 
		public Array_defContext() { }
		public void copyFrom(Array_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignUserAlphabetOfStringsInParensContext extends Array_defContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode LCB() { return getToken(SequenceAnalyzerParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(SequenceAnalyzerParser.RCB, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(SequenceAnalyzerParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(SequenceAnalyzerParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public AssignUserAlphabetOfStringsInParensContext(Array_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterAssignUserAlphabetOfStringsInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitAssignUserAlphabetOfStringsInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitAssignUserAlphabetOfStringsInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignUserAlphabetOfStringsWithRulesContext extends Array_defContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode LCB() { return getToken(SequenceAnalyzerParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(SequenceAnalyzerParser.RCB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(SequenceAnalyzerParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(SequenceAnalyzerParser.STRING_LITERAL, i);
		}
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public AssignUserAlphabetOfStringsWithRulesContext(Array_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterAssignUserAlphabetOfStringsWithRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitAssignUserAlphabetOfStringsWithRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitAssignUserAlphabetOfStringsWithRules(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignUserAlphabetOfStringsContext extends Array_defContext {
		public TerminalNode LCB() { return getToken(SequenceAnalyzerParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(SequenceAnalyzerParser.RCB, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(SequenceAnalyzerParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(SequenceAnalyzerParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public AssignUserAlphabetOfStringsContext(Array_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterAssignUserAlphabetOfStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitAssignUserAlphabetOfStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitAssignUserAlphabetOfStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_defContext array_def() throws RecognitionException {
		Array_defContext _localctx = new Array_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_def);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignUserAlphabetOfStringsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__10);
				setState(169);
				match(LCB);
				{
				setState(170);
				match(STRING_LITERAL);
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(171);
					match(COMMA);
					setState(172);
					match(STRING_LITERAL);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(RCB);
				}
				break;
			case 2:
				_localctx = new AssignUserAlphabetOfStringsInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__10);
				setState(180);
				match(LP);
				setState(181);
				match(LCB);
				{
				setState(182);
				match(STRING_LITERAL);
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(183);
					match(COMMA);
					setState(184);
					match(STRING_LITERAL);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(RCB);
				setState(191);
				match(RP);
				}
				break;
			case 3:
				_localctx = new AssignUserAlphabetOfStringsWithRulesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(T__10);
				setState(193);
				match(LP);
				setState(194);
				match(LCB);
				{
				setState(195);
				match(STRING_LITERAL);
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(196);
					match(COMMA);
					setState(197);
					match(STRING_LITERAL);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(RCB);
				setState(204);
				match(COMMA);
				{
				setState(205);
				rules();
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(206);
					match(COMMA);
					setState(207);
					rules();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class RulesContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public List<TerminalNode> INT() { return getTokens(SequenceAnalyzerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SequenceAnalyzerParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__11);
			setState(218);
			match(LP);
			{
			setState(219);
			match(INT);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				match(INT);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(RP);
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

	public static class DeriveContext extends ParserRuleContext {
		public DeriveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derive; }
	 
		public DeriveContext() { }
		public void copyFrom(DeriveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeriveAlphabetWithVariableContext extends DeriveContext {
		public Token alphabetName;
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public TerminalNode ID() { return getToken(SequenceAnalyzerParser.ID, 0); }
		public DeriveAlphabetWithVariableContext(DeriveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterDeriveAlphabetWithVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitDeriveAlphabetWithVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitDeriveAlphabetWithVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeriveAlphabetContext extends DeriveContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SequenceAnalyzerParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public DeriveAlphabetContext(DeriveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterDeriveAlphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitDeriveAlphabet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitDeriveAlphabet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeriveContext derive() throws RecognitionException {
		DeriveContext _localctx = new DeriveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_derive);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DeriveAlphabetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__12);
				setState(230);
				match(LP);
				setState(231);
				array_def();
				setState(232);
				match(COMMA);
				setState(233);
				match(INT);
				setState(234);
				match(RP);
				}
				break;
			case 2:
				_localctx = new DeriveAlphabetWithVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(T__12);
				setState(237);
				match(LP);
				setState(238);
				((DeriveAlphabetWithVariableContext)_localctx).alphabetName = match(ID);
				setState(239);
				match(COMMA);
				setState(240);
				match(INT);
				setState(241);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintArrayInParensContext extends PrintContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public PrintArrayInParensContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterPrintArrayInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitPrintArrayInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitPrintArrayInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintCommandContext extends PrintContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public PrintCommandContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterPrintCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitPrintCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitPrintCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintCommandInParensContext extends PrintContext {
		public TerminalNode LP() { return getToken(SequenceAnalyzerParser.LP, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode RP() { return getToken(SequenceAnalyzerParser.RP, 0); }
		public PrintCommandInParensContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterPrintCommandInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitPrintCommandInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitPrintCommandInParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintArrayContext extends PrintContext {
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
		}
		public PrintArrayContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterPrintArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitPrintArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitPrintArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new PrintArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__13);
				setState(245);
				array_def();
				}
				break;
			case 2:
				_localctx = new PrintArrayInParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__13);
				setState(247);
				match(LP);
				setState(248);
				array_def();
				setState(249);
				match(RP);
				}
				break;
			case 3:
				_localctx = new PrintCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(T__13);
				setState(252);
				cmd();
				}
				break;
			case 4:
				_localctx = new PrintCommandInParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(T__13);
				setState(254);
				match(LP);
				setState(255);
				cmd();
				setState(256);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public Token value;
		public TerminalNode STRING_LITERAL() { return getToken(SequenceAnalyzerParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends LiteralContext {
		public Token value;
		public TerminalNode INT() { return getToken(SequenceAnalyzerParser.INT, 0); }
		public IntegerLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((StringLiteralContext)_localctx).value = match(STRING_LITERAL);
				}
				break;
			case INT:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((IntegerLiteralContext)_localctx).value = match(INT);
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
	public static class ExpressionOfCommandContext extends ExprContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ExpressionOfCommandContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterExpressionOfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitExpressionOfCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitExpressionOfCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		try {
			_localctx = new ExpressionOfCommandContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			cmd();
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

	public static class Alpha_mappingContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(SequenceAnalyzerParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(SequenceAnalyzerParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> MAPPING_DELIMETER() { return getTokens(SequenceAnalyzerParser.MAPPING_DELIMETER); }
		public TerminalNode MAPPING_DELIMETER(int i) {
			return getToken(SequenceAnalyzerParser.MAPPING_DELIMETER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SequenceAnalyzerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SequenceAnalyzerParser.COMMA, i);
		}
		public Alpha_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).enterAlpha_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SequenceAnalyzerListener ) ((SequenceAnalyzerListener)listener).exitAlpha_mapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SequenceAnalyzerVisitor ) return ((SequenceAnalyzerVisitor<? extends T>)visitor).visitAlpha_mapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alpha_mappingContext alpha_mapping() throws RecognitionException {
		Alpha_mappingContext _localctx = new Alpha_mappingContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alpha_mapping);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(STRING_LITERAL);
			setState(267);
			match(MAPPING_DELIMETER);
			setState(268);
			match(STRING_LITERAL);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					match(COMMA);
					setState(270);
					match(STRING_LITERAL);
					setState(271);
					match(MAPPING_DELIMETER);
					setState(272);
					match(STRING_LITERAL);
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\6\3\64\n\3\r\3\16\3\65\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5"+
		"\5\5C\n\5\3\6\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00b0\n\22\f\22\16\22\u00b3\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00bc\n\22\f\22\16\22\u00bf\13\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c9\n\22\f\22\16\22\u00cc\13\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00d3\n\22\f\22\16\22\u00d6\13\22\3\22"+
		"\3\22\5\22\u00da\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u00e1\n\23\f\23\16"+
		"\23\u00e4\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00f5\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0105\n\25\3\26\3\26\5\26\u0109"+
		"\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0114\n\30\f\30"+
		"\16\30\u0117\13\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\2\2\2\u0121\2\60\3\2\2\2\4\63\3\2\2\2\6>\3\2\2\2\bB\3\2\2\2"+
		"\nF\3\2\2\2\fN\3\2\2\2\16`\3\2\2\2\20b\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2"+
		"\26\u0080\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u00a2\3\2\2\2\36"+
		"\u00a4\3\2\2\2 \u00a8\3\2\2\2\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u00f4\3"+
		"\2\2\2(\u0104\3\2\2\2*\u0108\3\2\2\2,\u010a\3\2\2\2.\u010c\3\2\2\2\60"+
		"\61\5\4\3\2\61\3\3\2\2\2\62\64\5\6\4\2\63\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67?\5\b\5\28?\5\n\6\29?\5\f\7\2"+
		":?\5*\26\2;?\5\"\22\2<?\5$\23\2=?\5(\25\2>\67\3\2\2\2>8\3\2\2\2>9\3\2"+
		"\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@C\5\36\20\2AC"+
		"\5 \21\2B@\3\2\2\2BA\3\2\2\2C\t\3\2\2\2DG\5\16\b\2EG\5\20\t\2FD\3\2\2"+
		"\2FE\3\2\2\2G\13\3\2\2\2HO\5\22\n\2IO\5\24\13\2JO\5\26\f\2KO\5\30\r\2"+
		"LO\5\32\16\2MO\5\34\17\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2"+
		"\2\2NM\3\2\2\2O\r\3\2\2\2PQ\7\3\2\2QR\7\24\2\2RS\5,\27\2ST\7\30\2\2TU"+
		"\5.\30\2UV\7\25\2\2Va\3\2\2\2WX\7\3\2\2XY\7\24\2\2YZ\5,\27\2Z[\7\30\2"+
		"\2[\\\5.\30\2\\]\7\30\2\2]^\7\22\2\2^_\7\25\2\2_a\3\2\2\2`P\3\2\2\2`W"+
		"\3\2\2\2a\17\3\2\2\2bc\7\4\2\2cd\7\24\2\2de\5,\27\2ef\7\30\2\2fg\5,\27"+
		"\2gh\7\25\2\2h\21\3\2\2\2ij\7\5\2\2jq\5,\27\2kl\7\5\2\2lm\7\24\2\2mn\5"+
		",\27\2no\7\25\2\2oq\3\2\2\2pi\3\2\2\2pk\3\2\2\2q\23\3\2\2\2rs\7\6\2\2"+
		"st\7\24\2\2tu\5,\27\2uv\7\30\2\2vw\5,\27\2wx\7\25\2\2x\25\3\2\2\2yz\7"+
		"\7\2\2z\u0081\5,\27\2{|\7\7\2\2|}\7\24\2\2}~\5,\27\2~\177\7\25\2\2\177"+
		"\u0081\3\2\2\2\u0080y\3\2\2\2\u0080{\3\2\2\2\u0081\27\3\2\2\2\u0082\u0083"+
		"\7\b\2\2\u0083\u008a\5,\27\2\u0084\u0085\7\b\2\2\u0085\u0086\7\24\2\2"+
		"\u0086\u0087\5,\27\2\u0087\u0088\7\25\2\2\u0088\u008a\3\2\2\2\u0089\u0082"+
		"\3\2\2\2\u0089\u0084\3\2\2\2\u008a\31\3\2\2\2\u008b\u008c\7\t\2\2\u008c"+
		"\u008d\7\24\2\2\u008d\u008e\5,\27\2\u008e\u008f\7\30\2\2\u008f\u0090\5"+
		",\27\2\u0090\u0091\7\25\2\2\u0091\33\3\2\2\2\u0092\u0093\7\n\2\2\u0093"+
		"\u0094\7\24\2\2\u0094\u0095\5,\27\2\u0095\u0096\7\30\2\2\u0096\u0097\5"+
		",\27\2\u0097\u0098\7\25\2\2\u0098\u00a3\3\2\2\2\u0099\u009a\7\13\2\2\u009a"+
		"\u009b\7\24\2\2\u009b\u009c\5,\27\2\u009c\u009d\7\30\2\2\u009d\u009e\5"+
		",\27\2\u009e\u009f\7\30\2\2\u009f\u00a0\5*\26\2\u00a0\u00a1\7\25\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u0092\3\2\2\2\u00a2\u0099\3\2\2\2\u00a3\35\3\2\2"+
		"\2\u00a4\u00a5\7\21\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\5,\27\2\u00a7"+
		"\37\3\2\2\2\u00a8\u00a9\7\21\2\2\u00a9!\3\2\2\2\u00aa\u00ab\7\r\2\2\u00ab"+
		"\u00ac\7\26\2\2\u00ac\u00b1\7\32\2\2\u00ad\u00ae\7\30\2\2\u00ae\u00b0"+
		"\7\32\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00da"+
		"\7\27\2\2\u00b5\u00b6\7\r\2\2\u00b6\u00b7\7\24\2\2\u00b7\u00b8\7\26\2"+
		"\2\u00b8\u00bd\7\32\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00bc\7\32\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\27\2\2\u00c1"+
		"\u00da\7\25\2\2\u00c2\u00c3\7\r\2\2\u00c3\u00c4\7\24\2\2\u00c4\u00c5\7"+
		"\26\2\2\u00c5\u00ca\7\32\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c9\7\32\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\27\2\2"+
		"\u00ce\u00cf\7\30\2\2\u00cf\u00d4\5$\23\2\u00d0\u00d1\7\30\2\2\u00d1\u00d3"+
		"\5$\23\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\25"+
		"\2\2\u00d8\u00da\3\2\2\2\u00d9\u00aa\3\2\2\2\u00d9\u00b5\3\2\2\2\u00d9"+
		"\u00c2\3\2\2\2\u00da#\3\2\2\2\u00db\u00dc\7\16\2\2\u00dc\u00dd\7\24\2"+
		"\2\u00dd\u00e2\7\22\2\2\u00de\u00df\7\30\2\2\u00df\u00e1\7\22\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\25\2\2\u00e6"+
		"%\3\2\2\2\u00e7\u00e8\7\17\2\2\u00e8\u00e9\7\24\2\2\u00e9\u00ea\5\"\22"+
		"\2\u00ea\u00eb\7\30\2\2\u00eb\u00ec\7\22\2\2\u00ec\u00ed\7\25\2\2\u00ed"+
		"\u00f5\3\2\2\2\u00ee\u00ef\7\17\2\2\u00ef\u00f0\7\24\2\2\u00f0\u00f1\7"+
		"\21\2\2\u00f1\u00f2\7\30\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f5\7\25\2\2"+
		"\u00f4\u00e7\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00f7\7"+
		"\20\2\2\u00f7\u0105\5\"\22\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa\7\24\2\2"+
		"\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7\25\2\2\u00fc\u0105\3\2\2\2\u00fd\u00fe"+
		"\7\20\2\2\u00fe\u0105\5\6\4\2\u00ff\u0100\7\20\2\2\u0100\u0101\7\24\2"+
		"\2\u0101\u0102\5\6\4\2\u0102\u0103\7\25\2\2\u0103\u0105\3\2\2\2\u0104"+
		"\u00f6\3\2\2\2\u0104\u00f8\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00ff\3\2"+
		"\2\2\u0105)\3\2\2\2\u0106\u0109\7\32\2\2\u0107\u0109\7\22\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0107\3\2\2\2\u0109+\3\2\2\2\u010a\u010b\5\6\4\2\u010b"+
		"-\3\2\2\2\u010c\u010d\7\32\2\2\u010d\u010e\7\33\2\2\u010e\u0115\7\32\2"+
		"\2\u010f\u0110\7\30\2\2\u0110\u0111\7\32\2\2\u0111\u0112\7\33\2\2\u0112"+
		"\u0114\7\32\2\2\u0113\u010f\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116/\3\2\2\2\u0117\u0115\3\2\2\2\26\65>B"+
		"FN`p\u0080\u0089\u00a2\u00b1\u00bd\u00ca\u00d4\u00d9\u00e2\u00f4\u0104"+
		"\u0108\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}