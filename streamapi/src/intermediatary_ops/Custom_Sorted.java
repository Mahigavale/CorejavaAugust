package intermediatary_ops;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Custom_Sorted {

	public static void main(String[] args) {

		
		/**
		 * Comparator >>>> Comparable
		 */
		
		
		/**
		 * Deque => Stack => LIFO
		 * Queue=> FIFO =>
		 */
		
	Deque<Plant>plants=new ArrayDeque<Plant>();
		
		 plants.add(new Plant(23.56,"Bhutya"));
		 plants.add(new Plant(89.98, "Kalpataru"));
		 plants.add(new Plant(56.67,"Naral"));
		 
		
		 
		 plants.stream().sorted(new treenamecomparator()).forEach((I)->{System.out.println(I);});
		 
		 
		 
	}
}



class Plant implements Comparable<Plant>
{
	double price;
	String name;
	public Plant (double price, String name)
	{
		this.price=price;
		this.name=name;
	}
	
	public String toString()
	{
		return this.price+" "+this.name;
	}

	@Override
	public int compareTo(Plant o) {
		
		return Double.compare(o.price, this.price);
	}
}

class treenamecomparator implements Comparator<Plant>
{

	@Override
	public int compare(Plant o1, Plant o2) {
		return Integer.compare(o2.name.length(), o1.name.length());
	}
	
}