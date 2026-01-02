package basic;

public class Lock_demo {

	public static void main(String[] args) throws InterruptedException {
		 Mutable_resource mt=new  Mutable_resource();
		 One_Thread one =new One_Thread(mt,"First Thread");
		 Two_Thread two=new Two_Thread(mt,"Second Thread");
		 One_Thread three=new One_Thread(mt,"third thread");
		 
		 one.start();
		 two.start();
		 three.start();
		 
		 
		 System.out.println(one.getName());
		 System.out.println(two.getName());
		 
		 
		 Thread.sleep(6000);
		 System.out.println(mt.getCounter());
	}
}

class Mutable_resource
{
	int counter=0;
	
	//final Object obj=new Object();
	   String increase()
	{
		  synchronized(this){
		  this.counter++;
		  }
		
		return "hello";
	}
	
	public int getCounter()
	{
		return this.counter;
	}
	
	public String getmessage()
	{
		 return "Hello brother@!";
	}
}
class One_Thread extends Thread
{

	Mutable_resource mt;
	public One_Thread(Mutable_resource mt, String name)
	{
		super(name);
		this.mt=mt;
	}
	
	public void run()
	{
		
		System.out.println(mt.getmessage());
		
		//System.out.println("Thread:"+this.getName()+"Locked the resource.");
		int num=1;
		//System.out.println(mt.getmessage());
		while(num<=10000)
		{
			
			mt.increase();
			num++;
			//System.out.println(this.getName()+"working on the resource...");
			
		}
		//System.out.println("Thread:"+this.getName()+"released lock...");
	}
}

class Two_Thread extends Thread
{
	Mutable_resource mt;
	public Two_Thread(Mutable_resource mt, String str)
	{
		super(str);
		this.mt=mt;
	}
	public void run()
	{
		System.out.println(mt.getmessage());
		
		//System.out.println("Thread:"+this.getName()+"Acquiring lock...");
		
	//	System.out.println(mt.getmessage()+this.getName());
		
		int num=1;
		
		
		while(num<=10000)
		{
			
			mt.increase();
			num++;
		//	System.out.println(this.getName()+"working on the resource");
		}
		//System.out.println("Thread:"+this.getName()+"released the lockkk...");
	}
}

