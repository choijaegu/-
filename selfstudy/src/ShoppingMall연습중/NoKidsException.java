package ShoppingMall연습중;

public class NoKidsException extends Exception//일반예외
//public class NokidsException extends RuntimeException	//비체크 예외
{	
	public static int count;
	
	public NoKidsException()	//생성자에서 리턴값뺴라 
	{
		super("애들은 가라");
		count++;
	}
	
	public NoKidsException(String message)
	{
		super(message);
		count++;
	}
}
