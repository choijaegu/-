package ex0807.ex01;

import java.util.Arrays;
import java.util.List;

public class MapToExam 
{
	public MapToExam()
	{
		List<Student> list = Arrays.asList(
				new Student ("희정", 100), new Student("가현",95),
				new Student ("찬범", 85), new Student("효리",80));			//asList는 여러개 넣을 수 있다는 뜻
			
		//학생의 점수만 Stream으로 만들고 싶다!!
		list.stream()
		.mapToInt(s->s.getScore())
		.forEach(System.out :: println);
		
		///////////////////////////////////////////////
		int sum =list.stream()
				.mapToInt(s->s.getScore())
				.sum();
		System.out.println("총점: "+sum);
		
		///////////////////////////////////////////////
		double avg	=list.stream()
					.mapToInt(s->s.getScore())
					.average()
					.getAsDouble();
		System.out.println("평균: "+avg);
		
		////////////////////////////////////////////////
		
		long count=	list.stream()
					.mapToInt(s->s.getScore())
					.count();
		System.out.println("count = "+count);
		
	}
	
	public static void main(String[] args) 
	{
		new MapToExam();
	}

}
