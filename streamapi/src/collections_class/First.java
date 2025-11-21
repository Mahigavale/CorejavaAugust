package collections_class;

import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		  /**
		   * Lambda Expressions => Functional I/F.
		   */
	//()
		
			Addition<String> CAD=(i,j)->{ return i+j+"*"+"&&";};
			
		
			System.out.println(CAD.add("AB", "CD"));
//
//		Add_double addd=new Add_double();
//		System.out.println(add.add("34", "45"));
//		System.out.println(addd.add(12.0, 67.0));
}
}

@FunctionalInterface
interface Addition <T>
{
	public T add(T i, T j);
}
