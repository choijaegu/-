package ex0807.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapExam 
{
	
	public FlatMapExam()
	{
		List<String> list = new ArrayList<>();
		list.add("My name is Heejung");
		list.add("Have a nice day");
		
		//list.stream().forEach(sentence->System.out.println(sentence));
		
		//list에 있는 항목을 공백을 기준으로 분리해서 Stream으로 만들고 싶다.
		list.stream()
			.flatMap((sentence)-> 			//중간처리반복자는 최후반복자가 없으면 결과값이 안나옴.
			Arrays.stream(sentence.split(" ")))
			.forEach(n->System.out.println(n));
		
		System.out.println("===========================");
		List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		
		list2.stream()
		.flatMapToInt(data->{
			String s [] = data.split(",");
			
			int [] arr = new int [s.length];
			
			
			for(int i = 0; i<arr.length; i++)
			{
				arr [i] = Integer.parseInt(s[i]);
			}
			
			
			
			return Arrays.stream(arr);
		})
		.forEach(no->System.out.println(no));
		
				
		
	}
	public static void main(String[] args)
	{
		new FlatMapExam();
	}

}
