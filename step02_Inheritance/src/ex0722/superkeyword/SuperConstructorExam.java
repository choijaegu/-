package ex0722.superkeyword;

class Parent
{
	/*Parent()
	{ 
		System.out.println(1);
	}*/
	
	Parent(int i)
	{ 
		System.out.println(2);
	}
	
	Parent(String s)
	{ 
		System.out.println(3);
	}
}

class Child extends Parent //Child는 Parent다.
{
	Child()
	{	
		this(4);
		System.out.println(4);
	}
	
	Child(int i)
	{	
		super(i);
		
		System.out.println(5);
	}
	
	Child(boolean b)
	{	
		super(b+"쫑");
		System.out.println(6);
	}
	
	
}





public class SuperConstructorExam 
{
	
	public static void main(String[] args) 
	{
		//new Child(); // 1 4
		//new Child(3); // 1 5
		//new Child(true); // 1 6
		
		//만약, 부모생성자 1 2 3 없다면.디폴트 값이 자동적으로 생성되기 때문에 문제없다.
		
		
		//new Child(); // 1 4
		//new Child(3); // 1 5
		//new Child(true); // 1 6
		
		//만약, 부모생성자에 1 없고 2,3만 있다면 에러남.
		// 그래도 하고싶다면 this(값...),super(값...)을 하면 댐.
		new Child(); // 2 5 4 가 된다.
				/*new Child(3); // 1 5
				new Child(true); // 1 6*/
	}

}
