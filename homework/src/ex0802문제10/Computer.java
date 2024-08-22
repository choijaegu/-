package ex0802문제10;


abstract class Machine
{
	public void powerOn()
	{
		
	}
	
	public void powerOff()
	{
		
	}
	
	public abstract void work();
}




public class Computer extends Machine
{
	/*public void work()				//추상메소드는 반드시 자식클래스에서 재정의(오버라이딩)해서 실행 내용을 채워야 한다.
	{
		
	}*/																										
}
