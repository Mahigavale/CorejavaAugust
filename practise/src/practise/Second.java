package practise;
import java.util.List;
import java.util.Vector;

public class Second {

	public static void main(String[] args) throws InterruptedException {

		 Resource src=new Resource();
		 
		 One one=new One(src);
		 Two two=new Two(src);
		 
		 
		 one.start();
		 two.start();
		 
		 Thread.sleep(3000);
		 System.out.println(src.list);
	}
}


class Resource
{
	List<Integer> list=new Vector<Integer>();
	
	
	
	public void display()
	{
		  System.out.println(list);
	}
}


class One extends Thread
{
	Resource src;
	
	public One(Resource src)
	{
		 this.src=src;
	}
	
	public void run()
	{
		int i=1;
		while(i<501)
		{
			i++;
			src.list.add(i);
		}
	}
}
class Two extends Thread
{
	Resource src;
	
	public Two(Resource src)
	{
		this.src=src;
	}
	public void run()
	{
		int i=501;
		while(i<1001)
		{
			i++;
			src.list.add(i);
		}
	}
}