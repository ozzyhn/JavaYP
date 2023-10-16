
public class MyCheckedException extends Exception
{
	private String message;

	public MyCheckedException(String message)
	{
		super(message);
		this.message = message;
	}

	@Override
	public String getMessage()
	{
		return message;
	}
}