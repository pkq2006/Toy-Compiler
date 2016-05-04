package Parser;

import java.util.*;
import org.antlr.v4.runtime.misc.Pair;
import org.omg.CORBA.IMP_LIMIT;
import org.stringtemplate.v4.ST;

import javax.print.attribute.standard.MediaSize;

public class Symbol_table
{
    public int current_scope;
    public ArrayList <HashMap <Name, Type>> table;
	public Type BOOL, INT, STRING, VOID;
	public Type TRUE, FALSE, NULL;

    public Symbol_table()
    {
        current_scope = 0;
        table = new ArrayList <HashMap <Name, Type>> ();
        HashMap <Name, Type> tmp = new HashMap <Name, Type> ();

        //type: bool int string void

	    BOOL = new Type();
	    BOOL.type = "type";
	    BOOL.name = Name.getSymbolName("bool");
	    BOOL.type_name = BOOL;
	    tmp.put(BOOL.name, BOOL);

        INT = new Type();
        INT.type = "type";
	    INT.name = Name.getSymbolName("int");
	    INT.type_name = INT;
	    tmp.put(INT.name, INT);

	    STRING = new Type();
	    STRING.type = "type";
	    STRING.name = Name.getSymbolName("string");
	    STRING.type_name = STRING;
	    tmp.put(STRING.name, STRING);

	    VOID = new Type();
	    VOID.type = "type";
	    VOID.name = Name.getSymbolName("void");
	    VOID.type_name = VOID;
	    tmp.put(VOID.name, VOID);

	    //variable: true false null

	    TRUE = new Type();
	    TRUE.type = "variable";
	    TRUE.type_name = BOOL;
	    TRUE.name = Name.getSymbolName("true");
	    tmp.put(TRUE.name, TRUE);

	    FALSE = new Type();
	    FALSE.type = "variable";
	    FALSE.type_name = BOOL;
	    FALSE.name = Name.getSymbolName("false");
	    tmp.put(FALSE.name, FALSE);

	    NULL = new Type();
	    NULL.type = "variable";
	    NULL.name = Name.getSymbolName("null");
	    NULL.type_name = NULL;
	    tmp.put(NULL.name, NULL);

	    //function: print(string) println(string) getString() getInt() toString(int)

	    Type str = new Type();
	    str.type = "variable";
	    str.type_name = STRING;
	    str.name = Name.getSymbolName("str");

	    Type PRINT = new Type();
	    PRINT.type = "function";
	    PRINT.return_type = VOID;
	    PRINT.name = Name.getSymbolName("print");
	    PRINT.parameters = new ArrayList <Type> ();
	    PRINT.parameters.add(str);
	    tmp.put(PRINT.name, PRINT);

	    Type PRINTLN = new Type();
	    PRINTLN.type = "function";
	    PRINTLN.return_type = VOID;
	    PRINTLN.name = Name.getSymbolName("println");
	    PRINTLN.parameters = new ArrayList <Type> ();
	    PRINTLN.parameters.add(str);
	    tmp.put(PRINTLN.name, PRINTLN);

	    Type GETSTRING = new Type();
	    GETSTRING.type = "function";
	    GETSTRING.return_type = STRING;
	    GETSTRING.name = Name.getSymbolName("getString");
	    GETSTRING.parameters = new ArrayList<>();
	    tmp.put(GETSTRING.name, GETSTRING);

	    Type GETINT = new Type();
	    GETINT.type = "function";
	    GETINT.return_type = INT;
	    GETINT.name = Name.getSymbolName("getInt");
	    GETINT.parameters = new ArrayList<>();
	    tmp.put(GETINT.name, GETINT);

	    Type i = new Type();
	    i.type = "variable";
	    i.type_name = INT;
	    i.name = Name.getSymbolName("i");

	    Type TOSTRING = new Type();
	    TOSTRING.type = "function";
	    TOSTRING.return_type = STRING;
	    TOSTRING.name = Name.getSymbolName("toString");
	    TOSTRING.parameters = new ArrayList<>();
	    TOSTRING.parameters.add(i);
	    tmp.put(TOSTRING.name, TOSTRING);

	    table.add(tmp);
    }

    int find(Name id)
    {
        for (int i = current_scope; i >= 0; i --)
            if (table.get(i).get(id) != null)
                return i;
        return -1;
    }

    public void put(Name id, Type type, Pair <Integer, Integer> position)
    {
        int scope = find(id);
        if (scope == current_scope)
            throw new RuntimeException(position.a + " " + position.b);
        table.get(current_scope).put(id, type);
    }

	public void put(Name id, Type type)
	{
		table.get(current_scope).put(id, type);
	}

    public Type get(Name id, Pair <Integer, Integer> position)
    {
        int scope = find(id);
        if (scope == -1)
	        throw new RuntimeException(position.a + " " + position.b);
        return table.get(scope).get(id);
    }

	public Type get(Name id)
	{
		int scope = find(id);
		if (scope == -1)
			System.out.println(id.name);
		return table.get(scope).get(id);
	}

    public void begin_scope()
    {
        current_scope ++;
        table.add(new HashMap <Name, Type> ());
    }

    public void end_scope()
    {
        table.remove(current_scope);
        current_scope --;
    }

	public void print()
	{
		for (int i = 0; i <= current_scope; i ++)
		{
			Set <Map.Entry <Name, Type>> s = table.get(i).entrySet();
			for (Iterator <Map.Entry <Name, Type>> j = s.iterator(); j.hasNext(); )
			{
				Map.Entry <Name, Type> tmp = j.next();
				System.out.println(tmp.getKey().name);
			}
		}
	}
}