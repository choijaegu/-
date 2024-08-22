package ex0725;

import java.util.Random;

public class ShopingMain 
{
	public static int count;
	public static void main(String[] args) 									/*여기서도 throws NoKidsException으로 던지면 JBM에서 처리를 못끝내고 보낸다.
																		     *당장 실행하고 싶을때 임시방편으로 사용하는 것.
																		     *일반적으로는 사용하지 않음.
																		     */
	{	
		System.out.println("--------- ShoppingMall OPEN -------------");
		
		ShopingMall shop = new ShopingMall();
		
		
		
		Random random = new Random();
		for(int i=0; i<10; i++)		
		{	
			try {															//try범위를 정할 때 for문 안에 해야 나머지실행들이 for문을 안 벗어난다.
				int age = random.nextInt(55)+1;
				shop.ShopingMallMat(age);
			}
			catch(AgeException ea)
			{
				System.out.println(ea.getMessage());						//?? 어떻게해야되는지 이따 해야게따
				
			}
			
		}
		System.out.println("--------- ShoppingMall CLOSE ------------");
		System.out.println("예외 발생한 손님: "+AgeException.count+"명 입니다.");
	}

}
