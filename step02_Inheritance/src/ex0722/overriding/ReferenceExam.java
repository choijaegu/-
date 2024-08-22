package ex0722.overriding;
class ObjectExam
{	
	String str;
	public ObjectExam(){}//기본생성자
	
	public ObjectExam(String str)
	{
		this.str=str;
	}//오버로딩
	
	@Override
	public String toString() 
	{
		
		return super.toString()+" | "+str;
	}
}




//////////////////////////////////////////
public class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="장희정"; 
			String s02="Java";//Java
			String s03=new String("월요일");
			
			ObjectExam oe1=new ObjectExam("배고프다");
			
			ObjectExam oe2=new ObjectExam("안녕");
			
			System.out.println(c);//a
			/*
			 * print(Object obj)or println(Object obj)메소드는
			 * 전달된 인수 obj.toString()메소드를 자동호출하고
			 * 그 메소드가 리턴한 값을 출력한다.
			 * String은 오브젝트이다.
			 * 모든 자바의 첫글자 대문자는 오브젝트를 상속하고있기 때문.
			 * 
			 */
			System.out.println(s01.toString());//장희정
			System.out.println(s02);//Java
			
			System.out.println(s03);//월요일
			
			System.out.println(oe1);//주소값 =>쉬고싶다.
			System.out.println(oe2);//주소값 =>쉬고싶다.
			
			
			
	}
}