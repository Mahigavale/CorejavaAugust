package setif;

import java.util.HashSet;
import java.util.Set;

public class First {

	public static void main(String[] args) {
		
		/**
		 * Set => HashSet, LinkedAHashet, Treeset(SortedSet)
		 */
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(56);
		set.add(67);
		set.add(32);
		set.add(1);
		set.add(null);
		set.add("demo");
		
		System.out.println(set);
	}

}
