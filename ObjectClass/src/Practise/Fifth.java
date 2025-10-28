package Practise;

import java.util.Objects;

public class Fifth {

	public static void main(String args[])
	{
		
		
		Car_1 c1=new Car_1();
		
		c1.id=1;
		c1.name="a";
		c1.price=100.0;
		//System.out.println(c1.hashCode());
		
		Car_1 c2=new Car_1();
		c2.id=1;
		c2.name="a";
		c2.price=100.0;
		
		
		Car_2 c3=new Car_2();
		c3.id=1;
		c3.name="a";
		c3.price=100.0;
		c3.company="hyundai";
		
		//System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
//		StringBuilder sb=new StringBuilder("a");
//		
//		StringBuilder sb2=new StringBuilder("a");
//		
//		System.out.println(sb.equals(sb2));

		
	}
}


class Car_1 extends Object
{
	int id;
	String name ;
	double price;
	
//	public int hashCode()
//	{
//		return  Objects.hash(id,name,price);
//		
//	}
	
	public boolean equals(Object object)
	{
		/** 
		 * Write the logic in such a way that.
		 * return true only if,all the instance variables are same.
		 */
		//This , object
		/**
		 * Guard Clause 1
		 */
//		if(! (object instanceof Car_1) )
//		{
//			return false;
//		}
		
		/**
		 * Guard clause 2.
		 */
		if(object.getClass() != this.getClass())
		{
			return false;
		}
		Car_1 c2=(Car_1) object;
		
		return this.id==c2.id && this.price==c2.price && this.name.equals(c2.name);
		
		
		//return true;
	}
	
	
	
}

class Car_2
{
	int id;
	double price ;
	String name;
	String company;
}