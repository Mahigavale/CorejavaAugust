package specialSession;

public class Fourth {

	public static void main(String[] args) {
		
		Agechecker.checkage(21);
		
		System.out.println("GOOD AFTERNOON!");
	}

}

class Agechecker
{
	
	public static void checkage(int age)
	{
		/**
		 * age<18 => "NOT ELIGIBLE" =>  "ELIGIBLE"
		 */
		
		try
		{
			// <10&& 20 => TeenageException
			// 21 && 30 =>  YouthException
			// 11
			
			// you can't throw multiple exceptions from the single try block AT THE SAME TIME.
			if(age >10 && age <20)
			{
				throw new Exception("TeenageException");
			}
			else if(age>10 && age<30)
			{
				throw new Exception("YouthException");
			}
			System.out.println("NO exception occurred :normal flow");
			
		}
		catch(Exception ex)
		{
		
			System.out.println(ex.getMessage());
		}
		finally
		{
			
		}
		
	}
}