package ex0715.exam;

import java.util.Scanner;

public class ReportExamV2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean run =true;
		
		Report report = new Report();
		
		while(run)
		{
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1. 성적표           2.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			int menu = sc.nextInt();
			if(menu==1) 
			{
				System.out.print("이름은 ? ");
				String name = sc.next();
				
				System.out.print("국어점수 ? ");
				int kor = sc.nextInt();
				
				System.out.print("영어점수 ? ");
				int eng = sc.nextInt();
				
				System.out.print("수학점수 ? ");
				int math = sc.nextInt();
				
				report.printReport(name, kor, eng, math);
				
			}
			else if(menu==2) 
			{
				run = false;
			}
			else
			{
				System.out.println("메뉴는 1 ~ 2만 입력해주세요!");
			}
		}System.out.println("프로그램 종료합니다.");
	}

}
