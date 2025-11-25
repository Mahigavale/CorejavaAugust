package fifs;

import java.util.function.Function;

public class Function_2 {

	public static void main(String[] args) {

		// 12 (Integer>)=> 12.0(Double)
		Function<Integer, Double> fun=(t)->{
			System.out.println("After");
			return Double.valueOf(t);};
		
		//"12"(String)=> 12 (Integer)
		Function<String, Integer> fun2=(t)->{
			System.out.println("Before");
			return Integer.parseInt(t);};
		                             //after.compose(before);
		 Function<String, Double> fun3=fun.compose(fun2);
		 
		 System.out.println(fun3.apply("12"));
	}
}
