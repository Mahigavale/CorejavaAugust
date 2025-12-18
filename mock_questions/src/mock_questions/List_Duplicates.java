package mock_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class List_Duplicates {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,10,23,34,56,70,70,70);
		//[10,70]
		
	
		List<Integer> list2=new ArrayList<Integer>();
	 
		
	 
	 for(int i=0;i<list.size();i++)
	 {
		 int counter=1;
		 int j=list.get(i);
		 for(int k=0;k<list.size();k++)
		 {
			if(list.get(k)==j)
			{
				counter++;
			}
			
			System.out.println(counter);
		 }
		 if(counter>2)
		 {
			 list2.add(j);
		 }
	 }
	 
	 System.out.println(list2);
	 
	 Set<Integer> set=new HashSet<Integer>();
	 
	 set.addAll(list2);
	 
	 System.out.println(set);
	}

}
