package fifs;

import java.util.function.Function;

public class Function_1 {

	public static void main(String[] args) {
		
		
		Function<Integer, Double> fun=(t)->{return Double.valueOf(t);};
	
		
		 System.out.println(fun.apply(23).getClass());
		 System.out.println(fun.apply(23));
	}
}
