package intermediatary_ops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Count_ops {

	public static void main(String[] args) {
		

//[1,2,3,4,5,4,3,4,6,7
		//3,4
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(6);
		//1,4
		
		Set<Integer> set=new HashSet<Integer>();

  
	
		for(int i=0;i<list.size();i++)
		{
			int counter=0;
			for(int j=0;j<list.size();j++)
			{
				if(list.get(j)==list.get(i))
				{
					counter++;
				}
			}
			if(counter>=2)
			{
				set.add(list.get(i));
				//System.out.println(list.get(i));
			}
			
		}
		System.out.println(set);
		
}
	

} 