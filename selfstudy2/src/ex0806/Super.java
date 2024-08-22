package ex0806;

public class Super 
{
	int a = 5;
	String s = "Java";
	public void aa()
	{
		System.out.println(1);
	}
	
	public void bb()
	{
		System.out.println(2);
	}

		
}

class Sub extends Super
{
	int a = 10;
	String str = "Html";
	public void aa()
	{
		System.out.println(3);
		
		System.out.println(a);
		System.out.println(super.str);
		super.cc()
		
		
	}
	
	public void cc()
	{
		super.aa();
	}
	
	
	
}


