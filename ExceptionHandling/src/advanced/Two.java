package advanced;

public class Two {

	public static void main(String[] args) {

		
		int age=23;
		
		try
		{
		if(age<30)
		{
			throw new wrongAgeException("def");
		}
		}
		catch(wrongAgeException ex)
		{
			
			System.out.println(ex.getMessage());
		}
		
	}

}

class wrongAgeException extends Exception
{
	
	public wrongAgeException(String str)
	{
		super(str);
		
	}
}


















//class Animal
//{
//	
//	public Animal()
//	{
//		System.out.println("Parent ");
//	}
//	public Animal(int i)
//	{
//		 System.out.println("Param:");
//	}
//}
//
//class Tiger extends Animal
//{
//	public Tiger(int i)
//	{
//		super(i);
//		System.out.println("cHild ");
//	}
//}
