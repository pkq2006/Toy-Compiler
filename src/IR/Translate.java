package IR;

import java.util.ArrayList;

public class Translate
{
	public ArrayList <Instruction> IR_list;
	public ArrayList <String> MIPS_list;

	Translate(ArrayList <Instruction> ir_list)
	{
		IR_list = ir_list;
	}

	public void translate()
	{
		MIPS_list = new ArrayList<>();
		String function_name = IR_list.get(0).function_name;
		if (function_name.equals("main"))
		{}
	}
}
