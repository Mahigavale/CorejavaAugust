package intermediatary_ops;

import java.util.List;
import java.util.Stack;

public class DistinctDemo {

	public static void main(String[] args) {
		List<Integer> list=new Stack<Integer>();
		
		
		list.add(23);
		list.add(34);
		list.add(11);
		list.add(11);
		list.add(34);
		list.add(23);
		list.add(67);
		list.add(67);
		
		System.out.println(list);
		System.out.println("Printing the Stream::::::");
		
		list.stream().distinct().forEach((i)->{System.out.println(i);});
		
	}
}

