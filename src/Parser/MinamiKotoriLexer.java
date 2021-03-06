// Generated from MinamiKotori.g4 by ANTLR 4.5.3
package Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinamiKotoriLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, StringLiteral=35, Sign=36, Decimal_constant=37, 
		New=38, For=39, While=40, If=41, Else=42, Return=43, Break=44, Continue=45, 
		Left_bracket=46, Right_bracket=47, Left_square_bracket=48, Right_square_bracket=49, 
		Left_brace=50, Right_brace=51, Whitespace=52, Identifier=53, Newline=54, 
		BlockComment=55, LineComment=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "StringLiteral", "SCharSequence", "SChar", "EscapeSequence", 
		"SimpleEscapeSequence", "Sign", "Decimal_constant", "Non_zero_digit", 
		"New", "For", "While", "If", "Else", "Return", "Break", "Continue", "Left_bracket", 
		"Right_bracket", "Left_square_bracket", "Right_square_bracket", "Left_brace", 
		"Right_brace", "Whitespace", "Identifier", "Letter", "Digit", "Newline", 
		"BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'int'", "'string'", "'bool'", "'void'", "'class'", "'='", 
		"'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", 
		"'>='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'.'", "'++'", 
		"'--'", "'!'", "'~'", "','", "'true'", "'false'", "'null'", null, null, 
		null, "'new'", "'for'", "'while'", "'if'", "'else'", "'return'", "'break'", 
		"'continue'", "'('", "')'", "'['", "']'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "StringLiteral", 
		"Sign", "Decimal_constant", "New", "For", "While", "If", "Else", "Return", 
		"Break", "Continue", "Left_bracket", "Right_bracket", "Left_square_bracket", 
		"Right_square_bracket", "Left_brace", "Right_brace", "Whitespace", "Identifier", 
		"Newline", "BlockComment", "LineComment"
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


	public MinamiKotoriLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MinamiKotori.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u0179\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\5$\u00ed"+
		"\n$\3$\3$\3%\6%\u00f2\n%\r%\16%\u00f3\3&\3&\5&\u00f8\n&\3\'\3\'\3(\3("+
		"\3(\3)\3)\3*\3*\7*\u0103\n*\f*\16*\u0106\13*\3*\5*\u0109\n*\3+\3+\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\6:\u0146\n:\r:\16:\u0147\3:\3:\3;\3;\3;\7;\u014f"+
		"\n;\f;\16;\u0152\13;\3<\3<\3=\3=\3>\3>\5>\u015a\n>\3>\5>\u015d\n>\3>\3"+
		">\3?\3?\3?\3?\7?\u0165\n?\f?\16?\u0168\13?\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\7@\u0173\n@\f@\16@\u0176\13@\3@\3@\3\u0166\2A\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M\2"+
		"O\2Q&S\'U\2W(Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65s\66u\67w\2y\2{8}9"+
		"\177:\3\2\n\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\4\2--//\3\2\63;"+
		"\4\2\13\13\"\"\5\2C\\aac|\3\2\62;\4\2\f\f\17\17\u017d\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\3\u0081\3\2\2\2\5\u0083\3\2\2\2\7\u0087\3\2\2\2\t\u008e\3\2\2"+
		"\2\13\u0093\3\2\2\2\r\u0098\3\2\2\2\17\u009e\3\2\2\2\21\u00a0\3\2\2\2"+
		"\23\u00a3\3\2\2\2\25\u00a6\3\2\2\2\27\u00a8\3\2\2\2\31\u00aa\3\2\2\2\33"+
		"\u00ac\3\2\2\2\35\u00af\3\2\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2\2#\u00b6"+
		"\3\2\2\2%\u00b9\3\2\2\2\'\u00bc\3\2\2\2)\u00bf\3\2\2\2+\u00c2\3\2\2\2"+
		"-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2\2\65\u00cc"+
		"\3\2\2\2\67\u00ce\3\2\2\29\u00d1\3\2\2\2;\u00d4\3\2\2\2=\u00d6\3\2\2\2"+
		"?\u00d8\3\2\2\2A\u00da\3\2\2\2C\u00df\3\2\2\2E\u00e5\3\2\2\2G\u00ea\3"+
		"\2\2\2I\u00f1\3\2\2\2K\u00f7\3\2\2\2M\u00f9\3\2\2\2O\u00fb\3\2\2\2Q\u00fe"+
		"\3\2\2\2S\u0108\3\2\2\2U\u010a\3\2\2\2W\u010c\3\2\2\2Y\u0110\3\2\2\2["+
		"\u0114\3\2\2\2]\u011a\3\2\2\2_\u011d\3\2\2\2a\u0122\3\2\2\2c\u0129\3\2"+
		"\2\2e\u012f\3\2\2\2g\u0138\3\2\2\2i\u013a\3\2\2\2k\u013c\3\2\2\2m\u013e"+
		"\3\2\2\2o\u0140\3\2\2\2q\u0142\3\2\2\2s\u0145\3\2\2\2u\u014b\3\2\2\2w"+
		"\u0153\3\2\2\2y\u0155\3\2\2\2{\u015c\3\2\2\2}\u0160\3\2\2\2\177\u016e"+
		"\3\2\2\2\u0081\u0082\7=\2\2\u0082\4\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7p\2\2\u0085\u0086\7v\2\2\u0086\6\3\2\2\2\u0087\u0088\7u\2\2\u0088\u0089"+
		"\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c"+
		"\u008d\7i\2\2\u008d\b\3\2\2\2\u008e\u008f\7d\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7q\2\2\u0091\u0092\7n\2\2\u0092\n\3\2\2\2\u0093\u0094\7x\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7k\2\2\u0096\u0097\7f\2\2\u0097\f\3\2\2\2\u0098"+
		"\u0099\7e\2\2\u0099\u009a\7n\2\2\u009a\u009b\7c\2\2\u009b\u009c\7u\2\2"+
		"\u009c\u009d\7u\2\2\u009d\16\3\2\2\2\u009e\u009f\7?\2\2\u009f\20\3\2\2"+
		"\2\u00a0\u00a1\7~\2\2\u00a1\u00a2\7~\2\2\u00a2\22\3\2\2\2\u00a3\u00a4"+
		"\7(\2\2\u00a4\u00a5\7(\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7~\2\2\u00a7\26"+
		"\3\2\2\2\u00a8\u00a9\7`\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7(\2\2\u00ab"+
		"\32\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad\u00ae\7?\2\2\u00ae\34\3\2\2\2\u00af"+
		"\u00b0\7#\2\2\u00b0\u00b1\7?\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3"+
		" \3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba\u00bb\7?\2\2\u00bb"+
		"&\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd\u00be\7>\2\2\u00be(\3\2\2\2\u00bf\u00c0"+
		"\7@\2\2\u00c0\u00c1\7@\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3,\3"+
		"\2\2\2\u00c4\u00c5\7/\2\2\u00c5.\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7\60\3"+
		"\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7\'\2\2\u00cb"+
		"\64\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf"+
		"\u00d0\7-\2\2\u00d08\3\2\2\2\u00d1\u00d2\7/\2\2\u00d2\u00d3\7/\2\2\u00d3"+
		":\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7\u0080\2\2\u00d7"+
		">\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9@\3\2\2\2\u00da\u00db\7v\2\2\u00db\u00dc"+
		"\7t\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7g\2\2\u00deB\3\2\2\2\u00df\u00e0"+
		"\7h\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7u\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4D\3\2\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7w\2\2\u00e7"+
		"\u00e8\7n\2\2\u00e8\u00e9\7n\2\2\u00e9F\3\2\2\2\u00ea\u00ec\7$\2\2\u00eb"+
		"\u00ed\5I%\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2"+
		"\2\u00ee\u00ef\7$\2\2\u00efH\3\2\2\2\u00f0\u00f2\5K&\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"J\3\2\2\2\u00f5\u00f8\n\2\2\2\u00f6\u00f8\5M\'\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8L\3\2\2\2\u00f9\u00fa\5O(\2\u00faN\3\2\2\2\u00fb\u00fc"+
		"\7^\2\2\u00fc\u00fd\t\3\2\2\u00fdP\3\2\2\2\u00fe\u00ff\t\4\2\2\u00ffR"+
		"\3\2\2\2\u0100\u0104\5U+\2\u0101\u0103\5y=\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7\62\2\2\u0108\u0100\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109T\3\2\2\2\u010a\u010b\t\5\2\2\u010bV\3\2\2\2\u010c"+
		"\u010d\7p\2\2\u010d\u010e\7g\2\2\u010e\u010f\7y\2\2\u010fX\3\2\2\2\u0110"+
		"\u0111\7h\2\2\u0111\u0112\7q\2\2\u0112\u0113\7t\2\2\u0113Z\3\2\2\2\u0114"+
		"\u0115\7y\2\2\u0115\u0116\7j\2\2\u0116\u0117\7k\2\2\u0117\u0118\7n\2\2"+
		"\u0118\u0119\7g\2\2\u0119\\\3\2\2\2\u011a\u011b\7k\2\2\u011b\u011c\7h"+
		"\2\2\u011c^\3\2\2\2\u011d\u011e\7g\2\2\u011e\u011f\7n\2\2\u011f\u0120"+
		"\7u\2\2\u0120\u0121\7g\2\2\u0121`\3\2\2\2\u0122\u0123\7t\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7v\2\2\u0125\u0126\7w\2\2\u0126\u0127\7t\2\2\u0127"+
		"\u0128\7p\2\2\u0128b\3\2\2\2\u0129\u012a\7d\2\2\u012a\u012b\7t\2\2\u012b"+
		"\u012c\7g\2\2\u012c\u012d\7c\2\2\u012d\u012e\7m\2\2\u012ed\3\2\2\2\u012f"+
		"\u0130\7e\2\2\u0130\u0131\7q\2\2\u0131\u0132\7p\2\2\u0132\u0133\7v\2\2"+
		"\u0133\u0134\7k\2\2\u0134\u0135\7p\2\2\u0135\u0136\7w\2\2\u0136\u0137"+
		"\7g\2\2\u0137f\3\2\2\2\u0138\u0139\7*\2\2\u0139h\3\2\2\2\u013a\u013b\7"+
		"+\2\2\u013bj\3\2\2\2\u013c\u013d\7]\2\2\u013dl\3\2\2\2\u013e\u013f\7_"+
		"\2\2\u013fn\3\2\2\2\u0140\u0141\7}\2\2\u0141p\3\2\2\2\u0142\u0143\7\177"+
		"\2\2\u0143r\3\2\2\2\u0144\u0146\t\6\2\2\u0145\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\b:\2\2\u014at\3\2\2\2\u014b\u0150\5w<\2\u014c\u014f\5w<\2\u014d"+
		"\u014f\5y=\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2"+
		"\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151v\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0153\u0154\t\7\2\2\u0154x\3\2\2\2\u0155\u0156\t\b\2\2\u0156"+
		"z\3\2\2\2\u0157\u0159\7\17\2\2\u0158\u015a\7\f\2\2\u0159\u0158\3\2\2\2"+
		"\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015d\7\f\2\2\u015c\u0157"+
		"\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b>\2\2\u015f"+
		"|\3\2\2\2\u0160\u0161\7\61\2\2\u0161\u0162\7,\2\2\u0162\u0166\3\2\2\2"+
		"\u0163\u0165\13\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\7,\2\2\u016a\u016b\7\61\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b?"+
		"\2\2\u016d~\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0170\7\61\2\2\u0170\u0174"+
		"\3\2\2\2\u0171\u0173\n\t\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u0178\b@\2\2\u0178\u0080\3\2\2\2\17\2\u00ec\u00f3\u00f7\u0104"+
		"\u0108\u0147\u014e\u0150\u0159\u015c\u0166\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}