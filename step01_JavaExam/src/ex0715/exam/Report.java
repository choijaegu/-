package ex0715.exam;
/* 성적에 대한 총점, 평균, 등급, 출력을 담당하는 Business Logic
 * 
 */
public class Report 
{
	/**
	 * 총점
	 **/
	private int getSum(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	
	/**
	 * 평균
	 **/
	private double getAverage(int total, int subjectCount)
	{
		return total/(double)subjectCount;//둘중에 어느것이든 하나를 double로 바꿔놓아야 리턴값이 소숫점까지 나온다.
	}
	
	/**
	 * 등급
	 **/
	private char getGrade(double avg)
	{	
		
		if (avg>=90) {
				return 'A';
		} else if ( avg>=80) {
			return 'B';
		} else if ( avg>=70) {
			return 'C';
		}else if( avg>=60) {
				return 'D';
		}else return 'F';
				
	}
	
	/**
	 * 출력
	 **/
		

	
	public void printReport(String name, int kor, int eng, int math) 
	{
	//총점	
	int sum = this.getSum(kor,eng,math);
	//평균
	double avg = this.getAverage(sum, 3);
	//등급
	char grade = this.getGrade(avg);
	
	
	
	System.out.println("*********"+name+"님 성적표************");
	System.out.print("국어: "+kor+"\t");
	System.out.print("영어: "+eng+"\t");
	System.out.print("수학: "+math+"\n");
	
	System.out.print("총점: "+sum+"\t");
	System.out.print("평균: "+avg+"\t");
	System.out.print("등급:"+grade+"\n");
}
}

