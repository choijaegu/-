package ex0724;

//이 소스를 컴파일이 되도록 수정/추가/주석처리 하세요.
interface InterfaceExam00{					//생성 x, 상속 x, implements 이용해서 사용한다.
	abstract void interfaceExam00();		//public abstract가 기본이다.
}


interface InterfaceExam01 extends InterfaceExam00
{	//필드는 모두 public static final이 자동이다.
	final int i = 767;
	/*protected int k = 999;*/	public int k = 999;		//인터페이스 접근제한자는 무조건 public static
	
	void interfaceExam01(int i, int k);
}



interface InterfaceExam02
{
	int j =747;
	/*private int privateInt = 8;*/		int privateInt = 8;		//private쓰지말라고 //그리고 인터페이스는 앞에 아무것도 안쓰면 default가 아니라 public static final
	/*private void interfaceExam02(int j);*/ 	public void interfaceExma02(int j);		//public (abstract)가 국룰이고 뒤에 바디없이 ();로 끝내야함
																						
	
}



class SuperClassExam{
	String superString = "Super";

	String superMethod(){
		System.out.println("SuperClassExam.SuperMethod()가 호출되었습니다.");
		return "returnString";
	}
}

class SubClassExam01 extends SuperClassExam implements InterfaceExam01		//인터페이스는 implemnets로 상속해야함
{ 			
			public void interfaceExam00() {};						//public으로 다 바꿔준 뒤 위에 내용들을 전부 재정의해야함.
																	//사실 인터페이스 메소드들은 public들을 모두 숨기고 있던것.
			public void interfaceExam01(int i, int k) {};
}


 class SubClassExam02 extends SuperClassExam 
				implements InterfaceExam01, InterfaceExam02
{
	 		public void interfaceExma02(int j) {};
	 		public void interfaceExam01(int i, int k) {};			//InterfaceExam 00,01,02에 있는 메소드들 전부 재정의 하고 뒤에 body까지 붙여줘야함.
	 		public void interfaceExam00() {};

}


abstract class SubClassExam03 
			extends SuperClassExam implements InterfaceExam01, InterfaceExam02{}			//abstract라 body 안넣어도 됨 class는 extends로 상속해주기
			

class SubClassExam04 extends SubClassExam02{
	//여기에 필요한 것들을 추가하여 문제를 해결하세요..
	public void interfaceExam00(){}
	public void interfaceExam01(int i, int k){}
	public void interfaceExam02(int j){}

	SubClassExam04(){
		System.out.println("subClassExam04() 객체 생성");
		System.out.println(" i = "+i);
		System.out.println(" j = "+j);
	}
	SubClassExam04(String s1, String s2){
		System.out.println(s1+" 타입 "+"subClassExam04("+s2+") 객체 생성");
		
	}
	void printSuperString(){
		InterfaceExam01 ie01; /*= new InterfaceExam01();*/ //타입은 바꿀수 있으나 생성은 안된다. 
		

		System.out.println(" superString = "+superString);
	}
}

//여기서부터는 하나도 고치지 마시고 그대로 쓰면 됩니다.
public class ImplememtsInterfaceExam{ 
	public static void main(String args[]){		
		SubClassExam02 sub02sub04 = 	new SubClassExam04("SubClassExam02", "sub02sub04");
		SuperClassExam  superSub04 = 	new SubClassExam04("SuperClassExam", "superSub04");
		InterfaceExam01 ifc01Sub04 = 	new SubClassExam04("InterfaceExam01", "ifc01Sub04");
		SubClassExam04 sub04 = 			new SubClassExam04();
		sub04.interfaceExam00();
		sub04.interfaceExam01(1,7);
		sub04.superMethod();
	}
}


/*SubClassExma 04는 
  SubClassExam 02 이다
  SuperClassExam 도
  IterfateExam 01 도
  InterFaceExam 02 도
  InterfaceExam 00*/

/*인터페이스를 익스텐트 대신 쓰는이유
*더욱 확장이 가능하다(다중상속)
*상속은 둘의 기능이 비슷한것끼리 많이쓰고 인터페이스는 규격화된 틀 같은것을 정의할 때 많이쓴다.
*아직 구체화되진 않았지만 쓰는것이 인터페이스이다.
*/