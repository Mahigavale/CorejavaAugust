package basic;

public class Race_Condtition {

	public static void main(String[] args) throws InterruptedException {
		
	
		Source src=new Source();
		
		Thread_1 th1=new Thread_1(src);
		Thread_1_A th2=new Thread_1_A(src);
		
		
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		
	
		


System.out.println(src.getcounter());
		

	}
}

class Source
{
	int counter =0;
	
	public int getcounter()
	{
		return this.counter;
	}
}

class Thread_1 extends Thread
{
	 Source source;
	 static int counter=0;
	 
	 public Thread_1(Source source)
	 {
		 this.source=source;
	 }
	public void run()
	{
		
		for( int i=1;i<=10000;i++)
		{
			source.counter++;
			counter++;
		}
		
		System.out.println("Thread one:"+counter);
	}
}

class Thread_1_A extends Thread{
 Source source;
	 
 static int counter=0;
	 public Thread_1_A(Source source)
	 {
		 this.source=source;
	 }
	public void run()
	{
		
		for( int i=1;i<=10000;i++)
		{
			source.counter++;
			counter++;
		}
		System.out.println("Thread 2:"+counter);
	}
	
}