package method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class demo_37 {

	public static void main(String[] args) {
		
		/**
		 * "16","25","169","400"
		 * 
		 * 
		 */
		
		List<String> list=Arrays.asList("16","25","169","400");
		
		
		Function<String, Integer> fun=(i)->(i.length());
		
		
	  list.stream().map(String::length)
	  .map(Math::sqrt)
	  .forEach(System.out::println);
	  
	  Function<String, Integer> fun2=(i)->(Integer.parseInt(i));
	  
	  list.stream().map(Double::parseDouble)
	  .map(Math::sqrt)
	  .forEach(System.out::println);
	  
	  
	  
	  StringBuilder sb=new StringBuilder("hello");
	  
	  List<String> list2=Arrays.asList("abc","ced","edked");
	  
	  list2.stream().map(StringBuilder::new)
	  .map(StringBuilder::reverse)
	  .map(StringBuilder::toString)
	  .map(String::toUpperCase)
	  .map(StringBuilder::new)
	  .map(sb::append)
	  .forEach(System.out::println);
	  
	  
	}

}
