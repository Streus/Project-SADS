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
		T__9=10, T__10=11, ID=12, INT=13, STRING=14, LP=15, RP=16, COMMA=17, DBQUOTE=18, 
		FWDSLSH=19, STRING_LITERAL=20, LETTER=21, NEWLINE=22, LN_COMMENT=23, COMMENT=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "ID", "INT", "STRING", "LP", "RP", "COMMA", "DBQUOTE", 
		"FWDSLSH", "STRING_LITERAL", "LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wc'", "'concat'", 
		"':='", "'{'", "'}'", null, null, null, "'('", "')'", "','", "'\"'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ID", "INT", "STRING", "LP", "RP", "COMMA", "DBQUOTE", "FWDSLSH", "STRING_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\ra\n\r\f\r\16\rd"+
		"\13\r\3\16\6\16g\n\16\r\16\16\16h\3\17\3\17\6\17m\n\17\r\17\16\17n\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25"+
		"\177\n\25\f\25\16\25\u0082\13\25\3\25\3\25\3\26\6\26\u0087\n\26\r\26\16"+
		"\26\u0088\3\27\5\27\u008c\n\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0094"+
		"\n\30\f\30\16\30\u0097\13\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7"+
		"\31\u00a1\n\31\f\31\16\31\u00a4\13\31\3\31\3\31\3\31\3\31\3\31\3\32\6"+
		"\32\u00ac\n\32\r\32\16\32\u00ad\3\32\3\32\4\u0095\u00a2\2\33\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\7\3\2\62;\6\2\f\f\17\17"+
		"$$^^\4\2$$^^\4\2C\\c|\4\2\13\13\"\"\2\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\3\65\3\2\2\2\59\3\2\2\2\7=\3\2\2\2\t@\3\2\2\2\13C\3\2\2\2\rI\3\2\2"+
		"\2\17L\3\2\2\2\21O\3\2\2\2\23V\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2"+
		"\2\2\33f\3\2\2\2\35l\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%v\3\2\2\2"+
		"\'x\3\2\2\2)z\3\2\2\2+\u0086\3\2\2\2-\u008b\3\2\2\2/\u008f\3\2\2\2\61"+
		"\u009c\3\2\2\2\63\u00ab\3\2\2\2\65\66\7u\2\2\66\67\7w\2\2\678\7d\2\28"+
		"\4\3\2\2\29:\7e\2\2:;\7o\2\2;<\7r\2\2<\6\3\2\2\2=>\7e\2\2>?\7v\2\2?\b"+
		"\3\2\2\2@A\7u\2\2AB\7r\2\2B\n\3\2\2\2CD\7d\2\2DE\7w\2\2EF\7k\2\2FG\7n"+
		"\2\2GH\7f\2\2H\f\3\2\2\2IJ\7u\2\2JK\7o\2\2K\16\3\2\2\2LM\7y\2\2MN\7e\2"+
		"\2N\20\3\2\2\2OP\7e\2\2PQ\7q\2\2QR\7p\2\2RS\7e\2\2ST\7c\2\2TU\7v\2\2U"+
		"\22\3\2\2\2VW\7<\2\2WX\7?\2\2X\24\3\2\2\2YZ\7}\2\2Z\26\3\2\2\2[\\\7\177"+
		"\2\2\\\30\3\2\2\2]b\5+\26\2^a\5+\26\2_a\5\33\16\2`^\3\2\2\2`_\3\2\2\2"+
		"ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\32\3\2\2\2db\3\2\2\2eg\t\2\2\2fe\3\2\2"+
		"\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\34\3\2\2\2jm\5+\26\2km\5\33\16\2lj\3"+
		"\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\36\3\2\2\2pq\7*\2\2q "+
		"\3\2\2\2rs\7+\2\2s\"\3\2\2\2tu\7.\2\2u$\3\2\2\2vw\7$\2\2w&\3\2\2\2xy\7"+
		"\61\2\2y(\3\2\2\2z\u0080\7$\2\2{\177\n\3\2\2|}\7^\2\2}\177\t\4\2\2~{\3"+
		"\2\2\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7$\2\2\u0084*\3\2"+
		"\2\2\u0085\u0087\t\5\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089,\3\2\2\2\u008a\u008c\7\17\2\2"+
		"\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\7\f\2\2\u008e.\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7\61\2\2\u0091"+
		"\u0095\3\2\2\2\u0092\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\30"+
		"\2\2\u009b\60\3\2\2\2\u009c\u009d\7\61\2\2\u009d\u009e\7,\2\2\u009e\u00a2"+
		"\3\2\2\2\u009f\u00a1\13\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\b\31\2\2\u00a9\62\3\2\2\2\u00aa\u00ac\t\6\2\2\u00ab\u00aa\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\b\32\2\2\u00b0\64\3\2\2\2\17\2`bhln~\u0080\u0088"+
		"\u008b\u0095\u00a2\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}