package intermediatary_ops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorted_method {

	public static void main(String[] args) {

		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(23);
		list.add(34);
		list.add(11);
		list.add(11);
		list.add(17);
		list.add(21);
		list.add(22);
		
		list.stream().sorted().forEach((i)->{System.out.println(i);});
	}
}

