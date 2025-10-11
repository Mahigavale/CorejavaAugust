package specialSession;

public class First {

	public static void main(String[] args) {
		/**
		 * Exception Handling.
		 */
		
		
		/**
		 * try, catch , finally
		 */
		int k=10;
		int j=0;
		
		try
		{
		System.out.println(k/j); //(10/0)=> infinite.universal.
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			for(int i=0;i<100;i++)
			{
				System.out.println(i);
			}
			
			
			System.out.println("helllpppp");
		}
		
		
		System.out.println("Not finally.....");

	}

}
