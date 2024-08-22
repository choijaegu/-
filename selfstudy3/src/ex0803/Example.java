package ex0803;

/*
 * 다음과 같은 Example 클래스에서 action()메소드를 호출할 때 매개값이 C값일 경우에만
 * method2()가 호출되도록 밑줄에 들어갈 코드를 작성해보세요.
 * 
 */

class A
{
	public void method1()
	{
		System.out.println("A-method1()");
	}
	
	
	
}

class B extends A
{
	public void method1()
	{
		System.out.println("B-method1()");
	}
}

class C extends A
{
	public void method1()
	{
		System.out.println("C-method1()");
	}
	
	public void method2()
	{
		System.out.println("C-method2()");
	}
}




public class Example 
{
	public static void action(A a)
	{
		a.method1();
		
		if(a instanceof C c)
		{
			c.method2();
		}
	}
	
	public static void main(String []args)
	{
		action(new A());
		action(new B());
		action(new C());
		
	}
	
	
}
