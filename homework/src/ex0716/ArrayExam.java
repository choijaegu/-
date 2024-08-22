package ex0716;

class ArrayExam{
	
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	int [] intArr = new int [5]; //0
	double [] douArr = new double [5]; //0.0
	char [] chaArr = new char[5]; //u0000=공백
	boolean [] booArr = new boolean[5]; //false
	String [] strArr = new String[5]; //null

	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	public void printArrayValue01()
	{	
		int intLength=intArr.length;
		int douLength=douArr.length;
		int chaLength=chaArr.length;
		int booLength=booArr.length;
		int strLength=strArr.length;
		
		
		for(int i=0 ; i<intLength ; i++)
		{
			System.out.println("intArr ["+i+"] = "+intArr[i]);
		}
		
		for(int i=0 ; i<douLength ; i++)
		{
			System.out.println("douArr ["+i+"] = "+douArr[i]);
		}
		
		for(int i=0 ; i<chaLength ; i++)
		{
			System.out.println("chaArr ["+i+"] = "+chaArr[i]);
		}
		
		for(int i=0 ; i<booLength ; i++)
		{
			System.out.println("booArr ["+i+"] = "+booArr[i]);
		}
		
		for(int i=0 ; i<strLength ; i++)
		{
			System.out.println("strArr ["+i+"] = "+strArr[i]);
		}
		
	}

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	public void printArrayValue02()
	{
		for(int i = 0; i < 5; i++)
		{
			switch(i)
			{
				case 0: intArr[i] = 10;
				break;
				
				case 1:	intArr[i] = 20;
				break;
				
				case 2: intArr[i] = 30;
				break;
				
				case 3: intArr[i] = 40;
				break;
				
				case 4: intArr[i] = 50;
				break;
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			switch(i)
			{
				case 0: douArr[i] = 10.0;
				break;
				
				case 1:	douArr[i] = 20.0;
				break;
				
				case 2: douArr[i] = 30.0;
				break;
				
				case 3: douArr[i] = 40.0;
				break;
				
				case 4: douArr[i] = 50.0;
				break;
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			switch(i)
			{
				case 0: chaArr[i] = 'A';
				break;
				
				case 1:	chaArr[i] = 'B';
				break;
				
				case 2: chaArr[i] = 'C';
				break;
				
				case 3: chaArr[i] = 'D';
				break;
				
				case 4: chaArr[i] = 'E';
				break;
			}
		}

		for(int i = 0; i < 5; i++)
		{
			switch(i)
			{
				case 0: booArr[i] = true;
				break;
				
				case 1:	booArr[i] = false;
				break;
				
				case 2: booArr[i] = true;
				break;
				
				case 3: booArr[i] = false;
				break;
				
				case 4: booArr[i] = true;
				break;
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			switch(i)
			{
				case 0: strArr[i] = "가";
				break;
				
				case 1:	strArr[i] = "나";
				break;
				
				case 2: strArr[i] = "다";
				break;
				
				case 3: strArr[i] = "라";
				break;
				
				case 4: strArr[i] = "마";
				break;
			}
		}
	}
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	public void printArrayValue03()
	{	
		int intLength=intArr.length;
		int douLength=douArr.length;
		int chaLength=chaArr.length;
		int booLength=booArr.length;
		int strLength=strArr.length;
		
		for(int i = 0; i < intLength; i++)
		{
			System.out.println(intArr[i]);
		}
		
		for(int i = 0; i < douLength; i++)
		{
			System.out.println(douArr[i]);
		}
		
		for(int i = 0; i < douLength; i++)
		{
			System.out.println(chaArr[i]);
		}
		
		for(int i = 0; i < douLength; i++)
		{
			System.out.println(booArr[i]);
		}
		
		for(int i = 0; i < douLength; i++)
		{
			System.out.println(strArr[i]);
		}
	}
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	public static void main(String[] args) 
	{
		ArrayExam arr = new ArrayExam();
		
		arr.printArrayValue01();
		arr.printArrayValue02();
		arr.printArrayValue03();
	}
}