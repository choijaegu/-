package RightWheelCart;



interface Wheel {
	 void roll();
	}
	//인터페이스 '바퀴'정의하여 바퀴의 동작을 정의

class RedWheel implements Wheel 
{
	 @Override
	 public void roll() 
	 {
		 System.out.println("빨간 바퀴가 굴러가요!");
	 }
}
	
class BlueWheel implements Wheel 
{
	 @Override
	 public void roll() 
	 {
		 System.out.println("파란 바퀴가 굴러가요!");
	 }
}
	//빨간 바퀴와 파란 바퀴가 바퀴 클래스를 구현


class ToyCar 
{
	 private Wheel wheel;
	 // 생성자에서 바퀴를 주입받아
	 public ToyCar(Wheel wheel) 
	 {
		 this.wheel = wheel;
	 }
	 public void run() 
	 {
		 wheel.roll();
	 }
}

