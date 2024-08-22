package ex0719.constructor;
class Puppy3{
	/*String 타입 전역 변수 선언
		int 타입 전역 변수 선언*/
	
		String str;
		int i;
		
	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
			Puppy3()//만약 void를 쓴다면 그냥 메소드가 되는 것.
			{	
				str="메리";
				System.out.println("puplic Puppy3()호출되었습니다");
				System.out.println(this.str+","+i);
			}
	
	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
			Puppy3(String str)
			{
				this.str = str;
				System.out.println("puplic Puppy3()호출되었습니다");
				System.out.println(this.str+","+i);
			}
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/		
			public Puppy3(String str1,String str2)
			{
					this(str1+str2);
					System.out.println("puplic Puppy3()호출되었습니다");
			}
			
	
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/					
			public Puppy3(boolean b)
			{
				this(b+"쫑");
				System.out.println("public Puppy3() 호출되었습니다");
				
			}
	
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/			
			public Puppy3(char ch)
			{
				this();
				this.i = ch;
				System.out.println("public Puppy3(char ch)호출되었습니다");
				System.out.println("전역변수 : "+this.i);
				
				
			}
			
	
	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/	
		
			public void printMemberVariable() 
			{
				System.out.println(str+","+i);
			}
	
}

public class ConstructorOverloadingExam{
		//메인메소드에서
		public static void main(String [] args){
			//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
			Puppy3 p1 =new Puppy3();
			Puppy3 p2= new Puppy3("Java");
			Puppy3 p3= new Puppy3("Java"+"Hi");
			Puppy3 p4= new Puppy3(true);
			/*ex)전역변수 초기화.
			 * 	 불린 호출한 곳으로 이동.
			 * 	 불린메소드의 첫줄이 스트링인수로 받으니 스트링하나짜리 메소드로 감
			 * 	거기서 첫줄실행하고 다시 불린메소드로 ㄱㄱ
			 *   끝나면 생성개체한 줄로 감.
			 */
			Puppy3 p5= new Puppy3('A');
			
		//각 객체의 printMemberVariable메소드를 한번씩 호출
			
	}
}