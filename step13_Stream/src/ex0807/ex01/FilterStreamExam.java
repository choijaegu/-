package ex0807.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStreamExam 
{
	public FilterStreamExam ()
	{
		List<String> list = 
				Arrays.asList("장희정","이나영","장희정","이찬범","이효리");
				//asList는 (...)을 하면 쭉 만들어짐
		
		//stream api	제일먼저 스트림 해야함.
		list.stream()
		.distinct()
		.forEach(System.out :: println);
		
		System.out.println("--------------------");
		
		/*Stream<String> strStream = list.stream().filter((t)->{
			boolean re = t.startsWith("이");
			//기능
			return re;
		});*/
		
		//Stream<String> strStream = list.stream().filter((t)->t.startsWith("이"));
		
		//strStream.forEach(System.out :: println);
		
		//중복을 제거하고 장으로 시작하고 이름을 출력하세요.
		
		list.stream().distinct().filter((t)->t.startsWith("장")).forEach(System.out :: println);
	
	}
	public static void main(String[] args) 
	{
		new FilterStreamExam ();
	}

}
