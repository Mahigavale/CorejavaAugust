package queueif;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class First {

	public static void main(String[] args) {
	
		
		
//		Queue<Truck> q=new ArrayDeque(11);
//		
//		
//		 //1,7,5
//		
//		q.add(new Truck(1,23.56));
//		q.add(new Truck(1,78.89));
//		q.add(new Truck(7,56.78));
//		q.add(new Truck(5,89.89));
//		q.add(new Truck(6, 90.90));
//		q.add(new Truck(11,89.88));
//		q.add(new Truck(23,76.67));
//		q.add(new Truck(8,76.67));
//		
//		System.out.println(q.size());
//		System.out.println(q);
//		
//		 System.out.println(q.poll());
//
//		 
//		
//		 System.out.println(q.poll());
//		 
//		 
//		 System.out.println(q.poll());
//		 
//		 System.out.println(q.poll());
//		 System.out.println(q.poll());
//		 System.out.println(q.poll());
//		 System.out.println(q.poll());
//		 System.out.println(q);
		
		
		Queue<Integer> q=new ArrayDeque<Integer>();
		
//		for(int i=0;i<150;i++)
//		{
//			q.add(i);
//		}
//		
		
		q.add(23);
		q.add(22);
		q.add(12);
		q.add(11);
		q.add(35);
		System.out.println(q);
		
		System.out.println(q.poll());
	}

}

class Truck implements Comparable<Truck>
{

	
	
	public Truck(int id, double price)
	{
		this.id=id;
		this.price=price;
	}
	
	int id;
	double price;
	@Override
//	public int compareTo(Truck o) {
//		return Integer.compare(this.id, o.id);
//	}
	
	public String toString()
	{
		return this.id+" ";
	}
	@Override
	public int compareTo(Truck o) {
		return Integer.compare(o.id, this.id);
	}
}

class idComparator implements Comparator<Truck>
{

	@Override
	public int compare(Truck o1, Truck o2) {
		
		return Integer.compare(o2.id, o1.id);
	}
	
}