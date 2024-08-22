package ex0715;

import java.util.Scanner;

class sum
{
	public int sum01(int a,
			int b)
	{
		return a+b;
	}
}

class minus
{
	public int minus01(int a,int b)
	{
		return a-b;
	}
}

class time
{
	public int time01(int a,int b)
	{
		return a*b;
	}
}

class division
{
	public double division01(int a,int b)
	{
		return a/(double)b;
	}
}



public class ExersiceCalcuratorVer2 {

		
	public static void main(String[] args) 
	{
		int balance =0;
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run)
		{	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 9.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("메뉴선택->");
			int menu = sc.nextInt();
			
			switch(menu)
			{
				case 1: System.out.print("첫번째 숫자를 입력해주세요:");
						int sum1 = sc.nextInt();
						System.out.print("두번째 숫자를 입력해주세요:");
						int sum2 = sc.nextInt();
						
						 sum to1 = new sum();
						 int sum3 = to1.sum01(sum1,sum2);
						System.out.println("값: "+sum3);
						break;
						
				case 2: System.out.print("첫번째 숫자를 입력해주세요:");
						int minus1 = sc.nextInt();
						System.out.print("두번째 숫자를 입력해주세요:");
						int minus2 = sc.nextInt();
				
						minus to2 = new minus();
						int minus3 = to2.minus01(minus1,minus2);
						System.out.println("값: "+minus3);
						break;
				
				case 3: System.out.print("첫번째 숫자를 입력해주세요:");
						int time1 = sc.nextInt();
						System.out.print("두번째 숫자를 입력해주세요:");
						int time2 = sc.nextInt();
					
						time to3 = new time();
						int time3 = to3.time01(time1,time2);
						System.out.println("값: "+time3);
						break;
				
				case 4: System.out.print("첫번째 숫자를 입력해주세요:");
						int division1 = sc.nextInt();
						System.out.print("두번째 숫자를 입력해주세요:");
						int division2 = sc.nextInt();
				
						division to4 = new division();
						double division3 = to4.division01(division1,division2);
						System.out.println("값: "+division3);
						break;
				
				case 9: run=false;
						break;
				
				default : System.out.println("연산기호가 잘못되었습니다.");
							continue;
			}
		}System.out.println("계산을 종료합니다.");
	}

}
