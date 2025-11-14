package iterating;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Third {

	public static void main(String[] args) {
	
		
		List<Integer> list2=new ArrayList<Integer>();
		
		
		
		for(int i=0;i<10;i++)
		{
			list2.add(i);
		}
	
	
		ListIterator<Integer> litr=list2.listIterator();
		
		
		while(litr.hasNext())
		{
			if(litr.next()==5)
			{
				litr.remove();
			}
			else
			{
				System.out.println(litr.next());
			}
		}
		System.out.println(list2);
	}

}
