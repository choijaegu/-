package ex0711;

public class Exercise04 
{

	public static void main(String[] args) 
	{
		
		for( ; ; )
		{
			int dise1 = (int)(Math.random()*6)+1;
			int dise2 = (int)(Math.random()*6)+1;
			System.out.println(dise1+","+dise2);
			
			if(dise1+dise2==5)
				break;
				
		}
	//while문
		while(true) 
		{
					int dise1 = (int)(Math.random()*6)+1;
					int dise2 = (int)(Math.random()*6)+1;
					System.out.println(dise1+","+dise2);
			
					if(dise1+dise2==5)
					break;
			
		}
		
	}
	
	
}