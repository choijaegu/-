package ex0715.staticEx;

public class StaticMethodExam {
	
	int a=5;
	static int b = 10;
	
	public void aa()
	{
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(StaticMethodExam.b);
		
		//메소드호출
		bb();
		this.bb();
		
		dd();
		this.dd();
		StaticMethodExam.dd();
		
		
	}//aa() 끝
	
	public void bb()
	{
		
	}
	
	//static안에서 non-static 접근불가, this키워드 사용안됨.
	public static void cc() //StaticMethodExam.cc()호출했을거다.
	{
		//System.out.println(a);
		//System.out.println(this.a);
		
		System.out.println(b);
		//System.out.println(this.b);
		System.out.println(StaticMethodExam.b);
		
		//메소드호출
				//bb();
				//this.bb();
				
				dd();
				//this.dd();
				StaticMethodExam.dd();
	}//cc() 끝
	
	public static void dd()
	{
		
	}
	
	public static void main(String[] args) /*static은 non-static접근불가
											우리가 메소드 호출하는 방법중 static인지 확인하는게 최우선.
											메인에 static이 붙어있기 때문에 같은 class였어도 this를 사용할 수 없다.
											즉 같은 class면서 서로 static이거나 non-static일 때 this 이용 가능.
											*/
	{
		dd();
		//aa(); 같은 클래스임에도 불구하고 this생략이 안됨.
	}

}
