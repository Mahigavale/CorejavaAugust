package method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Instance_2 {

	public static void main(String[] args) {
//	
//		String str="abc";
//		
//		
//		Function<String, String> fun=str::concat;
//		
//		Function<String, String> fun2=(i)->{return str.concat(i) ;};
//		
//		
//		System.out.println(fun.apply("demo"));
//		System.out.println(fun2.apply("demo"));
//
//		
//		
//		Predicate<String> pred=str::startsWith;
//		Predicate<String> pred2=(i)->(str.startsWith(i));
//		
//		
//		System.out.println("***************************************************");
//		List<String> list= Arrays.asList("abc","cde","fgh","ijk");
//		
//		
//		list.stream().map(StringBuilder::new)
//		.map(StringBuilder::reverse)
//		.map(StringBuilder::toString)
//		.map(String::toUpperCase)
//		.forEach(Demo::demo);
//		
//	
		Demo_1A d=new Demo_1A();
		
		
		Function<String, Integer> fun=d::ac;
		
		System.out.println(fun.apply("jdeed"));
		
		
		String str2="hello";
		
		Function<String, String> fun2=str2::concat;
		
		System.out.println(fun2.apply("Alexa"));
		
	}

}

class Demo_1A
{
	 public  Integer  ac(String s) {
		 return s.length();
	 }
}
