package advanced;

public class Vola_Final {

	public static void main(String[] args) throws InterruptedException {
		
		Timer timer=new Timer();
		
		first f=new first(timer);
		
		Second_1 second=new Second_1(timer);
		
		second.start();
		f.start();
		
		
		second.join();
		f.join();
	}
}

class Timer
{
  int time=1;
	
	
	public  void increase()
	{
		this.time++;
	}
	
	public int gettime()
	{
		return this.time;
	}
	
	}


class first extends Thread{
	
	Timer time;
	public first(Timer time)
	{
		this.time=time;
	}
	
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Increasing the timeeeeeeeeeee*********");
		int j=1;
		while(j<400000)
		{
			
			time.increase();
			j++;
		}
		System.out.println("Increased value:::"+time.gettime());
	}
}
class Second_1 extends Thread
{
 Timer time;	
 public Second_1(Timer time)
 {
	 this.time=time;
 }
   public void run()
   {
	   while(true)
	   {
		   if(time.gettime()==50000)
		   {
			   System.out.println("THE END>>>>>>>");
			   break;
		   }
//		   else
//		   {
//			   System.out.println("Waiting");
//		   }
	   }
	 
   }
}