package ex0725;

import java.io.IOException;

public class ShopingMall 
{		
		static int Age=18;
		
		
		public static void ShopingMallMat(int Age2) throws AgeException		//throws 를 사용 해서 던져라.
		{	
			if(Age2<Age)
			{	//예외발생
				
				/*
				 *  throw new NokidsException(); 도 똑같은 내용.
				 */
				AgeException ea = new AgeException(Age2+"살은 가세요");			//호출.
				
				throw ea;
			}
																//18살보다 작았을때는 더이상 일을 하지 않으니 else를 사용하지 않아도 됨.
				
				System.out.println(Age2+"살 님 어서요세요");
			
				
			
		}
}
