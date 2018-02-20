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
		ID=10, INT=11, STRING=12, LP=13, RP=14, COMMA=15, DBQUOTE=16, FWDSLSH=17, 
		STRING_LITERAL=18, USER_ALPHA=19, LETTER=20, NEWLINE=21, LN_COMMENT=22, 
		COMMENT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ID", "INT", "STRING", "LP", "RP", "COMMA", "DBQUOTE", "FWDSLSH", "STRING_LITERAL", 
		"USER_ALPHA", "LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wc'", "'concat'", 
		"':='", null, null, null, "'('", "')'", "','", "'\"'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"STRING", "LP", "RP", "COMMA", "DBQUOTE", "FWDSLSH", "STRING_LITERAL", 
		"USER_ALPHA", "LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\7\13[\n\13\f\13\16\13^\13\13\3\f\6\fa\n\f\r"+
		"\f\16\fb\3\r\3\r\6\rg\n\r\r\r\16\rh\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23y\n\23\f\23\16\23|\13\23\3\23"+
		"\3\23\3\24\3\24\3\24\6\24\u0083\n\24\r\24\16\24\u0084\3\25\6\25\u0088"+
		"\n\25\r\25\16\25\u0089\3\26\5\26\u008d\n\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\7\27\u0095\n\27\f\27\16\27\u0098\13\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\7\30\u00a2\n\30\f\30\16\30\u00a5\13\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\6\31\u00ad\n\31\r\31\16\31\u00ae\3\31\3\31\4\u0096\u00a3"+
		"\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\7\3\2\62;\6\2\f\f"+
		"\17\17$$^^\4\2$$^^\4\2C\\c|\4\2\13\13\"\"\2\u00be\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3"+
		"\2\2\2\5\67\3\2\2\2\7;\3\2\2\2\t>\3\2\2\2\13A\3\2\2\2\rG\3\2\2\2\17J\3"+
		"\2\2\2\21M\3\2\2\2\23T\3\2\2\2\25W\3\2\2\2\27`\3\2\2\2\31f\3\2\2\2\33"+
		"j\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!p\3\2\2\2#r\3\2\2\2%t\3\2\2\2\'\u0082"+
		"\3\2\2\2)\u0087\3\2\2\2+\u008c\3\2\2\2-\u0090\3\2\2\2/\u009d\3\2\2\2\61"+
		"\u00ac\3\2\2\2\63\64\7u\2\2\64\65\7w\2\2\65\66\7d\2\2\66\4\3\2\2\2\67"+
		"8\7e\2\289\7o\2\29:\7r\2\2:\6\3\2\2\2;<\7e\2\2<=\7v\2\2=\b\3\2\2\2>?\7"+
		"u\2\2?@\7r\2\2@\n\3\2\2\2AB\7d\2\2BC\7w\2\2CD\7k\2\2DE\7n\2\2EF\7f\2\2"+
		"F\f\3\2\2\2GH\7u\2\2HI\7o\2\2I\16\3\2\2\2JK\7y\2\2KL\7e\2\2L\20\3\2\2"+
		"\2MN\7e\2\2NO\7q\2\2OP\7p\2\2PQ\7e\2\2QR\7c\2\2RS\7v\2\2S\22\3\2\2\2T"+
		"U\7<\2\2UV\7?\2\2V\24\3\2\2\2W\\\5)\25\2X[\5)\25\2Y[\5\27\f\2ZX\3\2\2"+
		"\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\26\3\2\2\2^\\\3\2\2\2_a"+
		"\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\30\3\2\2\2dg\5)\25\2"+
		"eg\5\27\f\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\32\3\2"+
		"\2\2jk\7*\2\2k\34\3\2\2\2lm\7+\2\2m\36\3\2\2\2no\7.\2\2o \3\2\2\2pq\7"+
		"$\2\2q\"\3\2\2\2rs\7\61\2\2s$\3\2\2\2tz\7$\2\2uy\n\3\2\2vw\7^\2\2wy\t"+
		"\4\2\2xu\3\2\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3"+
		"\2\2\2}~\7$\2\2~&\3\2\2\2\177\u0080\5%\23\2\u0080\u0081\7.\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085(\3\2\2\2\u0086\u0088\t\5\2\2\u0087\u0086\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a*\3"+
		"\2\2\2\u008b\u008d\7\17\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\7\f\2\2\u008f,\3\2\2\2\u0090\u0091\7\61\2\2"+
		"\u0091\u0092\7\61\2\2\u0092\u0096\3\2\2\2\u0093\u0095\13\2\2\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\b\27\2\2\u009c.\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f"+
		"\7,\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\u00a8\7\61\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\b\30\2\2\u00aa\60\3\2\2\2\u00ab\u00ad\t\6\2"+
		"\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\31\2\2\u00b1\62\3\2\2\2\20"+
		"\2Z\\bfhxz\u0084\u0089\u008c\u0096\u00a3\u00ae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}