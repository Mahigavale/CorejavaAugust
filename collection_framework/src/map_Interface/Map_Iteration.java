package map_Interface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Iteration {

	public static void main(String[] args) {
		
		
		Map<Long, String> cities=new LinkedHashMap<Long, String>();
		
		cities.put(122234l, "Mumbai");
		cities.put(343434l,"Pune");
		cities.put(343435l, "Solapur");
		cities.put(565656l, "Bengaluru");
		
		
		
		System.out.println(cities.entrySet());
	
		for( Entry<Long, String> e: cities.entrySet())
		{
			 System.out.println(e.getKey());
			 System.out.println(e.getValue());
		}
		
		for ( long l:cities.keySet())
		{
			System.out.println(l);
		}
		
		for(String str:cities.values())
		{
			System.out.println(str);
		}
	}
}
