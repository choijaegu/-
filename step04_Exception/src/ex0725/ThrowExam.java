package ex0725;

import java.io.IOException;

public class ThrowExam 
{	
	
	/**
	 * 인수의 값은 음수가 들어올 수 없다!
	 *
	 * @param i
	 */
	
	
	
	public void aa(int i) throws IllegalArgumentException, IOException
	{
		System.out.println("전달된 i ="+i);
		
		if(i<0)
		{
			//강제로 예외를 발생하고 싶다!
			IllegalArgumentException ia = new IllegalArgumentException("음수는 안돼요!!");		//=>런타임엑셉션임.
			
			throw ia;//여기까지만 하면 프로그램이 끝까지 실행되진 않음.
		}
		
		
		//만약 i의 값이 100이면 안된다.
		if(i==100)
		{						
			throw new IOException("100 안 돼요!!");			//IOException은 런타임이 아님.
															//그냥 Exception은 예외처리가 필수되야함.
		}
		
		
		
	}

	
	public static void main(String[] args) 
	{
		System.out.println("-----메인 시작------");
		try {
		new ThrowExam().aa(100);
		}catch(IllegalArgumentException | IOException e) {
			System.out.println(e.getMessage());				
		}
		System.out.println("-----메인 끝--------");
	}

}
