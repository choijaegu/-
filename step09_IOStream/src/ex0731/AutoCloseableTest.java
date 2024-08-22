package ex0731;



class Test implements AutoCloseable					//IO들은 이미 이걸 다 가지고 있음.
{
	
		public void close() throws Exception			
		{
			System.out.println("클로즈 콜");
		}
	
	
	
}



public class AutoCloseableTest 
{

	
	public static void main(String[] args) 
	{
		//Test t = new Test();
		
		try(Test t = new Test();)						//자동close
		{
			System.out.println("안녕");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		System.out.println("------end-------");
				
				
		
		
		
		
	}

}
