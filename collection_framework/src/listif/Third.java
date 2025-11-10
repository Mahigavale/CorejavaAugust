package listif;

import java.util.ArrayList;
import java.util.List;

public class Third {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(23);
		list.add(45);
		list.add(56);
		list.add(123);
		
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		System.out.println(list.getFirst());
		
		//System.out.println(list.getLast());
		
		
		list.set(0, 1000);
		System.out.println(list.getFirst());
		
		
		System.out.println(list.isEmpty());
	
	
		
		System.out.println(list.contains(123));
	}

}
