package intermediatary_ops;

import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		List<Integer> numbers=new Vector<Integer>();
		
		// i>=400

	    
		/**
		 * foreach(Consumer)=>terminal.
		 * filter(Predicate)=> intermediatary.
		 */
		
		
		Consumer<Integer>cons=(i)->{System.out.println(i*2.5);};
		Predicate<Integer> pred=(i)->{return i>=120;};
		numbers.add(123);
		numbers.add(456);
		numbers.add(789);
		numbers.add(111);
	    numbers.add(120);
		
	    numbers.stream().filter(pred).forEach((i)->{System.out.println(i);});
	
	}

}

// IS-A Predicate.
class Greaterthan400  implements Predicate<Integer>
{

	 public boolean test(Integer i)
	 {
		 return i>400;
	 }
}
