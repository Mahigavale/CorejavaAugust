package advanced;

public class Daemon_One {

	public static void main(String[] args) throws InterruptedException {
		
		Thread first=new Thread(()->{
			for(int i=1;i<30;i++)
			{
				System.out.println(i);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread user=new Thread(()->{
			for(int i=1;i<10;i++)
			{
				System.out.println("*"+i);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		first.setDaemon(true);
		first.start();
	//	first.join();
		user.start();
		
		Thread.sleep(3000);
		System.out.println("hii this is the main thread .....");
	}

}
