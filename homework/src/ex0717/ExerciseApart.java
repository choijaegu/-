package ex0717;

public class ExerciseApart 
{
	
	
	
	public static void main(String[] args) 
	{	
		String arr[][] = new String [10][10];
		int arL = arr.length;
		for(int i = 0; i<arL; i++)
		{	
			
			for(int j = 0; j<i+1; j++)
			{	
				System.out.print((i+1)+"동"+(j+1)+"호"+" ");
			}System.out.println();
		}System.out.println("\n");
		
		ExerciseApart ap = new ExerciseApart();
		ap.apart2();
	}
	
	public void apart2()
	{	String arr[][] = new String [10][10];
		
		int arL = arr.length;
		
		
		for(int i = 0; i<arL; i++)
		{	 
			
			for(int j = 0; j<i; j++)
			{
				System.out.print("      ");
								
			}
			
			
			for(int j = 1; j<11-i; j++)
			{	
				System.out.print((i+j)+"동"+(i+1)+"호");
			}System.out.println();
		}
	}
}
