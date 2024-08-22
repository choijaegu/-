package ex0802문제6;

/*
 * 상속 확인문제
 * 문제 6번
 */

public class Parent 
{
	public String name;
	
	
	//public Parent(){}									//이렇게 만들어 주면 됨.
	public Parent(String name)
	{
		this.name = name;
	}
}

class Child extends Parent
{
	public int studentNo;
	
	public Child(String name, int studentNo)			//자식생성자는 자동적으로 super() 즉, 부모쪽 생성자를 호출하는데 부모쪽에는 이런 생성자가 없으므로 에러가 뜸.
	{
		this.name = name;
		this.studentNo = studentNo;
	}
	
	
	
	
	
	
	
}
