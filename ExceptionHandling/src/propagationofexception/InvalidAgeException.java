package propagationofexception;

public class InvalidAgeException extends RuntimeException {

	
	public InvalidAgeException()
	{
		super("Invalid age exception");
	}
	public InvalidAgeException(String str)
	{
		super(str);
	}
}

 class NotIndianException extends RuntimeException
 {
	 
	 public NotIndianException(String str)
	 {
		 super(str);
		 
	 }
 }
