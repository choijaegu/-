package ShoppingMall연습중;



public class ShoppingMall 
{
	public void enter(int age) throws NoKidsException
	{
		if(age<18)
		{
			
			throw new NoKidsException();
		}
		System.out.println(age + "살 님 입장하신걸 환영합니다.");
		
		
		
	}
	
	
	
	
	
}
