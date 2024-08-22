package ex0717.array;

public class MultiArrayExam {
	
	//int [] [] arr = new int [3][4] ;// 선언
	
	/*int [][] arr = new int[][] 
	{
		{1,2,3},
		{2,4,6,8,0},
		{10},
		{10,20},
		{3,6,9}
		
	};*/
	
	int [][] arr = new int [3][];//행은 무조건 넣어야하고 열은 생략가능.
	
	public void test() //각 행마다 열의 개수를 생성
	{	
		arr[0] = new int [3];
		arr[1] = new int [5];
		arr[2] = new int [] {1,2,3,4,5,6,7};
		System.out.println("arr = "+arr);//주소값
		System.out.println(arr.length);//행의 길이가 나온다.
		System.out.println(arr[0].length);//0행의 열의길이가 나온다.
		//현재 배열방에 모든 값을 출력해보자.
		for (int i = 0; i <arr.length; i++)
		{	System.out.print(arr[i] + " = ");
			for (int j = 0; j<arr[i].length; j++)
			{	
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		/*MultiArrayExam ma= new MultiArrayExam();
		ma.test();*/
		
		new MultiArrayExam().test(); //1회성 호출로 객체 생성없이 바로 호출하는법
		
	}

}
