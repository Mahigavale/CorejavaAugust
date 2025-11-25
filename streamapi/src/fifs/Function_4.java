package fifs;

import java.util.function.Function;

public class Function_4 {

	public static void main(String[] args) {
		
//		 Function<Integer, Double> fun1=(i)->{ return Double.valueOf(i);};
//			 
//		 
//		 Function<Double, String> fun2=(j)->{ return  j.toString();};
//	
//
//		
//		   Function<Integer, String> fun3=fun1.andThen(fun2);
//		   
//		   
//		   System.out.println(fun3.apply(10).length());
		
		

		 Function<Integer,Integer>fun=Function.identity();
		 
		 System.out.println(fun.apply(23));
	}
}
