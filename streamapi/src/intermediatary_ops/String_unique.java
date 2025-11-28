package intermediatary_ops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class String_unique {

	public static void main(String[] args) {
		
		/**
		 * "ababcdeeeffgggghi"
		 * "abcdefghi"
		 * "ihgfedcba"
		 * "IHGFEDCBA"
		 */
		
		String str="ababcdeeeffgggghi";
		
		char[] chars=str.toCharArray();
		
		List<Character> list=new ArrayList<Character>();
		
		for(Character c:chars)
		{
			list.add(c);
		}
		System.out.println(list);
		
		
		
		list.stream()
		.distinct().map((i)->{
		return i.toString().toUpperCase();
		}).sorted(new Stringreverse()).
		forEach((j)->{System.out.print(j);});
		
		
//		Function<Character, String> fun=new chartoString ();
//		
//		
//		System.out.println(fun.apply('t'));
	}

}

class chartoString implements Function<Character, String>
{

	@Override
	public String apply(Character t) {
		 StringBuffer sb=new StringBuffer(t);
		  System.out.println(sb.toString().toUpperCase());
		 return sb.toString().toUpperCase();
				 }
	
}

class Stringreverse implements Comparator<String>
{

	
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
}