package listif;

import java.util.ArrayList;
import java.util.List;

public class Second {

	public static void main (String args[])
	{
		
		List <Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<5;i++)
		{
			list.add(i+1);
		}
		
		list.add(67);
	//	System.out.println(list.size());
		
		System.out.println(list);
		list.remove(2)
;		System.out.println(list);
	//	System.out.println(list[4]);
	}
}


//constant time O(1);
//linear time O(n);
