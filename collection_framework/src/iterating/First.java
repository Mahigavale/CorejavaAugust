package iterating;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class First {

	public static void main(String[] args) {
		
		
	
		Queue<Integer> set=new ArrayDeque<Integer>();
		
		
		for(int i=0;i<100;i++)
		{
			set.add(i);
		}
		
		
		Iterator<Integer> itr=set.iterator();
		
		while(itr.hasNext())
			
		{
			System.out.println(itr.next());
			System.out.println("*");
		}
		
	}
}
