package map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Second {

	public static void main(String[] args) {
		
		Map<Car, Integer> map=new HashMap<Car, Integer>();
		
		map.put(new Car(1,"Mustang",567.90),1);
		map.put(new Car(1,"Mustang",567.89), 2);
  
		
		System.out.println(map);
	}

}

class Car
{
	int id;
	String name;
	double price;
	public Car(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
	public String toString()
	{
		return this.id+" "+this.name+" "+this.price;
	}
	
	public int hashCode()
	{
		System.out.println("Calculating the hashcode......");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return Objects.hash(this.id,this.name,this.price);
	}
	
	public boolean equals(Object o)
	{
		Car car=(Car)o;
		
		System.out.println("Checking the Equals because hashCode found to be same....");
		return this.id==car.id && this.price==car.price && this.name.equals(car.name);
	}
}