// Generated from MinamiKotori.g4 by ANTLR 4.5.3
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinamiKotoriParser}.
 */
public interface MinamiKotoriListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MinamiKotoriParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MinamiKotoriParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MinamiKotoriParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MinamiKotoriParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(MinamiKotoriParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(MinamiKotoriParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MinamiKotoriParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MinamiKotoriParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#non_array_type}.
	 * @param ctx the parse tree
	 */
	void enterNon_array_type(MinamiKotoriParser.Non_array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#non_array_type}.
	 * @param ctx the parse tree
	 */
	void exitNon_array_type(MinamiKotoriParser.Non_array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(MinamiKotoriParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(MinamiKotoriParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(MinamiKotoriParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(MinamiKotoriParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#array_declaration_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration_type(MinamiKotoriParser.Array_declaration_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#array_declaration_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration_type(MinamiKotoriParser.Array_declaration_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(MinamiKotoriParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(MinamiKotoriParser.Init_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(MinamiKotoriParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(MinamiKotoriParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(MinamiKotoriParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(MinamiKotoriParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(MinamiKotoriParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(MinamiKotoriParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(MinamiKotoriParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(MinamiKotoriParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#calculation_expression}.
	 * @param ctx the parse tree
	 */
	void enterCalculation_expression(MinamiKotoriParser.Calculation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#calculation_expression}.
	 * @param ctx the parse tree
	 */
	void exitCalculation_expression(MinamiKotoriParser.Calculation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(MinamiKotoriParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(MinamiKotoriParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#logical_or_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_operator(MinamiKotoriParser.Logical_or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#logical_or_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_operator(MinamiKotoriParser.Logical_or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(MinamiKotoriParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(MinamiKotoriParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#logical_and_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_operator(MinamiKotoriParser.Logical_and_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#logical_and_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_operator(MinamiKotoriParser.Logical_and_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#bitwise_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_or_expression(MinamiKotoriParser.Bitwise_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#bitwise_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_or_expression(MinamiKotoriParser.Bitwise_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#bitwise_or_operator}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_or_operator(MinamiKotoriParser.Bitwise_or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#bitwise_or_operator}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_or_operator(MinamiKotoriParser.Bitwise_or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#bitwise_xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_xor_expression(MinamiKotoriParser.Bitwise_xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#bitwise_xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_xor_expression(MinamiKotoriParser.Bitwise_xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#bitwise_xor_operator}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_xor_operator(MinamiKotoriParser.Bitwise_xor_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#bitwise_xor_operator}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_xor_operator(MinamiKotoriParser.Bitwise_xor_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#bitwise_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_and_expression(MinamiKotoriParser.Bitwise_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#bitwise_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_and_expression(MinamiKotoriParser.Bitwise_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#bitwise_and_operator}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_and_operator(MinamiKotoriParser.Bitwise_and_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#bitwise_and_operator}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_and_operator(MinamiKotoriParser.Bitwise_and_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(MinamiKotoriParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(MinamiKotoriParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#equality_operators}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operators(MinamiKotoriParser.Equality_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#equality_operators}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operators(MinamiKotoriParser.Equality_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#is_equal_operator}.
	 * @param ctx the parse tree
	 */
	void enterIs_equal_operator(MinamiKotoriParser.Is_equal_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#is_equal_operator}.
	 * @param ctx the parse tree
	 */
	void exitIs_equal_operator(MinamiKotoriParser.Is_equal_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#not_equal_operator}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal_operator(MinamiKotoriParser.Not_equal_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#not_equal_operator}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal_operator(MinamiKotoriParser.Not_equal_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#relation_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expression(MinamiKotoriParser.Relation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#relation_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expression(MinamiKotoriParser.Relation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#relation_operators}.
	 * @param ctx the parse tree
	 */
	void enterRelation_operators(MinamiKotoriParser.Relation_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#relation_operators}.
	 * @param ctx the parse tree
	 */
	void exitRelation_operators(MinamiKotoriParser.Relation_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#smaller_operator}.
	 * @param ctx the parse tree
	 */
	void enterSmaller_operator(MinamiKotoriParser.Smaller_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#smaller_operator}.
	 * @param ctx the parse tree
	 */
	void exitSmaller_operator(MinamiKotoriParser.Smaller_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#bigger_operator}.
	 * @param ctx the parse tree
	 */
	void enterBigger_operator(MinamiKotoriParser.Bigger_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#bigger_operator}.
	 * @param ctx the parse tree
	 */
	void exitBigger_operator(MinamiKotoriParser.Bigger_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#smaller_equal_operator}.
	 * @param ctx the parse tree
	 */
	void enterSmaller_equal_operator(MinamiKotoriParser.Smaller_equal_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#smaller_equal_operator}.
	 * @param ctx the parse tree
	 */
	void exitSmaller_equal_operator(MinamiKotoriParser.Smaller_equal_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#bigger_equal_operator}.
	 * @param ctx the parse tree
	 */
	void enterBigger_equal_operator(MinamiKotoriParser.Bigger_equal_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#bigger_equal_operator}.
	 * @param ctx the parse tree
	 */
	void exitBigger_equal_operator(MinamiKotoriParser.Bigger_equal_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(MinamiKotoriParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(MinamiKotoriParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#shift_operators}.
	 * @param ctx the parse tree
	 */
	void enterShift_operators(MinamiKotoriParser.Shift_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#shift_operators}.
	 * @param ctx the parse tree
	 */
	void exitShift_operators(MinamiKotoriParser.Shift_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#lshift_operator}.
	 * @param ctx the parse tree
	 */
	void enterLshift_operator(MinamiKotoriParser.Lshift_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#lshift_operator}.
	 * @param ctx the parse tree
	 */
	void exitLshift_operator(MinamiKotoriParser.Lshift_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#rshift_operator}.
	 * @param ctx the parse tree
	 */
	void enterRshift_operator(MinamiKotoriParser.Rshift_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#rshift_operator}.
	 * @param ctx the parse tree
	 */
	void exitRshift_operator(MinamiKotoriParser.Rshift_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(MinamiKotoriParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(MinamiKotoriParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#add_operators}.
	 * @param ctx the parse tree
	 */
	void enterAdd_operators(MinamiKotoriParser.Add_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#add_operators}.
	 * @param ctx the parse tree
	 */
	void exitAdd_operators(MinamiKotoriParser.Add_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#plus_operator}.
	 * @param ctx the parse tree
	 */
	void enterPlus_operator(MinamiKotoriParser.Plus_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#plus_operator}.
	 * @param ctx the parse tree
	 */
	void exitPlus_operator(MinamiKotoriParser.Plus_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#minus_operator}.
	 * @param ctx the parse tree
	 */
	void enterMinus_operator(MinamiKotoriParser.Minus_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#minus_operator}.
	 * @param ctx the parse tree
	 */
	void exitMinus_operator(MinamiKotoriParser.Minus_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_expression(MinamiKotoriParser.Multiply_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_expression(MinamiKotoriParser.Multiply_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#multiply_operators}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_operators(MinamiKotoriParser.Multiply_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#multiply_operators}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_operators(MinamiKotoriParser.Multiply_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_operator(MinamiKotoriParser.Multiply_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_operator(MinamiKotoriParser.Multiply_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#divide_operator}.
	 * @param ctx the parse tree
	 */
	void enterDivide_operator(MinamiKotoriParser.Divide_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#divide_operator}.
	 * @param ctx the parse tree
	 */
	void exitDivide_operator(MinamiKotoriParser.Divide_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#mod_operator}.
	 * @param ctx the parse tree
	 */
	void enterMod_operator(MinamiKotoriParser.Mod_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#mod_operator}.
	 * @param ctx the parse tree
	 */
	void exitMod_operator(MinamiKotoriParser.Mod_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(MinamiKotoriParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(MinamiKotoriParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(MinamiKotoriParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(MinamiKotoriParser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(MinamiKotoriParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(MinamiKotoriParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MinamiKotoriParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MinamiKotoriParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void enterInteger_constant(MinamiKotoriParser.Integer_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void exitInteger_constant(MinamiKotoriParser.Integer_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#string_constant}.
	 * @param ctx the parse tree
	 */
	void enterString_constant(MinamiKotoriParser.String_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#string_constant}.
	 * @param ctx the parse tree
	 */
	void exitString_constant(MinamiKotoriParser.String_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(MinamiKotoriParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(MinamiKotoriParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#get_member_operator}.
	 * @param ctx the parse tree
	 */
	void enterGet_member_operator(MinamiKotoriParser.Get_member_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#get_member_operator}.
	 * @param ctx the parse tree
	 */
	void exitGet_member_operator(MinamiKotoriParser.Get_member_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#plusplus_operator}.
	 * @param ctx the parse tree
	 */
	void enterPlusplus_operator(MinamiKotoriParser.Plusplus_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#plusplus_operator}.
	 * @param ctx the parse tree
	 */
	void exitPlusplus_operator(MinamiKotoriParser.Plusplus_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#minusminus_operator}.
	 * @param ctx the parse tree
	 */
	void enterMinusminus_operator(MinamiKotoriParser.Minusminus_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#minusminus_operator}.
	 * @param ctx the parse tree
	 */
	void exitMinusminus_operator(MinamiKotoriParser.Minusminus_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(MinamiKotoriParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(MinamiKotoriParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#not_sign_operator}.
	 * @param ctx the parse tree
	 */
	void enterNot_sign_operator(MinamiKotoriParser.Not_sign_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#not_sign_operator}.
	 * @param ctx the parse tree
	 */
	void exitNot_sign_operator(MinamiKotoriParser.Not_sign_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#bitwise_not_operator}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_not_operator(MinamiKotoriParser.Bitwise_not_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#bitwise_not_operator}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_not_operator(MinamiKotoriParser.Bitwise_not_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MinamiKotoriParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MinamiKotoriParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression(MinamiKotoriParser.Function_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression(MinamiKotoriParser.Function_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(MinamiKotoriParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(MinamiKotoriParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#new_operation}.
	 * @param ctx the parse tree
	 */
	void enterNew_operation(MinamiKotoriParser.New_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#new_operation}.
	 * @param ctx the parse tree
	 */
	void exitNew_operation(MinamiKotoriParser.New_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#array_new_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_new_type(MinamiKotoriParser.Array_new_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#array_new_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_new_type(MinamiKotoriParser.Array_new_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#class_new_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_new_type(MinamiKotoriParser.Class_new_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#class_new_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_new_type(MinamiKotoriParser.Class_new_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#builtin_constant}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_constant(MinamiKotoriParser.Builtin_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#builtin_constant}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_constant(MinamiKotoriParser.Builtin_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(MinamiKotoriParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(MinamiKotoriParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterBase_statement(MinamiKotoriParser.Base_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitBase_statement(MinamiKotoriParser.Base_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(MinamiKotoriParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(MinamiKotoriParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MinamiKotoriParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MinamiKotoriParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MinamiKotoriParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MinamiKotoriParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(MinamiKotoriParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(MinamiKotoriParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(MinamiKotoriParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(MinamiKotoriParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(MinamiKotoriParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(MinamiKotoriParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_statement(MinamiKotoriParser.For_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_statement(MinamiKotoriParser.For_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#the_first_for_expression}.
	 * @param ctx the parse tree
	 */
	void enterThe_first_for_expression(MinamiKotoriParser.The_first_for_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#the_first_for_expression}.
	 * @param ctx the parse tree
	 */
	void exitThe_first_for_expression(MinamiKotoriParser.The_first_for_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#the_second_for_expression}.
	 * @param ctx the parse tree
	 */
	void enterThe_second_for_expression(MinamiKotoriParser.The_second_for_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#the_second_for_expression}.
	 * @param ctx the parse tree
	 */
	void exitThe_second_for_expression(MinamiKotoriParser.The_second_for_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#the_third_for_expression}.
	 * @param ctx the parse tree
	 */
	void enterThe_third_for_expression(MinamiKotoriParser.The_third_for_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#the_third_for_expression}.
	 * @param ctx the parse tree
	 */
	void exitThe_third_for_expression(MinamiKotoriParser.The_third_for_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop_statement(MinamiKotoriParser.While_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop_statement(MinamiKotoriParser.While_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBranch_statement(MinamiKotoriParser.Branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBranch_statement(MinamiKotoriParser.Branch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinamiKotoriParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MinamiKotoriParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinamiKotoriParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MinamiKotoriParser.If_statementContext ctx);
}