package ex0725.ex03;

public class CarAgency implements Rentable<Car> {			//클래스는 new키워드로 <>안에 타입을 넣어주지만 implements 옆에 넣어준다.

	@Override
	public Car rent() {
		return new Car();
	}

}
