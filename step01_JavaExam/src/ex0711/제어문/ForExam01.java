package ex0711.제어문;

public class ForExam01 
{

	public static void main(String[] args) 
	{
		
		//1) 1~100까지 한줄로 출력
		for(int i =1 ; i<=100 ; i++) 
		{
			System.out.print(i+" ");
		}								//i라는 변수를 for문 안에서 선언했는데 중괄호 블럭을 빠져나가서는 i 를 쓸수가 없음.
		System.out.println("\n");
		
		
		//2) A~Z 까지 한줄로 출력
		for(char ch = 65 ; ch<=90 ; ch++) /*for(i=1; i <26 ; i++
										  *System.out.print((char)('A'+i) +""); 도 가능.
										  *또는 
										  *for(char ch='A'; ch<='Z' ; ch++){
										  *System.out.print(ch+" "); 도 가능
										  */
										  
		{ 
			System.out.print(ch);// 아스키코드
		}
		System.out.println("\n");
		
		
		//3) 1~10 까지 합 구해서 출력
		int sum = 0;
		for(int i = 1; i<=10 ; i++) 
		{
			sum = sum + i; //sum+=i 로 해도 sum = sum + i 라는 뜻
		}
			System.out.println("1~10까지의 합:" + sum);
			System.out.println("\n");//누적변수가 필요해서 sum이라는 변수를 대입함
			
			
		//4) 1~100 사이의 7의 배수만 출력
		for(int i = 7; i < 8 ; i++) {
		
			for(int j = 1; j<=14; j++) 
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
		
		}	
			System.out.println("\n");      /*for(int i=1 ; i<=100; i++){
											*	if(i%7==0)
											*		System.out.print(i+"\n")
											*/
			
			
			
		//5) 100~1 사이의 5의 배수만 출력
		for(int i = 100 ; i >=1 ; i--) 
		{
			if(i%5==0)System.out.print(i+"\n");
		}

}
}

