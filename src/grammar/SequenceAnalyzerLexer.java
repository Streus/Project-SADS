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
		ID=10, INT=11, STRING=12, USER_ALPHA=13, LP=14, RP=15, COMMA=16, DBQUOTE=17, 
		LETTER=18, NEWLINE=19, LN_COMMENT=20, COMMENT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ID", "INT", "STRING", "USER_ALPHA", "LP", "RP", "COMMA", "DBQUOTE", "LETTER", 
		"NEWLINE", "LN_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wc'", "'concat'", 
		"':='", null, null, null, null, "'('", "')'", "','", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"STRING", "USER_ALPHA", "LP", "RP", "COMMA", "DBQUOTE", "LETTER", "NEWLINE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\7\13W\n\13\f\13\16\13Z\13\13\3\f\6\f]\n\f\r\f\16\f^\3\r\3\r\7\r"+
		"c\n\r\f\r\16\rf\13\r\3\16\6\16i\n\16\r\16\16\16j\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\6\23v\n\23\r\23\16\23w\3\24\5\24{\n\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\7\25\u0083\n\25\f\25\16\25\u0086\13\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0090\n\26\f\26\16\26\u0093\13"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u009b\n\27\r\27\16\27\u009c\3\27"+
		"\3\27\4\u0084\u0091\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\3\2\62"+
		";\3\2\62\63\4\2C\\c|\4\2\13\13\"\"\2\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\63\3\2\2\2\7\67\3\2\2\2"+
		"\t:\3\2\2\2\13=\3\2\2\2\rC\3\2\2\2\17F\3\2\2\2\21I\3\2\2\2\23P\3\2\2\2"+
		"\25S\3\2\2\2\27\\\3\2\2\2\31d\3\2\2\2\33h\3\2\2\2\35l\3\2\2\2\37n\3\2"+
		"\2\2!p\3\2\2\2#r\3\2\2\2%u\3\2\2\2\'z\3\2\2\2)~\3\2\2\2+\u008b\3\2\2\2"+
		"-\u009a\3\2\2\2/\60\7u\2\2\60\61\7w\2\2\61\62\7d\2\2\62\4\3\2\2\2\63\64"+
		"\7e\2\2\64\65\7o\2\2\65\66\7r\2\2\66\6\3\2\2\2\678\7e\2\289\7v\2\29\b"+
		"\3\2\2\2:;\7u\2\2;<\7r\2\2<\n\3\2\2\2=>\7d\2\2>?\7w\2\2?@\7k\2\2@A\7n"+
		"\2\2AB\7f\2\2B\f\3\2\2\2CD\7u\2\2DE\7o\2\2E\16\3\2\2\2FG\7y\2\2GH\7e\2"+
		"\2H\20\3\2\2\2IJ\7e\2\2JK\7q\2\2KL\7p\2\2LM\7e\2\2MN\7c\2\2NO\7v\2\2O"+
		"\22\3\2\2\2PQ\7<\2\2QR\7?\2\2R\24\3\2\2\2SX\5%\23\2TW\5%\23\2UW\5\27\f"+
		"\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\26\3\2\2\2ZX\3\2"+
		"\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\30\3\2\2\2`"+
		"c\5%\23\2ac\5\27\f\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"e\32\3\2\2\2fd\3\2\2\2gi\t\3\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2"+
		"\2k\34\3\2\2\2lm\7*\2\2m\36\3\2\2\2no\7+\2\2o \3\2\2\2pq\7.\2\2q\"\3\2"+
		"\2\2rs\7$\2\2s$\3\2\2\2tv\t\4\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2"+
		"\2\2x&\3\2\2\2y{\7\17\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\f\2\2}(\3"+
		"\2\2\2~\177\7\61\2\2\177\u0080\7\61\2\2\u0080\u0084\3\2\2\2\u0081\u0083"+
		"\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7\f\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\25\2\2\u008a*\3\2\2\2\u008b"+
		"\u008c\7\61\2\2\u008c\u008d\7,\2\2\u008d\u0091\3\2\2\2\u008e\u0090\13"+
		"\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7,"+
		"\2\2\u0095\u0096\7\61\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\26\2\2\u0098"+
		",\3\2\2\2\u0099\u009b\t\5\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f"+
		"\b\27\2\2\u009f.\3\2\2\2\16\2VX^bdjwz\u0084\u0091\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}