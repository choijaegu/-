package selfstudy;

public class 지역변수전역변수연습 {

	int a; 	//전역변수
	String s; 	/*전역변수 = 맴버필드 = Field
				*전역변수는 class 블럭 안에 어디든 있어도 상관없음.
				*전역변수 앞에는 제한자가 올 수 있다.
				*/
	public void aa(int a)	//이때 a는 지역변수.
	{
		System.out.println(a); // 이때 a는 지역변수.(가까운 곳)
		System.out.println( this.a ); //a는 전역변수.(this는 생성된 객체의 주소값)
									
									/*같은 class 내부에 있는 method를 호출할 때도
									 * this.method이름(인수값,인수값...);
									 * 으로 적기도 하므로 혼동x(이 때 this는 생략가능)
									 */
		System.out.println(s); //전역변수 ok
		System.out.println(this.s);//전역변수 ok
		
	}
	
	public void bb()
	{
		int b = 0 ; //지역변수 ->접근제한자 사용불가(사용 전 반드시 초기화해야함.)
		
		System.out.println(a);  //전역변수.
		System.out.println( this.a );  //전역변수
		
		System.out.println(s);  //전역변수
		System.out.println( this.s);  //전역변수
	}
	
	public static void main(String[] args) 
	{
		
	}

}
