package ex0722.inheritance;

class Car
{		
		
		public String carname;
		public int cost;
		
		protected void printAttributes()
		{
			System.out.println("carname="+carname+"\tcost="+cost);
		}
}

////////////////////////////////////////////////////////////////////////
//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
	//각 클래스에 인수를 받지않는 생성자 작성
	//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당
class EfSonata extends Car
{
	EfSonata()
	{
		this.carname = "소나타";	//만약 이름이 중복된다면 this와 super가능.
		super.cost = 100;			//super는 부모를 지칭하는 키워드
		
	}
}
class Excel extends Car				
{	
	String color;
	Excel()
	{
		carname = "엑셀";
		cost = 200;
		
	}
}
class Carnival extends Car
{
	Carnival()
	{
		carname = "카니발";
		cost = 300;
		
	}
}
	

public class InheritanceExam
{
	//메인메소드에서 
	
		//Car, EfSonata, Excel, Canival 네개의 객체를 생성
		// 각 클래스에서 Car class에있는 printAttributes()메소드를 호출할수있다.
		public static void main(String[] args) 
		{	
			Car car = new Car();							//생성자를 호출하고 객체를 생성하는 순간 전역변수는 초기화.
			EfSonata es = new EfSonata();
			Excel ex = new Excel();
			Carnival cn = new Carnival();
			
			System.out.println("***각 객체의 주소*****");	/*단일 상속만 가능하기 때문에 현재 Car를 상속받은 Excel과 Carnival은 각각의 다른 Car를 상속받은것.
			 												* 그렇지 않다면 맨 마지막에 등록된 애가 다음거에 나옴.
			 												*/
			System.out.println("car = "+car);
			System.out.println("car = "+es);
			System.out.println("car = "+ex);
			System.out.println("car = "+cn);
			
			System.out.println("***각 객체의 메소드 호출 *******");
			car.printAttributes();
			es.printAttributes();		//부모로부터 다 상속받았기 때문에 모두 똑같은 메세지로 호출가능.
			ex.printAttributes();		//같은 속성을 가진 객체들을 extends로 묶어서 사용하므로 확장성과 재사용성에 용이하다.
			cn.printAttributes();
		}
	
}