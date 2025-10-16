package propagationandStatuscodes;

public class NotSundayException extends Exception  {
 int code;
	
	public NotSundayException(String str, Throwable t, int code)
	{
		super(str,t);
		this.code=code;
	}
	
	public int getCode()
	{
		return this.code;

	}
}
