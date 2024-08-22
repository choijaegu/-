package Exception;

public class UserAccountNotFoundException extends Exception 
{

	public UserAccountNotFoundException()
	{
		super("해당 유저를 찾을 수 없습니다.");
	}
}
