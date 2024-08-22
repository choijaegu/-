package ex0729.Lamda;

public class LamdaTest 
{

	public static void main(String[] args) 
	{
		//1.기존코딩
		AInterface ai = new Test();
		ai.aa();
		
		
		//2.Anonymous Inner type로 변경
		AInterface au = new AInterface()
				{
					//public void aa();
					public void aa()
					{
						System.out.println("inner aa() call");
					}
				
				}; 
		
				
		
		//3.람다 변경
		//AInterface ai3 = ()->System.out.println("람다 aa()");
		AInterface ai3 = ()->
		{
		System.out.println("3람다 aa()");
		System.out.println("1람다 aa()");
		System.out.println("2람다 aa()");
		};
		
		System.out.println("----------------------------");
		ai3.aa();
		
		System.out.println("*****BInterface*****");
		
		BInterface bi = (i)->System.out.println("인수의 값: "+i);
		
		bi.bb(5);
		bi.bb(15);
		
		System.out.println("*********CInterface******");
		
		//CInterface ci = (i,j)-> i*j;				//( )안에 변수는 그냥 알아서 넣으면 됨.
													//한문장일땐 리턴값을 따로 안씀.
		//CInterface ci = (i,j)-> return i*j;			// 이렇게 쓰면 오히려 에러남.
		//CInterface ci = (i,j)-> {return i*j;};			// return을 꼭 쓰고싶다면 중괄호를 넣어야함.
		CInterface ci = (i,j)-> {	
									System.out.println("i와 j를 곱합니다");
									return i*j;
								};			
		
		
		
				
		int result = ci.cc(20, 3);
		System.out.println("결과: "+result);
		
	}//메인끝

}

///////////////////////////////////////////////
class Test implements AInterface
{
	public void aa()
	{
		System.out.println("aa 호출됨...");
	}
	
	
	
	
}