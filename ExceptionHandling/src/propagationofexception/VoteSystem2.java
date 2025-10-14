package propagationofexception;

public class VoteSystem2 {

	public static void main(String[] args){

		try {
		  Voting.checkEligibility(19, false);
		}
		catch(Exception ex)
		  
		{
			ex.printStackTrace();
		}
	}

}

class Voting
{
	static public void checkEligibility(int age, boolean isIndian) throws InvalidAgeException, NotIndianException
	{	
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		
		
		if(age>18)
		{
			throw new NotIndianException("Non-Bharatiya");
		}
		System.out.println("hii");
		
		
	}
}