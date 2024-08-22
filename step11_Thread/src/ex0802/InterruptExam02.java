package ex0802;

public class InterruptExam02
{

	public static void main(String[] args)
	{
		System.out.println("******메인 시작합니다******");
		
		Thread th = new Thread(()->
		{	
			while(true)
			{
				System.out.println("점심 뭐 먹지?");
				if(Thread.interrupted())
				{
					break;
				}
			
			}
			System.out.println("스레드 종료합니다.");
		});
		
		th.start();
		try
		{
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		th.interrupt(); 		//th스레드를 InterreuptException을 발생시킨다.
	
		
		System.out.println("******메인 종료합니다******");
	}

}
