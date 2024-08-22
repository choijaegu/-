package Exception;

public class BalanceLackException extends Exception 
{
	public BalanceLackException()
	{
		super("잔고에 금액이 모자랍니다.");
	}
	
	
}
