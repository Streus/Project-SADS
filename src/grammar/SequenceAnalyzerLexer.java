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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, INT=16, STRING=17, 
		LP=18, RP=19, LCB=20, RCB=21, COMMA=22, DBQUOTE=23, STRING_LITERAL=24, 
		LETTER=25, NEWLINE=26, LN_COMMENT=27, COMMENT=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "ID", "INT", "STRING", "LP", 
		"RP", "LCB", "RCB", "COMMA", "DBQUOTE", "STRING_LITERAL", "LETTER", "NEWLINE", 
		"LN_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wc'", "'concat'", 
		"':='", "'def'", "'['", "']'", "'r'", "'print'", null, null, null, "'('", 
		"')'", "'{'", "'}'", "','", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ID", "INT", "STRING", "LP", "RP", "LCB", "RCB", "COMMA", 
		"DBQUOTE", "STRING_LITERAL", "LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\7\20u\n\20\f\20\16\20x\13\20\3\21\6\21{\n\21\r\21\16\21|\3"+
		"\22\3\22\6\22\u0081\n\22\r\22\16\22\u0082\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0095\n\31\f\31"+
		"\16\31\u0098\13\31\3\31\3\31\3\32\6\32\u009d\n\32\r\32\16\32\u009e\3\33"+
		"\5\33\u00a2\n\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00aa\n\34\f\34\16"+
		"\34\u00ad\13\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00b7\n\35"+
		"\f\35\16\35\u00ba\13\35\3\35\3\35\3\35\3\35\3\35\3\36\6\36\u00c2\n\36"+
		"\r\36\16\36\u00c3\3\36\3\36\4\u00ab\u00b8\2\37\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\7\3\2\62;\6\2\f\f"+
		"\17\17$$^^\4\2$$^^\4\2C\\c|\4\2\13\13\"\"\2\u00d2\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5A\3"+
		"\2\2\2\7E\3\2\2\2\tH\3\2\2\2\13K\3\2\2\2\rQ\3\2\2\2\17T\3\2\2\2\21W\3"+
		"\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35"+
		"k\3\2\2\2\37q\3\2\2\2!z\3\2\2\2#\u0080\3\2\2\2%\u0084\3\2\2\2\'\u0086"+
		"\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u008c\3\2\2\2/\u008e\3\2\2\2\61"+
		"\u0090\3\2\2\2\63\u009c\3\2\2\2\65\u00a1\3\2\2\2\67\u00a5\3\2\2\29\u00b2"+
		"\3\2\2\2;\u00c1\3\2\2\2=>\7u\2\2>?\7w\2\2?@\7d\2\2@\4\3\2\2\2AB\7e\2\2"+
		"BC\7o\2\2CD\7r\2\2D\6\3\2\2\2EF\7e\2\2FG\7v\2\2G\b\3\2\2\2HI\7u\2\2IJ"+
		"\7r\2\2J\n\3\2\2\2KL\7d\2\2LM\7w\2\2MN\7k\2\2NO\7n\2\2OP\7f\2\2P\f\3\2"+
		"\2\2QR\7u\2\2RS\7o\2\2S\16\3\2\2\2TU\7y\2\2UV\7e\2\2V\20\3\2\2\2WX\7e"+
		"\2\2XY\7q\2\2YZ\7p\2\2Z[\7e\2\2[\\\7c\2\2\\]\7v\2\2]\22\3\2\2\2^_\7<\2"+
		"\2_`\7?\2\2`\24\3\2\2\2ab\7f\2\2bc\7g\2\2cd\7h\2\2d\26\3\2\2\2ef\7]\2"+
		"\2f\30\3\2\2\2gh\7_\2\2h\32\3\2\2\2ij\7t\2\2j\34\3\2\2\2kl\7r\2\2lm\7"+
		"t\2\2mn\7k\2\2no\7p\2\2op\7v\2\2p\36\3\2\2\2qv\5\63\32\2ru\5\63\32\2s"+
		"u\5!\21\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w \3\2\2\2"+
		"xv\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\"\3\2\2"+
		"\2~\u0081\5\63\32\2\177\u0081\5!\21\2\u0080~\3\2\2\2\u0080\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083$\3"+
		"\2\2\2\u0084\u0085\7*\2\2\u0085&\3\2\2\2\u0086\u0087\7+\2\2\u0087(\3\2"+
		"\2\2\u0088\u0089\7}\2\2\u0089*\3\2\2\2\u008a\u008b\7\177\2\2\u008b,\3"+
		"\2\2\2\u008c\u008d\7.\2\2\u008d.\3\2\2\2\u008e\u008f\7$\2\2\u008f\60\3"+
		"\2\2\2\u0090\u0096\7$\2\2\u0091\u0095\n\3\2\2\u0092\u0093\7^\2\2\u0093"+
		"\u0095\t\4\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7$\2\2\u009a\62\3\2\2\2\u009b\u009d\t\5\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\64\3\2\2\2\u00a0\u00a2\7\17\2\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4\66\3\2\2"+
		"\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00ab\3\2\2\2\u00a8"+
		"\u00aa\13\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7\f\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\34\2\2\u00b18\3\2\2\2"+
		"\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7,\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7"+
		"\13\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc"+
		"\7,\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\35\2\2"+
		"\u00bf:\3\2\2\2\u00c0\u00c2\t\6\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\b\36\2\2\u00c6<\3\2\2\2\17\2tv|\u0080\u0082\u0094\u0096\u009e\u00a1"+
		"\u00ab\u00b8\u00c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}