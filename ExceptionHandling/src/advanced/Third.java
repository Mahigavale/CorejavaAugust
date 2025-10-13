package advanced;

public class Third {

	public static void main(String[] args) {
	
		
		try
		{
		if(10>5 && 40>30)
		{
			throw  new invalidDayException("Chukicha Diwas!");
		}
		
		else if(100>90 && 70 >68)
		{
			 throw new Exception("demooooooo");
		}
		}
		catch(invalidDayException ex)
		{ System.out.println(1);
			System.out.println(ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println("THE END");
	}

}

