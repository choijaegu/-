package RightWheelCart;

public class Main {
	 public static void main(String[] args) {
	 // 빨간 바퀴를 가진 자동차
	 Wheel redWheel = new RedWheel();
	 ToyCar redCar = new ToyCar(redWheel);
	 redCar.run();
	 // 파란 바퀴를 가진 자동차
	 Wheel blueWheel = new BlueWheel();
	 ToyCar blueCar = new ToyCar(blueWheel);
	 blueCar.run();
	 }
	}
	//자동차는 바퀴 인터페이스를 통해 어떤 색의 바퀴도 사용 가능해진다