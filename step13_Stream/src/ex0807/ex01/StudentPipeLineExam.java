package ex0807.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student
{
	private String name;
	private int score;
	
	public Student() {}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}



	public int getScore() {
		return score;
	}

	
	
	
}




public class StudentPipeLineExam 
{
	
	

	public static void main(String[] args) 
	{
		List<Student> list = Arrays.asList(
											new Student ("희정", 100), new Student("가현",95),
											new Student ("찬범", 85), new Student("효리",80));			//asList는 여러개 넣을 수 있다는 뜻

		//stream API이용
		Stream<Student> studentStream = list.stream();
		//studentStream.forEach((s)->System.out.println);
		
		studentStream.forEach((s)->System.out.println(s.getScore()));
		
		
	}

}
