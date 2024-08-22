package ex0724;




class Parent 
{
	public String name;
	
	//public Parent();				//기본생성자를 넣거나,
	public Parent(String name)
	{
		this.name= name;	
	}
}

public class Child extends Parent
{
	public int studentNo;
	
	
	public Child(String name, int studentNo)
	{												//부모의 생성자를 호출하는 super(매개변수)가 없으면
		//super(name);								//기본생성자 super()가 보이진않지만 생기게 됨.
													//근데 위 부모클래스에 기본생성자가 없기 때문에 컴파일에러가 남
		this.name = name;
		this.studentNo=studentNo;
	}
	
	
}
