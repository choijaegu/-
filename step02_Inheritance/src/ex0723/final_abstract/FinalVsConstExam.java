package ex0723.final_abstract;


class Test
{
	final int age;//초기값 지정 필수.
	
	static final int count;	//상수이고 반드시 초기값 지정 필수(초기화)
							//스태틱이라 실행하자마자 바로 값이 넘어감.
	
	Test(int age)//반드시 생성자를 이용해서 final필드 값 초기화.
	{
		this.age=age;
	}
	
	static //스태틱은 메인보다도 먼저 실행되기때문에 같은 스태틱으로 먼저 값을 붙여 스태틱블럭에서 상수를 초기화한다.
	{
		count = 100;
	}
}



public class FinalVsConstExam {

	public static void main(String[] args) 
	{
		Test t = new Test(5);
		System.out.println(t.age);
		
		//t.age=10;	//final은 값변경 불가.
		System.out.println(t.age);
		
		Test t2 = new Test(20);
		System.out.println(t2.age);
		
		System.out.println(t.count);
		System.out.println(t2.count);
		
	}

}
