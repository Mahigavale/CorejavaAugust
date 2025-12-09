package collections_class;

import java.util.Arrays;
import java.util.List;

public class Second {

	
	public static boolean check(String str)
	{
		return str.startsWith("e");
	}
	public static void main(String[] args) {
	
		
		List<String> list=Arrays.asList("abc","cde,","efg","eoj");
		
		
		list.stream().filter(Second::check)
		.map(StringBuilder::new)
		.map(StringBuilder::reverse)
		.map(StringBuilder::toString)
		.map(String::toUpperCase)
		.map(String::length)
		.forEach(System.out::println);
		
		
		
		
	}

}
