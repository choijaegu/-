package ex0710;

class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t=true ;//지역변수선언과 동시에 값할당
		boolean f=false;
		
		System.out.println("true&false="+(t&f));//true&false=false
		System.out.println("true&true="+(t&t));//true
		System.out.println("false&false="+(f&f));//false
		System.out.println();
	
		System.out.println("true|false="+(t|f));//true
		System.out.println("true|true="+(t|t));//true
		System.out.println("false|false="+(f|f));//false
		System.out.println();

		//xor은 양쪽이 같으면 false, 다르면 true
		System.out.println("true^false="+(t^f));//true
		System.out.println("true^true="+(t^t));//false
		System.out.println("true^false="+(t^f));//true
		System.out.println("true^true="+(t^t));//false
		System.out.println();

		System.out.println("true&&false="+(t&&f));//false
		System.out.println("true&&true="+(t&&t));//true
		System.out.println("true&&false="+(t&&f));//false
		System.out.println("false&&false="+(f&&f));//false
		System.out.println();

		System.out.println("true||false="+(t||f));//true
		System.out.println("true||true="+(t||t));//true
		System.out.println("false||false="+(f||f));//false
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i=" +i+ "\nint j=" +j);//int i=5 int j=3
		System.out.println("i>=j==>>"+(i>=j));//i>=j==>>true
		System.out.println("i>j=>>"+(i>j));//true
		System.out.println("i<=j=>>"+(i<=j));//false
		System.out.println("i<j=>>"+(i<j));//false
		System.out.println("i==j=>>"+(i==j));//false
		System.out.println("i!=j=>>"+(i != j));//true

	   System.out.println("-|,&와 ||,&&의 차이---------");

	
	   //System.out.println(true | test());//true
	   //System.out.println(true || test());//true
	   //System.out.println(false & test());//false
	   System.out.println(false && test());//false
	}//메인메소드 끝
	
	//메소드 작성
	public static boolean test() {
		System.out.println("test메소드 호출됨!");
	return false;
	}
}