package ex0725;

public class ExceptionExam {
	
	
	public static void main(String[] args) 
	{
		System.out.println("***메인 시작합니다.*******");
		
		System.out.println("args = "+args);
		try {
			//예외 가능성 코드 작성
			String param = args[0];
			System.out.println("param = "+param);
			//String => int변환
			int convertNo =Integer.parseInt(param);
			System.out.println("convertNO="+ convertNo);
			
		
			int result = 100/ convertNo;  //ArithmeticException 예외 가능성(0으로 나눌떄)
			System.out.println("나눈결과 ="+result);
					
					
		}
		
	
		//catch를 여러개 작성할 때 반드시 서브 클래스 부터 작성해야함
		
		catch(ArrayIndexOutOfBoundsException e)
		{	//예외발생 했을때 해야할 일 작성
			//제일 처음 대부분하는것.
			System.out.println("e ="+e.toString()); 	//객체를 찍으면 주소가 나와야함 e.toString() 호출
		
		
	    }
		catch(NumberFormatException e)
		{
			System.out.println("숫자만 입력하세요"+e.getMessage());		//겟메세지는 오류난 곳을 써주는 것.
														
		}
		catch(Exception e)	//Exception이 예외의 최고조상
		{
			System.out.println("예외가 발생했어요~!~");		//순서가 가장 중요!.
			e.printStackTrace(); //출력(개발모드에서 사용하고 운영모드에서 모두 제거 필수)
		}		
		finally
		{
			System.out.println("난 예외 발생여부 상관없이 무조건 실행해요~");
		}
		
		
		System.out.println("***메인 끝입니다.***********");	//프로그램을 끝까지 처리한다.
	}

}
//실행할때 콘솔(CMD)에서 java Ex
