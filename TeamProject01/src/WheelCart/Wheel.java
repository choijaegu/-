package WheelCart;

class RedWheel
{
	 void roll() 
	 {
	 System.out.println("빨간 바퀴가 굴러가요!");
	 }
}


class ToyCar 
{
	 private RedWheel Wheel;
	 public ToyCar() 
	 {
		 Wheel = new RedWheel(); // 자동차가 빨간 바퀴에 의존해요.
	 }
	 public void run() 
	 {
		 Wheel.roll();
	 }
}
	
public class Wheel 
{
	 public static void main(String[] args) 
	 {
	 ToyCar Car = new ToyCar();
	 Car.run();
	 }
}
	//이 경우에는 자동차는 꼭 빨간 바퀴를 써야 하며 다른 색의 바퀴를 쓸 수 없다.