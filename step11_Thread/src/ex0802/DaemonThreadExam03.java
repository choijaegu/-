package ex0802;

public class DaemonThreadExam03
{

	public static void main(String[] args)
	{
		System.out.println("******메인 시작합니다******");
		
		Thread th = new Thread(()->
		{	
			while(true)
			{
				System.out.println("점심 뭐 먹지?");
				
			
			}
		});
		th.setDaemon(true);//메인스레드가 종료되면 함께 종료한다.
		th.start();
		try
		{
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	
		
		System.out.println("******메인 종료합니다******");
	}

}
