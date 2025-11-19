package map_Interface;

import java.util.Enumeration;
import java.util.Hashtable;

public class Third {

	public static void main(String[] args) {
		
		
		Hashtable<String, Integer> table =new Hashtable<String, Integer>();
		
		table.put("one",1);
		table.put("two", 2);
		table.put("three", 29);
		
		
		System.out.println("**********");
		System.out.println(table.size());
		System.out.println("*******");
		Enumeration<Integer>  enm=table.elements();
		
		
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		
	 Enumeration<String> keys=	 table.keys();
	 
	 while(keys.hasMoreElements())
	 {
		 System.out.println(keys.nextElement());
	 }
	}
}
