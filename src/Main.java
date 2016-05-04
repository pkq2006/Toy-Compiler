import Parser.*;
import IR.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;

public class Main
{
	static Symbol_table symbol_table;

	public static void compile_start(InputStream src) throws IOException
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