package Ex0712Homework;

import java.util.Scanner;


class Total
{
	public static int total_1(int a, int b, int c)
	{
		int to = a+b+c;
		return to;
	}
}

class Average
{
	public static int average_1(int a, int b, int c)
	{
		int av = (a+b+c)/3;
		return av;
	}
}

class Grade
{
	public static char grade_1(int a,int b,int c)
	{
		int gr1 = ((a+b+c)/3)/10*10;
		char gr2 = 'A';
		switch(gr1)
		{
		case 100 : gr2 = 'A';break;
		case 90 : gr2 = 'A';break;
		case 80 : gr2 = 'B';break;
		case 70 : gr2 = 'C';break;
		default : gr2 = 'D';
		
		}return gr2;
	}
}

public class ExerciseTest {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean run = true ;
		while(run)
		{
			System.out.println("1. 성적표구하기 2. 종료");
			System.out.print("메뉴선택 : ");
			
			int menu = sc.nextInt();
			
			switch(menu)
			{
				case 1 : 
					System.out.print("국어 : ");
					int kor = sc.nextInt();
				
					System.out.print("영어 : ");
					int eng = sc.nextInt();
					
					System.out.print("수학 : ");
					int mat = sc.nextInt();
					
					System.out.print("이름 : ");
					String name = sc.next();
				
					System.out.println(name+"님의 성적은 국어: "+kor+" 영어: "+eng+" 수학: "+mat+" 입니다.");
				
							System.out.print("총점 : ");
							int to2 = Total.total_1(kor,eng,mat);
							System.out.print(to2+" ");
							
							System.out.print("평균 : ");
							int av2 = Average.average_1(kor,eng,mat);
							System.out.print(av2+" ");
							
							System.out.print("등급 : ");
							char gr3 = Grade.grade_1(kor, eng, mat);
							System.out.println(gr3);
							System.out.println("등급기준"+"\n"+"A = 90~100"+"\n"+"B = 80~89"+"\n"+"C = 70~79"+"\n"+"D = 69이하");
							
					
				case 2 :
					run = false;
			}
			
			
		}System.out.print("프로그램을 종료합니다.");
			 
	}

}
