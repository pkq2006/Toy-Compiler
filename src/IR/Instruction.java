package IR;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.io.*;

public class Instruction {
	public String instruction_type;
	public String source1, source2, source3;
	public String target;
	public int offset;
	public Integer register_num;
	public static PrintStream out;

	//for function call
	public String function_name;
	ArrayList<String> parameters;

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

	Instruction(String Instruction_type, String Function_name, ArrayList<String> Parameters, String Target, Integer Register_num)
	//function_call
	{
		instruction_type = Instruction_type;
		function_name = Function_name;
		parameters = Parameters;
		target = Target;
		register_num = Register_num;
	}

	Instruction(String Instruction_type, String Function_name, ArrayList<String> Parameters)
	//function_definition
	{
		instruction_type = Instruction_type;
		function_name = Function_name;
		parameters = Parameters;
	}

	Instruction(String Instruction_type)
	//return
	{
		instruction_type = Instruction_type;
	}

	boolean is_true_register(String register_id)
	{
		if (register_id.startsWith("$s") || register_id.startsWith("$v") || register_id.startsWith("$a") ||
				(register_id.startsWith("$t") && !register_id.startsWith("$t_")))
			return true;
		return false;
	}

	Integer get_variable_id(String variable)
	{
		char[] variable_char = variable.toCharArray();
		int ans = 0, base = 1;
		boolean is_neg = false;
		for (int i = variable.length() - 1; i >= 0; i --)
		{
			if (variable_char[i] < '0' || variable_char[i] > '9')
			{
				if (variable_char[i] == '-')
					is_neg = true;
				break;
			}
			ans += (variable_char[i] - '0') * base;
			base *= 10;
		}
		if (is_neg)
			ans *= -1;
		return ans;
	}

	String get_true_address(String variable)
	{
		String ans;
		Integer variable_id = get_variable_id(variable);
		variable_id *= 4;
		if (variable.startsWith("$g"))
			ans = variable_id.toString() + "(" + "$t9" + ")";
		else
		{
			variable_id *= -1;
			ans = variable_id.toString() + "(" + "$sp" + ")";
		}
		return ans;
	}

	Pair <Integer, String> get_true_address_pair(String variable)
	{
		String ans;
		Integer variable_id = get_variable_id(variable);
		variable_id *= 4;
		String register;
		if (variable.startsWith("$g"))
			register = "$t9";
		else
		{
			variable_id *= -1;
			register = "$sp";
		}
		return new Pair<>(variable_id, register);
	}

	boolean is_number(String s)
	{
		char[] c = s.toCharArray();
		if (c[0] != '-' && (c[0] > '9' || c[0] < '0'))
			return false;
		for (int i = 1; i < s.length(); i ++)
			if (c[i] > '9' || c[i] < '0')
				return false;
		return true;
	}

	public ArrayList <String> translate()
	{
		ArrayList <String> ans = new ArrayList<>();
		switch (instruction_type)
		{
			case "ret":
				ans.add("lw $ra, -4($sp)");
				ans.add("lw $sp, 0($sp)");
				ans.add("jr $ra");
				break;
			case "jump":
				ans.add("j " + target);
				break;
			case "br":
				if (source2.startsWith("and"))
					ans.add("beqz " + source1 + ", " + target);
				else if (source2.startsWith("or"))
					ans.add("beq " + source1 + ", 1, " + source2);
				else if (source2.startsWith("for_start_"))
					ans.add("beqz " + source1 + ", " + target);
				else if (source2.startsWith("while_start_"))
					ans.add("beqz " + source1 + ", " + target);
				else if (source2.startsWith("if_true_"))
					ans.add("beqz " + source1 + ", " + target);
				break;
			case "store":
				if (source1.equals("4"))
				{
					if (is_true_register(target))
					{
						if (is_true_register(source2))
							ans.add("sw " + target + ", " + "(" + source2 + ")");
						else
						{
							ans.add("lw $s4, " + get_true_address(source2));
							ans.add("sw " + target + ", ($s4)");
						}
					}
					else
					{
						Pair <Integer, String> tmp = get_true_address_pair(target);
						assert (!is_true_register(source2));
						ans.add("addi $s4, " + tmp.b + ", " + tmp.a);
						ans.add("sw $s4, " + get_true_address(source2));
					}
				}
				else
					ans.add("sb " + target + ", " + "(" + source2 + ")");
				break;
			case "load":
				if (is_true_register(source2))
					ans.add("lw " + target + ", " + "(" + source2 + ")");
				else
				{
					ans.add("lw " + target + ", " + get_true_address(source2));
					ans.add("lw " + target + ", (" + target + ")");
				}
				break;
			case "alloc":
				if (is_true_register(source1))
					ans.add("move $a0, " + source1);
				else
					ans.add("li $a0, " + source1);
				ans.add("li $v0, 9");
				ans.add("syscall");
				if (is_true_register(target))
				{
					if (!target.equals("$v0"))
						ans.add("move " + target + ", $v0");
				}
				else
					ans.add("sw $v0, " + get_true_address(target));
				break;
			case "call":
				if (function_name.startsWith("func__"))
				{
					Integer tmp = -register_num * 4;
					ans.add("addi $sp, $sp, " + tmp.toString());
					ans.add("jal " + function_name);
					tmp *= -1;
					ans.add("addi $sp, $sp, " + tmp.toString());
				}
				else
				{
					Integer tmp = -register_num * 4;
					ans.add("sw $sp, " + tmp.toString() + "($sp)");
					ans.add("addi $sp, $sp, " + tmp.toString());
					ans.add("jal " + function_name);
				}
				break;
			case "move":
				if (is_true_register(target))
				{
					if (is_true_register(source1))
						ans.add("move " + target + ", " + source1);
					else if (is_number(source1))
						ans.add("li " + target + ", " + source1);
					else
					{
						ans.add("lw " + target + ", " + get_true_address(source1));
					}
				}
				else
					ans.add("sw " + source1 + ", " + get_true_address(target));
				break;
			case "neg":
				ans.add("neg " + target + ", " + source1);
				break;
			case "add":
				if (is_number(source2))
					ans.add("addi " + target + ", " + source1 + ", " + source2);
				else
					ans.add("add " + target + ", " + source1 + ", " + source2);
				break;
			case "sub":
				if (is_number(source2))
					ans.add("addi " + target + ", " + source1 + ", -" + source2);
				else
					ans.add("sub " + target + ", " + source1 + ", " + source2);
				break;
			case "mul":
				ans.add("mul " + target + ", " + source1 + ", " + source2);
				break;
			case "div":
				ans.add("div " + target + ", " + source1 + ", " + source2);
				break;
			case "rem":
				ans.add("rem " + target + ", " + source1 + ", " + source2);
				break;
			case "shl":
				ans.add("sll " + target + ", " + source1 + ", " + source2);
				break;
			case "shr":
				ans.add("srl " + target + ", " + source1 + ", " + source2);
				break;
			case "and":
				ans.add("and " + target + ", " + source1 + ", " + source2);
				break;
			case "xor":
				ans.add("xor " + target + ", " + source1 + ", " + source2);
				break;
			case "or":
				ans.add("or " + target + ", " + source1 + ", " + source2);
				break;
			case "not":
				ans.add("not " + target + ", " + source1 + ", " + source2);
				break;
			case "slt":
				ans.add("slt " + target + ", " + source1 + ", " + source2);
				break;
			case "sgt":
				ans.add("sgt " + target + ", " + source1 + ", " + source2);
				break;
			case "sle":
				ans.add("sle " + target + ", " + source1 + ", " + source2);
				break;
			case "sge":
				ans.add("sge " + target + ", " + source1 + ", " + source2);
				break;
			case "seq":
				ans.add("seq " + target + ", " + source1 + ", " + source2);
				break;
			case "sne":
				ans.add("sne " + target + ", " + source1 + ", " + source2);
				break;
			case "label":
				if (!target.endsWith("start"))
					ans.add(target + ":");
				break;
			case "func":
				if (function_name != null)
				{
					if (function_name.equals("func_main"))
						ans.add("main:");
					else
						ans.add(function_name + ":");
					ans.add("sw $ra, -4($sp)");
				}
				else
				{
					ans.add("lw $ra, -4($sp)");
					ans.add("lw $sp, 0($sp)");
					ans.add("jr $ra");
				}
				break;
			default:
				break;
		}
		return ans;
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
		{
			if (target != null)
				out.println(instruction_type + " " + target);
			else
				out.println(instruction_type);
		}
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