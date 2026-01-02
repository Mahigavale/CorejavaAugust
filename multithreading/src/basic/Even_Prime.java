package basic;

public class Even_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Priter prit=new Priter();
		EvenPrinter even=new EvenPrinter(prit);
		
		PrimePrinter1 prime=new PrimePrinter1(prit);
		
		even.start();
		prime.start();
		
	}
}

class Priter
{
	int counter=0;
	
	int counter2=Integer.MAX_VALUE;
	int counter3=Integer.MAX_VALUE;
	static int num=1;
	static int num2=3;
	public synchronized void  printeven() throws InterruptedException
	{
		for(int i=num;i<counter2;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even :"+i);
				this.counter++;
				num++;
				System.out.println(counter);
			}
			if(this.counter==10)
			{
				break;
			}
		}
		notify();
		  if(this.counter ==10)
		  {
			  System.out.println("now print prime");
			 wait();
		  }
		
	}
	public synchronized void prime() throws InterruptedException
	{
		
		
		for(int j=num2;j<counter3;j++)
		{
			boolean flag=false;
			for(int i=2;i<j;i++)
			{
				if(j%i==0)
				{
					flag=true;
				}
			}
				
			if(!flag)
			{
				System.out.println(j);
				this.counter--;
				System.out.println("counter prime:"+this.counter);
			}
			if(this.counter==0)
			{
				break;
			}
			num2++;	
		}
		notify();
		if(this.counter==0)
		{ 
			wait();
			System.out.println("now even");
		}
	}
}

class EvenPrinter extends Thread
{
	Priter prit;
	
	
	public EvenPrinter(Priter prit)
	{
		this.prit=prit;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(1000);
				prit.printeven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class PrimePrinter1 extends Thread{
	Priter prit;
	
	public PrimePrinter1(Priter prit)
	{
		this.prit=prit;
	}
	
	
	public void run()
	{while(true)
	{
		try {
			Thread.sleep(1000);
			prit.prime();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}