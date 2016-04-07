package Parser;

import java.util.ArrayList;
import java.util.HashMap;

public class Type
{
    public Name name;
    public String type; //variable, function, type
    public Type type_name; //for variable and array
	public Type return_type; //for function
    public ArrayList <Type> parameters; //for function, parameters == null means it's not a function
    public Integer dim; //for array, dim > 0 means it's a array
    public ArrayList <Integer> dimension; //for array
    public HashMap <Name, Type> members; //for class, members == null means it's not a class

    Type()
    {
	    dim = 0;
    }

	boolean equal(Type b)
	{
		if (dim > 0)
			return type_name.equals(b.type_name) && dim == b.dim;
		if (name.name.equals("null") || b.name.name.equals("null"))
		{
			if (name.name.equals("int") || b.name.name.equals("int"))
				return false;
			if (name.name.equals("bool") || b.name.name.equals("bool"))
				return false;
			if (name.name.equals("string") || b.name.name.equals("string"))
				return false;
			return true;
		}
		return type_name == b.type_name;
	}
}