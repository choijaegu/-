
package exercise0719;

/* 0719 숙제
 * 6장 19번문제
 * 최재구
 */

public class Account 
{	
	private static int balance;
	
	
	public void setBalance(int money)
	{		int MIN_BALANCE = 0;
			int MAX_BALANCE = 1000000;
			
			if(money<MIN_BALANCE || money>MAX_BALANCE) 
				{this.getBalance();}
			else if(balance<MIN_BALANCE || balance>MAX_BALANCE)
				{this.getBalance();}
			else balance=money;
				
			
			
	}
	
	public int getBalance()
	{
		return balance;
	}
}
