 package ex0724;

class A
{
	public void method1()
	{
		System.out.println("A-method1()");
	}
	
}

class B extends A
{	@Override
	public void method1()
	{
		System.out.println("B-method1()");
	}
	
	
}

class C extends A
{	@Override
	public void method1()
	{	
		System.out.println("C-method1()");
	}
	
	public void method2()
	{
		System.out.println("C-method2()");
	}
}
///////////////////////////////////////
public class Example 
{	
	public static void action(A a)//자식인 B랑 C도 들어올 수 있음./들어오는건 a하나 
	{	
		a.method1();	//재정의된 메소드는 각 구현객체의 호출
		
		
		if(a instanceof C)		//a를 C타입으로 형변환
			
		{	
			C c =(C)a;
			c.method2();
		
		}
	
	}
	
	
	

	public static void main(String[] args) 
	{
		action(new A());
		action(new B());
		action(new C());
	
	}

}
