package misc2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Bifun {

	public static void main(String[] args) {
	
		//0,1,""
		
	
//		BiFunction<Integer, Double, String> bi=(i, j)->("*"+i+j); 
//		
//
//	 String st=bi.apply(23, 67.90);
//		
//	 System.out.println(st);
	 
	 
//	 
//	 BinaryOperator<String> bo=(s,s1)->(s+s1);
//	 
//	 
//	 
//	 System.out.println(bo.apply("null", "**"));
		
		
		
		List<Integer> list=Arrays.asList(2,3,4,5,6);
	
		
		
//	System.out.println(list.stream()
//			.filter((i)->(i%2==0))
//			.map((i)->(i*i)).reduce(0,Integer::sum));
		
	//i=10, j=5=>15
	//i=15,j=6 =>21
	//i=21 , j=7 =>28
	 
	
	List<Integer> list2=Arrays.asList();
	
	
	 System.out.println(list2.stream().reduce(10, Integer::sum));
	 
	}
}