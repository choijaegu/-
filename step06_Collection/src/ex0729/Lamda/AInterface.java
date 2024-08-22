package ex0729.Lamda;

/**
 * 함수형 인터페이스
 * : 난 반드시 메소드가 한개만 있다. - public abstract
 * 
 * 	단, static이나 default, private이 있을 수 있따.
 * 	-> 우리는 람다식으로 코딩할 수 있다.
 * : () -> 기능  이 가능함.
 */

@FunctionalInterface //함수형 인터페이스
public interface AInterface 
{
	void aa();
	
	//void cc(); 이건안됨.
	default void cc() {}	//디포트에 구현부 생성하면 가능함.
}
