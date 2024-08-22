package ex0802;

public class SyncronizedExam
{
	

	
	
	public static void main(String[] args) 
	{
		System.out.println("*****메인 시작합니다.*******");

		//공유객체 생성
		Bank bank = new Bank();
		
		CustomerThread th1 = new CustomerThread(bank, "인출자", false);
		
		CustomerThread th2 = new CustomerThread(bank, "입금자", true);
		
		th1.start();
		th2.start();
		
		System.out.println("*****메인 끝입니다.*********");
	}

}

/**
*	여러 스레드가 공유할 객체
*
*/


class Bank
{
	int balance;
	/**
	 * 
	 * @param boolean state는 true이면 입금, false이면 출금
	 * 
	 * wait(), notifyAll()은 반드시 synconize블럭안에만 사영가능
	 * 
	 * synchronized없이 사용하면 실행도중 {@link IllegalMonitorStateException} 발생.
	 */
	public synchronized void balanceChange(String name, boolean state)			//synchronized해도 꼭 한 스레드가 쭉 하는건 아님.
	{
		if(state)
		{
			if(balance < 1)
				
				//synchronized (this)														//여기서 this는 공유객체 bank를 뜻한다.
				{
					System.out.print(name + "==> 현재 잔액 확인: "+ balance + ",");
					balance++;
					System.out.println(name+ "==> 증가 한 후 잔액확인: "+balance);
					
				}
					
			else 
			{	
					System.out.println("name"+"스레드 wait()중입니다...");
					try 
					{
						wait();
					}
					catch(InterruptedException e)
					{
							e.printStackTrace();
					}
			
			}		
		}
			
		else
		{	
			if(balance >= 1)
				//synchronized (this) 
				{
					System.out.print(name + "==> 현재 잔액 확인: "+ balance + ",");
					balance--;
					System.out.println(name+ "==> 감소 한 후 잔액확인: "+balance);
					
				}
			else
			{
				System.out.println(name + "스레드 wait()중입니다.");
				try
				{
					wait();
				}
					catch(InterruptedException e)
				{
					e.getStackTrace();
				}
			}
			
		}
		//wait()에 의해 정지상태인 스레드를 깨운다.
		notifyAll();
		
	}//methodEnd
}//classEnd
////////////////////////////////////////////////////////////////
/**
 * 	고객 Thread
**/

class CustomerThread extends Thread
{
	super(name);		//스레드 네임 전달.
	private Bank bank;
	private String name;
	private boolean state;
	
	public CustomerThread(Bank bank , String name, boolean state)
	{
		this.bank = bank;
		this.name = name;
		this.state = state;
	}
	
	public void run() 
	{
	//고객이 thread에서 해야 할 일 작성
	
		for(int i = 1; i <=1000; i++)
		{
			bank.balanceChange(name, state);
		}
		
		System.out.println(super.getName()+" 스레드 종료합니다.");
	}
	

}