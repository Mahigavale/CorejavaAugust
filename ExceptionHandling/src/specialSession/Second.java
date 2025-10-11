package specialSession;

public class Second {

	public static void main(String[] args) {
	
		
		/**
		 * Custom Logic : we have manually throw an exception
		 */
		/**
		 * Throw => this keyword is used to throw an Exception for the custom logic.
		 */
		int money=500;
		
		int amount =1400;
		/**
		 *  500-2000 => STOP. 
		 */
		
		/**
		 * 2000 =>this is impossible.
		 */
		
		
		try
		{
			if(money<amount)
			{
				
				/**
				 * new Exception("message");
				 */
				 throw new Exception("Insufficient ammount");
				 /**
				  * Creating the Object of exception
				  * and throwing it manually.
				  */
			}
			
			System.out.println(money-amount +"amount paid:");
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println("hello I am here");
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}

}
