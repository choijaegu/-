package ex0711;

public class ExerciseStar {

	public static void main(String[] args) 
	{
		for(int row = 1 ; row<=5 ;row++ )         //행
		{
			for(int col = 1; col<=row ; col++)      //열
			{
				System.out.print("★");
			}
				System.out.println();
		}
				System.out.println("*********************");
	
		for(int row = 5 ; row>=1 ; row--)
		{
			for(int col = 1; col<=row ; col++)
			{
				System.out.print("★");
			}
				System.out.println();
		}
				System.out.println("*********************");
				
		for(int row = 0 ; row < 5 ; row++)
		{
			for(int col = 0; col < 4-row ; col++)
			{
				System.out.print("  ");
			}
			for(int col2 = 0; col2 < row+1 ; col2++)
			{
				System.out.print("★");
			}
			System.out.println();
		
			
		for(int row = 0 ; row < 5 ; row++)
		{
			for(int col = 0; col < row; col++)
			{
				System.out.print("  ");
			}
			for(int col = 5; col > row; col--)
			{
				System.out.print("★");
			}
				System.out.println();
		}
		/*이렇게도 가능
		* for(int i=1;i<=5;i++)
		*{
		*for(int j=i; j<5;j++)
		*{
		*system.out,print("  ");
		*}
		*for(int c=1;c<=i;c++)
		*system.out.print("★");
		*}
		*system.out.println();
		*/
	 }
}
