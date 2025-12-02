package intermediatary_ops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Limitops {

	public static void main(String[] args) {
		
		
		
		List<Integer>  list=new ArrayList<Integer>();
		list.add(123);
		list.add(345);
		list.add(68);
		list.add(149);
		list.add(231);
		
		
		System.out.println(list);
		
		
		list.stream().sorted(new Integer_Comparator())
		.skip(1).limit(2)
		.forEach((i)->{System.out.println(i);});
		
	}
	
	}


class Integer_Comparator implements Comparator<Integer>
{

	
	public int compare(Integer o1, Integer o2) {
		
		return Integer.compare(o2, o1);
	}
	
}
