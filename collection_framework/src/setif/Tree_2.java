package setif;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Tree_2 {

	public static void main(String[] args) {

		
	
		
		SortedSet<Car> cars=new TreeSet<Car>(new RatingsComparator());
		
		
		 cars.add(new Car(1,"Honda",9.0,56789.67,new int[] {1,2,3}));
		 cars.add(new Car(2,"Hyundai",9.7,87890.90,new int[] {1,2,3,4}));
		
	 System.out.println(cars.first());
	 System.out.println(cars.last());
	 
	 cars.ge
		 
		// cars.add(null);
		 System.out.println(cars.size());
		 
		 System.out.println(cars);
	}
}


class Car  implements Comparable<Car>
{
	int id;
	String name;
	double ratings;
	double price;
	int[] servicings;
	public Car(int id, String name, double ratings, double price, int[] servicings) {
		super();
		this.id = id;
		this.name = name;
		this.ratings = ratings;
		this.price = price;
		this.servicings = servicings;
	}
	
	
	public String toString()
	{
		return this.name;
	}


	@Override
	public int compareTo(Car o) {
		return Double.compare(o.ratings,this.ratings);
	}
	
	public int hashCode()
	{
		return 100;
	}
	public boolean equals(Object o)
	{
		return true;
	}
	
}


class PriceComparator implements Comparator<Car>
{

	
	public int compare(Car o1, Car o2) {
		 return Double.compare(o2.price, o1.price);
	}
	
}

class RatingsComparator implements Comparator<Car>
{

	@Override
	public int compare(Car o1, Car o2) {
		 return Double.compare(o1.ratings, o2.ratings);
	}
	
}