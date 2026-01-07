package advanced;

public class Volatile_Demo {

	static volatile boolean status=false;
	
	
	public static boolean getstatus()
	{
		return status;
	}
	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{
			long i=1;
			while(i<100000000000000000l)
			{
				i++;
			}
			System.out.println("now changing the flag to the :True");
			status=true;
		});
		
		
		Thread t2=new Thread(()->{
			long i=1;
			while(i<100000000000000000l)
			{
				i++;
			}
			 System.out.println(Volatile_Demo.getstatus());
		});
		
		t1.start();
		t2.start();
	}

}
