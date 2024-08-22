package ex0801.ex02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExam 
{
	public SortExam()
	{
		List<Student> list = Arrays.asList(
				new Student ("희정", 100), new Student("가현",95),
				new Student ("찬범", 85), new Student("효리",80));	
		
		System.out.println("점수를 기준으로 정렬");
		list.stream()
		//.sorted()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out :: println);
		
		System.out.println("==================================");
		list.stream().sorted((x,y)->Integer.compare(x.getScore(), y.getScore())).forEach(System.out :: println);
	}
	
	public static void main(String[] args) 
	{
		new SortExam();

	}

}
