package ex0806;

class Super
{
	int i = 5; 
	String a = "JAVA";
	
	public void test()
	{
		System.out.println("1");
	}
	
	public void test2()
	{
		System.out.println("2");
	}
	
	
}


class Sub extends Super
{
	int i = 3;
	String b = "Html";
	
	public void test()
	{
		System.out.println("3");
	}
	
	public void test4()
	{
		System.out.println("4");
	}
	
}








public class TestExam 
{
	
	public static void main(String[] args) 
	{
		Sub s = new Sub();
		Super s2 = new Sub();
		Sub s3=s2;
		
		if(s3 instanceof Sub s)
		{
			
		}
	}

}
