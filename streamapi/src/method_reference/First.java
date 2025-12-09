package method_reference;

import java.util.Comparator;
import java.util.TreeSet;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> tree=new TreeSet<Integer>((d1,d2)->{ return Integer.compare(d2, d1);});
		
		tree.add(23);
		tree.add(34);
		tree.add(234);
		tree.add(11);
		System.out.println(tree);
		
		
		

	}

}

class IntegerComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return Integer.compare(o1, o2);
	}
	
	
	public boolean equals(Object obj)
	{
		return true;
	}
}

class IntegerComparator2 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return Integer.compare(o1, o2);
	}
	
	
}
