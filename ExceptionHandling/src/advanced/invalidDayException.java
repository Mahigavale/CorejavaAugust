package advanced;

/**
 * Unchecked and the fixed value exception.
 */
public class invalidDayException extends RuntimeException {

	public invalidDayException()
	{
		 super("Wrong day  !");
	}
	public invalidDayException(String str)
	{
		 super(str);
	}
}
