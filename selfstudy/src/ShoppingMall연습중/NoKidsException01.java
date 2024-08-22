package ShoppingMall연습중;

public class NoKidsException01 extends Exception
//public class NoKidsException extends RuntimeException
{
	public static int count;
	
	public NoKidsException01()
	{
		super("애들은 가라");
		count++;
	}
	
	public NoKidsException01(String message)
	{
		super(message);
		count++;
		
		
	}
	
	
	
	
	
	
	
}
