package ex0725;




//public class AgeException extends RuntimeException		//비체크예외종류일때 예외처리를 안해도 에러가 안뜸.		
public class AgeException extends Exception		//일반예외종류일때	예외처리를 안하면 에러가 안사라짐.예외처리 필수.
{	
	public static int count;		//0
	
	public AgeException() 
	{
		super("애들은 가라");
		count++;
	}
	
	public AgeException(String message) 		//오버로딩된거라 ea.getMessage하면 얘가호출됨
	{
		super(message);
		count++;
	}
}

