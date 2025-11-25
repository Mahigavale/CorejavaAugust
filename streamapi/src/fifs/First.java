package fifs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		
		//Negate => reverse the result of the test method.
		// AND => works on the two predicates and has the logic of LOGICAL AND.
		//
		Predicate<Integer> pred=(i)->{return i<10;};
		Predicate<Integer> pred2=(j)->{return j>50;};
		
//		 Predicate<Integer> pred3=pred.and(pred2);
//		 
//		 System.out.println(pred3.test(51));
	  
		//OR=>works on the two predicates and has the logic of LOGICAL OR.
		
		
		Predicate<Integer>pred3=pred.or(pred2);
		
		System.out.println(pred3.test(51));
	
	 }
}

