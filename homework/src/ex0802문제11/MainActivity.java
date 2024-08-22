package ex0802문제11;


class Activity
{
	public void onCreate()
	{
		System.out.println("기본적인 실행 내용");
	}
	
}



public class MainActivity extends Activity 
{
	@Override
	public void onCreate()
	{
		super.onCreate();								//Activity의 onCreate도 함께 실행시키고 싶다고 하니 super붙이면 댐
		System.out.println("추가적인 실행 내용");
	}
	
	
	public static void main(String[] args) 
	{
		MainActivity mainA = new MainActivity();
		mainA.onCreate();
	}
	
}
