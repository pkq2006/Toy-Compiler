package IR;

import java.util.ArrayList;

public class Translate
{
	public ArrayList <Instruction> IR_list;

	public Translate(ArrayList <Instruction> ir_list)
	{
		IR_list = ir_list;
	}

	public ArrayList <String> translate()
	{
		ArrayList <String> MIPS_list = new ArrayList<>();
		String function_name = IR_list.get(0).function_name;
		if (function_name.equals("main"))
		{}
		return MIPS_list;
	}
}
