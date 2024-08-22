package ex0723.final_abstract;
final class FinalClassExam{//상속불가, 생성가능
 final int i = -999999; //고정값, 값변경불가, 반드시 초기값이 필수
}


abstract class AbstractClassExam{	//상속가능,생성불가
    abstract String abstractMethodExam(int i,String s);    //기능없고, 재정의 필요
    final int finalMethodExam(int i, int j){ //재정의 불가
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	/*int finalMethodExam(int i, int j){ //final메소드는 재정의 불가.
		return i*j;
	}*/
	
}

class Sample02 {}/*extends FinalClassExam{  }	//final 클래스상속불가. 생성만 가능*/


 
abstract class Sample03 extends AbstractClassExam{		//클래스 앞에 abstract을 붙여야함.
	 String abstractMethodExam(String s,int i){		//
		return s+i;
	 }
	abstract String abstractMethodExam(int i,String s) ;    // abstract는 바디가없어야함 만약 잘못해서 바디 {} 를 달면 에러남.
														   // 그리고 클래스안에 메소드가 하나라도 abstract가 있을경우 class 앞에 
														   // abstract를 붙어야함

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

public class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace;/* = new AbstractClassExam(); //abstract 클래스는 생성불가하다. 타입은 가능하지만*/
		FinalClassExam fce = new FinalClassExam();
		//fce.i=100000;		//final필드는 반드시 고정값.
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}