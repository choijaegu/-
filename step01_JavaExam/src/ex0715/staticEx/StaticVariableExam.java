package ex0715.staticEx;

class Test
{
	int a;//전역변수 = 필드 =>a와 b는 0이 될 것.
	static int b;//전역변수 = 필드
	
}

////////////////////////////////
public class StaticVariableExam {

	public static void main(String[] args) 
	{
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("t1 = "+t1);
		System.out.println("t2 = "+t2);
		System.out.println("t3 = "+t3); //t1~t3의 주소는 전부 각각 다르다.
		
		System.out.println("****non-static(변경전) ****");
		System.out.println("t1.a = "+ t1.a);
		System.out.println("t2.a = "+ t2.a);
		System.out.println("t3.a = "+ t3.a);
		
		//값변경
		t1.a=100;
		
		System.out.println("****non-static(변경후) ****");
		System.out.println("t1.a = "+ t1.a);
		System.out.println("t2.a = "+ t2.a);
		System.out.println("t3.a = "+ t3.a);
		
		//static버젼
		System.out.println("****static(변경전) ****");
		System.out.println("t1.b = "+ t1.b);
		System.out.println("t2.b = "+ t2.b);
		System.out.println("t3.b = "+ t3.b);
		System.out.println("Test.b = "+ Test.b); // Test로 쓰는걸 권장.
		
		//값변경
		//t1.b=200;
		Test.b=300;
		System.out.println("****static(변경후) ****");
		System.out.println("t1.b = "+ t1.b);
		System.out.println("t2.b = "+ t2.b);
		System.out.println("t3.b = "+ t3.b);
		System.out.println("Test.b = "+ Test.b); // Test로 쓰는걸 권장.
		
		// static안에 들어간 b는 모두 공유필드가 된다.
		
	}

}
