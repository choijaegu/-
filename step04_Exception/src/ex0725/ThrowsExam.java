package ex0725;

import javax.print.attribute.SetOfIntegerSyntax;

class Test
{
	public void aa(int i)throws ArithmeticException, NullPointerException
	{
		System.out.println("aa 호출 됨..");
		//try {
		this.bb(i);
		//}
		//catch(ArithmeticException e)
		//{
			//System.out.println("0은 입력하면 안돼요!");
			
		//}
		
		System.out.println("aa 호출 끝..");
	}
	
	public void bb(int i)throws ArithmeticException, NullPointerException
	{
		System.out.println("bb 호출 됨..");
		try {
		int result = 100/i; //ArithmeticException			//최초로 오류난곳이고 aa로 가서 try,catch로 해본다.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ//
		System.out.println("결과 :"+result);				//그러면 final이없었으면 밑은 나오지 않았을 것이다.
		}finally{
		System.out.println("bb 호출 끝..");}
	}
}



public class ThrowsExam 
{

	public static void main(String[] args) 
	{
			System.out.println("**메인 시작합니다..");
			try{
				new Test().aa(10);
			}
			catch(ArithmeticException | NullPointerException e) {
				
				System.out.println("0은 안되고 다른 숫자를 입력해주세요");
			}
			
			System.out.println("메인 끝 입니다..");
	}

}
