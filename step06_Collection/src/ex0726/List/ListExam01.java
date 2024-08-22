package ex0726.List;

import java.util.Vector;  
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


//public class ListExam01 extends ArrayList<Integer>//나는 리스트에 숫자와 관련된 것만 하겠습니다.
public class ListExam01 extends ArrayList<Integer>
{
	public ListExam01()
	{
		super(5);	//int형 받는 부모생성자 호출. 범위가 5다.하지만 더 늘어나면 사이즈가 늘어난다.
		super.add(5); //오토박싱
		super.add(15); 
		super.add(52); 
		super.add(53); 
		super.add(5655); 
		super.add(55); 
		super.add(5325); 
		super.add(25); 
		super.add(5535); 
		super.add(5); 
		super.add(15166); 
		super.add(5); 
		super.add(551); 
		super.add(523); 
		super.add(55235235); 
		super.add(235); 
		super.add(25352); 
		super.add(355); 
		super.add(5225); 
		super.add(552); 
		this.add(5235); 
		add(235); 
		super.add(5); 
		//부모부르는 법은 super. this. 생략 모두 가능.
		
		System.out.println("추가된 요소의 개수: "+ this.size());
		
		//요소를 꺼내기
		for(int i = 0 ; i <this.size();i++)
		{
			int v = super.get(i);	//언박싱
			System.out.println(v);
		}
		
		//개선된 for문
		System.out.println("-----개선된 for------");
		//for(타입 변수 : 반복대상)
		
		for(int v : this)
		{
			System.out.println(v);
		}
		
		//super는 그냥 부모를 지칭하는것이고 this는 주소문이다.
		//syso해서 this를 넣어보고 super를 넣어보아라.super는 쓸수없음.
		//super는 부모를 지칭해서 뒤에 뭐를 하려는것임.
		System.out.println("this = "+ this );  	/*this.toString()이 호출되는것.
		
													
													this 는 투스트링이 오버라이딩되서 이렇게 나오도록해놓음*/
		
		super.remove(2);
		
		System.out.println("삭제 후 this: "+this);
		System.out.println("삭제 후 저장된 수: "+this.size());
		
		//정렬
		Collections.sort(this);		//올림차순
		System.out.println(this);
		
		
		Collections.sort(this, Collections.reverseOrder());		//내림차순
		
		System.out.println(this);
		
		
	}                                               
	
	
	
	public static void main(String[] args) 
	{
		new ListExam01(); 	//리스트를 생성할때 ArrayList의 기본생성자가 호출된다.
		
		
		
		
	}

}
