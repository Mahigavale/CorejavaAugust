package basic;

public class Seventh {

	public static void main(String[] args) {

		
		 Animal animal=new Animal();
		 
		 Animal animal2=new Animal();
			
		 Animal.getage(31);
		
		 
		 System.out.println("Hey there!");
	}

}

class Animal
{
	static
	{
		System.out.println("I am static");
	}
	
	public Animal()
	{ 
	System.out.println("hiiiii");
	
	}
	
	public Animal(int i)
	{
		
	}
	 static public void getage(int age)
	{
		 
		 try {
		if(age>20 &&age<30)
		{
			throw new Exception("Not valid");
		}
		if(age>30 && age<40) // 20<=40
		{
			throw new Exception("SHolay");
		
		}
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
		 
		 
	}
}