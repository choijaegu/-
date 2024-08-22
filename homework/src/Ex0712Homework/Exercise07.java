package Ex0712Homework;

import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) 
	{
		boolean run = true;
		
		int balance = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택> ");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 :
					
					System.out.print("예금액> ");
					int save = sc.nextInt();
					balance +=save;break;
					
				case 2 :
					
					System.out.print("출금액> ");
					int out = sc.nextInt();
					balance -=out;break;
				
				case 3 :
					System.out.print("잔고> ");
					System.out.println(balance);break;
				
				case 4 :
					run = false;
					System.out.println();
			}
		}System.out.println("프로그램 종료");

	}

}
