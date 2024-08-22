package ex0716;

import java.util.Scanner;

public class ExerciseReport 
{	
	int [] score;//길이로 변수할때는 뒤에 변수길이를 아직 선언하지말고 메소드안에서 선언 
	
	public void getStudent(int student)
	{
		this.score = new int[student]; 
	}
	
	
	public void getScore(int score1, int i)
	{
		this.score[i]=score1;
	}
	
	
	public void getList(int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.println(this.score[i]);
			
		}
	}
	
	public void getAverage(int k)
	{	int sum = 0;
		for (int i = 0 ; i < k; i++)
		{
			sum +=score[i];
		}
		double ave = (sum/(double)k);
		System.out.println("평균 :"+ave);
	}	
	// 교수님 죄송합니다. 제 한계는 여기까지인 것 같습니다. 최고점수 못구하겠습니다 ㅜ
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int student = 0;
		ExerciseReport report = new ExerciseReport();

		
		
		while(run)
		{
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료.");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			
			
			
			switch(menu)
			{
				case 1: System.out.print("학생수를 입력해주세요:");
						student = sc.nextInt();
						System.out.println("학생 수>"+student);
						report.getStudent(student);
						break;
				
				case 2: for(int i = 0; i < student; i++)
						{
							System.out.println("점수를 입력해주세요:");
							int score1 = sc.nextInt();
							report.getScore(score1,i);
						}
						break;
					
				case 3: report.getList(student);
						break;
				
				case 4: report.getAverage(student);
						break;
			}
			
		}
	}

	
}
