// Generated from MinamiKotori.g4 by ANTLR 4.5.3
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinamiKotoriParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_variable_declaration = 2, 
		RULE_type = 3, RULE_non_array_type = 4, RULE_type_name = 5, RULE_class_declaration = 6, 
		RULE_array_declaration_type = 7, RULE_init_declarator = 8, RULE_declarator = 9, 
		RULE_initializer = 10, RULE_assignment_expression = 11, RULE_assignment_operator = 12, 
		RULE_calculation_expression = 13, RULE_logical_or_expression = 14, RULE_logical_or_operator = 15, 
		RULE_logical_and_expression = 16, RULE_logical_and_operator = 17, RULE_bitwise_or_expression = 18, 
		RULE_bitwise_or_operator = 19, RULE_bitwise_xor_expression = 20, RULE_bitwise_xor_operator = 21, 
		RULE_bitwise_and_expression = 22, RULE_bitwise_and_operator = 23, RULE_equality_expression = 24, 
		RULE_is_equal_operator = 25, RULE_not_equal_operator = 26, RULE_relation_expression = 27, 
		RULE_smaller_operator = 28, RULE_bigger_operator = 29, RULE_smaller_equal_operator = 30, 
		RULE_bigger_equal_operator = 31, RULE_shift_expression = 32, RULE_lshift_operator = 33, 
		RULE_rshift_operator = 34, RULE_add_expression = 35, RULE_plus_operator = 36, 
		RULE_minus_operator = 37, RULE_multiply_expression = 38, RULE_multiply_operator = 39, 
		RULE_divide_operator = 40, RULE_mod_operator = 41, RULE_unary_expression = 42, 
		RULE_postfix_expression = 43, RULE_primary_expression = 44, RULE_constant = 45, 
		RULE_integer_constant = 46, RULE_string_constant = 47, RULE_postfix = 48, 
		RULE_get_member_operator = 49, RULE_plusplus_operator = 50, RULE_minusminus_operator = 51, 
		RULE_unary_operator = 52, RULE_not_sign_operator = 53, RULE_bitwise_not_operator = 54, 
		RULE_expression = 55, RULE_function_call_expression = 56, RULE_arguments = 57, 
		RULE_new_operation = 58, RULE_array_new_type = 59, RULE_class_new_type = 60, 
		RULE_builtin_constant = 61, RULE_function_definition = 62, RULE_parameter_list = 63, 
		RULE_parameter = 64, RULE_statement = 65, RULE_assignment_statement = 66, 
		RULE_compound_statement = 67, RULE_loop_statement = 68, RULE_for_loop_statement = 69, 
		RULE_the_first_for_expression = 70, RULE_the_second_for_expression = 71, 
		RULE_the_third_for_expression = 72, RULE_while_loop_statement = 73, RULE_branch_statement = 74, 
		RULE_if_statement = 75;
	public static final String[] ruleNames = {
		"program", "declaration", "variable_declaration", "type", "non_array_type", 
		"type_name", "class_declaration", "array_declaration_type", "init_declarator", 
		"declarator", "initializer", "assignment_expression", "assignment_operator", 
		"calculation_expression", "logical_or_expression", "logical_or_operator", 
		"logical_and_expression", "logical_and_operator", "bitwise_or_expression", 
		"bitwise_or_operator", "bitwise_xor_expression", "bitwise_xor_operator", 
		"bitwise_and_expression", "bitwise_and_operator", "equality_expression", 
		"is_equal_operator", "not_equal_operator", "relation_expression", "smaller_operator", 
		"bigger_operator", "smaller_equal_operator", "bigger_equal_operator", 
		"shift_expression", "lshift_operator", "rshift_operator", "add_expression", 
		"plus_operator", "minus_operator", "multiply_expression", "multiply_operator", 
		"divide_operator", "mod_operator", "unary_expression", "postfix_expression", 
		"primary_expression", "constant", "integer_constant", "string_constant", 
		"postfix", "get_member_operator", "plusplus_operator", "minusminus_operator", 
		"unary_operator", "not_sign_operator", "bitwise_not_operator", "expression", 
		"function_call_expression", "arguments", "new_operation", "array_new_type", 
		"class_new_type", "builtin_constant", "function_definition", "parameter_list", 
		"parameter", "statement", "assignment_statement", "compound_statement", 
		"loop_statement", "for_loop_statement", "the_first_for_expression", "the_second_for_expression", 
		"the_third_for_expression", "while_loop_statement", "branch_statement", 
		"if_statement"
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

	@Override
	public String getGrammarFileName() { return "MinamiKotori.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinamiKotoriParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(152);
						function_definition();
						}
						break;
					case 2:
						{
						setState(153);
						declaration();
						}
						break;
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(159);
			function_definition();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Identifier))) != 0)) {
				{
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(160);
					function_definition();
					}
					break;
				case 2:
					{
					setState(161);
					declaration();
					}
					break;
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				class_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Init_declaratorContext init_declarator() {
			return getRuleContext(Init_declaratorContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type();
			setState(172);
			init_declarator();
			setState(173);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Non_array_typeContext non_array_type() {
			return getRuleContext(Non_array_typeContext.class,0);
		}
		public Array_declaration_typeContext array_declaration_type() {
			return getRuleContext(Array_declaration_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				non_array_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				array_declaration_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_array_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Non_array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterNon_array_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitNon_array_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitNon_array_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_array_typeContext non_array_type() throws RecognitionException {
		Non_array_typeContext _localctx = new Non_array_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_non_array_type);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				type_name();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				class_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public Token builtin_type;
		public TerminalNode Identifier() { return getToken(MinamiKotoriParser.Identifier, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_name);
		int _la;
		try {
			setState(185);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((Type_nameContext)_localctx).builtin_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
					((Type_nameContext)_localctx).builtin_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MinamiKotoriParser.Identifier, 0); }
		public TerminalNode Left_brace() { return getToken(MinamiKotoriParser.Left_brace, 0); }
		public TerminalNode Right_brace() { return getToken(MinamiKotoriParser.Right_brace, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__5);
			setState(188);
			match(Identifier);
			setState(189);
			match(Left_brace);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Identifier))) != 0)) {
				{
				{
				setState(190);
				type();
				setState(191);
				declarator();
				setState(192);
				match(T__0);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(Right_brace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_declaration_typeContext extends ParserRuleContext {
		public Non_array_typeContext non_array_type() {
			return getRuleContext(Non_array_typeContext.class,0);
		}
		public List<TerminalNode> Left_square_bracket() { return getTokens(MinamiKotoriParser.Left_square_bracket); }
		public TerminalNode Left_square_bracket(int i) {
			return getToken(MinamiKotoriParser.Left_square_bracket, i);
		}
		public List<TerminalNode> Right_square_bracket() { return getTokens(MinamiKotoriParser.Right_square_bracket); }
		public TerminalNode Right_square_bracket(int i) {
			return getToken(MinamiKotoriParser.Right_square_bracket, i);
		}
		public Array_declaration_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterArray_declaration_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitArray_declaration_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitArray_declaration_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declaration_typeContext array_declaration_type() throws RecognitionException {
		Array_declaration_typeContext _localctx = new Array_declaration_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_declaration_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			non_array_type();
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(Left_square_bracket);
				setState(203);
				match(Right_square_bracket);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Left_square_bracket );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitInit_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitInit_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			declarator();
			setState(211);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(209);
				match(T__6);
				setState(210);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MinamiKotoriParser.Identifier, 0); }
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			assignment_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Calculation_expressionContext calculation_expression() {
			return getRuleContext(Calculation_expressionContext.class,0);
		}
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<Assignment_operatorContext> assignment_operator() {
			return getRuleContexts(Assignment_operatorContext.class);
		}
		public Assignment_operatorContext assignment_operator(int i) {
			return getRuleContext(Assignment_operatorContext.class,i);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					unary_expression();
					setState(218);
					assignment_operator();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(225);
			calculation_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calculation_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Calculation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterCalculation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitCalculation_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitCalculation_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calculation_expressionContext calculation_expression() throws RecognitionException {
		Calculation_expressionContext _localctx = new Calculation_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_calculation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			logical_or_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<Logical_or_operatorContext> logical_or_operator() {
			return getRuleContexts(Logical_or_operatorContext.class);
		}
		public Logical_or_operatorContext logical_or_operator(int i) {
			return getRuleContext(Logical_or_operatorContext.class,i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitLogical_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitLogical_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			logical_and_expression();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(232);
				logical_or_operator();
				setState(233);
				logical_and_expression();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_or_operatorContext extends ParserRuleContext {
		public Logical_or_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterLogical_or_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitLogical_or_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitLogical_or_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_operatorContext logical_or_operator() throws RecognitionException {
		Logical_or_operatorContext _localctx = new Logical_or_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logical_or_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public List<Bitwise_or_expressionContext> bitwise_or_expression() {
			return getRuleContexts(Bitwise_or_expressionContext.class);
		}
		public Bitwise_or_expressionContext bitwise_or_expression(int i) {
			return getRuleContext(Bitwise_or_expressionContext.class,i);
		}
		public List<Logical_and_operatorContext> logical_and_operator() {
			return getRuleContexts(Logical_and_operatorContext.class);
		}
		public Logical_and_operatorContext logical_and_operator(int i) {
			return getRuleContext(Logical_and_operatorContext.class,i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitLogical_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitLogical_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			bitwise_or_expression();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(243);
				logical_and_operator();
				setState(244);
				bitwise_or_expression();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_and_operatorContext extends ParserRuleContext {
		public Logical_and_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterLogical_and_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitLogical_and_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitLogical_and_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_operatorContext logical_and_operator() throws RecognitionException {
		Logical_and_operatorContext _localctx = new Logical_and_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logical_and_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_or_expressionContext extends ParserRuleContext {
		public List<Bitwise_xor_expressionContext> bitwise_xor_expression() {
			return getRuleContexts(Bitwise_xor_expressionContext.class);
		}
		public Bitwise_xor_expressionContext bitwise_xor_expression(int i) {
			return getRuleContext(Bitwise_xor_expressionContext.class,i);
		}
		public List<Bitwise_or_operatorContext> bitwise_or_operator() {
			return getRuleContexts(Bitwise_or_operatorContext.class);
		}
		public Bitwise_or_operatorContext bitwise_or_operator(int i) {
			return getRuleContext(Bitwise_or_operatorContext.class,i);
		}
		public Bitwise_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBitwise_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBitwise_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBitwise_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_or_expressionContext bitwise_or_expression() throws RecognitionException {
		Bitwise_or_expressionContext _localctx = new Bitwise_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bitwise_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			bitwise_xor_expression();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(254);
				bitwise_or_operator();
				setState(255);
				bitwise_xor_expression();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_or_operatorContext extends ParserRuleContext {
		public Bitwise_or_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBitwise_or_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBitwise_or_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBitwise_or_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_or_operatorContext bitwise_or_operator() throws RecognitionException {
		Bitwise_or_operatorContext _localctx = new Bitwise_or_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bitwise_or_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_xor_expressionContext extends ParserRuleContext {
		public List<Bitwise_and_expressionContext> bitwise_and_expression() {
			return getRuleContexts(Bitwise_and_expressionContext.class);
		}
		public Bitwise_and_expressionContext bitwise_and_expression(int i) {
			return getRuleContext(Bitwise_and_expressionContext.class,i);
		}
		public List<Bitwise_xor_operatorContext> bitwise_xor_operator() {
			return getRuleContexts(Bitwise_xor_operatorContext.class);
		}
		public Bitwise_xor_operatorContext bitwise_xor_operator(int i) {
			return getRuleContext(Bitwise_xor_operatorContext.class,i);
		}
		public Bitwise_xor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_xor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBitwise_xor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBitwise_xor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBitwise_xor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_xor_expressionContext bitwise_xor_expression() throws RecognitionException {
		Bitwise_xor_expressionContext _localctx = new Bitwise_xor_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bitwise_xor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			bitwise_and_expression();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(265);
				bitwise_xor_operator();
				setState(266);
				bitwise_and_expression();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_xor_operatorContext extends ParserRuleContext {
		public Bitwise_xor_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_xor_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBitwise_xor_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBitwise_xor_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBitwise_xor_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_xor_operatorContext bitwise_xor_operator() throws RecognitionException {
		Bitwise_xor_operatorContext _localctx = new Bitwise_xor_operatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bitwise_xor_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_and_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<Bitwise_and_operatorContext> bitwise_and_operator() {
			return getRuleContexts(Bitwise_and_operatorContext.class);
		}
		public Bitwise_and_operatorContext bitwise_and_operator(int i) {
			return getRuleContext(Bitwise_and_operatorContext.class,i);
		}
		public Bitwise_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBitwise_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBitwise_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBitwise_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_and_expressionContext bitwise_and_expression() throws RecognitionException {
		Bitwise_and_expressionContext _localctx = new Bitwise_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bitwise_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			equality_expression();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(276);
				bitwise_and_operator();
				setState(277);
				equality_expression();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_and_operatorContext extends ParserRuleContext {
		public Bitwise_and_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_and_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBitwise_and_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBitwise_and_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBitwise_and_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_and_operatorContext bitwise_and_operator() throws RecognitionException {
		Bitwise_and_operatorContext _localctx = new Bitwise_and_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bitwise_and_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relation_expressionContext> relation_expression() {
			return getRuleContexts(Relation_expressionContext.class);
		}
		public Relation_expressionContext relation_expression(int i) {
			return getRuleContext(Relation_expressionContext.class,i);
		}
		public List<Is_equal_operatorContext> is_equal_operator() {
			return getRuleContexts(Is_equal_operatorContext.class);
		}
		public Is_equal_operatorContext is_equal_operator(int i) {
			return getRuleContext(Is_equal_operatorContext.class,i);
		}
		public List<Not_equal_operatorContext> not_equal_operator() {
			return getRuleContexts(Not_equal_operatorContext.class);
		}
		public Not_equal_operatorContext not_equal_operator(int i) {
			return getRuleContext(Not_equal_operatorContext.class,i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			relation_expression();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(289);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(287);
					is_equal_operator();
					}
					break;
				case T__13:
					{
					setState(288);
					not_equal_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291);
				relation_expression();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_equal_operatorContext extends ParserRuleContext {
		public Is_equal_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_equal_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterIs_equal_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitIs_equal_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitIs_equal_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_equal_operatorContext is_equal_operator() throws RecognitionException {
		Is_equal_operatorContext _localctx = new Is_equal_operatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_is_equal_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_equal_operatorContext extends ParserRuleContext {
		public Not_equal_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterNot_equal_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitNot_equal_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitNot_equal_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_equal_operatorContext not_equal_operator() throws RecognitionException {
		Not_equal_operatorContext _localctx = new Not_equal_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_not_equal_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relation_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Smaller_operatorContext smaller_operator() {
			return getRuleContext(Smaller_operatorContext.class,0);
		}
		public Bigger_operatorContext bigger_operator() {
			return getRuleContext(Bigger_operatorContext.class,0);
		}
		public Smaller_equal_operatorContext smaller_equal_operator() {
			return getRuleContext(Smaller_equal_operatorContext.class,0);
		}
		public Bigger_equal_operatorContext bigger_equal_operator() {
			return getRuleContext(Bigger_equal_operatorContext.class,0);
		}
		public Relation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterRelation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitRelation_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitRelation_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_expressionContext relation_expression() throws RecognitionException {
		Relation_expressionContext _localctx = new Relation_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			shift_expression();
			setState(311);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(307);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(303);
					smaller_operator();
					}
					break;
				case T__15:
					{
					setState(304);
					bigger_operator();
					}
					break;
				case T__16:
					{
					setState(305);
					smaller_equal_operator();
					}
					break;
				case T__17:
					{
					setState(306);
					bigger_equal_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(309);
				shift_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Smaller_operatorContext extends ParserRuleContext {
		public Smaller_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smaller_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterSmaller_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitSmaller_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitSmaller_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Smaller_operatorContext smaller_operator() throws RecognitionException {
		Smaller_operatorContext _localctx = new Smaller_operatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_smaller_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bigger_operatorContext extends ParserRuleContext {
		public Bigger_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigger_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBigger_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBigger_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBigger_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bigger_operatorContext bigger_operator() throws RecognitionException {
		Bigger_operatorContext _localctx = new Bigger_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bigger_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Smaller_equal_operatorContext extends ParserRuleContext {
		public Smaller_equal_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smaller_equal_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterSmaller_equal_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitSmaller_equal_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitSmaller_equal_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Smaller_equal_operatorContext smaller_equal_operator() throws RecognitionException {
		Smaller_equal_operatorContext _localctx = new Smaller_equal_operatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_smaller_equal_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bigger_equal_operatorContext extends ParserRuleContext {
		public Bigger_equal_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigger_equal_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBigger_equal_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBigger_equal_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBigger_equal_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bigger_equal_operatorContext bigger_equal_operator() throws RecognitionException {
		Bigger_equal_operatorContext _localctx = new Bigger_equal_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bigger_equal_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Add_expressionContext> add_expression() {
			return getRuleContexts(Add_expressionContext.class);
		}
		public Add_expressionContext add_expression(int i) {
			return getRuleContext(Add_expressionContext.class,i);
		}
		public List<Lshift_operatorContext> lshift_operator() {
			return getRuleContexts(Lshift_operatorContext.class);
		}
		public Lshift_operatorContext lshift_operator(int i) {
			return getRuleContext(Lshift_operatorContext.class,i);
		}
		public List<Rshift_operatorContext> rshift_operator() {
			return getRuleContexts(Rshift_operatorContext.class);
		}
		public Rshift_operatorContext rshift_operator(int i) {
			return getRuleContext(Rshift_operatorContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			add_expression();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__19) {
				{
				{
				setState(324);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(322);
					lshift_operator();
					}
					break;
				case T__19:
					{
					setState(323);
					rshift_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326);
				add_expression();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lshift_operatorContext extends ParserRuleContext {
		public Lshift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lshift_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterLshift_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitLshift_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitLshift_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lshift_operatorContext lshift_operator() throws RecognitionException {
		Lshift_operatorContext _localctx = new Lshift_operatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lshift_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rshift_operatorContext extends ParserRuleContext {
		public Rshift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rshift_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterRshift_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitRshift_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitRshift_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rshift_operatorContext rshift_operator() throws RecognitionException {
		Rshift_operatorContext _localctx = new Rshift_operatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rshift_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_expressionContext extends ParserRuleContext {
		public List<Multiply_expressionContext> multiply_expression() {
			return getRuleContexts(Multiply_expressionContext.class);
		}
		public Multiply_expressionContext multiply_expression(int i) {
			return getRuleContext(Multiply_expressionContext.class,i);
		}
		public List<Plus_operatorContext> plus_operator() {
			return getRuleContexts(Plus_operatorContext.class);
		}
		public Plus_operatorContext plus_operator(int i) {
			return getRuleContext(Plus_operatorContext.class,i);
		}
		public List<Minus_operatorContext> minus_operator() {
			return getRuleContexts(Minus_operatorContext.class);
		}
		public Minus_operatorContext minus_operator(int i) {
			return getRuleContext(Minus_operatorContext.class,i);
		}
		public Add_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterAdd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitAdd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitAdd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_expressionContext add_expression() throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_add_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			multiply_expression();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__21) {
				{
				{
				setState(340);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(338);
					plus_operator();
					}
					break;
				case T__21:
					{
					setState(339);
					minus_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(342);
				multiply_expression();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Plus_operatorContext extends ParserRuleContext {
		public Plus_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterPlus_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitPlus_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitPlus_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plus_operatorContext plus_operator() throws RecognitionException {
		Plus_operatorContext _localctx = new Plus_operatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_plus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Minus_operatorContext extends ParserRuleContext {
		public Minus_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterMinus_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitMinus_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitMinus_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minus_operatorContext minus_operator() throws RecognitionException {
		Minus_operatorContext _localctx = new Minus_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_minus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiply_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<Multiply_operatorContext> multiply_operator() {
			return getRuleContexts(Multiply_operatorContext.class);
		}
		public Multiply_operatorContext multiply_operator(int i) {
			return getRuleContext(Multiply_operatorContext.class,i);
		}
		public List<Divide_operatorContext> divide_operator() {
			return getRuleContexts(Divide_operatorContext.class);
		}
		public Divide_operatorContext divide_operator(int i) {
			return getRuleContext(Divide_operatorContext.class,i);
		}
		public List<Mod_operatorContext> mod_operator() {
			return getRuleContexts(Mod_operatorContext.class);
		}
		public Mod_operatorContext mod_operator(int i) {
			return getRuleContext(Mod_operatorContext.class,i);
		}
		public Multiply_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterMultiply_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitMultiply_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitMultiply_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiply_expressionContext multiply_expression() throws RecognitionException {
		Multiply_expressionContext _localctx = new Multiply_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiply_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			unary_expression();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(357);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(354);
					multiply_operator();
					}
					break;
				case T__23:
					{
					setState(355);
					divide_operator();
					}
					break;
				case T__24:
					{
					setState(356);
					mod_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(359);
				unary_expression();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiply_operatorContext extends ParserRuleContext {
		public Multiply_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterMultiply_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitMultiply_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitMultiply_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiply_operatorContext multiply_operator() throws RecognitionException {
		Multiply_operatorContext _localctx = new Multiply_operatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_multiply_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Divide_operatorContext extends ParserRuleContext {
		public Divide_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterDivide_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitDivide_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitDivide_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Divide_operatorContext divide_operator() throws RecognitionException {
		Divide_operatorContext _localctx = new Divide_operatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_divide_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mod_operatorContext extends ParserRuleContext {
		public Mod_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterMod_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitMod_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitMod_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_operatorContext mod_operator() throws RecognitionException {
		Mod_operatorContext _localctx = new Mod_operatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mod_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Function_call_expressionContext function_call_expression() {
			return getRuleContext(Function_call_expressionContext.class,0);
		}
		public New_operationContext new_operation() {
			return getRuleContext(New_operationContext.class,0);
		}
		public Builtin_constantContext builtin_constant() {
			return getRuleContext(Builtin_constantContext.class,0);
		}
		public Integer_constantContext integer_constant() {
			return getRuleContext(Integer_constantContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unary_expression);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				postfix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				unary_operator();
				setState(374);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				function_call_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				new_operation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				builtin_constant();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				integer_constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitPostfix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_postfix_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			primary_expression();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << Left_square_bracket))) != 0)) {
				{
				{
				setState(383);
				postfix();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MinamiKotoriParser.Identifier, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode Left_bracket() { return getToken(MinamiKotoriParser.Left_bracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Right_bracket() { return getToken(MinamiKotoriParser.Right_bracket, 0); }
		public Function_call_expressionContext function_call_expression() {
			return getRuleContext(Function_call_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primary_expression);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(Left_bracket);
				setState(392);
				expression();
				setState(393);
				match(Right_bracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				function_call_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Integer_constantContext integer_constant() {
			return getRuleContext(Integer_constantContext.class,0);
		}
		public String_constantContext string_constant() {
			return getRuleContext(String_constantContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constant);
		try {
			setState(400);
			switch (_input.LA(1)) {
			case Sign:
			case Decimal_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				integer_constant();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				string_constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_constantContext extends ParserRuleContext {
		public TerminalNode Decimal_constant() { return getToken(MinamiKotoriParser.Decimal_constant, 0); }
		public TerminalNode Sign() { return getToken(MinamiKotoriParser.Sign, 0); }
		public Integer_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterInteger_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitInteger_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitInteger_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_constantContext integer_constant() throws RecognitionException {
		Integer_constantContext _localctx = new Integer_constantContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_integer_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if (_la==Sign) {
				{
				setState(402);
				match(Sign);
				}
			}

			setState(405);
			match(Decimal_constant);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_constantContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(MinamiKotoriParser.StringLiteral, 0); }
		public String_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterString_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitString_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitString_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_constantContext string_constant() throws RecognitionException {
		String_constantContext _localctx = new String_constantContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_string_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixContext extends ParserRuleContext {
		public TerminalNode Left_square_bracket() { return getToken(MinamiKotoriParser.Left_square_bracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Right_square_bracket() { return getToken(MinamiKotoriParser.Right_square_bracket, 0); }
		public Get_member_operatorContext get_member_operator() {
			return getRuleContext(Get_member_operatorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MinamiKotoriParser.Identifier, 0); }
		public Function_call_expressionContext function_call_expression() {
			return getRuleContext(Function_call_expressionContext.class,0);
		}
		public Plusplus_operatorContext plusplus_operator() {
			return getRuleContext(Plusplus_operatorContext.class,0);
		}
		public Minusminus_operatorContext minusminus_operator() {
			return getRuleContext(Minusminus_operatorContext.class,0);
		}
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_postfix);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case Left_square_bracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(Left_square_bracket);
				setState(410);
				expression();
				setState(411);
				match(Right_square_bracket);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				get_member_operator();
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(414);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(415);
					function_call_expression();
					}
					break;
				}
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				plusplus_operator();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				minusminus_operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_member_operatorContext extends ParserRuleContext {
		public Get_member_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_member_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterGet_member_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitGet_member_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitGet_member_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_member_operatorContext get_member_operator() throws RecognitionException {
		Get_member_operatorContext _localctx = new Get_member_operatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_get_member_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Plusplus_operatorContext extends ParserRuleContext {
		public Plusplus_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusplus_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterPlusplus_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitPlusplus_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitPlusplus_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plusplus_operatorContext plusplus_operator() throws RecognitionException {
		Plusplus_operatorContext _localctx = new Plusplus_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_plusplus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Minusminus_operatorContext extends ParserRuleContext {
		public Minusminus_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusminus_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterMinusminus_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitMinusminus_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitMinusminus_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minusminus_operatorContext minusminus_operator() throws RecognitionException {
		Minusminus_operatorContext _localctx = new Minusminus_operatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_minusminus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Not_sign_operatorContext not_sign_operator() {
			return getRuleContext(Not_sign_operatorContext.class,0);
		}
		public Minus_operatorContext minus_operator() {
			return getRuleContext(Minus_operatorContext.class,0);
		}
		public Plusplus_operatorContext plusplus_operator() {
			return getRuleContext(Plusplus_operatorContext.class,0);
		}
		public Minusminus_operatorContext minusminus_operator() {
			return getRuleContext(Minusminus_operatorContext.class,0);
		}
		public Bitwise_not_operatorContext bitwise_not_operator() {
			return getRuleContext(Bitwise_not_operatorContext.class,0);
		}
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unary_operator);
		try {
			setState(433);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				not_sign_operator();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				minus_operator();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				plusplus_operator();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				minusminus_operator();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				bitwise_not_operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_sign_operatorContext extends ParserRuleContext {
		public Not_sign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_sign_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterNot_sign_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitNot_sign_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitNot_sign_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_sign_operatorContext not_sign_operator() throws RecognitionException {
		Not_sign_operatorContext _localctx = new Not_sign_operatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_not_sign_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_not_operatorContext extends ParserRuleContext {
		public Bitwise_not_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_not_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBitwise_not_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBitwise_not_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBitwise_not_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_not_operatorContext bitwise_not_operator() throws RecognitionException {
		Bitwise_not_operatorContext _localctx = new Bitwise_not_operatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_bitwise_not_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			assignment_expression();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(440);
				match(T__30);
				setState(441);
				assignment_expression();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_expressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MinamiKotoriParser.Identifier, 0); }
		public TerminalNode Left_bracket() { return getToken(MinamiKotoriParser.Left_bracket, 0); }
		public TerminalNode Right_bracket() { return getToken(MinamiKotoriParser.Right_bracket, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterFunction_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitFunction_call_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_expressionContext function_call_expression() throws RecognitionException {
		Function_call_expressionContext _localctx = new Function_call_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_function_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(Identifier);
			setState(448);
			match(Left_bracket);
			setState(450);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
				{
				setState(449);
				arguments();
				}
			}

			setState(452);
			match(Right_bracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			assignment_expression();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(455);
				match(T__30);
				setState(456);
				assignment_expression();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_operationContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MinamiKotoriParser.New, 0); }
		public Array_new_typeContext array_new_type() {
			return getRuleContext(Array_new_typeContext.class,0);
		}
		public Class_new_typeContext class_new_type() {
			return getRuleContext(Class_new_typeContext.class,0);
		}
		public New_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterNew_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitNew_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitNew_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_operationContext new_operation() throws RecognitionException {
		New_operationContext _localctx = new New_operationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_new_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(New);
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(463);
				array_new_type();
				}
				break;
			case 2:
				{
				setState(464);
				class_new_type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_new_typeContext extends ParserRuleContext {
		public Non_array_typeContext non_array_type() {
			return getRuleContext(Non_array_typeContext.class,0);
		}
		public List<TerminalNode> Left_square_bracket() { return getTokens(MinamiKotoriParser.Left_square_bracket); }
		public TerminalNode Left_square_bracket(int i) {
			return getToken(MinamiKotoriParser.Left_square_bracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Right_square_bracket() { return getTokens(MinamiKotoriParser.Right_square_bracket); }
		public TerminalNode Right_square_bracket(int i) {
			return getToken(MinamiKotoriParser.Right_square_bracket, i);
		}
		public Array_new_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_new_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterArray_new_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitArray_new_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitArray_new_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_new_typeContext array_new_type() throws RecognitionException {
		Array_new_typeContext _localctx = new Array_new_typeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_array_new_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			non_array_type();
			setState(472); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(468);
					match(Left_square_bracket);
					setState(469);
					expression();
					setState(470);
					match(Right_square_bracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(474); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Left_square_bracket) {
				{
				{
				setState(476);
				match(Left_square_bracket);
				setState(477);
				match(Right_square_bracket);
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_new_typeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MinamiKotoriParser.Identifier, 0); }
		public Class_new_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_new_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterClass_new_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitClass_new_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitClass_new_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_new_typeContext class_new_type() throws RecognitionException {
		Class_new_typeContext _localctx = new Class_new_typeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_class_new_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Builtin_constantContext extends ParserRuleContext {
		public Builtin_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBuiltin_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBuiltin_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBuiltin_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Builtin_constantContext builtin_constant() throws RecognitionException {
		Builtin_constantContext _localctx = new Builtin_constantContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_builtin_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MinamiKotoriParser.Identifier, 0); }
		public TerminalNode Left_bracket() { return getToken(MinamiKotoriParser.Left_bracket, 0); }
		public TerminalNode Right_bracket() { return getToken(MinamiKotoriParser.Right_bracket, 0); }
		public TerminalNode Left_brace() { return getToken(MinamiKotoriParser.Left_brace, 0); }
		public TerminalNode Right_brace() { return getToken(MinamiKotoriParser.Right_brace, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			type();
			setState(488);
			match(Identifier);
			setState(489);
			match(Left_bracket);
			setState(491);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Identifier))) != 0)) {
				{
				setState(490);
				parameter_list();
				}
			}

			setState(493);
			match(Right_bracket);
			setState(494);
			match(Left_brace);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << For) | (1L << While) | (1L << If) | (1L << Return) | (1L << Break) | (1L << Continue) | (1L << Left_bracket) | (1L << Left_brace) | (1L << Identifier))) != 0)) {
				{
				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(495);
					statement();
					}
					break;
				case 2:
					{
					setState(496);
					declaration();
					}
					break;
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			match(Right_brace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			parameter();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(505);
				match(T__30);
				setState(506);
				parameter();
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			type();
			setState(513);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_statement);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				compound_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				loop_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				branch_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(519);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			expression();
			setState(523);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode Left_brace() { return getToken(MinamiKotoriParser.Left_brace, 0); }
		public TerminalNode Right_brace() { return getToken(MinamiKotoriParser.Right_brace, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(Left_brace);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << For) | (1L << While) | (1L << If) | (1L << Return) | (1L << Break) | (1L << Continue) | (1L << Left_bracket) | (1L << Left_brace) | (1L << Identifier))) != 0)) {
				{
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(526);
					declaration();
					}
					break;
				case 2:
					{
					setState(527);
					statement();
					}
					break;
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(533);
			match(Right_brace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public For_loop_statementContext for_loop_statement() {
			return getRuleContext(For_loop_statementContext.class,0);
		}
		public While_loop_statementContext while_loop_statement() {
			return getRuleContext(While_loop_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_loop_statement);
		try {
			setState(537);
			switch (_input.LA(1)) {
			case For:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				for_loop_statement();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				while_loop_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loop_statementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(MinamiKotoriParser.For, 0); }
		public TerminalNode Left_bracket() { return getToken(MinamiKotoriParser.Left_bracket, 0); }
		public TerminalNode Right_bracket() { return getToken(MinamiKotoriParser.Right_bracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public The_first_for_expressionContext the_first_for_expression() {
			return getRuleContext(The_first_for_expressionContext.class,0);
		}
		public The_second_for_expressionContext the_second_for_expression() {
			return getRuleContext(The_second_for_expressionContext.class,0);
		}
		public The_third_for_expressionContext the_third_for_expression() {
			return getRuleContext(The_third_for_expressionContext.class,0);
		}
		public For_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterFor_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitFor_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitFor_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_statementContext for_loop_statement() throws RecognitionException {
		For_loop_statementContext _localctx = new For_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_for_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(For);
			setState(540);
			match(Left_bracket);
			setState(542);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
				{
				setState(541);
				the_first_for_expression();
				}
			}

			setState(544);
			match(T__0);
			setState(546);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
				{
				setState(545);
				the_second_for_expression();
				}
			}

			setState(548);
			match(T__0);
			setState(550);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
				{
				setState(549);
				the_third_for_expression();
				}
			}

			setState(552);
			match(Right_bracket);
			setState(553);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class The_first_for_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public The_first_for_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_the_first_for_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterThe_first_for_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitThe_first_for_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitThe_first_for_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final The_first_for_expressionContext the_first_for_expression() throws RecognitionException {
		The_first_for_expressionContext _localctx = new The_first_for_expressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_the_first_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class The_second_for_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public The_second_for_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_the_second_for_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterThe_second_for_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitThe_second_for_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitThe_second_for_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final The_second_for_expressionContext the_second_for_expression() throws RecognitionException {
		The_second_for_expressionContext _localctx = new The_second_for_expressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_the_second_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class The_third_for_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public The_third_for_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_the_third_for_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterThe_third_for_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitThe_third_for_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitThe_third_for_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final The_third_for_expressionContext the_third_for_expression() throws RecognitionException {
		The_third_for_expressionContext _localctx = new The_third_for_expressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_the_third_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loop_statementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(MinamiKotoriParser.While, 0); }
		public TerminalNode Left_bracket() { return getToken(MinamiKotoriParser.Left_bracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Right_bracket() { return getToken(MinamiKotoriParser.Right_bracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterWhile_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitWhile_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitWhile_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loop_statementContext while_loop_statement() throws RecognitionException {
		While_loop_statementContext _localctx = new While_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_while_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(While);
			setState(562);
			match(Left_bracket);
			setState(563);
			expression();
			setState(564);
			match(Right_bracket);
			setState(565);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public TerminalNode Return() { return getToken(MinamiKotoriParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Break() { return getToken(MinamiKotoriParser.Break, 0); }
		public TerminalNode Continue() { return getToken(MinamiKotoriParser.Continue, 0); }
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBranch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBranch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBranch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_branch_statement);
		int _la;
		try {
			setState(577);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				if_statement();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(Return);
				setState(570);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
					{
					setState(569);
					expression();
					}
				}

				setState(572);
				match(T__0);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(Break);
				setState(574);
				match(T__0);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				match(Continue);
				setState(576);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MinamiKotoriParser.If, 0); }
		public TerminalNode Left_bracket() { return getToken(MinamiKotoriParser.Left_bracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Right_bracket() { return getToken(MinamiKotoriParser.Right_bracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(MinamiKotoriParser.Else, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(If);
			setState(580);
			match(Left_bracket);
			setState(581);
			expression();
			setState(582);
			match(Right_bracket);
			setState(583);
			statement();
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(584);
				match(Else);
				setState(585);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u024f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\7\2\u009d\n\2\f\2\16\2\u00a0\13\2"+
		"\3\2\3\2\3\2\7\2\u00a5\n\2\f\2\16\2\u00a8\13\2\3\3\3\3\5\3\u00ac\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\5\5\u00b4\n\5\3\6\3\6\5\6\u00b8\n\6\3\7\3\7\5\7"+
		"\u00bc\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c5\n\b\f\b\16\b\u00c8\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\6\t\u00cf\n\t\r\t\16\t\u00d0\3\n\3\n\3\n\5\n\u00d6"+
		"\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r\u00df\n\r\f\r\16\r\u00e2\13\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00ee\n\20\f\20\16"+
		"\20\u00f1\13\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00f9\n\22\f\22\16"+
		"\22\u00fc\13\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0104\n\24\f\24\16"+
		"\24\u0107\13\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u010f\n\26\f\26\16"+
		"\26\u0112\13\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u011a\n\30\f\30\16"+
		"\30\u011d\13\30\3\31\3\31\3\32\3\32\3\32\5\32\u0124\n\32\3\32\3\32\7\32"+
		"\u0128\n\32\f\32\16\32\u012b\13\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0136\n\35\3\35\3\35\5\35\u013a\n\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u0147\n\"\3\"\3\"\7\"\u014b\n\"\f\"\16"+
		"\"\u014e\13\"\3#\3#\3$\3$\3%\3%\3%\5%\u0157\n%\3%\3%\7%\u015b\n%\f%\16"+
		"%\u015e\13%\3&\3&\3\'\3\'\3(\3(\3(\3(\5(\u0168\n(\3(\3(\7(\u016c\n(\f"+
		"(\16(\u016f\13(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u017f\n,"+
		"\3-\3-\7-\u0183\n-\f-\16-\u0186\13-\3.\3.\3.\3.\3.\3.\3.\5.\u018f\n.\3"+
		"/\3/\5/\u0193\n/\3\60\5\60\u0196\n\60\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\5\62\u01a3\n\62\3\62\3\62\5\62\u01a7\n\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u01b4\n\66\3\67"+
		"\3\67\38\38\39\39\39\79\u01bd\n9\f9\169\u01c0\139\3:\3:\3:\5:\u01c5\n"+
		":\3:\3:\3;\3;\3;\7;\u01cc\n;\f;\16;\u01cf\13;\3<\3<\3<\5<\u01d4\n<\3="+
		"\3=\3=\3=\3=\6=\u01db\n=\r=\16=\u01dc\3=\3=\7=\u01e1\n=\f=\16=\u01e4\13"+
		"=\3>\3>\3?\3?\3@\3@\3@\3@\5@\u01ee\n@\3@\3@\3@\3@\7@\u01f4\n@\f@\16@\u01f7"+
		"\13@\3@\3@\3A\3A\3A\7A\u01fe\nA\fA\16A\u0201\13A\3B\3B\3B\3C\3C\3C\3C"+
		"\3C\5C\u020b\nC\3D\3D\3D\3E\3E\3E\7E\u0213\nE\fE\16E\u0216\13E\3E\3E\3"+
		"F\3F\5F\u021c\nF\3G\3G\3G\5G\u0221\nG\3G\3G\5G\u0225\nG\3G\3G\5G\u0229"+
		"\nG\3G\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\5L\u023d\nL"+
		"\3L\3L\3L\3L\3L\5L\u0244\nL\3M\3M\3M\3M\3M\3M\3M\5M\u024d\nM\3M\2\2N\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\2\4\3\2\4\7\3\2\"$\u024c\2\u009e\3\2\2"+
		"\2\4\u00ab\3\2\2\2\6\u00ad\3\2\2\2\b\u00b3\3\2\2\2\n\u00b7\3\2\2\2\f\u00bb"+
		"\3\2\2\2\16\u00bd\3\2\2\2\20\u00cb\3\2\2\2\22\u00d2\3\2\2\2\24\u00d7\3"+
		"\2\2\2\26\u00d9\3\2\2\2\30\u00e0\3\2\2\2\32\u00e5\3\2\2\2\34\u00e7\3\2"+
		"\2\2\36\u00e9\3\2\2\2 \u00f2\3\2\2\2\"\u00f4\3\2\2\2$\u00fd\3\2\2\2&\u00ff"+
		"\3\2\2\2(\u0108\3\2\2\2*\u010a\3\2\2\2,\u0113\3\2\2\2.\u0115\3\2\2\2\60"+
		"\u011e\3\2\2\2\62\u0120\3\2\2\2\64\u012c\3\2\2\2\66\u012e\3\2\2\28\u0130"+
		"\3\2\2\2:\u013b\3\2\2\2<\u013d\3\2\2\2>\u013f\3\2\2\2@\u0141\3\2\2\2B"+
		"\u0143\3\2\2\2D\u014f\3\2\2\2F\u0151\3\2\2\2H\u0153\3\2\2\2J\u015f\3\2"+
		"\2\2L\u0161\3\2\2\2N\u0163\3\2\2\2P\u0170\3\2\2\2R\u0172\3\2\2\2T\u0174"+
		"\3\2\2\2V\u017e\3\2\2\2X\u0180\3\2\2\2Z\u018e\3\2\2\2\\\u0192\3\2\2\2"+
		"^\u0195\3\2\2\2`\u0199\3\2\2\2b\u01a6\3\2\2\2d\u01a8\3\2\2\2f\u01aa\3"+
		"\2\2\2h\u01ac\3\2\2\2j\u01b3\3\2\2\2l\u01b5\3\2\2\2n\u01b7\3\2\2\2p\u01b9"+
		"\3\2\2\2r\u01c1\3\2\2\2t\u01c8\3\2\2\2v\u01d0\3\2\2\2x\u01d5\3\2\2\2z"+
		"\u01e5\3\2\2\2|\u01e7\3\2\2\2~\u01e9\3\2\2\2\u0080\u01fa\3\2\2\2\u0082"+
		"\u0202\3\2\2\2\u0084\u020a\3\2\2\2\u0086\u020c\3\2\2\2\u0088\u020f\3\2"+
		"\2\2\u008a\u021b\3\2\2\2\u008c\u021d\3\2\2\2\u008e\u022d\3\2\2\2\u0090"+
		"\u022f\3\2\2\2\u0092\u0231\3\2\2\2\u0094\u0233\3\2\2\2\u0096\u0243\3\2"+
		"\2\2\u0098\u0245\3\2\2\2\u009a\u009d\5~@\2\u009b\u009d\5\4\3\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a6\5~"+
		"@\2\u00a2\u00a5\5~@\2\u00a3\u00a5\5\4\3\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\3\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\5\6\4\2\u00aa\u00ac\5\16\b"+
		"\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\5\3\2\2\2\u00ad\u00ae"+
		"\5\b\5\2\u00ae\u00af\5\22\n\2\u00af\u00b0\7\3\2\2\u00b0\7\3\2\2\2\u00b1"+
		"\u00b4\5\n\6\2\u00b2\u00b4\5\20\t\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4\t\3\2\2\2\u00b5\u00b8\5\f\7\2\u00b6\u00b8\5\16\b\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\13\3\2\2\2\u00b9\u00bc\t\2\2"+
		"\2\u00ba\u00bc\7\67\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\r\3\2\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf\7\67\2\2\u00bf\u00c6\7\64\2"+
		"\2\u00c0\u00c1\5\b\5\2\u00c1\u00c2\5\24\13\2\u00c2\u00c3\7\3\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\65\2\2\u00ca\17\3\2\2\2\u00cb\u00ce\5\n\6\2\u00cc\u00cd\7\62"+
		"\2\2\u00cd\u00cf\7\63\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\21\3\2\2\2\u00d2\u00d5\5\24\13"+
		"\2\u00d3\u00d4\7\t\2\2\u00d4\u00d6\5\26\f\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\23\3\2\2\2\u00d7\u00d8\7\67\2\2\u00d8\25\3\2\2\2"+
		"\u00d9\u00da\5\30\r\2\u00da\27\3\2\2\2\u00db\u00dc\5V,\2\u00dc\u00dd\5"+
		"\32\16\2\u00dd\u00df\3\2\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e4\5\34\17\2\u00e4\31\3\2\2\2\u00e5\u00e6\7\t\2\2\u00e6"+
		"\33\3\2\2\2\u00e7\u00e8\5\36\20\2\u00e8\35\3\2\2\2\u00e9\u00ef\5\"\22"+
		"\2\u00ea\u00eb\5 \21\2\u00eb\u00ec\5\"\22\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\37\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\n\2\2\u00f3!\3"+
		"\2\2\2\u00f4\u00fa\5&\24\2\u00f5\u00f6\5$\23\2\u00f6\u00f7\5&\24\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb#\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe"+
		"\7\13\2\2\u00fe%\3\2\2\2\u00ff\u0105\5*\26\2\u0100\u0101\5(\25\2\u0101"+
		"\u0102\5*\26\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\'\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u0109\7\f\2\2\u0109)\3\2\2\2\u010a\u0110\5.\30\2\u010b"+
		"\u010c\5,\27\2\u010c\u010d\5.\30\2\u010d\u010f\3\2\2\2\u010e\u010b\3\2"+
		"\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"+\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\r\2\2\u0114-\3\2\2\2\u0115"+
		"\u011b\5\62\32\2\u0116\u0117\5\60\31\2\u0117\u0118\5\62\32\2\u0118\u011a"+
		"\3\2\2\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c/\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\16\2\2"+
		"\u011f\61\3\2\2\2\u0120\u0129\58\35\2\u0121\u0124\5\64\33\2\u0122\u0124"+
		"\5\66\34\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0126\58\35\2\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0128\u012b"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\63\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\7\17\2\2\u012d\65\3\2\2\2\u012e\u012f\7\20"+
		"\2\2\u012f\67\3\2\2\2\u0130\u0139\5B\"\2\u0131\u0136\5:\36\2\u0132\u0136"+
		"\5<\37\2\u0133\u0136\5> \2\u0134\u0136\5@!\2\u0135\u0131\3\2\2\2\u0135"+
		"\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\5B\"\2\u0138\u013a\3\2\2\2\u0139\u0135\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a9\3\2\2\2\u013b\u013c\7\21\2\2\u013c;\3\2\2\2\u013d"+
		"\u013e\7\22\2\2\u013e=\3\2\2\2\u013f\u0140\7\23\2\2\u0140?\3\2\2\2\u0141"+
		"\u0142\7\24\2\2\u0142A\3\2\2\2\u0143\u014c\5H%\2\u0144\u0147\5D#\2\u0145"+
		"\u0147\5F$\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2"+
		"\2\u0148\u0149\5H%\2\u0149\u014b\3\2\2\2\u014a\u0146\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014dC\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7\25\2\2\u0150E\3\2\2\2\u0151\u0152\7\26\2"+
		"\2\u0152G\3\2\2\2\u0153\u015c\5N(\2\u0154\u0157\5J&\2\u0155\u0157\5L\'"+
		"\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159"+
		"\5N(\2\u0159\u015b\3\2\2\2\u015a\u0156\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015dI\3\2\2\2\u015e\u015c\3\2\2\2"+
		"\u015f\u0160\7\27\2\2\u0160K\3\2\2\2\u0161\u0162\7\30\2\2\u0162M\3\2\2"+
		"\2\u0163\u016d\5V,\2\u0164\u0168\5P)\2\u0165\u0168\5R*\2\u0166\u0168\5"+
		"T+\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016a\5V,\2\u016a\u016c\3\2\2\2\u016b\u0167\3\2\2"+
		"\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016eO"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\31\2\2\u0171Q\3\2\2\2\u0172"+
		"\u0173\7\32\2\2\u0173S\3\2\2\2\u0174\u0175\7\33\2\2\u0175U\3\2\2\2\u0176"+
		"\u017f\5X-\2\u0177\u0178\5j\66\2\u0178\u0179\5V,\2\u0179\u017f\3\2\2\2"+
		"\u017a\u017f\5r:\2\u017b\u017f\5v<\2\u017c\u017f\5|?\2\u017d\u017f\5^"+
		"\60\2\u017e\u0176\3\2\2\2\u017e\u0177\3\2\2\2\u017e\u017a\3\2\2\2\u017e"+
		"\u017b\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017fW\3\2\2\2"+
		"\u0180\u0184\5Z.\2\u0181\u0183\5b\62\2\u0182\u0181\3\2\2\2\u0183\u0186"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185Y\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u018f\7\67\2\2\u0188\u018f\5\\/\2\u0189\u018a\7\60"+
		"\2\2\u018a\u018b\5p9\2\u018b\u018c\7\61\2\2\u018c\u018f\3\2\2\2\u018d"+
		"\u018f\5r:\2\u018e\u0187\3\2\2\2\u018e\u0188\3\2\2\2\u018e\u0189\3\2\2"+
		"\2\u018e\u018d\3\2\2\2\u018f[\3\2\2\2\u0190\u0193\5^\60\2\u0191\u0193"+
		"\5`\61\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193]\3\2\2\2\u0194"+
		"\u0196\7&\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\7\'\2\2\u0198_\3\2\2\2\u0199\u019a\7%\2\2\u019aa\3\2"+
		"\2\2\u019b\u019c\7\62\2\2\u019c\u019d\5p9\2\u019d\u019e\7\63\2\2\u019e"+
		"\u01a7\3\2\2\2\u019f\u01a2\5d\63\2\u01a0\u01a3\7\67\2\2\u01a1\u01a3\5"+
		"r:\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a7\3\2\2\2\u01a4"+
		"\u01a7\5f\64\2\u01a5\u01a7\5h\65\2\u01a6\u019b\3\2\2\2\u01a6\u019f\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7c\3\2\2\2\u01a8\u01a9"+
		"\7\34\2\2\u01a9e\3\2\2\2\u01aa\u01ab\7\35\2\2\u01abg\3\2\2\2\u01ac\u01ad"+
		"\7\36\2\2\u01adi\3\2\2\2\u01ae\u01b4\5l\67\2\u01af\u01b4\5L\'\2\u01b0"+
		"\u01b4\5f\64\2\u01b1\u01b4\5h\65\2\u01b2\u01b4\5n8\2\u01b3\u01ae\3\2\2"+
		"\2\u01b3\u01af\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2"+
		"\3\2\2\2\u01b4k\3\2\2\2\u01b5\u01b6\7\37\2\2\u01b6m\3\2\2\2\u01b7\u01b8"+
		"\7 \2\2\u01b8o\3\2\2\2\u01b9\u01be\5\30\r\2\u01ba\u01bb\7!\2\2\u01bb\u01bd"+
		"\5\30\r\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2"+
		"\u01be\u01bf\3\2\2\2\u01bfq\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7"+
		"\67\2\2\u01c2\u01c4\7\60\2\2\u01c3\u01c5\5t;\2\u01c4\u01c3\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\61\2\2\u01c7s\3\2\2\2"+
		"\u01c8\u01cd\5\30\r\2\u01c9\u01ca\7!\2\2\u01ca\u01cc\5\30\r\2\u01cb\u01c9"+
		"\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"u\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\7(\2\2\u01d1\u01d4\5x=\2\u01d2"+
		"\u01d4\5z>\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4w\3\2\2\2\u01d5"+
		"\u01da\5\n\6\2\u01d6\u01d7\7\62\2\2\u01d7\u01d8\5p9\2\u01d8\u01d9\7\63"+
		"\2\2\u01d9\u01db\3\2\2\2\u01da\u01d6\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e2\3\2\2\2\u01de\u01df\7\62"+
		"\2\2\u01df\u01e1\7\63\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3y\3\2\2\2\u01e4\u01e2\3\2\2\2"+
		"\u01e5\u01e6\7\67\2\2\u01e6{\3\2\2\2\u01e7\u01e8\t\3\2\2\u01e8}\3\2\2"+
		"\2\u01e9\u01ea\5\b\5\2\u01ea\u01eb\7\67\2\2\u01eb\u01ed\7\60\2\2\u01ec"+
		"\u01ee\5\u0080A\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f0\7\61\2\2\u01f0\u01f5\7\64\2\2\u01f1\u01f4\5\u0084"+
		"C\2\u01f2\u01f4\5\4\3\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4"+
		"\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2"+
		"\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7\65\2\2\u01f9\177\3\2\2\2\u01fa"+
		"\u01ff\5\u0082B\2\u01fb\u01fc\7!\2\2\u01fc\u01fe\5\u0082B\2\u01fd\u01fb"+
		"\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0081\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\5\b\5\2\u0203\u0204\5\24"+
		"\13\2\u0204\u0083\3\2\2\2\u0205\u020b\5\u0086D\2\u0206\u020b\5\u0088E"+
		"\2\u0207\u020b\5\u008aF\2\u0208\u020b\5\u0096L\2\u0209\u020b\5\4\3\2\u020a"+
		"\u0205\3\2\2\2\u020a\u0206\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020a\u0209\3\2\2\2\u020b\u0085\3\2\2\2\u020c\u020d\5p9\2\u020d\u020e"+
		"\7\3\2\2\u020e\u0087\3\2\2\2\u020f\u0214\7\64\2\2\u0210\u0213\5\4\3\2"+
		"\u0211\u0213\5\u0084C\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2"+
		"\2\2\u0216\u0214\3\2\2\2\u0217\u0218\7\65\2\2\u0218\u0089\3\2\2\2\u0219"+
		"\u021c\5\u008cG\2\u021a\u021c\5\u0094K\2\u021b\u0219\3\2\2\2\u021b\u021a"+
		"\3\2\2\2\u021c\u008b\3\2\2\2\u021d\u021e\7)\2\2\u021e\u0220\7\60\2\2\u021f"+
		"\u0221\5\u008eH\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0224\7\3\2\2\u0223\u0225\5\u0090I\2\u0224\u0223\3\2\2"+
		"\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\7\3\2\2\u0227\u0229"+
		"\5\u0092J\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2"+
		"\2\u022a\u022b\7\61\2\2\u022b\u022c\5\u0084C\2\u022c\u008d\3\2\2\2\u022d"+
		"\u022e\5p9\2\u022e\u008f\3\2\2\2\u022f\u0230\5p9\2\u0230\u0091\3\2\2\2"+
		"\u0231\u0232\5p9\2\u0232\u0093\3\2\2\2\u0233\u0234\7*\2\2\u0234\u0235"+
		"\7\60\2\2\u0235\u0236\5p9\2\u0236\u0237\7\61\2\2\u0237\u0238\5\u0084C"+
		"\2\u0238\u0095\3\2\2\2\u0239\u0244\5\u0098M\2\u023a\u023c\7-\2\2\u023b"+
		"\u023d\5p9\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2"+
		"\2\u023e\u0244\7\3\2\2\u023f\u0240\7.\2\2\u0240\u0244\7\3\2\2\u0241\u0242"+
		"\7/\2\2\u0242\u0244\7\3\2\2\u0243\u0239\3\2\2\2\u0243\u023a\3\2\2\2\u0243"+
		"\u023f\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0097\3\2\2\2\u0245\u0246\7+"+
		"\2\2\u0246\u0247\7\60\2\2\u0247\u0248\5p9\2\u0248\u0249\7\61\2\2\u0249"+
		"\u024c\5\u0084C\2\u024a\u024b\7,\2\2\u024b\u024d\5\u0084C\2\u024c\u024a"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0099\3\2\2\29\u009c\u009e\u00a4\u00a6"+
		"\u00ab\u00b3\u00b7\u00bb\u00c6\u00d0\u00d5\u00e0\u00ef\u00fa\u0105\u0110"+
		"\u011b\u0123\u0129\u0135\u0139\u0146\u014c\u0156\u015c\u0167\u016d\u017e"+
		"\u0184\u018e\u0192\u0195\u01a2\u01a6\u01b3\u01be\u01c4\u01cd\u01d3\u01dc"+
		"\u01e2\u01ed\u01f3\u01f5\u01ff\u020a\u0212\u0214\u021b\u0220\u0224\u0228"+
		"\u023c\u0243\u024c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}