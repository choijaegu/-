package ShoppingMall연습중;

import java.util.Random;

public class MainApp02 
{

	public static void main(String[] args)
	{
		System.out.println("---------- ShoppingMall OPEN-----------");
		ShoppingMall01 mall = new ShoppingMall01();
		
		Random random =new Random();
		
		for(int i=0; i<10; i++)
		{
			int age = random.nextInt(55)+1;
			try 
			{
			mall.enter(age);
			}
			catch(NoKidsException01 a)
			{
				a.getMessage();
			}
			System.out.println();
			
		}
		System.out.println("---------ShoppingMall CLOSE-------------");
		
		

		System.out.println("예외발생한 손님: "+NoKidsException01.count+"명");
		
	}

}
