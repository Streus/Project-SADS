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
		ID=10, INT=11, USER_ALPHA=12, FILE_EXT=13, LP=14, RP=15, COMMA=16, LETTER=17, 
		NEWLINE=18, LN_COMMENT=19, COMMENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ID", "INT", "USER_ALPHA", "FILE_EXT", "LP", "RP", "COMMA", "LETTER", 
		"NEWLINE", "LN_COMMENT", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"U\n\13\f\13\16\13X\13\13\3\f\6\f[\n\f\r\f\16\f\\\3\r\6\r`\n\r\r\r\16\r"+
		"a\3\16\3\16\6\16f\n\16\r\16\16\16g\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\6\22q\n\22\r\22\16\22r\3\23\5\23v\n\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\7\24~\n\24\f\24\16\24\u0081\13\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u008b\n\25\f\25\16\25\u008e\13\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\6\26\u0096\n\26\r\26\16\26\u0097\3\26\3\26\4\177\u008c\2\27\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27\3\2\6\3\2\62;\3\2\62\63\4\2C\\c|\4\2\13\13\""+
		"\"\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2"+
		"\5\61\3\2\2\2\7\65\3\2\2\2\t8\3\2\2\2\13;\3\2\2\2\rA\3\2\2\2\17D\3\2\2"+
		"\2\21G\3\2\2\2\23N\3\2\2\2\25Q\3\2\2\2\27Z\3\2\2\2\31_\3\2\2\2\33c\3\2"+
		"\2\2\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#p\3\2\2\2%u\3\2\2\2\'y\3\2\2\2"+
		")\u0086\3\2\2\2+\u0095\3\2\2\2-.\7u\2\2./\7w\2\2/\60\7d\2\2\60\4\3\2\2"+
		"\2\61\62\7e\2\2\62\63\7o\2\2\63\64\7r\2\2\64\6\3\2\2\2\65\66\7e\2\2\66"+
		"\67\7v\2\2\67\b\3\2\2\289\7u\2\29:\7r\2\2:\n\3\2\2\2;<\7d\2\2<=\7w\2\2"+
		"=>\7k\2\2>?\7n\2\2?@\7f\2\2@\f\3\2\2\2AB\7u\2\2BC\7o\2\2C\16\3\2\2\2D"+
		"E\7y\2\2EF\7e\2\2F\20\3\2\2\2GH\7e\2\2HI\7q\2\2IJ\7p\2\2JK\7e\2\2KL\7"+
		"c\2\2LM\7v\2\2M\22\3\2\2\2NO\7<\2\2OP\7?\2\2P\24\3\2\2\2QV\5#\22\2RU\5"+
		"#\22\2SU\5\27\f\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\26"+
		"\3\2\2\2XV\3\2\2\2Y[\t\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2"+
		"\2]\30\3\2\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\32\3"+
		"\2\2\2ce\7\60\2\2df\5\25\13\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"h\34\3\2\2\2ij\7*\2\2j\36\3\2\2\2kl\7+\2\2l \3\2\2\2mn\7.\2\2n\"\3\2\2"+
		"\2oq\t\4\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s$\3\2\2\2tv\7\17"+
		"\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\f\2\2x&\3\2\2\2yz\7\61\2\2z{\7"+
		"\61\2\2{\177\3\2\2\2|~\13\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177\u0080\3\2"+
		"\2\2\177}\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7"+
		"\f\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\24\2\2\u0085(\3\2\2\2\u0086\u0087"+
		"\7\61\2\2\u0087\u0088\7,\2\2\u0088\u008c\3\2\2\2\u0089\u008b\13\2\2\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008d\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7,\2\2\u0090"+
		"\u0091\7\61\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\25\2\2\u0093*\3\2\2"+
		"\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\26\2\2"+
		"\u009a,\3\2\2\2\r\2TV\\agru\177\u008c\u0097\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}