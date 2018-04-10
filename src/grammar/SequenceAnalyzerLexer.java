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
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, INT=15, STRING=16, LP=17, 
		RP=18, LCB=19, RCB=20, COMMA=21, DBQUOTE=22, STRING_LITERAL=23, MAPPING_DELIMETER=24, 
		LAST_COMMAND_CHAR=25, LETTER=26, NEWLINE=27, LN_COMMENT=28, COMMENT=29, 
		WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "ID", "INT", "STRING", "LP", "RP", 
		"LCB", "RCB", "COMMA", "DBQUOTE", "STRING_LITERAL", "MAPPING_DELIMETER", 
		"LAST_COMMAND_CHAR", "LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'sm'", "'wc'", "'concat'", "'insert'", 
		"':='", "'def'", "'r'", "'der'", "'print'", null, null, null, "'('", "')'", 
		"'{'", "'}'", "','", "'\"'", null, "'->'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "INT", "STRING", "LP", "RP", "LCB", "RCB", "COMMA", 
		"DBQUOTE", "STRING_LITERAL", "MAPPING_DELIMETER", "LAST_COMMAND_CHAR", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\7\17x\n\17\f\17\16\17{\13\17\3\20\6\20~\n\20\r\20\16"+
		"\20\177\3\21\3\21\6\21\u0084\n\21\r\21\16\21\u0085\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0098"+
		"\n\30\f\30\16\30\u009b\13\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\6"+
		"\33\u00a5\n\33\r\33\16\33\u00a6\3\34\5\34\u00aa\n\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\7\35\u00b2\n\35\f\35\16\35\u00b5\13\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\7\36\u00bf\n\36\f\36\16\36\u00c2\13\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\6\37\u00ca\n\37\r\37\16\37\u00cb\3\37\3\37\4\u00b3"+
		"\u00c0\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= \3\2\7\3\2\62;\6\2\f\f\17\17$$^^\4\2$$^^\4\2C\\c|\4\2\13"+
		"\13\"\"\2\u00da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5C\3\2\2\2\7G\3\2\2\2\tJ\3"+
		"\2\2\2\13M\3\2\2\2\rP\3\2\2\2\17S\3\2\2\2\21Z\3\2\2\2\23a\3\2\2\2\25d"+
		"\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33n\3\2\2\2\35t\3\2\2\2\37}\3\2\2\2!"+
		"\u0083\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u008d\3"+
		"\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61\u009e\3\2\2\2\63"+
		"\u00a1\3\2\2\2\65\u00a4\3\2\2\2\67\u00a9\3\2\2\29\u00ad\3\2\2\2;\u00ba"+
		"\3\2\2\2=\u00c9\3\2\2\2?@\7u\2\2@A\7w\2\2AB\7d\2\2B\4\3\2\2\2CD\7e\2\2"+
		"DE\7o\2\2EF\7r\2\2F\6\3\2\2\2GH\7e\2\2HI\7v\2\2I\b\3\2\2\2JK\7u\2\2KL"+
		"\7r\2\2L\n\3\2\2\2MN\7u\2\2NO\7o\2\2O\f\3\2\2\2PQ\7y\2\2QR\7e\2\2R\16"+
		"\3\2\2\2ST\7e\2\2TU\7q\2\2UV\7p\2\2VW\7e\2\2WX\7c\2\2XY\7v\2\2Y\20\3\2"+
		"\2\2Z[\7k\2\2[\\\7p\2\2\\]\7u\2\2]^\7g\2\2^_\7t\2\2_`\7v\2\2`\22\3\2\2"+
		"\2ab\7<\2\2bc\7?\2\2c\24\3\2\2\2de\7f\2\2ef\7g\2\2fg\7h\2\2g\26\3\2\2"+
		"\2hi\7t\2\2i\30\3\2\2\2jk\7f\2\2kl\7g\2\2lm\7t\2\2m\32\3\2\2\2no\7r\2"+
		"\2op\7t\2\2pq\7k\2\2qr\7p\2\2rs\7v\2\2s\34\3\2\2\2ty\5\65\33\2ux\5\65"+
		"\33\2vx\5\37\20\2wu\3\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\36"+
		"\3\2\2\2{y\3\2\2\2|~\t\2\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080 \3\2\2\2\u0081\u0084\5\65\33\2\u0082\u0084\5\37\20\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\"\3\2\2\2\u0087\u0088\7*\2\2\u0088$\3\2"+
		"\2\2\u0089\u008a\7+\2\2\u008a&\3\2\2\2\u008b\u008c\7}\2\2\u008c(\3\2\2"+
		"\2\u008d\u008e\7\177\2\2\u008e*\3\2\2\2\u008f\u0090\7.\2\2\u0090,\3\2"+
		"\2\2\u0091\u0092\7$\2\2\u0092.\3\2\2\2\u0093\u0099\7$\2\2\u0094\u0098"+
		"\n\3\2\2\u0095\u0096\7^\2\2\u0096\u0098\t\4\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7$\2\2\u009d"+
		"\60\3\2\2\2\u009e\u009f\7/\2\2\u009f\u00a0\7@\2\2\u00a0\62\3\2\2\2\u00a1"+
		"\u00a2\7a\2\2\u00a2\64\3\2\2\2\u00a3\u00a5\t\5\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\66"+
		"\3\2\2\2\u00a8\u00aa\7\17\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7"+
		"\61\2\2\u00ae\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\13\2\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\b\35\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7\61\2"+
		"\2\u00bb\u00bc\7,\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\13\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c5\7\61"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\36\2\2\u00c7<\3\2\2\2\u00c8\u00ca"+
		"\t\6\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\37\2\2\u00ce>\3\2\2\2"+
		"\17\2wy\177\u0083\u0085\u0097\u0099\u00a6\u00a9\u00b3\u00c0\u00cb\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}