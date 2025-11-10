package listif;

import java.util.ArrayList;
import java.util.List;

public class First {

	public static void main(String[] args) {
		
		
	//	List
		
		
		//15
		List<Integer> list=new ArrayList<Integer>();
		
		/**
		 * ArrayList=> resizeable array.
		 */
		
		System.out.println(list.size());
		list.add(7);
	    list.add(7);
	    list.add(7);
		list.add(1);
		list.add(2);
	   list.add(3);
	   list.add(4);
	   list.add(5);
	    list.add(6);
	    list.add(null);
	    list.add(null);
	    list.add(null);
	    System.out.println(list.size());
	    
		
		//[]=> dynamic 
//		//10=>7.5=>20=>15=>40
//		System.out.println(list);
//		System.out.println(list.size());
	}

}
