package ex0801;

public class ThreadExam 
{

	public static void main(String[] args) 							//메인을 포함한 총 4개의 스레드가 돌아가는 중
	
	{
		System.out.println("-----main시작합니다.-------");
		NumberThread th1 = new NumberThread("첫번째 Thread");		//넘버 스레드가 생성될떄 스레드의 기본생성자가 호출되어짐.
		NumberThread th2 = new NumberThread("두번째 Thread");
		Thread th3 = new Thread(new AlphaThread(), "세번째 Thread");
		
		//thread를 준비=대기상태로 만들기
		th1.start();		
		th2.start();
		th3.start();
		
		//th1.run();			//일반 메소드 호출하듯이 순차적으로 작동함/
		//th2.run();	
		//th3.run();
		
		/*try
		{
		th1.join(); 	//th1스레드가 종료될 떄 까지 현재 스레드 중지 , th1 스레드가 끝나야 시작됨.
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
		System.out.println("총합은 :" + th1.sum);
		System.out.println("-------main끝입니다.---------");

	}

}
/////////////////////////////////////////////////////////////////

/**
*	1~100부터 출력하는 Thread - 상속
**/

class NumberThread extends Thread
{	
	int sum;
	NumberThread(String name)
	{
		super(name);
	}
	
	
	@Override
	public void run() 
	{
		for(int i = 1; i<=100; i++)
		{
			
			System.out.println(super.getName()+"=>"+i);
			sum+=i; //총합 구하기
			try {
			//Thread.sleep((int)(Math.random()*100));				//1000은 1초 100은 0.1초.
				Thread.yield();
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(super.getName()+" 종료합니다.^^");
			
			
		
	}
}
///////////////////////////////////////////////////////////////




/**
*	A~z출력하는 Thread - 구현
**/

class AlphaThread implements Runnable
{

	@Override
	public void run() 
	{	//현재 동작하고 있는 thread객체 가져오기
		Thread th = Thread.currentThread();
		
		
		for(char ch='A' ; ch<='z'; ch++)
		{
			System.out.println(th.getName()+"=>"+ch);
			try {
				//Thread.sleep((int)(Math.random()*300));				//1000은 1초 100은 0.1초.
				Thread.yield();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
		}
		System.out.println(th.getName()+"종료합니다.");
	}
	
	
	
}
