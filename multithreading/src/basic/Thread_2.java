package basic;

public class Thread_2 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread one=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("*");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		});
		
		
		Thread Two=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("^--^");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		});
		
		
		
		
		
		one.start();
	   
		Two.start();
		for(int i=0;i<5;i++)
		{
			
			System.out.println(i);
		}
	}

}
