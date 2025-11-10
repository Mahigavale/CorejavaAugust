package listif;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timecomparison {

	public static void main(String[] args) {
		
		
		LinkedList<Laptop> list=new LinkedList();
		
		
		for(int i=1;i<=1000000;i++)
		{
			list.add(new Laptop(i,"a"+i,100.0+i,new int[] {12,34,56},"ab"+i));
		}
		long starttime=System.nanoTime();
	   list.remove(9);
		long endtime=System.nanoTime();
		long total_time=endtime-starttime;
		System.out.println(total_time);
		
		//44700,30500,30900 =>999000 (LL)
		//19100,14500,18600 => 999000 (AL)
		
		
		
		//469900,583500,629500 =>9 (AL)
		//24500,25200,21100 => 9 (LL)
		
		
	}

}
class  Laptop
{
	int id;
	String name;
	double price;
	int[] servicing;
	String model;
	
	public Laptop(int id, String name, double price,int[] servicing, String model)
	{
		this.id=id;
		this.model=model;
		this.price=price;
		this.servicing=servicing;
		this.name=name;
	}
}
