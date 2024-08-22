package ex0710.제어문;

public class IfExam01 {

	public static void main(String[] args) {
	int i = (int)(Math.random()*1001)+1;;
	System.out.println("i="+i);//난수발생
		//정수형 변수를 선언하고 적당한 값으로 초기화 한다.
	
	//난수발생
	
	double nansu = Math.random()*5+1;
	System.out.println("nansu = "+ nansu);
	if(i%2==1) {
		System.out.println(i+"는 홀수");
	}else {System.out.println(i+"는 짝수");
		// 선언한 정수형 변수의 값이 짝수인지 홀수 인지 출력해주세요.

	}
	}
}
