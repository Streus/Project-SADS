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
		STRING_LITERAL=18, LETTER=19, NEWLINE=20, LN_COMMENT=21, COMMENT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ID", "INT", "STRING", "LP", "RP", "COMMA", "DBQUOTE", "FWDSLSH", "STRING_LITERAL", 
		"LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wc'", "'concat'", 
		"':='", null, null, null, "'('", "')'", "','", "'\"'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"STRING", "LP", "RP", "COMMA", "DBQUOTE", "FWDSLSH", "STRING_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\7\13Y\n\13\f\13\16\13\\\13\13\3\f\6\f_\n\f\r\f\16\f`\3"+
		"\r\3\r\6\re\n\r\r\r\16\rf\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\7\23w\n\23\f\23\16\23z\13\23\3\23\3\23\3\24"+
		"\6\24\177\n\24\r\24\16\24\u0080\3\25\5\25\u0084\n\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\7\26\u008c\n\26\f\26\16\26\u008f\13\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\7\27\u0099\n\27\f\27\16\27\u009c\13\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\6\30\u00a4\n\30\r\30\16\30\u00a5\3\30\3\30\4\u008d"+
		"\u009a\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\3\2\62;\6\2\f\f"+
		"\17\17$$^^\4\2$$^^\4\2C\\c|\4\2\13\13\"\"\2\u00b4\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\65\3"+
		"\2\2\2\79\3\2\2\2\t<\3\2\2\2\13?\3\2\2\2\rE\3\2\2\2\17H\3\2\2\2\21K\3"+
		"\2\2\2\23R\3\2\2\2\25U\3\2\2\2\27^\3\2\2\2\31d\3\2\2\2\33h\3\2\2\2\35"+
		"j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'~\3\2\2\2)\u0083"+
		"\3\2\2\2+\u0087\3\2\2\2-\u0094\3\2\2\2/\u00a3\3\2\2\2\61\62\7u\2\2\62"+
		"\63\7w\2\2\63\64\7d\2\2\64\4\3\2\2\2\65\66\7e\2\2\66\67\7o\2\2\678\7r"+
		"\2\28\6\3\2\2\29:\7e\2\2:;\7v\2\2;\b\3\2\2\2<=\7u\2\2=>\7r\2\2>\n\3\2"+
		"\2\2?@\7d\2\2@A\7w\2\2AB\7k\2\2BC\7n\2\2CD\7f\2\2D\f\3\2\2\2EF\7u\2\2"+
		"FG\7o\2\2G\16\3\2\2\2HI\7y\2\2IJ\7e\2\2J\20\3\2\2\2KL\7e\2\2LM\7q\2\2"+
		"MN\7p\2\2NO\7e\2\2OP\7c\2\2PQ\7v\2\2Q\22\3\2\2\2RS\7<\2\2ST\7?\2\2T\24"+
		"\3\2\2\2UZ\5\'\24\2VY\5\'\24\2WY\5\27\f\2XV\3\2\2\2XW\3\2\2\2Y\\\3\2\2"+
		"\2ZX\3\2\2\2Z[\3\2\2\2[\26\3\2\2\2\\Z\3\2\2\2]_\t\2\2\2^]\3\2\2\2_`\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2a\30\3\2\2\2be\5\'\24\2ce\5\27\f\2db\3\2\2\2"+
		"dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\32\3\2\2\2hi\7*\2\2i\34\3\2"+
		"\2\2jk\7+\2\2k\36\3\2\2\2lm\7.\2\2m \3\2\2\2no\7$\2\2o\"\3\2\2\2pq\7\61"+
		"\2\2q$\3\2\2\2rx\7$\2\2sw\n\3\2\2tu\7^\2\2uw\t\4\2\2vs\3\2\2\2vt\3\2\2"+
		"\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|&\3\2\2"+
		"\2}\177\t\5\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081(\3\2\2\2\u0082\u0084\7\17\2\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\f\2\2\u0086*\3\2\2\2"+
		"\u0087\u0088\7\61\2\2\u0088\u0089\7\61\2\2\u0089\u008d\3\2\2\2\u008a\u008c"+
		"\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091"+
		"\7\f\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\26\2\2\u0093,\3\2\2\2\u0094"+
		"\u0095\7\61\2\2\u0095\u0096\7,\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13"+
		"\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7,"+
		"\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\27\2\2\u00a1"+
		".\3\2\2\2\u00a2\u00a4\t\6\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\b\30\2\2\u00a8\60\3\2\2\2\17\2XZ`dfvx\u0080\u0083\u008d\u009a\u00a5\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}