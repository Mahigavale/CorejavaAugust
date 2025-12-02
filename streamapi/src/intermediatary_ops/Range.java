package intermediatary_ops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Range {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//13,14,17,19,20=> 15,16,18
		
		
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(15);
		list.add(14);
		list.add(11);
		list.add(17);
		list.add(12);
      	list.add(25);
		list.add(19);
		
      
		Collections.sort(list);
		
		System.out.println(list);
	
		for(int i=list.get(0);i<=list.get(list.size()-1);i++)
		{

if(!list.contains(i))
{
	 System.out.println(i);
}

		}	

	}

}
