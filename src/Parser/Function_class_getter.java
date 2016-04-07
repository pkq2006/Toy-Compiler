// Generated from MinamiKotori.g4 by ANTLR 4.5.3
package Parser;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.misc.Pair;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * This class provides an empty implementation of {@link MinamiKotoriVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */

//get the members of class and the parameters of function
public class Function_class_getter extends AbstractParseTreeVisitor<ArrayList <Type>> implements MinamiKotoriVisitor<ArrayList <Type>> {
	public Symbol_table symbol_table;
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitProgram(MinamiKotoriParser.ProgramContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitDeclaration(MinamiKotoriParser.DeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitVariable_declaration(MinamiKotoriParser.Variable_declarationContext ctx)
	{return visitChildren(ctx);}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitType(MinamiKotoriParser.TypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitNon_array_type(MinamiKotoriParser.Non_array_typeContext ctx)
	{
		ArrayList <Type> arraylist = new ArrayList <Type>();
		Type type = new Type();
		String name = ctx.type_name().getText();
		type = symbol_table.get(Name.getSymbolName(name), new Pair <>(ctx.getStart().getLine(), ctx
				.getStart().getCharPositionInLine()));
		arraylist.add(type);
		return arraylist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitType_name(MinamiKotoriParser.Type_nameContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitClass_declaration(MinamiKotoriParser.Class_declarationContext ctx)
	{
		symbol_table.begin_scope();
		ArrayList <Type> arraylist = new ArrayList <Type>();
		Iterator <MinamiKotoriParser.DeclaratorContext> j = ctx.declarator().iterator();
		for (Iterator <MinamiKotoriParser.TypeContext> i = ctx.type().iterator(); i.hasNext(); )
		{
			Type type = new Type();
			type.type = "variable";
			MinamiKotoriParser.TypeContext tmp = i.next();
			Pair <Integer, Integer> position = new Pair <>(tmp.getStart().getLine(), tmp.getStart()
					.getCharPositionInLine());
			type.type_name = visit(tmp).get(0);
			type.name = Name.getSymbolName(j.next().getText());
			arraylist.add(type);
			symbol_table.put(type.name, type, position);
		}
		symbol_table.end_scope();
		Type now_class = symbol_table.get(Name.getSymbolName(ctx.Identifier().getText()), new Pair <>
				(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
		for (int i = 0; i < arraylist.size(); i ++)
			now_class.members.put(arraylist.get(i).name, arraylist.get(i));
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitArray_declaration_type(MinamiKotoriParser.Array_declaration_typeContext ctx)
	{
		Type type = new Type();
		type.type = "type";
		type.dim = ctx.Left_square_bracket().size();
		type.type_name = visit(ctx.non_array_type()).get(0);
		type.name = type.type_name.name;
		ArrayList <Type> arraylist = new ArrayList <Type>();
		arraylist.add(type);
		return arraylist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitInit_declarator(MinamiKotoriParser.Init_declaratorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitDeclarator(MinamiKotoriParser.DeclaratorContext ctx)
	{
		Type type = new Type();
		type.type = "varible";
		type.name = Name.getSymbolName(ctx.Identifier().getText());
		ArrayList <Type> arraylist = new ArrayList <Type>();
		arraylist.add(type);
		return arraylist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitInitializer(MinamiKotoriParser.InitializerContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitAssignment_expression(MinamiKotoriParser.Assignment_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitAssignment_operator(MinamiKotoriParser.Assignment_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitCalculation_expression(MinamiKotoriParser.Calculation_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitLogical_or_expression(MinamiKotoriParser.Logical_or_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitLogical_or_operator(MinamiKotoriParser.Logical_or_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitLogical_and_expression(MinamiKotoriParser.Logical_and_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitLogical_and_operator(MinamiKotoriParser.Logical_and_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBitwise_or_expression(MinamiKotoriParser.Bitwise_or_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBitwise_or_operator(MinamiKotoriParser.Bitwise_or_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBitwise_xor_expression(MinamiKotoriParser.Bitwise_xor_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBitwise_xor_operator(MinamiKotoriParser.Bitwise_xor_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBitwise_and_expression(MinamiKotoriParser.Bitwise_and_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBitwise_and_operator(MinamiKotoriParser.Bitwise_and_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitEquality_expression(MinamiKotoriParser.Equality_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitIs_equal_operator(MinamiKotoriParser.Is_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitNot_equal_operator(MinamiKotoriParser.Not_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitRelation_expression(MinamiKotoriParser.Relation_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitSmaller_operator(MinamiKotoriParser.Smaller_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBigger_operator(MinamiKotoriParser.Bigger_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitSmaller_equal_operator(MinamiKotoriParser.Smaller_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBigger_equal_operator(MinamiKotoriParser.Bigger_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitShift_expression(MinamiKotoriParser.Shift_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitLshift_operator(MinamiKotoriParser.Lshift_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitRshift_operator(MinamiKotoriParser.Rshift_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitAdd_expression(MinamiKotoriParser.Add_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitPlus_operator(MinamiKotoriParser.Plus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitMinus_operator(MinamiKotoriParser.Minus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitMultiply_expression(MinamiKotoriParser.Multiply_expressionContext ctx) {
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitMultiply_operator(MinamiKotoriParser.Multiply_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitDivide_operator(MinamiKotoriParser.Divide_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitMod_operator(MinamiKotoriParser.Mod_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitUnary_expression(MinamiKotoriParser.Unary_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitPostfix_expression(MinamiKotoriParser.Postfix_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitPrimary_expression(MinamiKotoriParser.Primary_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitConstant(MinamiKotoriParser.ConstantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitInteger_constant(MinamiKotoriParser.Integer_constantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitString_constant(MinamiKotoriParser.String_constantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitPostfix(MinamiKotoriParser.PostfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitGet_member_operator(MinamiKotoriParser.Get_member_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitPlusplus_operator(MinamiKotoriParser.Plusplus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitMinusminus_operator(MinamiKotoriParser.Minusminus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitUnary_operator(MinamiKotoriParser.Unary_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitNot_sign_operator(MinamiKotoriParser.Not_sign_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBitwise_not_operator(MinamiKotoriParser.Bitwise_not_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitExpression(MinamiKotoriParser.ExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitFunction_call_expression(MinamiKotoriParser.Function_call_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitArguments(MinamiKotoriParser.ArgumentsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitNew_operation(MinamiKotoriParser.New_operationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitArray_new_type(MinamiKotoriParser.Array_new_typeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitClass_new_type(MinamiKotoriParser.Class_new_typeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBuiltin_constant(MinamiKotoriParser.Builtin_constantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitFunction_definition(MinamiKotoriParser.Function_definitionContext ctx)
	{
		Type type = new Type();
		type.type = "function";
		type.return_type = visit(ctx.type()).get(0);
		ArrayList <Type> parameters = null;
		symbol_table.begin_scope();
		if (ctx.parameter_list() != null)
			parameters = visit(ctx.parameter_list());
		symbol_table.end_scope();
		type.parameters = new ArrayList <Type>();
		if (parameters != null)
			type.parameters.addAll(parameters);
		type.name = Name.getSymbolName(ctx.Identifier().getText());
		symbol_table.put(type.name, type, new Pair <>(ctx.getStart().getLine(), ctx.getStart()
				.getCharPositionInLine()));
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitParameter_list(MinamiKotoriParser.Parameter_listContext ctx)
	{
		ArrayList <Type> arraylist = new ArrayList <Type>();
		List <MinamiKotoriParser.ParameterContext> list = ctx.parameter();
		for (int i = 0; i < list.size(); i ++)
			arraylist.addAll(visit(list.get(i)));
		return arraylist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitParameter(MinamiKotoriParser.ParameterContext ctx)
	{
		Type type = visit(ctx.declarator()).get(0);
		type.type = "varible";
		type.type_name = visit(ctx.type()).get(0);
		ArrayList <Type> arraylist = new ArrayList <Type>();
		arraylist.add(type);
		symbol_table.put(type.name, type, new Pair <>(ctx.getStart().getLine(), ctx.getStart()
				.getCharPositionInLine()));
		return arraylist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitStatement(MinamiKotoriParser.StatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitAssignment_statement(MinamiKotoriParser.Assignment_statementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitCompound_statement(MinamiKotoriParser.Compound_statementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitLoop_statement(MinamiKotoriParser.Loop_statementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitFor_loop_statement(MinamiKotoriParser.For_loop_statementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type>  visitThe_first_for_expression(MinamiKotoriParser.The_first_for_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type>  visitThe_second_for_expression(MinamiKotoriParser.The_second_for_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type>  visitThe_third_for_expression(MinamiKotoriParser.The_third_for_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitWhile_loop_statement(MinamiKotoriParser.While_loop_statementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitBranch_statement(MinamiKotoriParser.Branch_statementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Type> visitIf_statement(MinamiKotoriParser.If_statementContext ctx) { return visitChildren(ctx); }
}