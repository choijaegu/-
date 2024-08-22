package exercise0719;

/* 0719 숙제
 * 6장 15번문제
 * 최재구
 */
class MemberService 
{
	String id;
	String password;
	boolean result;
	
	MemberService()
	{
		this("hong","12345");
	}
	
	MemberService(String id,String password)
	{
		this.id = id;
		this.password = password;
	}
	
	boolean login(String id,String password)
	{
		if(this.id.equals(id)&&this.password.equals(password))
		{
			return true;
		}
		return false;
	}
	
	void logout(String id)
	{
		if(this.id.equals(id))
		{
			System.out.println(id+"님이 로그아웃 되었습니다.");
		}
		else
		{
			System.out.println("id가 올바르지않습니다.");
		}
	}
}

public class MembserServiceExample
{
	public static void main(String[] args) 
	{
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong","12345");
		if(result)
		{
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}
		else
		{
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}