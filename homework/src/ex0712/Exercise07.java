package ex0712;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) 
	{
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택>");
			
			int choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.print("예금액>");
					int save = scanner.nextInt();
					balance += save;
					break;
			
				case 2:
					System.out.print("출금액>");
					int out = scanner.nextInt();
					balance -= out;
					break;
				case 3:
					System.out.print("잔고>");
					System.out.println(balance);
					break;
				case 4:
					run=false;
			}
			
		}System.out.println("프로그램 종료");
	}

}
