package ex0806;

class B
{
	public B()
	{
		System.out.println("1");
	}
	
	public B(int i)
	{
		this("JAVA");
		System.out.println("2");
	}
	
	public B(String s)
	{
		System.out.println("3");
	}
}

class A extends B
{
	public A()
	{	
		this(5);
		System.out.println("4");
	}
	
	public A(int i)
	{	
		super(2);
		System.out.println("5");
	}
	
	public A(boolean b)
	{
		
		System.out.println("6");
	}
	
	
}








public class ConExam 
{

	public static void main(String[] args) 
	{
		new A();
	}

}
