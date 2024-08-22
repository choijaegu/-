package ex0722.inheritance;
class CarCenter
{
	public void engineer(Car cd)	//Car cd = ex객체넣어라.=>ex)객체를 넣어라
	{	
		System.out.println("cd주소 : "+cd);
		
		//System.out.println(cd.color); 	부모타입변수로 자식부분 접근불가!!!!!
		//자식을 부모타입에 넣는다. =>부모가 더 크다고 판단하기 때문에  '프로모션'이라고 함;
		//실행 도중 ClassCastException이 발생할 확률을 낮추기 위해 instanceog 연산자 사용
		//부모타입을 => 다시 자식타입으로 변환하면 자식부분을 접근할수 있다!!!
		
		
		
		//부모타입을 자식변수를 저장하려면 ObjentDwonCasting을 해야한다.
		
		if(cd instanceof Excel) {
			Excel e =(Excel)cd;  //Type mismatch: cannot convert from Car to Excel
			System.out.println("");
		}
		
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}
}
////////////////////////////////////////////////////////
public class PolymorphismExam
{
	public static void main(String[] args)
	{
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car car= new Car();
		
		System.out.println("ex주소 : " + ex);
		System.out.println("ex.color = " + ex.color);
		
		cc.engineer(car);//
		cc.engineer(ef);//
		cc.engineer(ca);
		cc.engineer(ex);
		
		
	
	}
}
