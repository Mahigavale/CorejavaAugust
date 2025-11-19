package map_Interface;

import java.util.Hashtable;

public class Fourth {

	public static void main(String[] args) {
		
		
		Hashtable<Integer, String> table=new Hashtable<Integer, String>();
		
		
		table.put(1, "ABC");
		table.put(2, "DEF");
		table.put(3, "VaLUE  Default");
		System.out.println(table.getOrDefault(3, "DEFAULT VALUE"));
		
		System.out.println(table);
	}

}
