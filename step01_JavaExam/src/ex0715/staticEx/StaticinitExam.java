package ex0715.staticEx;
//package 선언은 반드시 문서 첫 줄, 한개만 작성가능.

public class StaticinitExam 
{	//필드, 생성자, 메소드 구성
	int a;
	static int b;
	
	public StaticinitExam()
	{
		a=50;
		b=100;
	}
	
	
	/*static블럭
	 * main보다 먼저 실행된다!
	 * 환경구축을 위한 설정정보를 로딩하고 세팅하는 과정
	 * 데이터를 로딩해서 초기화 작업 ex)DB로드, 연결...
	 */
	static 
	{
		System.out.println("ㅡㅡㅡstatic init입니다.ㅡㅡㅡㅡ");
		b=100; //초기화
		//a=50;	//안된다!  인스턴스필드는 static블럭에서 접근불가
	}
	
	public static void main(String[] args) 
	{
		System.out.println("ㅡㅡㅡ메인 시작합니다.ㅡㅡㅡㅡㅡ");
		
	}

}
