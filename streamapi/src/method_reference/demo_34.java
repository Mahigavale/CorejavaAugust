package method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class demo_34 {	
	
	public static void main(String[] args) {
		
		String str="abc";
//		
//		//str.indexOf(str)
//		
//		
//		Function<String, Integer> fun=str::indexOf;
//		
//System.out.println(fun.apply("a"));
		
		
				
		
		
		List<String> names=Arrays.asList("abc","cderg","djdoejek",""," ","AEDCe");		
	    names.stream().map(String::toUpperCase).forEach(System.out::println);

	}

}

