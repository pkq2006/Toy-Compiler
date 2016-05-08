// Generated from MinamiKotori.g4 by ANTLR 4.5.3
package IR;
import Parser.MinamiKotoriParser;
import Parser.MinamiKotoriVisitor;
import Parser.Symbol_table;
import Parser.Type;
import Parser.Name;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.*;

/**
 * This class provides an empty implementation of {@link MinamiKotoriVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class IR_constructer extends AbstractParseTreeVisitor<Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>>> implements MinamiKotoriVisitor<Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>>> {
	public Symbol_table symbol_table;
	public Parser.Checker checker;
	private Integer temporary_variable_counter = 0;
	public Integer global_variable_counter = 0;
	private Integer or_expression_counter = 0, and_expression_counter = 0;
	private int for_counter = 0, while_counter = 0, if_counter = 0;
	private ArrayList <Pair <String, Integer>> break_list;
	private ArrayList <Instruction> global_variable;
	private String variable_prefix;
	private boolean is_global;
	private HashMap <String, String> builtin_function;
	private ArrayList <String> last_parameters_list;
	private HashMap <String, String> string_constant;

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	private String get_function_name(String function_name)
	{
		if (builtin_function.get(function_name) != null)
			return builtin_function.get(function_name);
		return function_name;
	}

	private boolean is_identifier(String parameters_name)
	{
		char[] char_list = parameters_name.toCharArray();
		for (int i = 0; i < parameters_name.length(); i ++)
		{
			if ((char_list[i] >= 'a' && char_list[i] <= 'z') || (char_list[i] >= 'A' && char_list[i] <= 'Z') || (char_list[i] >= '0' && char_list[i] <= '9') || (char_list[i] == '_'))
				continue;
			return false;
		}
		return true;
	}

	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitProgram(MinamiKotoriParser.ProgramContext ctx)
	{
		break_list = new ArrayList<>();
		builtin_function = new HashMap<>();
		builtin_function.put("print", "func__print");
		builtin_function.put("println", "func__println");
		builtin_function.put("getString", "func__getString");
		builtin_function.put("getInt", "func__getInt");
		builtin_function.put("toString", "func__toString");
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
		global_variable = new ArrayList<>();
		last_parameters_list = new ArrayList<>();
		string_constant = new HashMap<>();
		variable_prefix = "$t_main_";
		is_global = true;
		temporary_variable_counter = 2;
		for (int i = 0; i < ctx.declaration().size(); i ++)
		{
			Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.declaration(i));
			global_variable.addAll(tmp.b.a);
			global_variable.addAll(tmp.b.b);
		}
		is_global = false;
		for (int i = 0; i < ctx.function_definition().size(); i ++)
			if (ctx.function_definition(i).Identifier().getText().equals("main"))
			{
				variable_prefix = "$t_" + ctx.function_definition(i).Identifier().getText() + "_";
				Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.function_definition(i));
				return_list.b.a.addAll(tmp.b.a);
				return_list.b.a.addAll(tmp.b.b);
			}
		for (int i = 0; i < ctx.function_definition().size(); i ++)
			if (!ctx.function_definition(i).Identifier().getText().equals("main"))
			{
				variable_prefix = "$t_" + ctx.function_definition(i).Identifier().getText() + "_";
				Type function = symbol_table.get(Name.getSymbolName(ctx.function_definition(i).Identifier().getText()));
				temporary_variable_counter = -function.parameters.size();
				Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.function_definition(i));
				return_list.b.a.addAll(tmp.b.a);
				return_list.b.a.addAll(tmp.b.b);
			}
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitDeclaration(MinamiKotoriParser.DeclarationContext ctx){ return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitVariable_declaration(MinamiKotoriParser.Variable_declarationContext ctx)
	{
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp;
		if (ctx.init_declarator().initializer() != null)
			tmp = visit(ctx.init_declarator().initializer());
		else
			tmp = new Pair<>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
		Type variable = new Type();
		variable.type_name = checker.visit(ctx.type()).get(0).a;
		if (is_global)
			variable.register_id = "$g_" + (global_variable_counter ++).toString();
		else
			variable.register_id = variable_prefix + (temporary_variable_counter ++).toString();
		variable.name = Name.getSymbolName(ctx.init_declarator().declarator().getText());
		symbol_table.put(variable.name, variable);
		tmp.b.a.add(new Instruction("store", 4, variable.register_id, variable_prefix + (temporary_variable_counter ++).toString()));
		if (ctx.init_declarator().initializer() != null)
		{
			tmp.b.a.add(new Instruction("load", 4, tmp.a, "$s0"));
			tmp.b.a.add(new Instruction("store", 4, variable.register_id, "$s0"));
		}
		tmp.b.a.addAll(tmp.b.b);
		tmp.b.b.clear();
		return tmp;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitType(MinamiKotoriParser.TypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitNon_array_type(MinamiKotoriParser.Non_array_typeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitType_name(MinamiKotoriParser.Type_nameContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitClass_declaration(MinamiKotoriParser.Class_declarationContext ctx)
	{
		int counter = 0;
		Type now_class = symbol_table.get(Name.getSymbolName(ctx.Identifier().getText()));
		Set <HashMap.Entry <Name, Type>> set = now_class.members.entrySet();
		Iterator <HashMap.Entry <Name, Type>> iterator = set.iterator();
		while (iterator.hasNext())
			iterator.next().getValue().number_in_class = counter ++;
		return new Pair<>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitArray_declaration_type(MinamiKotoriParser.Array_declaration_typeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitInit_declarator(MinamiKotoriParser.Init_declaratorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitDeclarator(MinamiKotoriParser.DeclaratorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitInitializer(MinamiKotoriParser.InitializerContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitAssignment_expression(MinamiKotoriParser.Assignment_expressionContext ctx)
	{
		if (ctx.assignment_operator().size() == 0)
			return visit(ctx.calculation_expression());
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = visit(ctx.calculation_expression());
		for (int i = ctx.unary_expression().size() - 1; i >= 0; i --)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.unary_expression(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			return_list.b.a.add(new Instruction("load", 4, return_list.a, "$s0"));
			return_list.b.a.add(new Instruction("store", 4, tmp.a, "$s0"));
		}
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitAssignment_operator(MinamiKotoriParser.Assignment_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitCalculation_expression(MinamiKotoriParser.Calculation_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitLogical_or_expression(MinamiKotoriParser.Logical_or_expressionContext ctx)
	{
		if (ctx.logical_and_expression().size() == 1)
			return visit(ctx.logical_and_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		return_list.b.a.add(new Instruction("move", 1, "$s0"));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		or_expression_counter ++;
		String prefix = "or_expression_" + or_expression_counter.toString();
		return_list.b.a.add(new Instruction("jump", prefix + "_0"));
		for (int i = 0; i < ctx.logical_and_expression().size(); i++)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.logical_and_expression(i));
			return_list.b.a.add(new Instruction("label", prefix + "_" + Integer.toString(i)));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			return_list.b.a.add(new Instruction("load", 4, tmp.a, "$s0"));
			if (i == ctx.logical_and_expression().size() - 1)
				return_list.b.a.add(new Instruction("br", "$s0", prefix + "_end", prefix + "_false"));
			else
				return_list.b.a.add(new Instruction("br", "$s0", prefix + "_end", prefix + "_" + Integer.toString(i + 1)));
		}
		return_list.b.a.add(new Instruction("label", prefix + "_false"));
		return_list.b.a.add(new Instruction("move", 1, "$s0"));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		return_list.b.a.add(new Instruction("jump", prefix + "_end"));
		return_list.b.a.add(new Instruction("label", prefix + "_end"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitLogical_or_operator(MinamiKotoriParser.Logical_or_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitLogical_and_expression(MinamiKotoriParser.Logical_and_expressionContext ctx)
	{
		if (ctx.bitwise_or_expression().size() == 1)
			return visit(ctx.bitwise_or_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		return_list.b.a.add(new Instruction("move", 0, "$s0"));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		and_expression_counter ++;
		String prefix = "and_expression_" + and_expression_counter.toString();
		return_list.b.a.add(new Instruction("jump", prefix + "_0"));
		for (int i = 0; i < ctx.bitwise_or_expression().size(); i++)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.bitwise_or_expression(i));
			return_list.b.a.add(new Instruction("label", prefix + "_" + Integer.toString(i)));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			return_list.b.a.add(new Instruction("load", 4, tmp.a, "$s0"));
			if (i == ctx.bitwise_or_expression().size() - 1)
				return_list.b.a.add(new Instruction("br", "$s0", prefix + "_true", prefix + "_end"));
			else
				return_list.b.a.add(new Instruction("br", "$s0", prefix + "_" + Integer.toString(i + 1), prefix + "_end"));
		}
		return_list.b.a.add(new Instruction("label", prefix + "_true"));
		return_list.b.a.add(new Instruction("move", 1, "$s0"));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		return_list.b.a.add(new Instruction("jump", prefix + "_end"));
		return_list.b.a.add(new Instruction("label", prefix + "_end"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitLogical_and_operator(MinamiKotoriParser.Logical_and_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBitwise_or_expression(MinamiKotoriParser.Bitwise_or_expressionContext ctx)
	{
		if (ctx.bitwise_xor_expression().size() == 1)
			return visit(ctx.bitwise_xor_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		ArrayList <String> value_list = new ArrayList<>();
		for (int i = 0; i < ctx.bitwise_xor_expression().size(); i++)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.bitwise_xor_expression(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			value_list.add(tmp.a);
		}
		return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$s0"));
		for (int i = 1; i < value_list.size(); i ++)
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$s1"));
			return_list.b.a.add(new Instruction("or", "$s0", "$s1", "$s0"));
		}
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBitwise_or_operator(MinamiKotoriParser.Bitwise_or_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBitwise_xor_expression(MinamiKotoriParser.Bitwise_xor_expressionContext ctx)
	{
		if (ctx.bitwise_and_expression().size() == 1)
			return visit(ctx.bitwise_and_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		ArrayList <String> value_list = new ArrayList<>();
		for (int i = 0; i < ctx.bitwise_and_expression().size(); i++)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.bitwise_and_expression(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			value_list.add(tmp.a);
		}
		return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$s0"));
		for (int i = 1; i < value_list.size(); i ++)
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$s1"));
			return_list.b.a.add(new Instruction("xor", "$s0", "$s1", "$s0"));
		}
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBitwise_xor_operator(MinamiKotoriParser.Bitwise_xor_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBitwise_and_expression(MinamiKotoriParser.Bitwise_and_expressionContext ctx)
	{
		if (ctx.equality_expression().size() == 1)
			return visit(ctx.equality_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		ArrayList <String> value_list = new ArrayList<>();
		for (int i = 0; i < ctx.equality_expression().size(); i++)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.equality_expression(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			value_list.add(tmp.a);
		}
		return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$s0"));
		for (int i = 1; i < value_list.size(); i ++)
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$s1"));
			return_list.b.a.add(new Instruction("and", "$s0", "$s1", "$s0"));
		}
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBitwise_and_operator(MinamiKotoriParser.Bitwise_and_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitEquality_expression(MinamiKotoriParser.Equality_expressionContext ctx)
	{
		if (ctx.relation_expression().size() == 1)
			return visit(ctx.relation_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		ArrayList <String> value_list = new ArrayList<>();
		for (int i = 0; i < ctx.relation_expression().size(); i ++)
		{
			Pair<String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.relation_expression(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			value_list.add(tmp.a);
		}
		Type the_first_type = checker.visit(ctx.relation_expression(0)).get(0).a;
		String instruction_type = "";
		if (ctx.equality_operators(0).is_equal_operator() != null)
			instruction_type = "seq";
		if (ctx.equality_operators(0).not_equal_operator() != null)
			instruction_type = "sne";
		if (the_first_type.equal(symbol_table.INT))
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$s0"));
			return_list.b.a.add(new Instruction("load", 4, value_list.get(1), "$s1"));
			return_list.b.a.add(new Instruction(instruction_type, "$s0", "$s1", "$s2"));
		}
		else
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$a0"));
			return_list.b.a.add(new Instruction("load", 4, value_list.get(1), "$a1"));
			ArrayList <String> parameters = new ArrayList<>();
			parameters.add("$a0");
			parameters.add("$a1");
			return_list.b.a.add(new Instruction("call", "func__stringIsEqual", parameters, "$v0", temporary_variable_counter));
			return_list.b.a.add(new Instruction(instruction_type, "$v0", 1, "$s2"));
		}
		for (int i = 2; i < value_list.size(); i ++)
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$s0"));
			if (ctx.equality_operators(i - 1).is_equal_operator() != null)
				instruction_type = "seq";
			else
				instruction_type = "sne";
			return_list.b.a.add(new Instruction(instruction_type, "$s0", "$s2", "$s2"));
		}
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s2"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitEquality_operators(MinamiKotoriParser.Equality_operatorsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitIs_equal_operator(MinamiKotoriParser.Is_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitNot_equal_operator(MinamiKotoriParser.Not_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitRelation_expression(MinamiKotoriParser.Relation_expressionContext ctx)
	{
		if (ctx.shift_expression().size() == 1)
			return visit(ctx.shift_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		ArrayList <String> value_list = new ArrayList<>();
		for (int i = 0; i < ctx.shift_expression().size(); i++)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.shift_expression(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			value_list.add(tmp.a);
		}
		String instruction_type = "";
		if (ctx.relation_operators().bigger_equal_operator() != null)
			instruction_type = "sge";
		if (ctx.relation_operators().bigger_operator() != null)
			instruction_type = "sgt";
		if (ctx.relation_operators().smaller_equal_operator() != null)
			instruction_type = "sle";
		if (ctx.relation_operators().smaller_operator() != null)
			instruction_type = "slt";
		Type return_type = checker.visit(ctx.shift_expression(0)).get(0).a;
		if (return_type.equal(symbol_table.INT))
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$s0"));
			return_list.b.a.add(new Instruction("load", 4, value_list.get(1), "$s1"));
			return_list.b.a.add(new Instruction(instruction_type, "$s0", "$s1", "$s2"));
			return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s2"));
		}
		else
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$a0"));
			return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$a1"));
			ArrayList <String> parameters = new ArrayList<>();
			parameters.add("$a0");
			parameters.add("$a1");
			switch (instruction_type)
			{
				case "sge":
					return_list.b.a.add(new Instruction("call", "func__stringGeq", parameters, "$v0", temporary_variable_counter));
					break;
				case "sgt":
					return_list.b.a.add(new Instruction("call", "func__stringLarge", parameters, "$v0", temporary_variable_counter));
					break;
				case "sle":
					return_list.b.a.add(new Instruction("call", "func__stringLeq", parameters, "$v0", temporary_variable_counter));
					break;
				case "slt":
					return_list.b.a.add(new Instruction("call", "func__stringLess", parameters, "$v0", temporary_variable_counter));
					break;
			}
			return_list.b.a.add(new Instruction("store", 4, return_list.a, "$v0"));
		}
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitRelation_operators(MinamiKotoriParser.Relation_operatorsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitSmaller_operator(MinamiKotoriParser.Smaller_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBigger_operator(MinamiKotoriParser.Bigger_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitSmaller_equal_operator(MinamiKotoriParser.Smaller_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBigger_equal_operator(MinamiKotoriParser.Bigger_equal_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitShift_expression(MinamiKotoriParser.Shift_expressionContext ctx)
	{
		if (ctx.add_expression().size() == 1)
			return visit(ctx.add_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		ArrayList <String> value_list = new ArrayList<>();
		for (int i = 0; i < ctx.add_expression().size(); i++)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.add_expression(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			value_list.add(tmp.a);
		}
		return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$s0"));
		for (int i = 1; i < value_list.size(); i ++)
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$s1"));
			String instruction_type = "";
			if (ctx.shift_operators(i - 1).lshift_operator() != null)
				instruction_type = "shl";
			if (ctx.shift_operators(i - 1).rshift_operator() != null)
				instruction_type = "shr";
			return_list.b.a.add(new Instruction(instruction_type, "$s0", "$s1", "$s0"));
		}
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitShift_operators(MinamiKotoriParser.Shift_operatorsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitLshift_operator(MinamiKotoriParser.Lshift_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitRshift_operator(MinamiKotoriParser.Rshift_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitAdd_expression(MinamiKotoriParser.Add_expressionContext ctx)
	{
		if (ctx.multiply_expression().size() == 1)
			return visit(ctx.multiply_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		ArrayList <String> value_list = new ArrayList<>();
		for (int i = 0; i < ctx.multiply_expression().size(); i++)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.multiply_expression(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			value_list.add(tmp.a);
		}
		Type return_type = checker.visit(ctx.multiply_expression(0)).get(0).a;
		if (return_type.equal(symbol_table.INT))
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$s0"));
			for (int i = 1; i < ctx.multiply_expression().size(); i ++)
			{
				return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$s1"));
				String instruction_type = "";
				if (ctx.add_operators(i - 1).plus_operator() != null)
					instruction_type = "add";
				if (ctx.add_operators(i - 1).minus_operator() != null)
					instruction_type = "sub";
				return_list.b.a.add(new Instruction(instruction_type, "$s0", "$s1", "$s0"));
			}
			return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		}
		else
		{
			return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$a0"));
			for (int i = 1; i < ctx.multiply_expression().size(); i ++)
			{
				return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$a1"));
				ArrayList <String> parameters = new ArrayList<>();
				parameters.add("$a0");
				parameters.add("$a1");
				return_list.b.a.add(new Instruction("call", "func__stringConcatenate", parameters, "$v0", temporary_variable_counter));
				return_list.b.a.add(new Instruction("move", "$v0", "$a0"));
			}
			return_list.b.a.add(new Instruction("store", 4, return_list.a, "$a0"));
		}
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitAdd_operators(MinamiKotoriParser.Add_operatorsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitPlus_operator(MinamiKotoriParser.Plus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitMinus_operator(MinamiKotoriParser.Minus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitMultiply_expression(MinamiKotoriParser.Multiply_expressionContext ctx)
	{
		if (ctx.unary_expression().size() == 1)
			return visit(ctx.unary_expression(0));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		ArrayList <String> value_list = new ArrayList<>();
		for (int i = 0; i < ctx.unary_expression().size(); i++)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.unary_expression(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
			value_list.add(tmp.a);
		}
		return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$s0"));
		for (int i = 1; i < ctx.unary_expression().size(); i ++)
		{
			String instruction_type = "";
			if (ctx.multiply_operators(i - 1).multiply_operator() != null)
				instruction_type = "mul";
			if (ctx.multiply_operators(i - 1).divide_operator() != null)
				instruction_type = "div";
			if (ctx.multiply_operators(i - 1).mod_operator() != null)
				instruction_type = "rem";
			return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$s1"));
			return_list.b.a.add(new Instruction(instruction_type, "$s0", "$s1", "$s0"));
		}
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitMultiply_operators(MinamiKotoriParser.Multiply_operatorsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitMultiply_operator(MinamiKotoriParser.Multiply_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitDivide_operator(MinamiKotoriParser.Divide_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitMod_operator(MinamiKotoriParser.Mod_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitUnary_expression(MinamiKotoriParser.Unary_expressionContext ctx)
	{
		if (ctx.unary_operator() == null)
			return visitChildren(ctx);
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.unary_expression());
		tmp.b.a.add(new Instruction("load", 4, tmp.a, "$s0"));
		if (ctx.unary_operator().not_sign_operator() != null)
			tmp.b.a.add(new Instruction("seq", "$s0", 0, "$s0"));
		if (ctx.unary_operator().bitwise_not_operator() != null)
			tmp.b.a.add(new Instruction("not", "$s0", "$s0"));
		if (ctx.unary_operator().minus_operator() != null)
			tmp.b.a.add(new Instruction("neg", "$s0", "$s0"));
		if (ctx.unary_operator().plusplus_operator() != null)
			tmp.b.a.add(new Instruction("add", "$s0", 1, "$s0"));
		if (ctx.unary_operator().minusminus_operator() != null)
			tmp.b.a.add(new Instruction("sub", "$s0", 1, "$s0"));
		tmp.b.a.add(new Instruction("store", 4, tmp.a, "$s0"));
		return tmp;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitPostfix_expression(MinamiKotoriParser.Postfix_expressionContext ctx)
	{
		if (ctx.postfix().size() == 0)
			return visit(ctx.primary_expression());
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> left = visit(ctx.primary_expression());
		return_list.b.a.addAll(left.b.a);
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		Type now = checker.visit(ctx.primary_expression()).get(0).a;
		if (now.equal(symbol_table.INT) || now.equal(symbol_table.BOOL))
		{
			return_list.b.a.add(new Instruction("move", left.a, "$s0"));
			return_list.b.a.add(new Instruction("move", "$s0", return_list.a));
		}
		else
		{
			return_list.b.a.add(new Instruction("load", 4, left.a, "$s0"));
			return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		}
		return_list.b.b.addAll(left.b.b);
		for (int i = 0; i < ctx.postfix().size(); i ++)
		{
			if (ctx.postfix(i).Left_square_bracket() != null)
			{
				Type temp = now;
				now = new Type();
				now.name = temp.name;
				now.type = temp.type;
				now.type_name = temp.type_name;
				now.members = temp.members;
				now.dim = temp.dim - 1;
				Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.postfix(i).expression());
				return_list.b.a.addAll(tmp.b.a);
				return_list.b.b.addAll(tmp.b.b);
				return_list.b.a.add(new Instruction("load", 4, return_list.a, "$s0"));
				return_list.b.a.add(new Instruction("load", 4, tmp.a, "$s1"));
				if (now.dim == 0 && now.members != null)
					return_list.b.a.add(new Instruction("mul", "$s1", now.members.size(), "$s1"));
				return_list.b.a.add(new Instruction("mul", "$s1", 4, "$s1"));
				return_list.b.a.add(new Instruction("add", "$s0", "$s1", "$s0"));
				return_list.b.a.add(new Instruction("move", "$s0", return_list.a));
			}
			if (ctx.postfix(i).get_member_operator() != null)
			{
				if (ctx.postfix(i).function_call_expression() == null)
				{
					int offset = now.type_name.members.get(Name.getSymbolName(ctx.postfix(i).Identifier().getText())).number_in_class * 4;
					now = now.type_name.members.get(Name.getSymbolName(ctx.postfix(i).Identifier().getText()));
					return_list.b.a.add(new Instruction("load", 4, return_list.a, "$s0"));
					return_list.b.a.add(new Instruction("add", "$s0", offset, "$s0"));
					return_list.b.a.add(new Instruction("move", "$s0", return_list.a));
				}
				else
				{
					if (ctx.postfix(i).function_call_expression().Identifier().getText().equals("size"))
					{
						now = symbol_table.INT;
						ArrayList <String> parameters = new ArrayList<>();
						return_list.b.a.add(new Instruction("load", 4, return_list.a, "$a0"));
						parameters.add("$a0");
						return_list.b.a.add(new Instruction("call", "func__array.size", parameters, "$v0", temporary_variable_counter));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, "$v0"));
						//parameter is the pointer of the array
					}
					if (ctx.postfix(i).function_call_expression().Identifier().getText().equals("length"))
					{
						now = symbol_table.INT;
						ArrayList <String> parameters = new ArrayList<>();
						return_list.b.a.add(new Instruction("load", 4, return_list.a, "$a0"));
						parameters.add("$a0");
						return_list.b.a.add(new Instruction("call", "func__string.length", parameters, "$v0", temporary_variable_counter));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, "$v0"));
					}
					if (ctx.postfix(i).function_call_expression().Identifier().getText().equals("substring"))
					{
						now = symbol_table.STRING;
						ArrayList <String> value_list = new ArrayList<>();
						for (int j = 0; j < ctx.postfix(i).function_call_expression().arguments().assignment_expression().size(); j ++)
						{
							Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.postfix(i).function_call_expression().arguments().assignment_expression(j));
							return_list.b.a.addAll(tmp.b.a);
							return_list.b.b.addAll(tmp.b.b);
							value_list.add(tmp.a);
						}
						return_list.b.a.add(new Instruction("load", 4, return_list.a, "$a0"));
						return_list.b.a.add(new Instruction("load", 4, value_list.get(0), "$a1"));
						return_list.b.a.add(new Instruction("load", 4, value_list.get(1), "$a2"));
						ArrayList <String> parameters = new ArrayList<>();
						parameters.add("$a0");
						parameters.add("$a1");
						parameters.add("$a2");
						return_list.b.a.add(new Instruction("call", "func__string.substring", parameters, "$v0", temporary_variable_counter));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, "$v0"));
					}
					if (ctx.postfix(i).function_call_expression().Identifier().getText().equals("parseInt"))
					{
						now = symbol_table.INT;
						ArrayList <String> parameters = new ArrayList<>();
						return_list.b.a.add(new Instruction("load", 4, return_list.a, "$a0"));
						parameters.add("$a0");
						return_list.b.a.add(new Instruction("call", "func__string.parseInt", parameters, "$v0", temporary_variable_counter));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, "$v0"));
					}
					if (ctx.postfix(i).function_call_expression().Identifier().getText().equals("ord"))
					{
						now = symbol_table.INT;
						Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> tmp = visit(ctx.postfix(i).function_call_expression().arguments().assignment_expression(0));
						return_list.b.a.addAll(tmp.b.a);
						return_list.b.b.addAll(tmp.b.b);
						return_list.b.a.add(new Instruction("load", 4, return_list.a, "$a0"));
						return_list.b.a.add(new Instruction("load", 4, tmp.a, "$a1"));
						ArrayList <String> parameters = new ArrayList<>();
						parameters.add("$a0");
						parameters.add("$a1");
						return_list.b.a.add(new Instruction("call", "func__string.ord", parameters, "$v0", temporary_variable_counter));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
						return_list.b.a.add(new Instruction("store", 4, return_list.a, "$v0"));
					}
				}
			}
			if (ctx.postfix(i).plusplus_operator() != null)
			{
				return_list.b.b.add(new Instruction("load", 4, return_list.a, "$s0"));
				return_list.b.b.add(new Instruction("add", "$s0", 1, "$s0"));
				return_list.b.b.add(new Instruction("store", 4, return_list.a, "$s0"));
			}
			if (ctx.postfix(i).minusminus_operator() != null)
			{
				return_list.b.b.add(new Instruction("load", 4, return_list.a, "$s0"));
				return_list.b.b.add(new Instruction("sub", "$s0", 1, "$s0"));
				return_list.b.b.add(new Instruction("store", 4, return_list.a, "$s0"));
			}
		}
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitPrimary_expression(MinamiKotoriParser.Primary_expressionContext ctx)
	{
		if (ctx.constant() != null)
			return visit(ctx.constant());
		if (ctx.expression() != null)
			return visit(ctx.expression());
		if (ctx.function_call_expression() != null)
			return visit(ctx.function_call_expression());
		Type now_type = symbol_table.get(Name.getSymbolName(ctx.Identifier().getText()));
		return new Pair<>(now_type.register_id, new Pair<>(new ArrayList<>(), new ArrayList<>()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitConstant(MinamiKotoriParser.ConstantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitInteger_constant(MinamiKotoriParser.Integer_constantContext ctx)
	{
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		return_list.b.a.add(new Instruction("move", Integer.valueOf(ctx.getText()), "$s0"));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitString_constant(MinamiKotoriParser.String_constantContext ctx)
	{
		String value = ctx.getText();
		value = value.substring(1, value.length() - 1);
		String tmp = "";
		char[] value_char = value.toCharArray();
		for (int i = 0; i < value.length(); i ++)
			if (value_char[i] == '\\')
			{
				if (value_char[i + 1] == 'n')
					tmp += '\n';
				else if (value_char[i + 1] == '\\')
					tmp += '\\';
				else if (value_char[i + 1] == '"')
					tmp += '"';
				i ++;
			}
			else
				tmp += value_char[i];
		value = tmp;
		value_char = value.toCharArray();
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list;
		if (string_constant.get(value) != null)
		{
			return_list = new Pair<>(string_constant.get(value), new Pair<>(new ArrayList<>(), new ArrayList<>()));
			return return_list;
		}
		return_list = new Pair<>("$g_" + (global_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$g_" + (global_variable_counter ++).toString()));
		string_constant.put(value, return_list.a);
		ArrayList <Integer> value_ascii = new ArrayList<>();
		for (int i = 0; i < value.length(); i ++)
			value_ascii.add((int)value_char[i]);
		int length = value.length() + 5;
		return_list.b.a.add(new Instruction("move", length, "$s0"));
		return_list.b.a.add(new Instruction("alloc", "$s0", "$v0"));
		return_list.b.a.add(new Instruction("move", value.length(), "$s0"));
		return_list.b.a.add(new Instruction("store", 4, "$v0", "$s0"));
		return_list.b.a.add(new Instruction("add", "$v0", 4, "$v0"));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$v0"));
		for (int i = 0; i < value.length(); i ++)
		{
			return_list.b.a.add(new Instruction("move", value_ascii.get(i), "$s0"));
			return_list.b.a.add(new Instruction("store", 1, "$v0", "$s0"));
			return_list.b.a.add(new Instruction("add", "$v0", 1, "$v0"));
		}
		return_list.b.a.add(new Instruction("move", 0, "$s0"));
		return_list.b.a.add(new Instruction("store", 1, "$v0", "$s0"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitPostfix(MinamiKotoriParser.PostfixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitGet_member_operator(MinamiKotoriParser.Get_member_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitPlusplus_operator(MinamiKotoriParser.Plusplus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitMinusminus_operator(MinamiKotoriParser.Minusminus_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitUnary_operator(MinamiKotoriParser.Unary_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitNot_sign_operator(MinamiKotoriParser.Not_sign_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBitwise_not_operator(MinamiKotoriParser.Bitwise_not_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitExpression(MinamiKotoriParser.ExpressionContext ctx)
	{
		ArrayList <Instruction> instruction_list = new ArrayList<>();
		String return_register = "";
		for (int i = 0; i < ctx.assignment_expression().size(); i ++)
		{
			Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.assignment_expression(i));
			instruction_list.addAll(tmp.b.a);
			if (i == ctx.assignment_expression().size() - 1)
				return_register = tmp.a;
			instruction_list.addAll(tmp.b.b);
		}
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(return_register, new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.addAll(instruction_list);
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitFunction_call_expression(MinamiKotoriParser.Function_call_expressionContext ctx)
	{
		String function_name = ctx.Identifier().getText();
		Type function_type = symbol_table.get(Name.getSymbolName(function_name));
		String true_function_name = get_function_name(function_name);
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list;
		if (function_type.return_type.equal(symbol_table.VOID))
			return_list = new Pair <>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
		else
		{
			return_list = new Pair<>(variable_prefix + (temporary_variable_counter++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
			return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter++).toString()));
		}
		ArrayList <String> value_list = new ArrayList<>();
		ArrayList <String> parameters = new ArrayList<>();
		if (!function_name.equals(true_function_name))
		{
			if (ctx.arguments() != null)
			{
				for (int i = 0; i < ctx.arguments().assignment_expression().size(); i ++)
				{
					Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.arguments().assignment_expression(i));
					return_list.b.a.addAll(tmp.b.a);
					return_list.b.b.addAll(tmp.b.b);
					value_list.add(tmp.a);
				}
			}
			for (int i = 0; i < value_list.size(); i ++)
			{
				return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$a" + Integer.toString(i)));
				parameters.add("$a" + Integer.toString(i));
			}
		}
		else if (function_type.parameters.size() <= 8)
		{
			ArrayList <String> now_parameters_list = new ArrayList<>();
			ArrayList <Boolean> is_equal_list = new ArrayList<>();
			if (ctx.arguments() != null)
			{
				for (int i = 0; i < ctx.arguments().assignment_expression().size(); i ++)
				{
					String name = ctx.arguments().assignment_expression(i).getText();
					now_parameters_list.add(name);
					boolean is_equal = true;
					if (!is_identifier(name))
						is_equal = false;
					if (last_parameters_list.size() < i + 1 || !last_parameters_list.get(i).equals(name))
						is_equal = false;
					is_equal_list.add(is_equal);
					if (is_equal)
					{
						value_list.add("");
						continue;
					}
					Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.arguments().assignment_expression(i));
					return_list.b.a.addAll(tmp.b.a);
					return_list.b.b.addAll(tmp.b.b);
					value_list.add(tmp.a);
				}
				last_parameters_list = now_parameters_list;
			}
			for (int i = 0; i < value_list.size(); i ++)
			{
				if (!is_equal_list.get(i))
					return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$t" + Integer.toString(i)));
				parameters.add("$t" + Integer.toString(i));
			}
			true_function_name = "func_" + true_function_name;
		}
		else
		{
			if (ctx.arguments() != null)
			{
				for (int i = 0; i < ctx.arguments().assignment_expression().size(); i ++)
				{
					Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.arguments().assignment_expression(i));
					return_list.b.a.addAll(tmp.b.a);
					return_list.b.b.addAll(tmp.b.b);
					value_list.add(tmp.a);
				}
			}
			for (int i = 0; i < value_list.size(); i ++)
			{
				String new_register_id = variable_prefix + (temporary_variable_counter ++).toString();
				return_list.b.a.add(new Instruction("load", 4, value_list.get(i), "$s0"));
				return_list.b.a.add(new Instruction("move", "$s0", new_register_id));
				parameters.add(new_register_id);
			}
			true_function_name = "func_" + true_function_name;
		}
		return_list.b.a.add(new Instruction("call", true_function_name, parameters, "$v0", temporary_variable_counter));
		if (!function_type.return_type.equal(symbol_table.VOID))
			return_list.b.a.add(new Instruction("store", 4, return_list.a, "$v0"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitArguments(MinamiKotoriParser.ArgumentsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitNew_operation(MinamiKotoriParser.New_operationContext ctx)
	{
		if (ctx.class_new_type() != null)
		{
			Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
			return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
			Type class_type = symbol_table.get(Name.getSymbolName(ctx.class_new_type().getText()));
			return_list.b.a.add(new Instruction("alloc", class_type.members.size() * 4, "$s0"));
			return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
			return return_list;
		}
		else
			return visit(ctx.array_new_type());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitArray_new_type(MinamiKotoriParser.Array_new_typeContext ctx)
	{
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.expression(0));
		return_list.b.a.addAll(tmp.b.a);
		return_list.b.a.add(new Instruction("load", 4, tmp.a, "$s0"));
		return_list.b.a.add(new Instruction("move", "$s0", "$s1"));
		return_list.b.a.addAll(tmp.b.b);
		if (ctx.Left_square_bracket().size() == ctx.expression().size())
		{
			Type type = checker.visit(ctx.non_array_type()).get(0).a;
			if (type.members != null)
				return_list.b.a.add(new Instruction("mul", "$s0", type.members.size() * 4, "$s0"));
			else
				return_list.b.a.add(new Instruction("mul", "$s0", 4, "$s0"));
		}
		else
			return_list.b.a.add(new Instruction("mul", "$s0", 4, "$s0"));
		return_list.b.a.add(new Instruction("add", "$s0", 4, "$s0"));
		return_list.b.a.add(new Instruction("alloc", "$s0", "$s2"));
		return_list.b.a.add(new Instruction("store", 4, "$s2", "$s1"));
		return_list.b.a.add(new Instruction("add", "$s2", 4, "$s2"));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s2"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitClass_new_type(MinamiKotoriParser.Class_new_typeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBuiltin_constant(MinamiKotoriParser.Builtin_constantContext ctx)
	{
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>(variable_prefix + (temporary_variable_counter ++).toString(), new Pair<>(new ArrayList<>(), new ArrayList<>()));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, variable_prefix + (temporary_variable_counter ++).toString()));
		if (Objects.equals(ctx.getText(), "true"))
			return_list.b.a.add(new Instruction("move", 1, "$s0"));
		else
			return_list.b.a.add(new Instruction("move", 0, "$s0"));
		return_list.b.a.add(new Instruction("store", 4, return_list.a, "$s0"));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitFunction_definition(MinamiKotoriParser.Function_definitionContext ctx)
	{
		symbol_table.begin_scope();
		Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> return_list = new Pair<>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
		ArrayList<String> parameters = new ArrayList<>();
		Type function_type = symbol_table.get(Name.getSymbolName(ctx.Identifier().getText()));
		for (int i = 0; i < function_type.parameters.size(); i++)
		{
			String register_id = variable_prefix + (temporary_variable_counter ++).toString();
			parameters.add(register_id);
			function_type.parameters.get(i).register_id = register_id;
		}
		temporary_variable_counter += 2;
		return_list.b.a.add(new Instruction("func", "func_" + ctx.Identifier().getText(), parameters));
		return_list.b.a.add(new Instruction("label", ctx.Identifier().getText() + "_start"));
		if (function_type.name.equals(Name.getSymbolName("main")))
			return_list.b.a.addAll(global_variable);
		if (function_type.parameters.size() <= 8)
		{
			for (int i = 0; i < function_type.parameters.size(); i ++)
			{
				String register_id = variable_prefix + (temporary_variable_counter ++).toString();
				return_list.b.a.add(new Instruction("store", 4, register_id, variable_prefix + (temporary_variable_counter ++).toString()));
				return_list.b.a.add(new Instruction("store", 4, "$s4", "$t" + Integer.toString(i)));
				function_type.parameters.get(i).register_id = register_id;
				symbol_table.put(function_type.parameters.get(i).name, function_type.parameters.get(i));
			}
		}
		else
		{
			for (int i = 0; i < function_type.parameters.size(); i++)
			{
				String register_id = variable_prefix + (temporary_variable_counter ++).toString();
				return_list.b.a.add(new Instruction("store", 4, register_id, variable_prefix + (temporary_variable_counter++).toString()));
				return_list.b.a.add(new Instruction("move", function_type.parameters.get(i).register_id, "$s0"));
				return_list.b.a.add(new Instruction("store", 4, "$s4", "$s0"));
				function_type.parameters.get(i).register_id = register_id;
				symbol_table.put(function_type.parameters.get(i).name, function_type.parameters.get(i));
			}
		}
		for (int i = 0; i < ctx.base_statement().size(); i++)
		{
			Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.base_statement(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.a.addAll(tmp.b.b);
		}
		return_list.b.a.add(new Instruction("func", "}"));
		symbol_table.end_scope();
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBase_statement(MinamiKotoriParser.Base_statementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitParameter_list(MinamiKotoriParser.Parameter_listContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitParameter(MinamiKotoriParser.ParameterContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitStatement(MinamiKotoriParser.StatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitAssignment_statement(MinamiKotoriParser.Assignment_statementContext ctx)
	{
		Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> return_list = visit(ctx.expression());
		return_list.b.a.addAll(return_list.b.b);
		return_list.b.b.clear();
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitCompound_statement(MinamiKotoriParser.Compound_statementContext ctx)
	{
		symbol_table.begin_scope();
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
		for (int i = 0; i < ctx.base_statement().size(); i ++)
		{
			Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.base_statement(i));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.b.addAll(tmp.b.b);
		}
		symbol_table.end_scope();
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitLoop_statement(MinamiKotoriParser.Loop_statementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitFor_loop_statement(MinamiKotoriParser.For_loop_statementContext ctx)
	{
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> return_list = new Pair<>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
		Integer for_id = for_counter ++;
		Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp;
		if (ctx.the_first_for_expression() != null)
		{
			tmp = visit(ctx.the_first_for_expression());
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.a.addAll(tmp.b.b);
		}
		return_list.b.a.add(new Instruction("jump", "for_judge_" + for_id.toString()));
		return_list.b.a.add(new Instruction("label", "for_judge_" + for_id.toString()));
		if (ctx.the_second_for_expression() != null)
		{
			tmp = visit(ctx.the_second_for_expression());
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.a.addAll(tmp.b.b);
			return_list.b.a.add(new Instruction("load", 4, tmp.a, "$s0"));
			return_list.b.a.add(new Instruction("br", "$s0", "for_start_" + for_id.toString(), "for_end_" + for_id.toString()));
		}
		else
			return_list.b.a.add(new Instruction("jump", "for_start_" + for_id.toString()));
		return_list.b.a.add(new Instruction("label", "for_start_" + for_id.toString()));
		break_list.add(new Pair<>("for", for_id));
		symbol_table.begin_scope();
		tmp = visit(ctx.statement());
		return_list.b.a.addAll(tmp.b.a);
		return_list.b.a.addAll(tmp.b.b);
		symbol_table.end_scope();
		break_list.remove(break_list.size() - 1);
		return_list.b.a.add(new Instruction("jump", "for_todo_" + for_id.toString()));
		return_list.b.a.add(new Instruction("label", "for_todo_" + for_id.toString()));
		if (ctx.the_third_for_expression() != null)
		{
			tmp = visit(ctx.the_third_for_expression());
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.a.addAll(tmp.b.b);
		}
		return_list.b.a.add(new Instruction("jump", "for_judge_" + for_id.toString()));
		return_list.b.a.add(new Instruction("label", "for_end_" + for_id.toString()));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitThe_first_for_expression(MinamiKotoriParser.The_first_for_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitThe_second_for_expression(MinamiKotoriParser.The_second_for_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitThe_third_for_expression(MinamiKotoriParser.The_third_for_expressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitWhile_loop_statement(MinamiKotoriParser.While_loop_statementContext ctx)
	{
		Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> return_list = new Pair<>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
		Integer while_id = while_counter ++;
		return_list.b.a.add(new Instruction("jump", "while_judge_" + while_id.toString()));
		Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp;
		return_list.b.a.add(new Instruction("label", "while_judge_" + while_id.toString()));
		tmp = visit(ctx.expression());
		return_list.b.a.addAll(tmp.b.a);
		return_list.b.a.addAll(tmp.b.b);
		return_list.b.a.add(new Instruction("load", 4, tmp.a, "$s0"));
		return_list.b.a.add(new Instruction("br", "$s0", "while_start_" + while_id.toString(), "while_end_" + while_id.toString()));
		return_list.b.a.add(new Instruction("label", "while_start_" + while_id.toString()));
		break_list.add(new Pair<>("while", while_id));
		symbol_table.begin_scope();
		tmp = visit(ctx.statement());
		return_list.b.a.addAll(tmp.b.a);
		return_list.b.a.addAll(tmp.b.b);
		symbol_table.end_scope();
		break_list.remove(break_list.size() - 1);
		return_list.b.a.add(new Instruction("jump", "while_judge_" + while_id.toString()));
		return_list.b.a.add(new Instruction("label", "while_end_" + while_id.toString()));
		return return_list;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitBranch_statement(MinamiKotoriParser.Branch_statementContext ctx)
	{
		if (ctx.if_statement() != null)
			return visit(ctx.if_statement());
		else
		{
			Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> return_list = new Pair<>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
			if (ctx.Return() != null)
			{
				if (ctx.expression() != null)
				{
					Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp = visit(ctx.expression());
					return_list.b.a.addAll(tmp.b.a);
					return_list.b.a.addAll(tmp.b.b);
					return_list.b.a.add(new Instruction("load", 4, tmp.a, "$v0"));
					return_list.b.a.add(new Instruction("ret", "$v0"));
				}
				else
					return_list.b.a.add(new Instruction("ret"));
			}
			if (ctx.Break() != null)
			{
				if (Objects.equals(break_list.get(break_list.size() - 1).a, "while"))
					return_list.b.a.add(new Instruction("jump", "while_end_" + break_list.get(break_list.size() - 1).b.toString()));
				else
					return_list.b.a.add(new Instruction("jump", "for_end_" + break_list.get(break_list.size() - 1).b.toString()));
			}
			if (ctx.Continue() != null)
			{
				if (Objects.equals(break_list.get(break_list.size() - 1).a, "while"))
					return_list.b.a.add(new Instruction("jump", "while_judge_" + break_list.get(break_list.size() - 1).b.toString()));
				else
					return_list.b.a.add(new Instruction("jump", "for_judge_" + break_list.get(break_list.size() - 1).b.toString()));
			}
			return return_list;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> visitIf_statement(MinamiKotoriParser.If_statementContext ctx)
	{
		Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> return_list = new Pair<>("", new Pair<>(new ArrayList<>(), new ArrayList<>()));
		Pair <String, Pair<ArrayList<Instruction>, ArrayList<Instruction>>> tmp;
		tmp = visit(ctx.expression());
		Integer if_id = if_counter ++;
		return_list.b.a.addAll(tmp.b.a);
		return_list.b.a.addAll(tmp.b.b);
		return_list.b.a.add(new Instruction("load", 4, tmp.a, "$s0"));
		return_list.b.a.add(new Instruction("br", "$s0", "if_true_" + if_id.toString(), "if_false_" + if_id.toString()));
		return_list.b.a.add(new Instruction("label", "if_true_" + if_id.toString()));
		symbol_table.begin_scope();
		tmp = visit(ctx.statement(0));
		return_list.b.a.addAll(tmp.b.a);
		return_list.b.a.addAll(tmp.b.b);
		symbol_table.end_scope();
		return_list.b.a.add(new Instruction("jump", "if_end_" + if_id.toString()));
		return_list.b.a.add(new Instruction("label", "if_false_" + if_id.toString()));
		if (ctx.Else() != null)
		{
			symbol_table.begin_scope();
			tmp = visit(ctx.statement(1));
			return_list.b.a.addAll(tmp.b.a);
			return_list.b.a.addAll(tmp.b.b);
			symbol_table.end_scope();
		}
		return_list.b.a.add(new Instruction("jump", "if_end_" + if_id.toString()));
		return_list.b.a.add(new Instruction("label", "if_end_" + if_id.toString()));
		return return_list;
	}
}