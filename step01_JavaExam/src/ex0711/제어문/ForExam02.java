package ex0711.제어문;

public class ForExam02 {

	public static void main(String[] args) 
		{
		//1) 1~100까지 10행 10열로 출력 (for문안에 for문 이용)
		int sum=1;  				//변수하나 더 넣음
		for(int i =1; i<=10 ; i++) //큰 for문이 한번도는동안 아래for문이 여러번도니 큰 for를 행으로
		{
			for(int j=1; j<=10 ; j++)
			{
				System.out.print(sum++ +" "); /*i가 행의 역할을 하니까 10씩 늘리면 됨.
											   * for(int i =0; i<100; i+=10)
											   * {
											   * for(int j = 1; j<=10; j++)
											   * {
											   * System.out.print((i+j) + " ");
											   * }
											   * System.out.println();
											   * 으로 하면 됨.
											   * 혹은 for(int i = 0; i < 10; i++)
											   * {
											   * for(int j =1;j<=10; j++)
											   * {
											   *
											   * System.out.print((i*10+j)+ " ")
											   * }
											   * System.out.println()
											   * }
											   * 
											   * 도 가능.
											   */
				
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////
		for(int i = 0 ; i < 10 ; i++)
		{
			for(int j = 1 ; j <= 10 ; j++)
			{
				System.out.print((i*10+j)+"\t");
			}
			System.out.println();
		}
		//2) 1~100까지 10행 10열로 출력 (for문안에 if문 이용)
		for(int i =1 ; i<= 100 ; i++) 
		{   System.out.print(i+" ");
		
			if(i%10==0)System.out.println();
			
		}
		
		//3) 구구단을 출력 (2중 for문으로 9행8열)
		for(int row = 1 ; row<=9; row++) //행
		{
			for(int col = 2;col <=9; col++) //열 
					{
						System.out.print(col+"*"+row+"="+(col*row)+"\t");
					}
					System.out.println();
		}
	}

}
