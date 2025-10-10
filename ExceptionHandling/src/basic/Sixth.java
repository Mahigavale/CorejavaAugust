package basic;

public class Sixth {

	public static void main(String[] args) {
		int age=12;
		  try {
		if(age<18)
		{
			 throw new Exception("Invalid  age");
		}
		System.out.println("you can vote....");
		  }
		  catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
		  finally
		  {
			  System.out.println("hello");
		  }
	}

}
