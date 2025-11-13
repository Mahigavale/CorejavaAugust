package queueif;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Second {

	public static void main(String[] args) {
		
		
		Queue<String> q1=new PriorityQueue<String>();
		
		
		q1.add("Z");
		q1.add("D");
		q1.add("B");
		q1.add("Y");
		q1.add("A");
		System.out.println(q1);
		
		
		q1.add("G");
		System.out.println(q1);
		
		 System.out.println(q1.poll());
		 System.out.println(q1);
		 
		 System.out.println(q1.poll());
		 System.out.println(q1);
	
		
	}

}
