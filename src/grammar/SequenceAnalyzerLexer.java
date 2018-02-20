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
		FWDSLSH=18, STRING_LITERAL=19, LETTER=20, NEWLINE=21, LN_COMMENT=22, COMMENT=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ID", "INT", "STRING", "USER_ALPHA", "LP", "RP", "COMMA", "DBQUOTE", "FWDSLSH", 
		"STRING_LITERAL", "LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wc'", "'concat'", 
		"':='", null, null, null, null, "'('", "')'", "','", "'\"'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"STRING", "USER_ALPHA", "LP", "RP", "COMMA", "DBQUOTE", "FWDSLSH", "STRING_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\7\13[\n\13\f\13\16\13^\13\13\3\f\6\fa\n\f\r"+
		"\f\16\fb\3\r\3\r\6\rg\n\r\r\r\16\rh\3\16\6\16l\n\16\r\16\16\16m\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24~"+
		"\n\24\f\24\16\24\u0081\13\24\3\24\3\24\3\25\6\25\u0086\n\25\r\25\16\25"+
		"\u0087\3\26\5\26\u008b\n\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0093\n"+
		"\27\f\27\16\27\u0096\13\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30"+
		"\u00a0\n\30\f\30\16\30\u00a3\13\30\3\30\3\30\3\30\3\30\3\30\3\31\6\31"+
		"\u00ab\n\31\r\31\16\31\u00ac\3\31\3\31\4\u0094\u00a1\2\32\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\3\2\b\3\2\62;\3\2\62\63\6\2\f\f\17\17"+
		"$$^^\4\2$$^^\4\2C\\c|\4\2\13\13\"\"\2\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2"+
		"\2\5\67\3\2\2\2\7;\3\2\2\2\t>\3\2\2\2\13A\3\2\2\2\rG\3\2\2\2\17J\3\2\2"+
		"\2\21M\3\2\2\2\23T\3\2\2\2\25W\3\2\2\2\27`\3\2\2\2\31f\3\2\2\2\33k\3\2"+
		"\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#u\3\2\2\2%w\3\2\2\2\'y\3\2\2\2"+
		")\u0085\3\2\2\2+\u008a\3\2\2\2-\u008e\3\2\2\2/\u009b\3\2\2\2\61\u00aa"+
		"\3\2\2\2\63\64\7u\2\2\64\65\7w\2\2\65\66\7d\2\2\66\4\3\2\2\2\678\7e\2"+
		"\289\7o\2\29:\7r\2\2:\6\3\2\2\2;<\7e\2\2<=\7v\2\2=\b\3\2\2\2>?\7u\2\2"+
		"?@\7r\2\2@\n\3\2\2\2AB\7d\2\2BC\7w\2\2CD\7k\2\2DE\7n\2\2EF\7f\2\2F\f\3"+
		"\2\2\2GH\7u\2\2HI\7o\2\2I\16\3\2\2\2JK\7y\2\2KL\7e\2\2L\20\3\2\2\2MN\7"+
		"e\2\2NO\7q\2\2OP\7p\2\2PQ\7e\2\2QR\7c\2\2RS\7v\2\2S\22\3\2\2\2TU\7<\2"+
		"\2UV\7?\2\2V\24\3\2\2\2W\\\5)\25\2X[\5)\25\2Y[\5\27\f\2ZX\3\2\2\2ZY\3"+
		"\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\26\3\2\2\2^\\\3\2\2\2_a\t\2\2"+
		"\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\30\3\2\2\2dg\5)\25\2eg\5\27"+
		"\f\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\32\3\2\2\2jl\t"+
		"\3\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\34\3\2\2\2op\7*\2\2p\36"+
		"\3\2\2\2qr\7+\2\2r \3\2\2\2st\7.\2\2t\"\3\2\2\2uv\7$\2\2v$\3\2\2\2wx\7"+
		"\61\2\2x&\3\2\2\2y\177\7$\2\2z~\n\4\2\2{|\7^\2\2|~\t\5\2\2}z\3\2\2\2}"+
		"{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7$\2\2\u0083(\3\2\2\2\u0084\u0086"+
		"\t\6\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088*\3\2\2\2\u0089\u008b\7\17\2\2\u008a\u0089\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\f\2\2\u008d,\3"+
		"\2\2\2\u008e\u008f\7\61\2\2\u008f\u0090\7\61\2\2\u0090\u0094\3\2\2\2\u0091"+
		"\u0093\13\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7\f\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\27\2\2\u009a.\3\2\2\2"+
		"\u009b\u009c\7\61\2\2\u009c\u009d\7,\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0"+
		"\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5"+
		"\7,\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\30\2\2"+
		"\u00a8\60\3\2\2\2\u00a9\u00ab\t\7\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\b\31\2\2\u00af\62\3\2\2\2\20\2Z\\bfhm}\177\u0087\u008a\u0094\u00a1"+
		"\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}