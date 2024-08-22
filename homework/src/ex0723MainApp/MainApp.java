package ex0723MainApp;

public class MainApp 
{
	static int count;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Employee emp[] = new Employee[5];		//new Employee(); 는 객체생성이고
												//Employee타입의 emp배열을 생성한 것 
												//그래서 abstract여도 배열은 생성가능
												
		emp[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);		//필드를 이용한 다형성.
		emp[1]= new FullTime(20,"박명수","가수",10,"2013-06-20","무한도전",7500,100);
		emp[2]= new FullTime(30,"정준하","예능인",10,"2013-06-22","무한도전",6000,100);
		emp[3]= new PartTime(40,"노홍철","예능인",20,"2014-05-01","무한도전",20000);
		emp[4]= new PartTime(50,"하하","가수",30,"2014-05-02","무한도전",25000);
		
		
		
		System.out.println("**************Emp 정보***************");
		
		for(int i=0; i < emp.length; i++)
		{
			System.out.println(emp[i]);
		}
		
		//개선된 for문
		//for( 변수타입 과 변수 : 반복할 대상  )
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(Employee e : emp)
		{
			System.out.println(e);
		}
		
		System.out.println("***********Emp Message 정보***********");
		for(Employee e : emp)
		{
				e.empMessage();// 어짜피 Employee의 메세지를 호출해도 재정의된 Full과 Part에서 호출됨.
		}
	}

}