package ex0719.constructor;


/**
 * 싱글톤 클래스 작성
 * 1)private 생성자를 만든다.
 * 2)static맴버필드를 이용해서 객체를 생성
 * 3)static맴버필드를 리턴하는 메소드 제공
 */
class Test{
	private static Test instance= new Test();
	int age;
	
	private Test(){}//외부에서 객체생성하지마라.
	
	public void aa() {}
	/*
	 * 현재객체를 직접 생성해서 리턴하는 메소드를 제공해줘야 댐.
	 * 
	 */
	public static Test getInstance()//외부에서 객체생성없이 호출할수 있게 하기위해 static필요. 
	{
		
		return instance;
	}
}
//////////////////////////////////////////
public class privateConstructorExam 
{

	public static void main(String[] args) 
	{
		//new Test( ); private 생성자 이므로 생성불가.
		
		//제공된 메소드를 호출해서 test객체를 얻어야함.
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();//주소값이다르다.
		
		System.out.println(t1);
		System.out.println(t2);
		
		t1.age
		t2.age
	}

}
