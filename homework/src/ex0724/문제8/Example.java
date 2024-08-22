package ex0724.문제8;

public class Example 
{	
	public static void action(A a)
	{
		a.method1();
		if(a instanceof C)
		{	
			C c= (C)a;		//a가 C타입으로 변해야 인수로 들어온 a가 c.method2를 작동시킨다.
			
			c.method2();
		}
	}
	

	public static void main(String[] args) 
	{
		action(new B());
		action(new C());
	}

}
