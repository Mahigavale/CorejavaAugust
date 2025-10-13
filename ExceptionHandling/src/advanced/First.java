package advanced;

public class First {

	public static void main(String[] args) {
		
		Aeroplane.fly(101);
		
		
		System.out.println("jhdiwdwksx");
	}

}

class Aeroplane
{
	
	public static void fly(int i)
	{
		
		
		/**
		 * Unchecked Exception:=> 
		 * if we throw an instance of the RuntimeException 
		 * 
		 */
		
		try {
		if(i != 100)
		{
			throw new RuntimeException("invalid argument");
		}
		System.out.println("aeroplane is in the sky");
		}
		catch(RuntimeException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		
		System.out.println("I am in the fly method. intact");
	}
}