package Exception;

public class UserAccountNotFoundException extends Exception
{
	public UserAccountNotFoundException()
	{
		super("해당 고객넘버를 찾을 수 없습니다.");
	}
}
