package collections_class;

import java.util.Deque;
import java.util.LinkedList;

public class Misc {

	public static void main(String[] args) {
	
		
		LinkedList<Pen> list=new LinkedList<Pen>();
		
		
		for(int i=0;i<10000000;i++)
		{
			 list.add(new Pen(12, 7890.09));
		}
		
		long start_time=System.nanoTime();
		 System.out.println(list.get(4999998));
		 long end_time=System.nanoTime();
		 
		 System.out.println("Time Taken:"+(end_time-start_time)/1000);
	}

}

class Pen
{
	int id;
	double price;
	public Pen(int id, double price)
	{
	this.id=id;
	this.price=price;
	}
}