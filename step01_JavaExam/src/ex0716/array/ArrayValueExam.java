package ex0716.array;

class ArrayValue
{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	//int [] arr = new int [10];  //null
	//int [] arr = new int [10]; //배열은 생성될 때 모든 공간이 초기화된다.
	//int [] arr= new int[] {1,2,3,4,5,6,7,8,9,10}; // 명시적 초기화.	
	int [] arr = {1,2,3,4,5,6,7,8,9,10}; 
	
   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
	*/			
	public void printArrayvalue()
	{
		System.out.println("arr= "+arr);
		System.out.println("arr.length ="+arr.length);
		
		int len = arr.length; //권장은
		for(int i=0; i<len; i++)
		{
			//System.out.println("arr["+i+"]="+arr[i]);
			System.out.printf("arr[%d]=%d%n",i,arr[i]);
		}
		
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args [])
	{
        // ArrayValue에 있는 printArrayvalue메소드 호출
		ArrayValue arr2 = new ArrayValue();
		arr2.printArrayvalue();

	}
}