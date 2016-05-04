package IR;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Objects;
import java.io.*;

public class Instruction
{
	public String instruction_type;
	public String source1, source2, source3;
	public String target;
	public int offset;
	public String label;
	public static PrintStream out;

	//for function call
	public String function_name;
	ArrayList <String> parameters;

	//There must be target, but can be null
	Instruction(String Instruction_type, String Target)
	{
		instruction_type = Instruction_type;
		target = Target;
	}

	Instruction(String Instruction_type, Integer Source1, String Target)
	{
		instruction_type = Instruction_type;
		source1 = Source1.toString();
		target = Target;
	}

	Instruction(String Instruction_type, String Source1, String Target)
	{
		instruction_type = Instruction_type;
		source1 = Source1;
		target = Target;
	}

	Instruction(String Instruction_type, Integer Source1, String Source2, String Target)
	{
		instruction_type = Instruction_type;
		source1 = Source1.toString();
		source2 = Source2;
		target = Target;
	}

	Instruction(String Instruction_type, String Source1, Integer Source2, String Target)
	{
		instruction_type = Instruction_type;
		source1 = Source1;
		source2 = Source2.toString();
		target = Target;
	}

	Instruction(String Instruction_type, String Source1, String Source2, String Target)
	{
		instruction_type = Instruction_type;
		source1 = Source1;
		source2 = Source2;
		target = Target;
	}

	Instruction(String Instruction_type, Integer Source1, String Source2, Integer Target) //store imm
	{
		instruction_type = Instruction_type;
		source1 = Source1.toString();
		source2 = Source2;
		target = Target.toString();
	}

	Instruction(String Instruction_type, String Function_name, ArrayList <String> Parameters, String Target)
	//function_call
	{
		instruction_type = Instruction_type;
		function_name = Function_name;
		parameters = Parameters;
		target = Target;
	}

	Instruction(String Instruction_type, String Function_name, ArrayList <String> Parameters)
	//function_definition
	{
		instruction_type = Instruction_type;
		function_name = Function_name;
		parameters = Parameters;
	}

	public void print()
	{
		if (instruction_type.equals("func"))
		{
			if (function_name != null)
			{
				out.print("func " + function_name);
				for (int i = 0; i < parameters.size(); i ++)
					out.print(" " + parameters.get(i));
				out.println(" {");
			}
			else
				out.println("}");
		}
		else if (instruction_type.equals("label"))
			out.println("%" + target + ":");
		else if (instruction_type.equals("jump"))
			out.println("jump %" + target);
		else if (instruction_type.equals("br"))
			out.println("br " + source1 + " %" + source2 + " %" + target);
		else if (instruction_type.equals("call"))
		{
			if (target != null)
				out.print(target + " = ");
			out.print(instruction_type + " ");
			out.print(function_name + " ");
			for (int i = 0; i < parameters.size(); i ++)
			{
				if (i != 0)
					out.print(" ");
				out.print(parameters.get(i));
			}
			out.println("");
		}
		else if (instruction_type.equals("ret"))
			out.println(instruction_type + " " + target);
		else if (instruction_type.equals("store"))
			out.println(instruction_type + " " + source1 + " " + source2 + " " + target + " " + Integer.toString(offset));
		else if (instruction_type.equals("load"))
			out.println(target + " = " + instruction_type + " " + source1 + " " + source2 + " " + Integer.toString(offset));
		else
		{
			if (target != null)
				out.print(target + " = ");
			out.print(instruction_type + " ");
			if (source1 != null)
				out.print(source1 + " ");
			if (source2 != null)
				out.print(source2 + " ");
			if (source3 != null)
				out.print(source3 + " ");
			out.println("");
		}
	}
}