package functionalifs;

public class F_1 {

	public static void main(String[] args) {
		
		/**
		 * Lambda expression in java.
		 * FunctionalIF
		 */
//		 I_run I_1=(int i , int j, int k)->{System.out.println(i+j+k);};
//			
//			 
//				
//		 I_1.run(100, 123,100);
//		 I_1.eat();
//		I_run.sleep();
		
		
		
//		I_2_A sk=new I_2_A() {
//
//			@Override
//			public void slack(String str) {
//				System.out.println(str.toUpperCase());
//			}
//			
//		};
		
		I_2_A sk=(String str)->{System.out.println(str.toUpperCase());}; 
		 sk.slack("ajbxejkdk");

	}

}


@FunctionalInterface
interface I_run
{
	 void run(int i, int j,int k);
	 
	 public default void eat()
	 {
		
		 System.out.println("eat from I_run");
	 }
	 public static void sleep()
	 {
		System.out.println("sleep from I_run"); 
	 }
}

//class One implements I_run
//{
//
//	@Override
//	public void run() {
//		System.out.println("run overridden from the one class.");
//		
//	}
//	
//}

@FunctionalInterface
interface I_2_A 
{
	 void slack( String str);
}
class Slack_user implements I_2_A
{

	
	public void slack(String str) {
		System.out.println(str.toUpperCase());
	}
	
}