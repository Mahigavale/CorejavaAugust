package basic;

public class First {

	public static void main(String[] args) throws Exception {
		
		boolean status=true;
		
		
		Number_Printer numb=new Number_Printer();
		
		Number_Printer numb1=new Number_Printer();
		Number_Printer numb2=new Number_Printer();
		Number_Printer numb3=new Number_Printer();
		
		numb.start();
		numb1.start();
		numb2.start();
		numb3.start();
		
		while(status)
		{
			Thread.sleep(1000);
			System.out.println("*");
		}
		
		
		throw new Exception("demo")
;
		
	}
}



//Is-A 
class Number_Printer extends Thread
{
	
	
	public void run()
	{
		for(char  i='A';i<'Z';i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			}
}



