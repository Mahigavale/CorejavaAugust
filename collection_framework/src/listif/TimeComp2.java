package listif;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeComp2 {

	public static void main(String[] args) {
	ArrayList<Laptop1> list=new ArrayList();
		
		
	long starttime=System.nanoTime();
	

		for(int i=1;i<=10000000;i++)
		{
			list.add(new Laptop1(i,"a"+i,100.0+i,new int[] {12,34,56},"ab"+i));
		}
		long endtime=System.nanoTime();
		long total_time=endtime-starttime;
		System.out.println(total_time);
	  
		
		//LL=> 1 Crore Laptops :2.744781100,2.652236800
		
		//AL=> 1 Crore Laptops: 1.075254000,1.070824700
		
	
	}

}


class  Laptop1
{
int id;
String name;
double price;
int[] servicing;
String model;

public Laptop1(int id, String name, double price,int[] servicing, String model)
{
this.id=id;
this.model=model;
this.price=price;
this.servicing=servicing;
this.name=name;
}
}
