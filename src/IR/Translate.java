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
		MIPS_list.addAll(IR_list.get(0).translate());
		if (function_name.equals("main"))
		{
			MIPS_list.add("li $v0, 9");
			MIPS_list.add("li $a0, 32768");
			MIPS_list.add("syscall");
			MIPS_list.add("move $t9, $v0");
		}
		for (int i = 1; i < IR_list.size(); i ++)
			MIPS_list.addAll(IR_list.get(i).translate());
		return MIPS_list;
	}
}
