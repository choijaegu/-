package ex0711.제어문;

public class DoWhileExam01 {

	public static void main(String[] args) 
	{
		//1. 1~100까지 출력
		int a = 1;
		do 
		{//무조건 한번은 실행한다.
			System.out.print(a+"\t");
			a++;
		}
		while(a<=100);
			System.out.println();
		
		//2. A~Z까지 출력
		char ch = 'A';
		do
		{
			System.out.print(ch+"\t");
			ch++;
		}
		while(ch<='Z');
			System.out.println();
				
		//3. 1~100사이의 3의 배수의 합 구해서 출력
		int sum = 0;
		int b = 1;
		do
		{
				if(b%3==0)
				sum+=b;
				b++;
				
		}
		while (b <= 100);
		System.out.print(sum);
		System.out.println();
		
		//4. 1~100을 10행 10열로 출력(while문안에 while문 이용)	
		int c = 0 ;
		do
		{
			int d = 1;
			do
			{
				System.out.print((c+d)+" ");
				d++;
			}while (d<=10);
			
			c += 10;
			System.out.println();
		}while (c<100);
		
		//5. 구구단
		int i = 1;
		do
		{
		int j = 2;
			do
			{
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				j++;
			}while(j<=9);
			i++;
			System.out.println();
		} while (i<=9);
	}

}
