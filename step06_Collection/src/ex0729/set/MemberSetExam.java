package ex0729.set;

import java.util.HashSet;  
import java.util.Set;

public class MemberSetExam extends HashSet<Member> 					
{
	
	//Set<Member> set = new HashSet<Member>();
	
	public MemberSetExam() 
	{	/**
		*set은 중복을 체크하기 위해서
		*hashcode() 호출하고 다르면 중복아님	
		*같으면 -> equals() 호출해서 false이면 중복아님 (equals는 주소값 으로 판단)
		*		   					 true이면 같은 객체인걸로 판단!!
		*/
		
		super.add(new Member("희정2", 22, "서울"));						//add할때마다 계속 hashcode를 호출함. 그래서 총 3개
		super.add(new Member("희정2", 22, "대구"));
		super.add(new Member("희정", 28, "대전"));
		
		System.out.println("저장된 개수: "+super.size());
		
	}
	
	
	public static void main(String[] args) 
	{
		new MemberSetExam();
	}
}
