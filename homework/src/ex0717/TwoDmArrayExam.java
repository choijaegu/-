package ex0717;
//TwoDmArrayExam.java

class TwoDmArray
{	String twoDmArray[] = new String[4] ;
	//String을 저장하는 twoDmArray 배열선언
	public void make2DmArray()
	{	
		twoDmArray[0] = "가";
		twoDmArray[1] = "나";
		twoDmArray[2] = "다";
		twoDmArray[3] = "라";
	}
	//메소드 make2DmArray
	
		//twoDmArray 배열에  값을 할당
	public void print2DmArray()
	{	
		int twoLen = twoDmArray.length;
	
		for(int i = 0; i<twoLen; i++)
		{
			System.out.println(twoDmArray[i]+"\t");
		}
	}
		
	//메소드 print2DmArray
	//	twoDmArray 배열의 값을 주어진형식으로 출력
		
}

public class TwoDmArrayExam
{

	public static void main(String[] args) 
	{
		TwoDmArray td = new TwoDmArray();
		td.make2DmArray();
		td.print2DmArray();
		
	}
	//main메소드에서
	
		//TwoDmArray객체생성
		
		//TwoDmArray객체의 make2DmArray메소드 호출
		
		//TwoDmArray객체의 print2DmArray메소드 호출
		
	}