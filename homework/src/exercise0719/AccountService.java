package exercise0719;

/* 0719 숙제
 * 6장 19번문제
 * 최재구
 */

public class AccountService 
{
	
	public static void main(String[] args) 
	{
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: "+ account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: "+ account.getBalance());

		account.setBalance(2000000);
		System.out.println("현재 잔고: "+ account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: "+ account.getBalance());
	}

}
