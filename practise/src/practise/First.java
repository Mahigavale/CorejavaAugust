package practise;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		Src src=new Src();
		
		Thread_1 t1=new Thread_1(src,"First");
		Thread_2 t2=new Thread_2(src,"Second");
		
		
		t1.start();
		t2.start();
		
		
		Thread.sleep(2500);
		System.out.println(src.counter);
	}
}

class Src
{
	  int counter=1;
	  void print()
	{
		 counter++;
		
	}
}

class Thread_1 extends Thread
{
	Src src;
	public Thread_1(Src src, String name)
	{
		super(name);
		this.src=src;
	}
	
	
	public void run()
	{
		int sum=1;
		while(sum<100)
		{
			System.out.println(this.getName());
			src.print();
			sum++;
		}
	}
}

class Thread_2 extends Thread
{
	Src src;
	public Thread_2(Src src, String name)
	{
		super(name);
		this.src=src;
	}
	
	
	public void run()
	{
		int sum=1;
		while(sum<100)
		{
			System.out.println(this.getName());
			src.print();
			sum++;
		}
	}
}