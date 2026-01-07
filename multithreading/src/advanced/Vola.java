package advanced;

public class Vola {

	public static void main(String[] args) throws InterruptedException {
	
		Common com=new Common();
		Reader read=new Reader(com);
		Writer write=new Writer(com);
		
		read.start();
		write.start();
		read.join();
		write.join();
	}
}

class Common
{
	volatile int status=1;
	
	
	public  int getStatus()
	{
		return this.status;
	}
	
	}

class Writer extends Thread
{
	
	Common common;
	
	public Writer(Common common)
	{
		this.common=common;
	}
	
	public void run()
	{
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(":Increasing the value...");
		int j=1;
		while(j<50000000)
		{
			
			j++;
			common.status++;
		}
		
		System.out.println("from write value increased :"+common.getStatus());
	}
	
}


class Reader extends Thread
{
	
	Common common;
	
	public Reader(Common common)
	{
		this.common=common;
	}
	
	public void run()
	{
		long one=1;
              
		while(true)
		{
			if(common.getStatus()>45000)
			{
				System.out.println("updated value...");
				break;
			}
			else
			{
				System.out.println("waiting");
			}
		}
		System.out.println(this.common.getStatus());
	}
}