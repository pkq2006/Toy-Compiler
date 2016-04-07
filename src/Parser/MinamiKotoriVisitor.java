// Generated from MinamiKotori.g4 by ANTLR 4.5.3
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MinamiKotoriParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MinamiKotoriVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MinamiKotoriParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MinamiKotoriParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(MinamiKotoriParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MinamiKotoriParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#non_array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_array_type(MinamiKotoriParser.Non_array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(MinamiKotoriParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(MinamiKotoriParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#array_declaration_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration_type(MinamiKotoriParser.Array_declaration_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(MinamiKotoriParser.Init_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(MinamiKotoriParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(MinamiKotoriParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(MinamiKotoriParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(MinamiKotoriParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#calculation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculation_expression(MinamiKotoriParser.Calculation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(MinamiKotoriParser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#logical_or_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_operator(MinamiKotoriParser.Logical_or_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(MinamiKotoriParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#logical_and_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_operator(MinamiKotoriParser.Logical_and_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#bitwise_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise_or_expression(MinamiKotoriParser.Bitwise_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#bitwise_or_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise_or_operator(MinamiKotoriParser.Bitwise_or_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#bitwise_xor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise_xor_expression(MinamiKotoriParser.Bitwise_xor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#bitwise_xor_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise_xor_operator(MinamiKotoriParser.Bitwise_xor_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#bitwise_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise_and_expression(MinamiKotoriParser.Bitwise_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#bitwise_and_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise_and_operator(MinamiKotoriParser.Bitwise_and_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(MinamiKotoriParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#is_equal_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_equal_operator(MinamiKotoriParser.Is_equal_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#not_equal_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal_operator(MinamiKotoriParser.Not_equal_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#relation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expression(MinamiKotoriParser.Relation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#smaller_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmaller_operator(MinamiKotoriParser.Smaller_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#bigger_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigger_operator(MinamiKotoriParser.Bigger_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#smaller_equal_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmaller_equal_operator(MinamiKotoriParser.Smaller_equal_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#bigger_equal_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigger_equal_operator(MinamiKotoriParser.Bigger_equal_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(MinamiKotoriParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#lshift_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLshift_operator(MinamiKotoriParser.Lshift_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#rshift_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRshift_operator(MinamiKotoriParser.Rshift_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#add_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expression(MinamiKotoriParser.Add_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#plus_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_operator(MinamiKotoriParser.Plus_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#minus_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_operator(MinamiKotoriParser.Minus_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#multiply_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply_expression(MinamiKotoriParser.Multiply_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#multiply_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply_operator(MinamiKotoriParser.Multiply_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#divide_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide_operator(MinamiKotoriParser.Divide_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#mod_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_operator(MinamiKotoriParser.Mod_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(MinamiKotoriParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(MinamiKotoriParser.Postfix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(MinamiKotoriParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MinamiKotoriParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#integer_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_constant(MinamiKotoriParser.Integer_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#string_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_constant(MinamiKotoriParser.String_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(MinamiKotoriParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#get_member_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_member_operator(MinamiKotoriParser.Get_member_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#plusplus_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusplus_operator(MinamiKotoriParser.Plusplus_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#minusminus_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusminus_operator(MinamiKotoriParser.Minusminus_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(MinamiKotoriParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#not_sign_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_sign_operator(MinamiKotoriParser.Not_sign_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#bitwise_not_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise_not_operator(MinamiKotoriParser.Bitwise_not_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MinamiKotoriParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(MinamiKotoriParser.Function_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(MinamiKotoriParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#new_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_operation(MinamiKotoriParser.New_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#array_new_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_new_type(MinamiKotoriParser.Array_new_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#class_new_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_new_type(MinamiKotoriParser.Class_new_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#builtin_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltin_constant(MinamiKotoriParser.Builtin_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(MinamiKotoriParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(MinamiKotoriParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MinamiKotoriParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MinamiKotoriParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(MinamiKotoriParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(MinamiKotoriParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(MinamiKotoriParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#for_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_statement(MinamiKotoriParser.For_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#the_first_for_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_first_for_expression(MinamiKotoriParser.The_first_for_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#the_second_for_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_second_for_expression(MinamiKotoriParser.The_second_for_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#the_third_for_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_third_for_expression(MinamiKotoriParser.The_third_for_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#while_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop_statement(MinamiKotoriParser.While_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(MinamiKotoriParser.Branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinamiKotoriParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MinamiKotoriParser.If_statementContext ctx);
}