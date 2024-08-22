package ex0712.제어문;

public class BreakContunueExam {

	public static void main(String[] args) 
	{
		for(int a =1; a<=10;a++)
		{
			//if(a==5)break;
			//if(a==5)continue;
		
			//if(a>=5)break;
			if(a>=5)continue;
			System.out.print(a+"\t");
		}
		
		System.out.println("\n 이중 반복문 -----");
		outer : 
		for(int a=1; a <=5; a++)//레이블즉 라벨 은 콜론을 사용함.
		{
			for(int b=1; b<=3;b++)
			{
				if(b==2)break outer;//자신을 감싸고 있는 블럭만 빠져나간다.
				//if(b==2)continue;
				
				//if(a==2)break;//제어가 b블럭에서만 제어되서 a가 2일때만 안뜨고 3부턴 계속돈다.
				//if(a==2)continue;
				System.out.print(b+" ");
			}
			System.out.println();
		}//for끝
		
		System.out.println();
		
	//구구단 5단만 빼고 출력
		for(int row = 1 ; row<=9; row++) //행
		{
			for(int col = 2;col <=9; col++) //열 
					{	if(col==5) continue;
						System.out.print(col+"*"+row+"="+(col*row)+"\t");
					}
					System.out.println();
		}
		System.out.println();
		
	//구구단 5단까지만 출력
		for(int row = 1 ; row<=9; row++) //행
		{
			for(int col = 2;col <=9; col++) //열 
					{	
						if(col==6) break;
						System.out.print(col+"*"+row+"="+(col*row)+"\t");
					}
					System.out.println();
		}
	}

}






