package ex0807.ex01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayPileLineExam
{
	static int sum = 0;
	public static void main(String[] args) 
	{
		System.out.println("1. String Array ---");
		String [] strArr = {"나영", "효리","미미", "미선"};
		Stream<String>strStream =Arrays.stream(strArr);			//String은 객체라 스트링필요
		//strStream.forEach((name)->System.out.println(name));
		strStream.forEach(System.out :: println);
		
		System.out.println("2. int Array ---");
		int [] intArr = {1,2,3,4,5,6,7,8,9};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(no->System.out.println(no));
		
		System.out.println();
		
		intStream = IntStream.rangeClosed(1,10);
		intStream.forEach(no->
		{	//syso(no)
			sum +=no;
			
		});
		
		
	}
		
}
	