package ex0724;

class Tire
{
	public void run()
	{
		System.out.println("일반 타이어가 굴러갑니다.");
	}
	
	
}

class SnowTire extends Tire
{
	@Override
	public void run()
	{
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
	
	
}



public class SnowTireExample 
{

	public static void main(String[] args) 
	{
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; //무조건 재정의된 메소드먼저.
		
		snowTire.run();
		tire.run();
	}

}
//스노우타이어가 굴러갑니다.
//스노우타이어가 굴러갑니다.