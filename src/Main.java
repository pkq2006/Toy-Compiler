import Parser.*;
import IR.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static Symbol_table symbol_table;
	static ArrayList <String> builtin_MIPS;

	static void get_builtin_MIPS_data() throws IOException
	{
		File input_file = new File("src/build_in_functions_data.s");
		InputStream inputstream = new FileInputStream(input_file);
		Scanner in = new Scanner(inputstream);
		builtin_MIPS.clear();
		while (in.hasNextLine())
			builtin_MIPS.add(in.nextLine());
	}

	static void get_builtin_MIPS_text() throws IOException
	{
		File input_file = new File("src/build_in_functions_text.s");
		InputStream inputstream = new FileInputStream(input_file);
		Scanner in = new Scanner(inputstream);
		builtin_MIPS.clear();
		while (in.hasNextLine())
			builtin_MIPS.add(in.nextLine());
	}

	static void compile_start(InputStream src) throws IOException
	{
		InputStreamReader source = new InputStreamReader(src);
		ANTLRInputStream input = new ANTLRInputStream(source);
		MinamiKotoriLexer lexer = new MinamiKotoriLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		MinamiKotoriParser parser = new MinamiKotoriParser(token);
		ParseTree parse_tree = parser.program();
		if (parser.getNumberOfSyntaxErrors() > 0)
			throw new RuntimeException("Syntax Error");
		Class_name_getter class_name_getter = new Class_name_getter();
		class_name_getter.symbol_table = symbol_table;
		class_name_getter.visit(parse_tree);
		Function_class_getter function_class_getter = new Function_class_getter();
		function_class_getter.symbol_table = symbol_table;
		function_class_getter.visit(parse_tree);
		{
			Type test = symbol_table.get(Name.getSymbolName("main"), new Pair<>(0, 0));
			if (test.return_type != symbol_table.INT)
				throw new RuntimeException("what the f**k?");
		}
		symbol_table.begin_scope();
		Checker checker = new Checker();
		checker.symbol_table = symbol_table;
		checker.visit(parse_tree);
		symbol_table.end_scope();
		IR_constructer constructer = new IR_constructer();
		constructer.symbol_table = symbol_table;
		constructer.checker = checker;
		Pair <String, Pair <ArrayList <Instruction>, ArrayList <Instruction>>> IR_list = constructer.visit(parse_tree);
		for (int i = 0; i < IR_list.b.a.size(); i ++)
			IR_list.b.a.get(i).print();
		ArrayList <String> MIPS = new ArrayList<>();
		get_builtin_MIPS_data();
		MIPS.addAll(builtin_MIPS);
		for (int i = 0; i < IR_list.b.a.size(); i ++)
		{
			if (IR_list.b.a.get(i).instruction_type.equals("func"))
			{
				ArrayList <Instruction> tmp = new ArrayList<>();
				for (int j = i; j < IR_list.b.a.size(); j ++)
				{
					tmp.add(IR_list.b.a.get(j));
					if (IR_list.b.a.get(j).instruction_type.equals("func") && IR_list.b.a.get(j).function_name == null)
					{
						i = j;
						break;
					}
				}
				Translate this_function = new Translate(tmp);
				MIPS.addAll(this_function.translate());
			}
		}
		get_builtin_MIPS_text();
		MIPS.addAll(builtin_MIPS);
		for (int i = 0; i < MIPS.size(); i ++)
			System.out.println(MIPS.get(i));
	}

	public static void main(String args[]) throws Exception
	{
		symbol_table = new Symbol_table();
		/*
		try
		{
			compile_start(System.in);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.exit(1);
		}
		System.exit(0);
		*/
		File input_file = new File("src/test.in");
		File output_file = new File("src/test.out");
		InputStream in = new FileInputStream(input_file);
		PrintStream out = new PrintStream(output_file);
		Instruction.out = out;
		compile_start(in);
	}
}