package ex0712;

class Methodinvoke01{
	//다음과 같이 메소드를 작성하세요.
	
	/*method 이름 : method01
	어디서나 누구나 접근가능=>static을 붙여라.
	정수 리턴
	인수로 정수2개 받음
	인수로 들어온 정수 2개를 곱해서 출력하고 리턴*/
	public static int method01(int i , int j)
	{
		int a = i*j;
		System.out.println(a);
		return a;
	}
	
}

class Methodinvoke02{
	
	//method 이름 : method02
	//어디서나 누구나 접근가능,객체를 생성하지 않고도 접근가능=>static을 붙여라.
	//정수 리턴
	//인수로 정수2개 받음
	
	//인수로 들어온 정수 2개를 더해서 출력하고 더한수 리턴
	public static int method02(int q , int w)
	{
		int e = q+w;
		System.out.println(e);
		return e;
	}
		
	

	
}

class MethodInvokeExam{
	public static void main(String []args){
		//MethodInvoke01의 method01 호출
		int k = Methodinvoke01.method01(33 , 22);
		System.out.println(k);
		
		

		//MethodInvoke02의 method02 호출
		int l = Methodinvoke02.method02(45 , 22);
		System.out.println(l);
		

		

	}
}

