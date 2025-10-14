package propagationofexception;

public class VoterSystem {

	public static void main(String[] args) {
		
		
		Voting_day.castVote(13, false);
		
		
		System.out.println("hiiiii");

	}

}


class Voting_day
{
	
	public  static void castVote(int age, boolean isIndian)
	{
		try{
		if(age<18)
		{
			throw new InvalidAgeException("ja ghari");
		}
		System.out.println("Please vote::");
		}
		catch(InvalidAgeException ex)
		{
			ex.printStackTrace();
		}
		
		try
		{
			if(age<18 && isIndian==false)
			{
				throw new NotIndianException("You are not an Indian");
			}
			System.out.println("You are indian and 18+:: Please vote");
			
		}
		catch(NotIndianException ex)
		{
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	} 
}