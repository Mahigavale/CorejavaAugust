package basic;

public class Seventh {

	public static void main(String[] args) {

		
		 Animal.getage(31);
		
		 
		 System.out.println("Hey there!");
	}

}

class Animal
{
	
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