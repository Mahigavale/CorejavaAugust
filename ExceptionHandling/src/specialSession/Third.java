package specialSession;

public class Third {

	public static void main(String[] args) {
		
		
		boolean isActive=false;
		try {
		if(isActive==false) //FALSE :=> TRUE
		{
			 throw new Exception("Account closed....");
		}
		
		System.out.println("Welcome to canara bank.....");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
