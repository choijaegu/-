package ex0729.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam 
{
	//Set<String> set = new HashSet<String>();
	Set<String> set = new TreeSet<String>();				//해쉬셋 에서 트리셋으로만 바꿔주면 됨.
															//기본이 올림차순이라 ㄱㄴㄷ 순으로 나올것임.
															//로또를 정렬해서 와라 하면 트리셋쓰면 편함.
	
	boolean re;
	
	public SetExam(String args[])
	{	
		for(String s : args)
		{
			boolean re= set.add(s);
			System.out.println(s+"추가결과: "+re);
		}														//결과를 보면 넣은 순서는 보장받지 못함.
		System.out.println("저장된 개수: "+ set.size());		//set은 중복없이 생성이 되야함.
		System.out.println("set = "+set);
		
		//set안에 있는 요소를 하나씩 조회 - 꺼내기
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())									//다음요소가 있을동안 반복을 해라
		{		
		String v = it.next();								//다음 요소를 꺼낸다.
		System.out.println(v);
		}
		
		System.out.println("\n\n");
		
		
		for(String i:set )									//for문으로 바꾸면?
		{	
			
			System.out.println(i);
		}
		
		System.out.println("------제거--------");
		
		this.re = set.remove("미미");
		
		
		System.out.println("제거 후 사이즈: "+set.size());
		System.out.println("제거 후 정보: "+set);
		System.out.println("제거결과: "+re);
		
	}															
																
																	
	public static void main(String[] args) 
	{
		new SetExam(args);									//로또번호는 사실 랜덤이라 순서가 없음.
	}
}
