package encapsulation;

public class Second {

	public static void main(String[] args) {

		
		Instagram piyusha=new Instagram();
		
		piyusha.username="p";
				
		
	 piyusha.setPassword("923u3kjfnokwfpwke");
	 
	 System.out.println(piyusha.getPassword());
	// System.out.println(piyusha.password);
		
	}
}

class Instagram
{
	 String username;
	 /**
	  * This Password is accessible only within the Instagram class.
	  */
	private String password;
	
	
	
	public void setPassword(String pass)
	{if(pass.length()>10)
	{
		this.password=pass;
	}
	else
	{
		System.out.println("Invalid Password...");
	}
	
	}
	public String getPassword()
	{
		return this.password;
	}
}