package selfstudy;

public class 배열연습문01 {

	int [] arr;
	
	public void array(int i)
	{	
		int [] arr = new int[i];
		arr[2]=100;
		arr[i]=300;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		System.out.println(arr[i]);
	}
	
	public static void main(String[] args) 
	{
		배열연습문01 arr1 = new 배열연습문01();
		arr1.array(50);
	}

}
