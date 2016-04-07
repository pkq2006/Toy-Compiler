package Parser;

import java.util.Dictionary;
import java.util.Hashtable;

public class Name {
    String name;
    private static Dictionary<String, Name> dict = new Hashtable<String, Name> ();
    private Name(String text)
    {
	    name = text;
    }
    public static Name getSymbolName(String text) {
        String unique = text.intern();
        Name s = dict.get(unique);
        if (s == null) {
            s = new Name(unique);
            dict.put(unique, s);
        }
        return s;
    }
}