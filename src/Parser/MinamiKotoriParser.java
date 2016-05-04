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
		RULE_equality_operators = 25, RULE_is_equal_operator = 26, RULE_not_equal_operator = 27, 
		RULE_relation_expression = 28, RULE_relation_operators = 29, RULE_smaller_operator = 30, 
		RULE_bigger_operator = 31, RULE_smaller_equal_operator = 32, RULE_bigger_equal_operator = 33, 
		RULE_shift_expression = 34, RULE_shift_operators = 35, RULE_lshift_operator = 36, 
		RULE_rshift_operator = 37, RULE_add_expression = 38, RULE_add_operators = 39, 
		RULE_plus_operator = 40, RULE_minus_operator = 41, RULE_multiply_expression = 42, 
		RULE_multiply_operators = 43, RULE_multiply_operator = 44, RULE_divide_operator = 45, 
		RULE_mod_operator = 46, RULE_unary_expression = 47, RULE_postfix_expression = 48, 
		RULE_primary_expression = 49, RULE_constant = 50, RULE_integer_constant = 51, 
		RULE_string_constant = 52, RULE_postfix = 53, RULE_get_member_operator = 54, 
		RULE_plusplus_operator = 55, RULE_minusminus_operator = 56, RULE_unary_operator = 57, 
		RULE_not_sign_operator = 58, RULE_bitwise_not_operator = 59, RULE_expression = 60, 
		RULE_function_call_expression = 61, RULE_arguments = 62, RULE_new_operation = 63, 
		RULE_array_new_type = 64, RULE_class_new_type = 65, RULE_builtin_constant = 66, 
		RULE_function_definition = 67, RULE_base_statement = 68, RULE_parameter_list = 69, 
		RULE_parameter = 70, RULE_statement = 71, RULE_assignment_statement = 72, 
		RULE_compound_statement = 73, RULE_loop_statement = 74, RULE_for_loop_statement = 75, 
		RULE_the_first_for_expression = 76, RULE_the_second_for_expression = 77, 
		RULE_the_third_for_expression = 78, RULE_while_loop_statement = 79, RULE_branch_statement = 80, 
		RULE_if_statement = 81;
	public static final String[] ruleNames = {
		"program", "declaration", "variable_declaration", "type", "non_array_type", 
		"type_name", "class_declaration", "array_declaration_type", "init_declarator", 
		"declarator", "initializer", "assignment_expression", "assignment_operator", 
		"calculation_expression", "logical_or_expression", "logical_or_operator", 
		"logical_and_expression", "logical_and_operator", "bitwise_or_expression", 
		"bitwise_or_operator", "bitwise_xor_expression", "bitwise_xor_operator", 
		"bitwise_and_expression", "bitwise_and_operator", "equality_expression", 
		"equality_operators", "is_equal_operator", "not_equal_operator", "relation_expression", 
		"relation_operators", "smaller_operator", "bigger_operator", "smaller_equal_operator", 
		"bigger_equal_operator", "shift_expression", "shift_operators", "lshift_operator", 
		"rshift_operator", "add_expression", "add_operators", "plus_operator", 
		"minus_operator", "multiply_expression", "multiply_operators", "multiply_operator", 
		"divide_operator", "mod_operator", "unary_expression", "postfix_expression", 
		"primary_expression", "constant", "integer_constant", "string_constant", 
		"postfix", "get_member_operator", "plusplus_operator", "minusminus_operator", 
		"unary_operator", "not_sign_operator", "bitwise_not_operator", "expression", 
		"function_call_expression", "arguments", "new_operation", "array_new_type", 
		"class_new_type", "builtin_constant", "function_definition", "base_statement", 
		"parameter_list", "parameter", "statement", "assignment_statement", "compound_statement", 
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
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(164);
						function_definition();
						}
						break;
					case 2:
						{
						setState(165);
						declaration();
						}
						break;
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(171);
			function_definition();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Identifier))) != 0)) {
				{
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(172);
					function_definition();
					}
					break;
				case 2:
					{
					setState(173);
					declaration();
					}
					break;
				}
				}
				setState(178);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
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
			setState(183);
			type();
			setState(184);
			init_declarator();
			setState(185);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				non_array_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
			setState(193);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				type_name();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
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
			setState(197);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
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
				setState(196);
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
			setState(199);
			match(T__5);
			setState(200);
			match(Identifier);
			setState(201);
			match(Left_brace);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Identifier))) != 0)) {
				{
				{
				setState(202);
				type();
				setState(203);
				declarator();
				setState(204);
				match(T__0);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
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
			setState(213);
			non_array_type();
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				match(Left_square_bracket);
				setState(215);
				match(Right_square_bracket);
				}
				}
				setState(218); 
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
			setState(220);
			declarator();
			setState(223);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(221);
				match(T__6);
				setState(222);
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
			setState(225);
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
			setState(227);
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
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					unary_expression();
					setState(230);
					assignment_operator();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(237);
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
			setState(239);
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
			setState(241);
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
			setState(243);
			logical_and_expression();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(244);
				logical_or_operator();
				setState(245);
				logical_and_expression();
				}
				}
				setState(251);
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
			setState(252);
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
			setState(254);
			bitwise_or_expression();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(255);
				logical_and_operator();
				setState(256);
				bitwise_or_expression();
				}
				}
				setState(262);
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
			setState(263);
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
			setState(265);
			bitwise_xor_expression();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(266);
				bitwise_or_operator();
				setState(267);
				bitwise_xor_expression();
				}
				}
				setState(273);
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
			setState(274);
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
			setState(276);
			bitwise_and_expression();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(277);
				bitwise_xor_operator();
				setState(278);
				bitwise_and_expression();
				}
				}
				setState(284);
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
			setState(285);
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
			setState(287);
			equality_expression();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(288);
				bitwise_and_operator();
				setState(289);
				equality_expression();
				}
				}
				setState(295);
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
			setState(296);
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
		public List<Equality_operatorsContext> equality_operators() {
			return getRuleContexts(Equality_operatorsContext.class);
		}
		public Equality_operatorsContext equality_operators(int i) {
			return getRuleContext(Equality_operatorsContext.class,i);
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
			setState(298);
			relation_expression();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(299);
				equality_operators();
				setState(300);
				relation_expression();
				}
				}
				setState(306);
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

	public static class Equality_operatorsContext extends ParserRuleContext {
		public Is_equal_operatorContext is_equal_operator() {
			return getRuleContext(Is_equal_operatorContext.class,0);
		}
		public Not_equal_operatorContext not_equal_operator() {
			return getRuleContext(Not_equal_operatorContext.class,0);
		}
		public Equality_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterEquality_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitEquality_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitEquality_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_operatorsContext equality_operators() throws RecognitionException {
		Equality_operatorsContext _localctx = new Equality_operatorsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_equality_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(307);
				is_equal_operator();
				}
				break;
			case T__13:
				{
				setState(308);
				not_equal_operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 52, RULE_is_equal_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 54, RULE_not_equal_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		public Relation_operatorsContext relation_operators() {
			return getRuleContext(Relation_operatorsContext.class,0);
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
		enterRule(_localctx, 56, RULE_relation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			shift_expression();
			setState(319);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(316);
				relation_operators();
				setState(317);
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

	public static class Relation_operatorsContext extends ParserRuleContext {
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
		public Relation_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterRelation_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitRelation_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitRelation_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_operatorsContext relation_operators() throws RecognitionException {
		Relation_operatorsContext _localctx = new Relation_operatorsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relation_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(321);
				smaller_operator();
				}
				break;
			case T__15:
				{
				setState(322);
				bigger_operator();
				}
				break;
			case T__16:
				{
				setState(323);
				smaller_equal_operator();
				}
				break;
			case T__17:
				{
				setState(324);
				bigger_equal_operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 60, RULE_smaller_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 62, RULE_bigger_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 64, RULE_smaller_equal_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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
		enterRule(_localctx, 66, RULE_bigger_equal_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		public List<Shift_operatorsContext> shift_operators() {
			return getRuleContexts(Shift_operatorsContext.class);
		}
		public Shift_operatorsContext shift_operators(int i) {
			return getRuleContext(Shift_operatorsContext.class,i);
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
		enterRule(_localctx, 68, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			add_expression();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__19) {
				{
				{
				setState(336);
				shift_operators();
				setState(337);
				add_expression();
				}
				}
				setState(343);
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

	public static class Shift_operatorsContext extends ParserRuleContext {
		public Lshift_operatorContext lshift_operator() {
			return getRuleContext(Lshift_operatorContext.class,0);
		}
		public Rshift_operatorContext rshift_operator() {
			return getRuleContext(Rshift_operatorContext.class,0);
		}
		public Shift_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterShift_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitShift_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitShift_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_operatorsContext shift_operators() throws RecognitionException {
		Shift_operatorsContext _localctx = new Shift_operatorsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shift_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			switch (_input.LA(1)) {
			case T__18:
				{
				setState(344);
				lshift_operator();
				}
				break;
			case T__19:
				{
				setState(345);
				rshift_operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 72, RULE_lshift_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		enterRule(_localctx, 74, RULE_rshift_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		public List<Add_operatorsContext> add_operators() {
			return getRuleContexts(Add_operatorsContext.class);
		}
		public Add_operatorsContext add_operators(int i) {
			return getRuleContext(Add_operatorsContext.class,i);
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
		enterRule(_localctx, 76, RULE_add_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			multiply_expression();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__21) {
				{
				{
				setState(353);
				add_operators();
				setState(354);
				multiply_expression();
				}
				}
				setState(360);
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

	public static class Add_operatorsContext extends ParserRuleContext {
		public Plus_operatorContext plus_operator() {
			return getRuleContext(Plus_operatorContext.class,0);
		}
		public Minus_operatorContext minus_operator() {
			return getRuleContext(Minus_operatorContext.class,0);
		}
		public Add_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterAdd_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitAdd_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitAdd_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_operatorsContext add_operators() throws RecognitionException {
		Add_operatorsContext _localctx = new Add_operatorsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_add_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(361);
				plus_operator();
				}
				break;
			case T__21:
				{
				setState(362);
				minus_operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 80, RULE_plus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 82, RULE_minus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		public List<Multiply_operatorsContext> multiply_operators() {
			return getRuleContexts(Multiply_operatorsContext.class);
		}
		public Multiply_operatorsContext multiply_operators(int i) {
			return getRuleContext(Multiply_operatorsContext.class,i);
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
		enterRule(_localctx, 84, RULE_multiply_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			unary_expression();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(370);
				multiply_operators();
				setState(371);
				unary_expression();
				}
				}
				setState(377);
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

	public static class Multiply_operatorsContext extends ParserRuleContext {
		public Multiply_operatorContext multiply_operator() {
			return getRuleContext(Multiply_operatorContext.class,0);
		}
		public Divide_operatorContext divide_operator() {
			return getRuleContext(Divide_operatorContext.class,0);
		}
		public Mod_operatorContext mod_operator() {
			return getRuleContext(Mod_operatorContext.class,0);
		}
		public Multiply_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterMultiply_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitMultiply_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitMultiply_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiply_operatorsContext multiply_operators() throws RecognitionException {
		Multiply_operatorsContext _localctx = new Multiply_operatorsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiply_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(378);
				multiply_operator();
				}
				break;
			case T__23:
				{
				setState(379);
				divide_operator();
				}
				break;
			case T__24:
				{
				setState(380);
				mod_operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 88, RULE_multiply_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
		enterRule(_localctx, 90, RULE_divide_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		enterRule(_localctx, 92, RULE_mod_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 94, RULE_unary_expression);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				postfix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				unary_operator();
				setState(391);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				function_call_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				new_operation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				builtin_constant();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
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
		enterRule(_localctx, 96, RULE_postfix_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			primary_expression();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << Left_square_bracket))) != 0)) {
				{
				{
				setState(400);
				postfix();
				}
				}
				setState(405);
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
		enterRule(_localctx, 98, RULE_primary_expression);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(Left_bracket);
				setState(409);
				expression();
				setState(410);
				match(Right_bracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
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
		enterRule(_localctx, 100, RULE_constant);
		try {
			setState(417);
			switch (_input.LA(1)) {
			case Sign:
			case Decimal_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				integer_constant();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
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
		enterRule(_localctx, 102, RULE_integer_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if (_la==Sign) {
				{
				setState(419);
				match(Sign);
				}
			}

			setState(422);
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
		enterRule(_localctx, 104, RULE_string_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 106, RULE_postfix);
		try {
			setState(437);
			switch (_input.LA(1)) {
			case Left_square_bracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(Left_square_bracket);
				setState(427);
				expression();
				setState(428);
				match(Right_square_bracket);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				get_member_operator();
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(431);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(432);
					function_call_expression();
					}
					break;
				}
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				plusplus_operator();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
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
		enterRule(_localctx, 108, RULE_get_member_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 110, RULE_plusplus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		enterRule(_localctx, 112, RULE_minusminus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		enterRule(_localctx, 114, RULE_unary_operator);
		try {
			setState(450);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				not_sign_operator();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				minus_operator();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				plusplus_operator();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				minusminus_operator();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
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
		enterRule(_localctx, 116, RULE_not_sign_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
		enterRule(_localctx, 118, RULE_bitwise_not_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
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
		enterRule(_localctx, 120, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			assignment_expression();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(457);
				match(T__30);
				setState(458);
				assignment_expression();
				}
				}
				setState(463);
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
		enterRule(_localctx, 122, RULE_function_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(Identifier);
			setState(465);
			match(Left_bracket);
			setState(467);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
				{
				setState(466);
				arguments();
				}
			}

			setState(469);
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
		enterRule(_localctx, 124, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			assignment_expression();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(472);
				match(T__30);
				setState(473);
				assignment_expression();
				}
				}
				setState(478);
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
		enterRule(_localctx, 126, RULE_new_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(New);
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(480);
				array_new_type();
				}
				break;
			case 2:
				{
				setState(481);
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
		enterRule(_localctx, 128, RULE_array_new_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			non_array_type();
			setState(489); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(485);
					match(Left_square_bracket);
					setState(486);
					expression();
					setState(487);
					match(Right_square_bracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(491); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Left_square_bracket) {
				{
				{
				setState(493);
				match(Left_square_bracket);
				setState(494);
				match(Right_square_bracket);
				}
				}
				setState(499);
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
		enterRule(_localctx, 130, RULE_class_new_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		enterRule(_localctx, 132, RULE_builtin_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		public List<Base_statementContext> base_statement() {
			return getRuleContexts(Base_statementContext.class);
		}
		public Base_statementContext base_statement(int i) {
			return getRuleContext(Base_statementContext.class,i);
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
		enterRule(_localctx, 134, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			type();
			setState(505);
			match(Identifier);
			setState(506);
			match(Left_bracket);
			setState(508);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Identifier))) != 0)) {
				{
				setState(507);
				parameter_list();
				}
			}

			setState(510);
			match(Right_bracket);
			setState(511);
			match(Left_brace);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << For) | (1L << While) | (1L << If) | (1L << Return) | (1L << Break) | (1L << Continue) | (1L << Left_bracket) | (1L << Left_brace) | (1L << Identifier))) != 0)) {
				{
				{
				setState(512);
				base_statement();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
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

	public static class Base_statementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Base_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).enterBase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinamiKotoriListener ) ((MinamiKotoriListener)listener).exitBase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinamiKotoriVisitor ) return ((MinamiKotoriVisitor<? extends T>)visitor).visitBase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_statementContext base_statement() throws RecognitionException {
		Base_statementContext _localctx = new Base_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_base_statement);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				statement();
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
		enterRule(_localctx, 138, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			parameter();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(525);
				match(T__30);
				setState(526);
				parameter();
				}
				}
				setState(531);
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
		enterRule(_localctx, 140, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			type();
			setState(533);
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
		enterRule(_localctx, 142, RULE_statement);
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				compound_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				loop_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(538);
				branch_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(539);
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
		enterRule(_localctx, 144, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			expression();
			setState(543);
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
		public List<Base_statementContext> base_statement() {
			return getRuleContexts(Base_statementContext.class);
		}
		public Base_statementContext base_statement(int i) {
			return getRuleContext(Base_statementContext.class,i);
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
		enterRule(_localctx, 146, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(Left_brace);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << For) | (1L << While) | (1L << If) | (1L << Return) | (1L << Break) | (1L << Continue) | (1L << Left_bracket) | (1L << Left_brace) | (1L << Identifier))) != 0)) {
				{
				{
				setState(546);
				base_statement();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
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
		enterRule(_localctx, 148, RULE_loop_statement);
		try {
			setState(556);
			switch (_input.LA(1)) {
			case For:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				for_loop_statement();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
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
		enterRule(_localctx, 150, RULE_for_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(For);
			setState(559);
			match(Left_bracket);
			setState(561);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
				{
				setState(560);
				the_first_for_expression();
				}
			}

			setState(563);
			match(T__0);
			setState(565);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
				{
				setState(564);
				the_second_for_expression();
				}
			}

			setState(567);
			match(T__0);
			setState(569);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
				{
				setState(568);
				the_third_for_expression();
				}
			}

			setState(571);
			match(Right_bracket);
			setState(572);
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
		enterRule(_localctx, 152, RULE_the_first_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
		enterRule(_localctx, 154, RULE_the_second_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		enterRule(_localctx, 156, RULE_the_third_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
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
		enterRule(_localctx, 158, RULE_while_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(While);
			setState(581);
			match(Left_bracket);
			setState(582);
			expression();
			setState(583);
			match(Right_bracket);
			setState(584);
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
		enterRule(_localctx, 160, RULE_branch_statement);
		int _la;
		try {
			setState(596);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				if_statement();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(Return);
				setState(589);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << StringLiteral) | (1L << Sign) | (1L << Decimal_constant) | (1L << New) | (1L << Left_bracket) | (1L << Identifier))) != 0)) {
					{
					setState(588);
					expression();
					}
				}

				setState(591);
				match(T__0);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				match(Break);
				setState(593);
				match(T__0);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				match(Continue);
				setState(595);
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
		enterRule(_localctx, 162, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(If);
			setState(599);
			match(Left_bracket);
			setState(600);
			expression();
			setState(601);
			match(Right_bracket);
			setState(602);
			statement();
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(603);
				match(Else);
				setState(604);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0262\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\7\2\u00a9\n\2\f\2\16\2\u00ac\13\2\3\2\3\2\3\2\7\2\u00b1\n\2\f\2\16"+
		"\2\u00b4\13\2\3\3\3\3\5\3\u00b8\n\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5\u00c0"+
		"\n\5\3\6\3\6\5\6\u00c4\n\6\3\7\3\7\5\7\u00c8\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u00d1\n\b\f\b\16\b\u00d4\13\b\3\b\3\b\3\t\3\t\3\t\6\t\u00db"+
		"\n\t\r\t\16\t\u00dc\3\n\3\n\3\n\5\n\u00e2\n\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\7\r\u00eb\n\r\f\r\16\r\u00ee\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\7\20\u00fa\n\20\f\20\16\20\u00fd\13\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\7\22\u0105\n\22\f\22\16\22\u0108\13\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\7\24\u0110\n\24\f\24\16\24\u0113\13\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\7\26\u011b\n\26\f\26\16\26\u011e\13\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\7\30\u0126\n\30\f\30\16\30\u0129\13\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\7\32\u0131\n\32\f\32\16\32\u0134\13\32\3\33\3\33\5"+
		"\33\u0138\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0142\n\36"+
		"\3\37\3\37\3\37\3\37\5\37\u0148\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3$\7$\u0156\n$\f$\16$\u0159\13$\3%\3%\5%\u015d\n%\3&\3&\3\'\3\'\3(\3"+
		"(\3(\3(\7(\u0167\n(\f(\16(\u016a\13(\3)\3)\5)\u016e\n)\3*\3*\3+\3+\3,"+
		"\3,\3,\3,\7,\u0178\n,\f,\16,\u017b\13,\3-\3-\3-\5-\u0180\n-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0190\n\61\3"+
		"\62\3\62\7\62\u0194\n\62\f\62\16\62\u0197\13\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\5\63\u01a0\n\63\3\64\3\64\5\64\u01a4\n\64\3\65\5\65\u01a7"+
		"\n\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01b4"+
		"\n\67\3\67\3\67\5\67\u01b8\n\67\38\38\39\39\3:\3:\3;\3;\3;\3;\3;\5;\u01c5"+
		"\n;\3<\3<\3=\3=\3>\3>\3>\7>\u01ce\n>\f>\16>\u01d1\13>\3?\3?\3?\5?\u01d6"+
		"\n?\3?\3?\3@\3@\3@\7@\u01dd\n@\f@\16@\u01e0\13@\3A\3A\3A\5A\u01e5\nA\3"+
		"B\3B\3B\3B\3B\6B\u01ec\nB\rB\16B\u01ed\3B\3B\7B\u01f2\nB\fB\16B\u01f5"+
		"\13B\3C\3C\3D\3D\3E\3E\3E\3E\5E\u01ff\nE\3E\3E\3E\7E\u0204\nE\fE\16E\u0207"+
		"\13E\3E\3E\3F\3F\5F\u020d\nF\3G\3G\3G\7G\u0212\nG\fG\16G\u0215\13G\3H"+
		"\3H\3H\3I\3I\3I\3I\3I\5I\u021f\nI\3J\3J\3J\3K\3K\7K\u0226\nK\fK\16K\u0229"+
		"\13K\3K\3K\3L\3L\5L\u022f\nL\3M\3M\3M\5M\u0234\nM\3M\3M\5M\u0238\nM\3"+
		"M\3M\5M\u023c\nM\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3"+
		"R\5R\u0250\nR\3R\3R\3R\3R\3R\5R\u0257\nR\3S\3S\3S\3S\3S\3S\3S\5S\u0260"+
		"\nS\3S\2\2T\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\2\4\3\2\4\7\3\2\"$\u0258\2\u00aa\3\2\2\2\4\u00b7\3\2\2\2\6\u00b9"+
		"\3\2\2\2\b\u00bf\3\2\2\2\n\u00c3\3\2\2\2\f\u00c7\3\2\2\2\16\u00c9\3\2"+
		"\2\2\20\u00d7\3\2\2\2\22\u00de\3\2\2\2\24\u00e3\3\2\2\2\26\u00e5\3\2\2"+
		"\2\30\u00ec\3\2\2\2\32\u00f1\3\2\2\2\34\u00f3\3\2\2\2\36\u00f5\3\2\2\2"+
		" \u00fe\3\2\2\2\"\u0100\3\2\2\2$\u0109\3\2\2\2&\u010b\3\2\2\2(\u0114\3"+
		"\2\2\2*\u0116\3\2\2\2,\u011f\3\2\2\2.\u0121\3\2\2\2\60\u012a\3\2\2\2\62"+
		"\u012c\3\2\2\2\64\u0137\3\2\2\2\66\u0139\3\2\2\28\u013b\3\2\2\2:\u013d"+
		"\3\2\2\2<\u0147\3\2\2\2>\u0149\3\2\2\2@\u014b\3\2\2\2B\u014d\3\2\2\2D"+
		"\u014f\3\2\2\2F\u0151\3\2\2\2H\u015c\3\2\2\2J\u015e\3\2\2\2L\u0160\3\2"+
		"\2\2N\u0162\3\2\2\2P\u016d\3\2\2\2R\u016f\3\2\2\2T\u0171\3\2\2\2V\u0173"+
		"\3\2\2\2X\u017f\3\2\2\2Z\u0181\3\2\2\2\\\u0183\3\2\2\2^\u0185\3\2\2\2"+
		"`\u018f\3\2\2\2b\u0191\3\2\2\2d\u019f\3\2\2\2f\u01a3\3\2\2\2h\u01a6\3"+
		"\2\2\2j\u01aa\3\2\2\2l\u01b7\3\2\2\2n\u01b9\3\2\2\2p\u01bb\3\2\2\2r\u01bd"+
		"\3\2\2\2t\u01c4\3\2\2\2v\u01c6\3\2\2\2x\u01c8\3\2\2\2z\u01ca\3\2\2\2|"+
		"\u01d2\3\2\2\2~\u01d9\3\2\2\2\u0080\u01e1\3\2\2\2\u0082\u01e6\3\2\2\2"+
		"\u0084\u01f6\3\2\2\2\u0086\u01f8\3\2\2\2\u0088\u01fa\3\2\2\2\u008a\u020c"+
		"\3\2\2\2\u008c\u020e\3\2\2\2\u008e\u0216\3\2\2\2\u0090\u021e\3\2\2\2\u0092"+
		"\u0220\3\2\2\2\u0094\u0223\3\2\2\2\u0096\u022e\3\2\2\2\u0098\u0230\3\2"+
		"\2\2\u009a\u0240\3\2\2\2\u009c\u0242\3\2\2\2\u009e\u0244\3\2\2\2\u00a0"+
		"\u0246\3\2\2\2\u00a2\u0256\3\2\2\2\u00a4\u0258\3\2\2\2\u00a6\u00a9\5\u0088"+
		"E\2\u00a7\u00a9\5\4\3\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b2\5\u0088E\2\u00ae\u00b1\5\u0088E\2"+
		"\u00af\u00b1\5\4\3\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\3\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b8\5\6\4\2\u00b6\u00b8\5\16\b\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\5\3\2\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb"+
		"\5\22\n\2\u00bb\u00bc\7\3\2\2\u00bc\7\3\2\2\2\u00bd\u00c0\5\n\6\2\u00be"+
		"\u00c0\5\20\t\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\t\3\2\2"+
		"\2\u00c1\u00c4\5\f\7\2\u00c2\u00c4\5\16\b\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\13\3\2\2\2\u00c5\u00c8\t\2\2\2\u00c6\u00c8\7\67\2"+
		"\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\r\3\2\2\2\u00c9\u00ca"+
		"\7\b\2\2\u00ca\u00cb\7\67\2\2\u00cb\u00d2\7\64\2\2\u00cc\u00cd\5\b\5\2"+
		"\u00cd\u00ce\5\24\13\2\u00ce\u00cf\7\3\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cc"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\65\2\2\u00d6\17\3\2\2"+
		"\2\u00d7\u00da\5\n\6\2\u00d8\u00d9\7\62\2\2\u00d9\u00db\7\63\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\21\3\2\2\2\u00de\u00e1\5\24\13\2\u00df\u00e0\7\t\2\2\u00e0"+
		"\u00e2\5\26\f\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\23\3\2\2"+
		"\2\u00e3\u00e4\7\67\2\2\u00e4\25\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6\27"+
		"\3\2\2\2\u00e7\u00e8\5`\61\2\u00e8\u00e9\5\32\16\2\u00e9\u00eb\3\2\2\2"+
		"\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\5\34\17\2"+
		"\u00f0\31\3\2\2\2\u00f1\u00f2\7\t\2\2\u00f2\33\3\2\2\2\u00f3\u00f4\5\36"+
		"\20\2\u00f4\35\3\2\2\2\u00f5\u00fb\5\"\22\2\u00f6\u00f7\5 \21\2\u00f7"+
		"\u00f8\5\"\22\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\37\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\7\n\2\2\u00ff!\3\2\2\2\u0100\u0106\5&\24\2"+
		"\u0101\u0102\5$\23\2\u0102\u0103\5&\24\2\u0103\u0105\3\2\2\2\u0104\u0101"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"#\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\13\2\2\u010a%\3\2\2\2\u010b"+
		"\u0111\5*\26\2\u010c\u010d\5(\25\2\u010d\u010e\5*\26\2\u010e\u0110\3\2"+
		"\2\2\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\'\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\f\2\2"+
		"\u0115)\3\2\2\2\u0116\u011c\5.\30\2\u0117\u0118\5,\27\2\u0118\u0119\5"+
		".\30\2\u0119\u011b\3\2\2\2\u011a\u0117\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d+\3\2\2\2\u011e\u011c\3\2\2\2"+
		"\u011f\u0120\7\r\2\2\u0120-\3\2\2\2\u0121\u0127\5\62\32\2\u0122\u0123"+
		"\5\60\31\2\u0123\u0124\5\62\32\2\u0124\u0126\3\2\2\2\u0125\u0122\3\2\2"+
		"\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128/"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\16\2\2\u012b\61\3\2\2\2\u012c"+
		"\u0132\5:\36\2\u012d\u012e\5\64\33\2\u012e\u012f\5:\36\2\u012f\u0131\3"+
		"\2\2\2\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\63\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0138\5\66\34"+
		"\2\u0136\u0138\58\35\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\65"+
		"\3\2\2\2\u0139\u013a\7\17\2\2\u013a\67\3\2\2\2\u013b\u013c\7\20\2\2\u013c"+
		"9\3\2\2\2\u013d\u0141\5F$\2\u013e\u013f\5<\37\2\u013f\u0140\5F$\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u0142\3\2\2\2\u0142;\3\2\2\2"+
		"\u0143\u0148\5> \2\u0144\u0148\5@!\2\u0145\u0148\5B\"\2\u0146\u0148\5"+
		"D#\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0146\3\2\2\2\u0148=\3\2\2\2\u0149\u014a\7\21\2\2\u014a?\3\2\2\2\u014b"+
		"\u014c\7\22\2\2\u014cA\3\2\2\2\u014d\u014e\7\23\2\2\u014eC\3\2\2\2\u014f"+
		"\u0150\7\24\2\2\u0150E\3\2\2\2\u0151\u0157\5N(\2\u0152\u0153\5H%\2\u0153"+
		"\u0154\5N(\2\u0154\u0156\3\2\2\2\u0155\u0152\3\2\2\2\u0156\u0159\3\2\2"+
		"\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158G\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u015a\u015d\5J&\2\u015b\u015d\5L\'\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015dI\3\2\2\2\u015e\u015f\7\25\2\2\u015fK\3\2\2\2\u0160"+
		"\u0161\7\26\2\2\u0161M\3\2\2\2\u0162\u0168\5V,\2\u0163\u0164\5P)\2\u0164"+
		"\u0165\5V,\2\u0165\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0167\u016a\3\2\2"+
		"\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169O\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016b\u016e\5R*\2\u016c\u016e\5T+\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016c\3\2\2\2\u016eQ\3\2\2\2\u016f\u0170\7\27\2\2\u0170S\3\2\2\2\u0171"+
		"\u0172\7\30\2\2\u0172U\3\2\2\2\u0173\u0179\5`\61\2\u0174\u0175\5X-\2\u0175"+
		"\u0176\5`\61\2\u0176\u0178\3\2\2\2\u0177\u0174\3\2\2\2\u0178\u017b\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017aW\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017c\u0180\5Z.\2\u017d\u0180\5\\/\2\u017e\u0180\5^\60\2\u017f"+
		"\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180Y\3\2\2\2"+
		"\u0181\u0182\7\31\2\2\u0182[\3\2\2\2\u0183\u0184\7\32\2\2\u0184]\3\2\2"+
		"\2\u0185\u0186\7\33\2\2\u0186_\3\2\2\2\u0187\u0190\5b\62\2\u0188\u0189"+
		"\5t;\2\u0189\u018a\5`\61\2\u018a\u0190\3\2\2\2\u018b\u0190\5|?\2\u018c"+
		"\u0190\5\u0080A\2\u018d\u0190\5\u0086D\2\u018e\u0190\5h\65\2\u018f\u0187"+
		"\3\2\2\2\u018f\u0188\3\2\2\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190a\3\2\2\2\u0191\u0195\5d\63\2"+
		"\u0192\u0194\5l\67\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196c\3\2\2\2\u0197\u0195\3\2\2\2\u0198"+
		"\u01a0\7\67\2\2\u0199\u01a0\5f\64\2\u019a\u019b\7\60\2\2\u019b\u019c\5"+
		"z>\2\u019c\u019d\7\61\2\2\u019d\u01a0\3\2\2\2\u019e\u01a0\5|?\2\u019f"+
		"\u0198\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019a\3\2\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0e\3\2\2\2\u01a1\u01a4\5h\65\2\u01a2\u01a4\5j\66\2\u01a3\u01a1"+
		"\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4g\3\2\2\2\u01a5\u01a7\7&\2\2\u01a6\u01a5"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7\'\2\2\u01a9"+
		"i\3\2\2\2\u01aa\u01ab\7%\2\2\u01abk\3\2\2\2\u01ac\u01ad\7\62\2\2\u01ad"+
		"\u01ae\5z>\2\u01ae\u01af\7\63\2\2\u01af\u01b8\3\2\2\2\u01b0\u01b3\5n8"+
		"\2\u01b1\u01b4\7\67\2\2\u01b2\u01b4\5|?\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2"+
		"\3\2\2\2\u01b4\u01b8\3\2\2\2\u01b5\u01b8\5p9\2\u01b6\u01b8\5r:\2\u01b7"+
		"\u01ac\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2"+
		"\2\2\u01b8m\3\2\2\2\u01b9\u01ba\7\34\2\2\u01bao\3\2\2\2\u01bb\u01bc\7"+
		"\35\2\2\u01bcq\3\2\2\2\u01bd\u01be\7\36\2\2\u01bes\3\2\2\2\u01bf\u01c5"+
		"\5v<\2\u01c0\u01c5\5T+\2\u01c1\u01c5\5p9\2\u01c2\u01c5\5r:\2\u01c3\u01c5"+
		"\5x=\2\u01c4\u01bf\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5u\3\2\2\2\u01c6\u01c7\7\37\2\2"+
		"\u01c7w\3\2\2\2\u01c8\u01c9\7 \2\2\u01c9y\3\2\2\2\u01ca\u01cf\5\30\r\2"+
		"\u01cb\u01cc\7!\2\2\u01cc\u01ce\5\30\r\2\u01cd\u01cb\3\2\2\2\u01ce\u01d1"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0{\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d2\u01d3\7\67\2\2\u01d3\u01d5\7\60\2\2\u01d4\u01d6\5"+
		"~@\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\7\61\2\2\u01d8}\3\2\2\2\u01d9\u01de\5\30\r\2\u01da\u01db\7!\2\2"+
		"\u01db\u01dd\5\30\r\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\177\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1"+
		"\u01e4\7(\2\2\u01e2\u01e5\5\u0082B\2\u01e3\u01e5\5\u0084C\2\u01e4\u01e2"+
		"\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u0081\3\2\2\2\u01e6\u01eb\5\n\6\2\u01e7"+
		"\u01e8\7\62\2\2\u01e8\u01e9\5z>\2\u01e9\u01ea\7\63\2\2\u01ea\u01ec\3\2"+
		"\2\2\u01eb\u01e7\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01f3\3\2\2\2\u01ef\u01f0\7\62\2\2\u01f0\u01f2\7"+
		"\63\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u0083\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7\67"+
		"\2\2\u01f7\u0085\3\2\2\2\u01f8\u01f9\t\3\2\2\u01f9\u0087\3\2\2\2\u01fa"+
		"\u01fb\5\b\5\2\u01fb\u01fc\7\67\2\2\u01fc\u01fe\7\60\2\2\u01fd\u01ff\5"+
		"\u008cG\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2"+
		"\u0200\u0201\7\61\2\2\u0201\u0205\7\64\2\2\u0202\u0204\5\u008aF\2\u0203"+
		"\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7\65\2\2\u0209"+
		"\u0089\3\2\2\2\u020a\u020d\5\4\3\2\u020b\u020d\5\u0090I\2\u020c\u020a"+
		"\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u008b\3\2\2\2\u020e\u0213\5\u008eH"+
		"\2\u020f\u0210\7!\2\2\u0210\u0212\5\u008eH\2\u0211\u020f\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u008d\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0216\u0217\5\b\5\2\u0217\u0218\5\24\13\2\u0218"+
		"\u008f\3\2\2\2\u0219\u021f\5\u0092J\2\u021a\u021f\5\u0094K\2\u021b\u021f"+
		"\5\u0096L\2\u021c\u021f\5\u00a2R\2\u021d\u021f\5\4\3\2\u021e\u0219\3\2"+
		"\2\2\u021e\u021a\3\2\2\2\u021e\u021b\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021d\3\2\2\2\u021f\u0091\3\2\2\2\u0220\u0221\5z>\2\u0221\u0222\7\3\2"+
		"\2\u0222\u0093\3\2\2\2\u0223\u0227\7\64\2\2\u0224\u0226\5\u008aF\2\u0225"+
		"\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\7\65\2\2\u022b"+
		"\u0095\3\2\2\2\u022c\u022f\5\u0098M\2\u022d\u022f\5\u00a0Q\2\u022e\u022c"+
		"\3\2\2\2\u022e\u022d\3\2\2\2\u022f\u0097\3\2\2\2\u0230\u0231\7)\2\2\u0231"+
		"\u0233\7\60\2\2\u0232\u0234\5\u009aN\2\u0233\u0232\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\7\3\2\2\u0236\u0238\5\u009cO"+
		"\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b"+
		"\7\3\2\2\u023a\u023c\5\u009eP\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2"+
		"\2\u023c\u023d\3\2\2\2\u023d\u023e\7\61\2\2\u023e\u023f\5\u0090I\2\u023f"+
		"\u0099\3\2\2\2\u0240\u0241\5z>\2\u0241\u009b\3\2\2\2\u0242\u0243\5z>\2"+
		"\u0243\u009d\3\2\2\2\u0244\u0245\5z>\2\u0245\u009f\3\2\2\2\u0246\u0247"+
		"\7*\2\2\u0247\u0248\7\60\2\2\u0248\u0249\5z>\2\u0249\u024a\7\61\2\2\u024a"+
		"\u024b\5\u0090I\2\u024b\u00a1\3\2\2\2\u024c\u0257\5\u00a4S\2\u024d\u024f"+
		"\7-\2\2\u024e\u0250\5z>\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0257\7\3\2\2\u0252\u0253\7.\2\2\u0253\u0257\7\3"+
		"\2\2\u0254\u0255\7/\2\2\u0255\u0257\7\3\2\2\u0256\u024c\3\2\2\2\u0256"+
		"\u024d\3\2\2\2\u0256\u0252\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u00a3\3\2"+
		"\2\2\u0258\u0259\7+\2\2\u0259\u025a\7\60\2\2\u025a\u025b\5z>\2\u025b\u025c"+
		"\7\61\2\2\u025c\u025f\5\u0090I\2\u025d\u025e\7,\2\2\u025e\u0260\5\u0090"+
		"I\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u00a5\3\2\2\28\u00a8"+
		"\u00aa\u00b0\u00b2\u00b7\u00bf\u00c3\u00c7\u00d2\u00dc\u00e1\u00ec\u00fb"+
		"\u0106\u0111\u011c\u0127\u0132\u0137\u0141\u0147\u0157\u015c\u0168\u016d"+
		"\u0179\u017f\u018f\u0195\u019f\u01a3\u01a6\u01b3\u01b7\u01c4\u01cf\u01d5"+
		"\u01de\u01e4\u01ed\u01f3\u01fe\u0205\u020c\u0213\u021e\u0227\u022e\u0233"+
		"\u0237\u023b\u024f\u0256\u025f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}