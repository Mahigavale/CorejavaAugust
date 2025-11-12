package setif;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_One {
public static void main(String args[])
{
	
	
	LinkedHashSet<Integer> set=new LinkedHashSet<>();
	
	
	for(int i=0;i<10;i++)
	{
		set.add(i);
	}
	
	
 System.out.println(	set.reversed());
	
	set.add(null);
	
	set.add(null);
	System.out.println(set);

}
}
