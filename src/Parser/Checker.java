// Generated from MinamiKotori.g4 by ANTLR 4.5.3
package Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * This class provides an empty implementation of {@link MinamiKotoriVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <ArrayList <Pair <Type, Boolean>>> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */

//Boolean means whether the type is lvalue
public class Checker extends AbstractParseTreeVisitor<ArrayList <Pair <Type, Boolean>>> implements
		MinamiKotoriVisitor<ArrayList <Pair <Type, Boolean>>> {
	public Symbol_table symbol_table;
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitProgram(MinamiKotoriParser.ProgramContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitDeclaration(MinamiKotoriParser.DeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitVariable_declaration(MinamiKotoriParser.Variable_declarationContext ctx)
	{
		Type variable = new Type();
		variable.type = "variable";
		variable.name = Name.getSymbolName(ctx.init_declarator().declarator().getText());
		variable.type_name = visit(ctx.type()).get(0).a;
		if (variable.type_name.equal(symbol_table.VOID))
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		symbol_table.put(variable.name, variable, new Pair <Integer, Integer>(ctx.getStart().getLine(), ctx.getStart()
				.getCharPositionInLine()));
		visit(ctx.init_declarator());
		return new ArrayList <Pair <Type, Boolean>>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitType(MinamiKotoriParser.TypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitNon_array_type(MinamiKotoriParser.Non_array_typeContext ctx)
	{
		ArrayList <Pair <Type, Boolean>> arraylist = new ArrayList<>();
		arraylist.add(new Pair <>(symbol_table.get(Name.getSymbolName(ctx.getText()), new Pair<> (ctx.getStart()
				.getLine(), ctx.getStart().getCharPositionInLine())), false));
		return arraylist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitType_name(MinamiKotoriParser.Type_nameContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitClass_declaration(MinamiKotoriParser.Class_declarationContext ctx)
	{
		return new ArrayList<Pair<Type, Boolean>>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitArray_declaration_type(MinamiKotoriParser.Array_declaration_typeContext ctx)
	{
		Type type = new Type();
		type.type = "type";
		type.dim = ctx.Left_square_bracket().size();
		type.type_name = visit(ctx.non_array_type()).get(0).a;
		type.name = type.type_name.name;
		ArrayList <Pair <Type, Boolean>> arraylist = new ArrayList <Pair <Type, Boolean>>();
		arraylist.add(new Pair <>(type, false));
		return arraylist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitInit_declarator(MinamiKotoriParser.Init_declaratorContext ctx)
	{
		Name name = Name.getSymbolName(ctx.declarator().getText());
		Type variable = symbol_table.get(name, new Pair <Integer, Integer>(ctx.getStart().getLine(), ctx.getStart()
				.getCharPositionInLine()));
		if (ctx.initializer() != null)
		{
			ArrayList <Pair <Type, Boolean>> arraylist = visit(ctx.initializer());
			if (arraylist.size() > 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!variable.type_name.equal(arraylist.get(0).a))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		return new ArrayList<Pair<Type, Boolean>>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitDeclarator(MinamiKotoriParser.DeclaratorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitInitializer(MinamiKotoriParser.InitializerContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitAssignment_expression(MinamiKotoriParser.Assignment_expressionContext ctx)
	{
		ArrayList <Pair <Type, Boolean>> Right = visit(ctx.calculation_expression());
		for (Iterator <MinamiKotoriParser.Unary_expressionContext> i = ctx.unary_expression().iterator(); i.hasNext(); )
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(i.next());
			if (!tmp.get(0).a.equal(Right.get(0).a))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!tmp.get(0).b)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList <>();
		returnlist.add(Right.get(0));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitAssignment_operator(MinamiKotoriParser.Assignment_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitCalculation_expression(MinamiKotoriParser.Calculation_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitLogical_or_expression(MinamiKotoriParser.Logical_or_expressionContext ctx)
	{
		if (ctx.logical_and_expression().size() == 1)
			return visit(ctx.logical_and_expression(0));
		for (int i = 0; i < ctx.logical_and_expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.logical_and_expression(i));
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!tmp.get(0).a.equal(symbol_table.BOOL))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList <>();
		returnlist.add(new Pair <>(symbol_table.BOOL, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitLogical_or_operator(MinamiKotoriParser.Logical_or_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitLogical_and_expression(MinamiKotoriParser.Logical_and_expressionContext ctx)
	{
		if (ctx.bitwise_or_expression().size() == 1)
			return visit(ctx.bitwise_or_expression(0));
		for (int i = 0; i < ctx.bitwise_or_expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.bitwise_or_expression(i));
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!tmp.get(0).a.equal(symbol_table.BOOL))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList <>();
		returnlist.add(new Pair <>(symbol_table.BOOL, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitLogical_and_operator(MinamiKotoriParser.Logical_and_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBitwise_or_expression(MinamiKotoriParser.Bitwise_or_expressionContext ctx)
	{
		if (ctx.bitwise_xor_expression().size() == 1)
			return visit(ctx.bitwise_xor_expression(0));
		for (int i = 0; i < ctx.bitwise_xor_expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.bitwise_xor_expression(i));
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!tmp.get(0).a.equal(symbol_table.INT))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList <>();
		returnlist.add(new Pair <>(symbol_table.INT, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBitwise_or_operator(MinamiKotoriParser.Bitwise_or_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBitwise_xor_expression(MinamiKotoriParser.Bitwise_xor_expressionContext ctx)
	{
		if (ctx.bitwise_and_expression().size() == 1)
			return visit(ctx.bitwise_and_expression(0));
		for (int i = 0; i < ctx.bitwise_and_expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.bitwise_and_expression(i));
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!tmp.get(0).a.equal(symbol_table.INT))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		returnlist.add(new Pair <>(symbol_table.INT, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBitwise_xor_operator(MinamiKotoriParser.Bitwise_xor_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBitwise_and_expression(MinamiKotoriParser.Bitwise_and_expressionContext ctx)
	{
		if (ctx.equality_expression().size() == 1)
			return visit(ctx.equality_expression(0));
		for (int i = 0; i < ctx.equality_expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.equality_expression(i));
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!tmp.get(0).a.equal(symbol_table.INT))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		returnlist.add(new Pair<>(symbol_table.INT, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBitwise_and_operator(MinamiKotoriParser.Bitwise_and_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitEquality_expression(MinamiKotoriParser.Equality_expressionContext ctx)
	{
		if (ctx.relation_expression().size()  == 1)
			return visit(ctx.relation_expression(0));
		ArrayList <Pair <Type, Boolean>> list = new ArrayList<>();
		for (int i = 0; i < ctx.relation_expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.relation_expression(i));
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			list.addAll(tmp);
		}
		if (!list.get(0).a.equal(list.get(1).a))
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		for (int i = 2; i < list.size(); i ++)
			if (!list.get(i).a.equal(symbol_table.BOOL))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		returnlist.add(new Pair<>(symbol_table.BOOL, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitIs_equal_operator(MinamiKotoriParser.Is_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitNot_equal_operator(MinamiKotoriParser.Not_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitRelation_expression(MinamiKotoriParser.Relation_expressionContext ctx)
	{
		if (ctx.shift_expression().size() == 1)
			return visit(ctx.shift_expression(0));
		ArrayList <Pair <Type, Boolean>> Left = visit(ctx.shift_expression(0));
		ArrayList <Pair <Type, Boolean>> Right = visit(ctx.shift_expression(1));
		if (Left.size() != 1 || Right.size() != 1)
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		if (!Left.get(0).a.equal(Right.get(0).a))
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		if (!Left.get(0).a.equal(symbol_table.INT) && !Left.get(0).a.equal(symbol_table.STRING))
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		returnlist.add(new Pair<>(symbol_table.BOOL, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitSmaller_operator(MinamiKotoriParser.Smaller_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBigger_operator(MinamiKotoriParser.Bigger_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitSmaller_equal_operator(MinamiKotoriParser.Smaller_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBigger_equal_operator(MinamiKotoriParser.Bigger_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitShift_expression(MinamiKotoriParser.Shift_expressionContext ctx)
	{
		if (ctx.add_expression().size() == 1)
			return visit(ctx.add_expression(0));
		for (int i = 0; i < ctx.add_expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.add_expression(i));
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!tmp.get(0).a.equal(symbol_table.INT))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		returnlist.add(new Pair<>(symbol_table.INT, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitLshift_operator(MinamiKotoriParser.Lshift_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitRshift_operator(MinamiKotoriParser.Rshift_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitAdd_expression(MinamiKotoriParser.Add_expressionContext ctx)
	{
		if (ctx.multiply_expression().size() == 1)
			return visit(ctx.multiply_expression(0));
		ArrayList <Pair <Type, Boolean>> list = new ArrayList<>();
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		for (int i = 0; i < ctx.multiply_expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.multiply_expression(i));
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			list.addAll(tmp);
		}
		if (list.get(0).a.equal(symbol_table.INT))
		{
			for (int i = 1; i < list.size(); i ++)
				if (!list.get(i).a.equal(symbol_table.INT))
					throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			returnlist.add(new Pair<>(list.get(0).a, false));
		}
		else if (list.get(0).a.equal(symbol_table.STRING))
		{
			for (int i = 1; i < list.size(); i ++)
				if (!list.get(i).a.equal(symbol_table.STRING))
					throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (ctx.minus_operator().size() > 0)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			returnlist.add(new Pair<>(list.get(0).a, false));
		}
		else
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitPlus_operator(MinamiKotoriParser.Plus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitMinus_operator(MinamiKotoriParser.Minus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitMultiply_expression(MinamiKotoriParser.Multiply_expressionContext ctx)
	{
		if (ctx.unary_expression().size() == 1)
			return visit(ctx.unary_expression(0));
		ArrayList <Pair <Type, Boolean>> list = new ArrayList<>();
		for (int i = 0; i < ctx.unary_expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.unary_expression(i));
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			list.addAll(tmp);
		}
		for (int i = 0; i < list.size(); i ++)
			if (!list.get(i).a.equal(symbol_table.INT))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		returnlist.add(new Pair<>(symbol_table.INT, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitMultiply_operator(MinamiKotoriParser.Multiply_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitDivide_operator(MinamiKotoriParser.Divide_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitMod_operator(MinamiKotoriParser.Mod_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitUnary_expression(MinamiKotoriParser.Unary_expressionContext ctx)
	{
		if (ctx.unary_operator() != null)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.unary_expression());
			ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
			if (tmp.size() != 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (tmp.get(0).a.equal(symbol_table.INT))
			{
				if (ctx.unary_operator().not_sign_operator() != null)
					throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
				returnlist.add(new Pair<>(symbol_table.INT, false));
			}
			else if (tmp.get(0).a.equal(symbol_table.BOOL))
			{
				if (ctx.unary_operator().not_sign_operator() == null)
					throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
				returnlist.add(new Pair<>(symbol_table.BOOL, false));
			}
			else
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			return returnlist;
		}
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitPostfix_expression(MinamiKotoriParser.Postfix_expressionContext ctx)
	{
		ArrayList <Pair <Type, Boolean>> primary = visit(ctx.primary_expression());
		Type now = primary.get(0).a;
		Boolean is_lvalue = primary.get(0).b;
		for (int i = 0; i < ctx.postfix().size(); i ++)
		{
			if (ctx.postfix(i).Left_square_bracket() != null)
			{
				ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.postfix(i).expression());
				if (tmp.size() != 1)
					throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
				if (!tmp.get(0).a.equal(symbol_table.INT))
					throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
				if (now.dim == 0)
					throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
				Type temp = now;
				now = new Type();
				now.name = temp.name;
				now.type = temp.type;
				now.type_name = temp.type_name;
				now.members = temp.members;
				now.dim = temp.dim - 1;
				now.dimension = temp.dimension;
				is_lvalue = true;
			}
			if (ctx.postfix(i).get_member_operator() != null)
			{
				if (now.dim > 0) //array.size()
				{
					if (ctx.postfix(i).function_call_expression() == null)
						throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
					if (!ctx.postfix(i).function_call_expression().Identifier().getText().equals("size"))
						throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
					if (ctx.postfix(i).function_call_expression().arguments() != null)
						throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
					now = symbol_table.INT;
					is_lvalue = false;
				}
				else
				{
					if (ctx.postfix(i).function_call_expression() != null) //string's function
					{
						if (!now.equal(symbol_table.STRING))
							throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
						if (ctx.postfix(i).function_call_expression().Identifier().getText().equals("length"))
						{
							if (ctx.postfix(i).function_call_expression().arguments() != null)
								throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
							now = symbol_table.INT;
							is_lvalue = false;
						}
						else if (ctx.postfix(i).function_call_expression().Identifier().getText().equals("substring"))
						{
							ArrayList <Pair <Type, Boolean>> list = new ArrayList<>();
							for (int j = 0; j < ctx.postfix(i).function_call_expression().arguments()
									.assignment_expression().size(); j ++)
							{
								ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.postfix(i).function_call_expression
										().arguments().assignment_expression(j));
								if (tmp.size() != 1)
									throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
								list.addAll(tmp);
							}
							if (list.size() != 2)
								throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
							for (int j = 0; j < list.size(); j ++)
								if (!list.get(j).a.equal(symbol_table.INT))
									throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
							now = symbol_table.STRING;
							is_lvalue = false;
						}
						else if (ctx.postfix(i).function_call_expression().Identifier().getText().equals("parseInt"))
						{
							if (ctx.postfix(i).function_call_expression().arguments() != null)
								throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
							now = symbol_table.INT;
							is_lvalue = false;
						}
						else if (ctx.postfix(i).function_call_expression().Identifier().getText().equals("ord"))
						{
							ArrayList <Pair <Type, Boolean>> list = new ArrayList<>();
							for (int j = 0; j < ctx.postfix(i).function_call_expression().arguments()
									.assignment_expression().size(); j ++)
							{
								ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.postfix(i).function_call_expression
										().arguments().assignment_expression(j));
								if (tmp.size() != 1)
									throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
								list.addAll(tmp);
							}
							if (list.size() != 1)
								throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
							if (!list.get(0).a.equal(symbol_table.INT))
								throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
							now = symbol_table.INT;
							is_lvalue = false;
						}
						else
							throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
					}
					else
					{
						if (now.type_name.members.get(Name.getSymbolName(ctx.postfix(i).Identifier().getText())) ==
								null)
							throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
						now = now.type_name.members.get(Name.getSymbolName(ctx.postfix(i).Identifier().getText()));
						is_lvalue = true;
					}
				}
			}
			if (ctx.postfix(i).plusplus_operator() != null || ctx.postfix(i).minusminus_operator() != null)
			{
				if (!now.equal(symbol_table.INT))
					throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
				is_lvalue = false;
			}
		}
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		returnlist.add(new Pair<>(now, is_lvalue));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitPrimary_expression(MinamiKotoriParser.Primary_expressionContext ctx)
	{
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		if (ctx.Identifier() != null)
		{
			Type type = symbol_table.get(Name.getSymbolName(ctx.Identifier().getText()), new Pair<>(ctx.getStart()
					.getLine(), ctx
					.getStart().getCharPositionInLine()));
			returnlist.add(new Pair<>(type.type_name, true));
		}
		if (ctx.constant() != null)
		{
			if (ctx.constant().integer_constant() != null)
				returnlist.add(new Pair<>(symbol_table.INT, false));
			else
				returnlist.add(new Pair<>(symbol_table.STRING, false));
		}
		if (ctx.expression() != null)
			return visit(ctx.expression());
		if (ctx.function_call_expression() != null)
			return visit(ctx.function_call_expression());
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitConstant(MinamiKotoriParser.ConstantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitInteger_constant(MinamiKotoriParser.Integer_constantContext ctx)
	{
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		returnlist.add(new Pair<>(symbol_table.INT, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitString_constant(MinamiKotoriParser.String_constantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitPostfix(MinamiKotoriParser.PostfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitGet_member_operator(MinamiKotoriParser.Get_member_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitPlusplus_operator(MinamiKotoriParser.Plusplus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitMinusminus_operator(MinamiKotoriParser.Minusminus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitUnary_operator(MinamiKotoriParser.Unary_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitNot_sign_operator(MinamiKotoriParser.Not_sign_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBitwise_not_operator(MinamiKotoriParser.Bitwise_not_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitExpression(MinamiKotoriParser.ExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitFunction_call_expression(MinamiKotoriParser.Function_call_expressionContext ctx)
	{
		Type function = symbol_table.get(Name.getSymbolName(ctx.Identifier().getText()), new Pair<>(ctx.getStart()
				.getLine(), ctx.getStart().getCharPositionInLine()));
		if (!function.type.equals("function"))
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		if (function.parameters.size() != 0 && ctx.arguments() == null)
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		if (ctx.arguments() != null)
		{
			if (function.parameters.size() != ctx.arguments().assignment_expression().size())
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			for (int i = 0; i < function.parameters.size(); i ++)
			{
				Type type = function.parameters.get(i).type_name;
				ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.arguments().assignment_expression(i));
				if (!type.equal(tmp.get(0).a))
					throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			}
		}
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		returnlist.add(new Pair <>(function.return_type, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitArguments(MinamiKotoriParser.ArgumentsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitNew_operation(MinamiKotoriParser.New_operationContext ctx)
	{
		if (ctx.array_new_type() != null)
			return visit(ctx.array_new_type());
		else
			return visit(ctx.class_new_type());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitArray_new_type(MinamiKotoriParser.Array_new_typeContext ctx)
	{
		Type type = new Type();
		type.type = "type";
		type.dim = ctx.Left_square_bracket().size();
		type.type_name = visit(ctx.non_array_type()).get(0).a;
		type.name = type.type_name.name;
		type.dimension = new ArrayList <>();
		for (int i = 0; i < ctx.expression().size(); i ++)
		{
			ArrayList <Pair <Type, Boolean>> arraylist = visit(ctx.expression(i));
			if (arraylist.size() > 1)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!arraylist.get(0).a.name.equals(Name.getSymbolName("int")))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		ArrayList <Pair <Type, Boolean>> arraylist = new ArrayList<>();
		arraylist.add(new Pair<>(type, false));
		return arraylist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitClass_new_type(MinamiKotoriParser.Class_new_typeContext ctx)
	{
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		Type type = symbol_table.get(Name.getSymbolName(ctx.getText()), new Pair<>(ctx.getStart().getLine(), ctx
				.getStart().getCharPositionInLine()));
		returnlist.add(new Pair<>(type, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBuiltin_constant(MinamiKotoriParser.Builtin_constantContext ctx)
	{
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		if (ctx.getText().equals("null"))
			returnlist.add(new Pair<>(symbol_table.NULL, false));
		else
			returnlist.add(new Pair<>(symbol_table.BOOL, false));
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitFunction_definition(MinamiKotoriParser.Function_definitionContext ctx)
	{
		symbol_table.begin_scope();
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList<>();
		Type type = symbol_table.get(Name.getSymbolName(ctx.Identifier().getText()), new Pair<>(ctx.getStart()
				.getLine(), ctx.getStart().getCharPositionInLine()));
		if (type.parameters != null)
			for (int i = 0; i < type.parameters.size(); i ++)
				symbol_table.put(type.parameters.get(i).name, type.parameters.get(i), new Pair<>(ctx.getStart()
						.getLine(), ctx.getStart().getCharPositionInLine()));
		for (Iterator <MinamiKotoriParser.DeclarationContext> i = ctx.declaration().iterator(); i.hasNext(); )
			visit(i.next());
		for (Iterator <MinamiKotoriParser.StatementContext> i = ctx.statement().iterator(); i.hasNext(); )
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(i.next());
			returnlist.addAll(tmp);
		}
		for (int i = 0; i < returnlist.size(); i ++)
			if (!returnlist.get(i).a.equal(type.return_type))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		symbol_table.end_scope();
		return new ArrayList <Pair <Type, Boolean>>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitParameter_list(MinamiKotoriParser.Parameter_listContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitParameter(MinamiKotoriParser.ParameterContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitStatement(MinamiKotoriParser.StatementContext ctx)
	//returnlist must be (return expression); and others must be empty
	{
		if (ctx.declaration() != null)
		{
			visit(ctx.declaration());
			return new ArrayList <Pair <Type, Boolean>>();
		}
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitAssignment_statement(MinamiKotoriParser.Assignment_statementContext ctx)
	{
		visit(ctx.expression());
		return new ArrayList<Pair<Type, Boolean>>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitCompound_statement(MinamiKotoriParser.Compound_statementContext ctx)
	{
		symbol_table.begin_scope();
		ArrayList <Pair <Type, Boolean>> returnlist = new ArrayList <>();
		for (Iterator <MinamiKotoriParser.DeclarationContext> i = ctx.declaration().iterator(); i.hasNext(); )
		{
			visit(i.next());
		}
		for (Iterator <MinamiKotoriParser.StatementContext> i = ctx.statement().iterator(); i.hasNext(); )
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(i.next());
			returnlist.addAll(tmp);
		}
		symbol_table.end_scope();
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitLoop_statement(MinamiKotoriParser.Loop_statementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitFor_loop_statement(MinamiKotoriParser.For_loop_statementContext ctx)
	{
		if (ctx.the_first_for_expression() != null)
			visit(ctx.the_first_for_expression());
		if (ctx.the_second_for_expression() != null)
		{
			ArrayList <Pair <Type, Boolean>> tmp = visit(ctx.the_second_for_expression());
			if (tmp.size() > 1 || tmp.size() == 0)
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
			if (!tmp.get(0).a.equal(symbol_table.BOOL))
				throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		}
		if (ctx.the_third_for_expression() != null)
			visit(ctx.the_third_for_expression());
		symbol_table.begin_scope();
		ArrayList <Pair <Type, Boolean>> returnlist = visit(ctx.statement());
		symbol_table.end_scope();
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>>  visitThe_first_for_expression(MinamiKotoriParser.The_first_for_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>>  visitThe_second_for_expression(MinamiKotoriParser.The_second_for_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>>  visitThe_third_for_expression(MinamiKotoriParser.The_third_for_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitWhile_loop_statement(MinamiKotoriParser.While_loop_statementContext ctx)
	{
		ArrayList <Pair <Type, Boolean>> while_expression = visit(ctx.expression());
		if (while_expression.size() != 1)
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		if (!while_expression.get(0).a.equal(symbol_table.BOOL))
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		symbol_table.begin_scope();
		ArrayList <Pair <Type, Boolean>> returnlist = visit(ctx.statement());
		symbol_table.end_scope();
		return returnlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitBranch_statement(MinamiKotoriParser.Branch_statementContext ctx)
	{
		if (ctx.if_statement() != null)
			return visit(ctx.if_statement());
		if (ctx.Return() != null)
		{
			if (ctx.expression() != null)
				return visit(ctx.expression());
			else
				return new ArrayList <Pair <Type, Boolean>>();
		}
		int dep = 0;
		ParserRuleContext now = ctx;
		ParserRuleContext For = new MinamiKotoriParser.For_loop_statementContext(now, -1);
		ParserRuleContext While = new MinamiKotoriParser.While_loop_statementContext(now, -1);
		while (now.depth() > 1)
		{
			if (now.getRuleIndex() == For.getRuleIndex())
				dep ++;
			if (now.getRuleIndex() == While.getRuleIndex())
				dep ++;
			now = now.getParent();
		}
		if (dep == 0)
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		return new ArrayList <Pair <Type, Boolean>>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public ArrayList <Pair <Type, Boolean>> visitIf_statement(MinamiKotoriParser.If_statementContext ctx)
	{
		ArrayList <Pair <Type, Boolean>> if_expression = visit(ctx.expression());
		if (if_expression.size() != 1)
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		if (!if_expression.get(0).a.equal(symbol_table.BOOL))
			throw new RuntimeException(ctx.getStart().getLine() + " " + ctx.getStart().getCharPositionInLine());
		ArrayList <Pair <Type, Boolean>> returnlist = visit(ctx.statement(0));
		if (ctx.Else() != null)
			returnlist.addAll(visit(ctx.statement(1)));
		return returnlist;
	}
}