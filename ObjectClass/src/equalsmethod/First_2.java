package equalsmethod;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public class First_2 {

	public static void main(String[] args) {
	
		Bike kawasaki =new Bike();
		
		Bike Harley=new Bike();
		kawasaki.average=100;
		kawasaki.color="yellow";
		kawasaki.maxspeed=200;
		kawasaki.model="Ninja";
		
		Harley.average=100;
		Harley.color="yellow";
		Harley.maxspeed=200;
		Harley.model="Ninja"; 
		
		
//		for(int i=0;i<1000;i++)
//		{
//	System.out.println(kawasaki.equals(Harley));
//		}
//		
		
		
		 System.out.println(Harley.equals(null));
//		System.out.println(kawasaki.hashCode());
//		
//		System.out.println(Harley.hashCode());
//		


		/**
		 * Reflexitivity => 
		 */
	}
}

class Bike
{
	 String model;
	 int average;
	 int maxspeed;
	 String color;
	// LocalDateTime[] servicing;'
	
	 public boolean equals(Object object)
	 {
		 if(object==null)
		 {
			 return false;
		 }
		  Bike b1=(Bike)object;
		  
		  return this.maxspeed==b1.maxspeed && this.model==b1.model && this.average==b1.average && this.color.equals(b1.color);
	 }
	 public int hashCode()
	 {
		 return Objects.hash(model, average, maxspeed,color);
	 }
}