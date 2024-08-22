package ex0723.final_abstract;

/*
 * 동물들의 공통의 속성과 메소드 정의
 */
abstract class Animal
{
	int legs;//다리수
	
	abstract public void sound();
	
	
	abstract public void run();
	
	public void eat()
	{
		System.out.println("고기를 좋아한다.");
	}
}
////////////////////////////////////////////////
/*abstract*/class Dog extends Animal
{

	@Override
	public void sound() 
	{
		System.out.println("Dog 멍멍");
	}

	@Override
	public void run() 
	{
		System.out.println("Dog 잘뛴다");
	}
}
/////////////////////////////////////////////////
	class Pig extends Animal
	{

	@Override
	public void sound() 
	{
		System.out.println("Pig 꿀꿀");
	}

	@Override
	public void run() 
	{
		System.out.println("Pig 못 뛴다...");
	}
	
	}
///////////////////////////////////////////////////
	class Cat extends Animal
	{
	@Override
	public void sound() 
	{
		System.out.println("Cat 야옹");
		
	}

	@Override
	public void run() 
	{
		System.out.println("잘 뛰고 잘 올라간다...");
		
	}
	public void eat()//오버라이딩
	{
		System.out.println("Cat 은 쥐를 먹는다");
	}
}

public class AbstractExam 
{		
	public static void test(Animal animal) 
	{//Cat or Pig or Dog...}
				animal.eat();
				animal.sound();
				animal.run();
	}
	
	

	public static void main(String[] args) 
	{
		System.out.println("******Test 해보자***********");
		//필드를 이용한 다형성 활용
		Animal an = new Cat();
		test(an);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		an=new Pig();
		test(an);
		an=new Dog();
		test(an);
				
		
	}
	
	
}
