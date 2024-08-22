package ex0722.instanceofEx;
//에러나는부분을 주석처리하고 이유를 써보세요!
class Car{} 
class EfSonata extends Car{}
class Excel extends Car{}
class Canival extends Car{}
class People{}

public class InstanceofExam{
	public static void main(String args []){
		
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel ex = new Excel();
		Canival ca = new Canival();
		People p = new People();		
		
		/* 반드시 왼쪽이 변수 오른쪽이 타입.
		⇨ 왼쪽의 변수가 오른쪽의 Type이 될 수 있느냐?
				3 왼쪽의 변수형이 오른쪽의 Type과 같거나 서브 class일 때 true이다.
				(왼쪽 <= 오른쪽)*/
		if(car instanceof Car){
			System.out.println("car instanceof Car is true");// O
		}else{
			System.out.println("car instanceof Car is false");
		}

		
		if(car instanceof EfSonata){
			System.out.println("car instanceof EfSonata is true");
		}else{
			System.out.println("car instanceof EfSonata is false");//O
		}
		
		if(ef instanceof Car){ 
			System.out.println("ef instanceof Car is true");// O
		}else{
			System.out.println("ef instanceof Car is false");
		}
		
		if(ex instanceof Car){
			System.out.println("ex instanceof Car is true");// O
		}else{
			System.out.println("ex instanceof Car is false");
		}
		
		if(ca instanceof Car){
			System.out.println("ca instanceof Car is true");// O
		}else{
			System.out.println("ca instanceof Car is false");
		}
		
		/*if(p instanceof Car){//instanceof 연산자는 상속관계일때 사용할수 있다.
							 //p가 Car 타입으로 갈수 있니? 물어보는 것. 
							 //instanceof는 반드시 상속관계일때만 사용할 수 있기 때문.
							 //people과 Car는 아무런 관계가 없고 people은 object에 상속되어있다.
			System.out.println("p instanceof Car is true");
		} */
	}
}	