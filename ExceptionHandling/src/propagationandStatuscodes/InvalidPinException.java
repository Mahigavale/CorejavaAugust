package propagationandStatuscodes;

/**
 * Checked => Exception Class
 * 
 * Unchecked=> RuntimeException Class.
 */
public class InvalidPinException extends Exception {
	
	int code;
	public  InvalidPinException(String str , int code, Throwable t)
	{
		super(str, t);
		this.code=code;
	}
	
	public InvalidPinException(String str)
	{
		super(str);
	}

	public int getCode()
	{
		return this.code;
	}
	
}

class InsuffiecentAmountException extends InvalidPinException
{
	int code;
	public InsuffiecentAmountException(String str, int code)
	{
		super(str);
		this.code=code;
	}
	
	public int getCode()
	{
		return this.code;
	}
	
}