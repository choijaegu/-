package ex0711.제어문;

public class WhileExam01 {

	public static void main(String[] args) 
	{
		//1. 1~100까지 출력
		
		int a = 1;
		while(a<=100)
		{
		
		System.out.print(a+"\t");
		a++;
		}
		System.out.println();
	
		//2. A~Z까지 출력
		
		char ch = 'A';
		while(ch<='Z')
		{
		System.out.print(ch+"\t");
		ch++;
		}
		System.out.println();
		
		//3. 1~100사이의 3의 배수의 합 구해서 출력
		
		int sum = 0;
		int b = 1;
		while(b<=100)
		{	
			if(b%3==0)
			sum += b;
			b++;
			
			
		}System.out.println(sum);
		
			
		
		//4. 1~100을 10행 10열로 출력(while문안에 while문 이용)
		
		int c = 0;
		while(c<10)  //행
		{	int d = 0;
			while(d<10)  //열
			{
				System.out.print((c*10+d)+"\t");
				d++;
			}
			System.out.println();
			c++;
		}
		//5. 구구단
		
		int row=1;
		
		while(row<=9) //9행
		{	int col=2;
			while(col<=9) //8열
			{
				System.out.print(col+"*"+row+"="+(col*row)+" ");
				col++;
			}
		System.out.println("\n");
		row++;	
		}
	}

}
