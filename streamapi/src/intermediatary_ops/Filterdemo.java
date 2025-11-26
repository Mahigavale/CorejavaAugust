package intermediatary_ops;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Filterdemo {

	public static void main(String[] args) {
		
		Set<String> pincodes=new HashSet<String>();
		
		
		pincodes.add("1234");
		pincodes.add("7789");
		pincodes.add("3344");
		pincodes.add("4343");
		pincodes.add("5321");
		
		// String => 4000
		pincodes.stream().filter((i)->{return Integer.parseInt(i)>4000;})
		.forEach((i)->{System.out.println(i.toUpperCase());});

	}

}
