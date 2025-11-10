package setif;

import java.util.HashSet;
import java.util.Set;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="ABC";
		
		String str2=new String("ABC");
		
		Set<String> set=new HashSet<String>();
		
		set.add(str2);
		set.add(str);
		
		System.out.println(set.size());
	}

}

