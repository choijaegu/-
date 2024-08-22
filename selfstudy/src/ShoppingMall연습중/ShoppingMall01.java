package ShoppingMall연습중;

public class ShoppingMall01 
{
	public void enter(int age) throws NoKidsException01
	{
		if(age<18)
		{
			throw new NoKidsException01(age+"살 은 입장할 수 없습니다.");
		
		}
		
		System.out.println(age+"살 님 입장하신걸 환영합니다.");
	}
	
	
}
