package ex0807.ex03;

import java.util.Arrays;
import java.util.List;

import ex0801.ex02.Student;

public class MatchExma
{
	
	
	public MatchExma()
	{
		int []intArr = {1,2,3,4,5,6,7,8,9};
		
		
		int num = Arrays.stream(intArr).max().getAsInt();
		System.out.println(num);
		
		
		
		int total =Arrays.stream(intArr)
		.peek(no->System.out.println(no))		//중간처리 메소드 이기때문에 최종처리 메소드 없으면 동작은 안한다.
		.sum();
		System.out.println("총합 ="+total);
		System.out.println("--------------");
		/*boolean re = Arrays.stream(intArr).allMatch(new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				System.out.println(value);
				return value%2==1;
			}
		});
		System.out.println("allMatch 결과: "+re);*/
		
		//boolean re = Arrays.stream(intArr).allMatch(no->no%2==0);
		boolean re = Arrays.stream(intArr).anyMatch(no->no%2==0);
		System.out.println("allMatch 결과: "+re);
		//////////////////////////////////////////////////////////////////////
		List<Student> list = Arrays.asList(
				new Student ("희정", 100), new Student("가현",95),
				new Student ("찬범", 85), new Student("효리",80));	
		
		
		//모든 학생들이 80점 이상인지 체크
		
		re = list.stream().allMatch(s->s.getScore()>=80);
		System.out.println(re);
		
		//학생들 중에 한명이라도 60점 미만이 있는지 체크
		re = list.stream().anyMatch(s->s.getScore()<60);
		
		//점수가 80이상인 학생이 몇명인지?
		long count = list.stream()
		.filter(s -> s.getScore()>=80)
		.peek(System.out::println)
		.count();
		
		System.out.println("몇명: "+count);
		
		System.out.println(re);
	}

	public static void main(String[] args) 
	{
		new  MatchExma();

	}

}
