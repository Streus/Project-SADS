package grammar;
// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SequenceAnalyzerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, INT=11, USER_ALPHA=12, LP=13, RP=14, COMMA=15, LETTER=16, NEWLINE=17, 
		LN_COMMENT=18, COMMENT=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ID", "INT", "USER_ALPHA", "LP", "RP", "COMMA", "LETTER", "NEWLINE", "LN_COMMENT", 
		"COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wc'", "'concat'", 
		"':='", null, null, null, "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"USER_ALPHA", "LP", "RP", "COMMA", "LETTER", "NEWLINE", "LN_COMMENT", 
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


	public SequenceAnalyzerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SequenceAnalyzer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13S\n\13\f\13"+
		"\16\13V\13\13\3\f\6\fY\n\f\r\f\16\fZ\3\r\6\r^\n\r\r\r\16\r_\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\6\21i\n\21\r\21\16\21j\3\22\5\22n\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\7\23v\n\23\f\23\16\23y\13\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\7\24\u0083\n\24\f\24\16\24\u0086\13\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\6\25\u008e\n\25\r\25\16\25\u008f\3\25\3\25\4"+
		"w\u0084\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\3\2\62;\3\2\62\63\4\2C\\"+
		"c|\4\2\13\13\"\"\2\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2"+
		"\2\5/\3\2\2\2\7\63\3\2\2\2\t\66\3\2\2\2\139\3\2\2\2\r?\3\2\2\2\17B\3\2"+
		"\2\2\21E\3\2\2\2\23L\3\2\2\2\25O\3\2\2\2\27X\3\2\2\2\31]\3\2\2\2\33a\3"+
		"\2\2\2\35c\3\2\2\2\37e\3\2\2\2!h\3\2\2\2#m\3\2\2\2%q\3\2\2\2\'~\3\2\2"+
		"\2)\u008d\3\2\2\2+,\7u\2\2,-\7w\2\2-.\7d\2\2.\4\3\2\2\2/\60\7e\2\2\60"+
		"\61\7o\2\2\61\62\7r\2\2\62\6\3\2\2\2\63\64\7e\2\2\64\65\7v\2\2\65\b\3"+
		"\2\2\2\66\67\7u\2\2\678\7r\2\28\n\3\2\2\29:\7d\2\2:;\7w\2\2;<\7k\2\2<"+
		"=\7n\2\2=>\7f\2\2>\f\3\2\2\2?@\7u\2\2@A\7o\2\2A\16\3\2\2\2BC\7y\2\2CD"+
		"\7e\2\2D\20\3\2\2\2EF\7e\2\2FG\7q\2\2GH\7p\2\2HI\7e\2\2IJ\7c\2\2JK\7v"+
		"\2\2K\22\3\2\2\2LM\7<\2\2MN\7?\2\2N\24\3\2\2\2OT\5!\21\2PS\5!\21\2QS\5"+
		"\27\f\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\26\3\2\2\2"+
		"VT\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\30\3\2\2"+
		"\2\\^\t\3\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\32\3\2\2\2ab\7"+
		"*\2\2b\34\3\2\2\2cd\7+\2\2d\36\3\2\2\2ef\7.\2\2f \3\2\2\2gi\t\4\2\2hg"+
		"\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\"\3\2\2\2ln\7\17\2\2ml\3\2\2\2"+
		"mn\3\2\2\2no\3\2\2\2op\7\f\2\2p$\3\2\2\2qr\7\61\2\2rs\7\61\2\2sw\3\2\2"+
		"\2tv\13\2\2\2ut\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2"+
		"\2\2z{\7\f\2\2{|\3\2\2\2|}\b\23\2\2}&\3\2\2\2~\177\7\61\2\2\177\u0080"+
		"\7,\2\2\u0080\u0084\3\2\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7,\2\2\u0088\u0089\7\61\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\b\24\2\2\u008b(\3\2\2\2\u008c\u008e\t\5\2\2"+
		"\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\25\2\2\u0092*\3\2\2\2\f\2R"+
		"TZ_jmw\u0084\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}