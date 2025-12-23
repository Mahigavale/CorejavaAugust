package basic;

public class Third_1 {

	public static void main(String[] args) throws InterruptedException {
		

		
		Runnable r=()->{

			for(int i=0;i<15;i++)
			{
				System.out.println("--!--");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		
		Thread th=new Thread(r); 
		
		th.start();
		th.join();
		for(int i=0;i<10;i++)
		{
			System.out.println("*");
			Thread.sleep(1000);
		}
		
		}

}
//
//class Number implements Runnable
//{
//
//	@Override
//	public void run()  {
//		
//		for(int i=0;i<100;i++)
//		{
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
//
//}
