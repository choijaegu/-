package ex0724;

abstract class Machine
{
	Machine(){}
	public void powerOn() {}
	public void powerOff() {}
	public abstract void work();
}

public abstract class Computer extends Machine	//부모클래스애 기본생성자가 없음.
{
										//자식클래스에서 재정의된 abstract문을 쓰거나
										//자식클래스 앞에도 abstract를 써야함
}
