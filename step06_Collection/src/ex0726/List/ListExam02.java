package ex0726.List;

import java.util.Vector;  
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


//public class ListExam01 extends ArrayList<Integer>//나는 리스트에 숫자와 관련된 것만 하겠습니다.
public class ListExam02 
{	
	List<Integer> list;	//null 인 상태를 선언만 한 것.
	//그냥 List가아니라 여기도 ArrayList가 오면 종속성이 생겨서 필드를 이용한 다형성을 못 발휘함
	//그래서 필드에 List로 와야 아래에 Linked나 Vector 를 넣을 수있음
	
	public ListExam02()
	{	//list = new ArrayList<>(5);//이게 (5) 5개 범위
		//list = new Vercot<>(5);
		list = new LinkedList<>(5);
	
	list.add(5);	//int형 받는 부모생성자 호출. 범위가 5다.하지만 더 늘어나면 사이즈가 늘어난다.
	list.add(5); //오토박싱
	list.add(15); 
	list.add(52); 
	list.add(53); 
	list.add(5655); 
	list.add(55); 
	list.add(5325); 
	list.add(25); 
	list.add(5535); 
	list.add(5); 
		list.add(15166); 
		list.add(5); 
		list.add(551); 
		list.add(523); 
		list.add(55235235); 
		list.add(235); 
		list.add(25352); 
		list.add(355); 
		list.add(5225); 
		list.add(552); 
		list.add(5235); 
		list.add(235); 
		list.add(5); 
		//부모부르는 법은 super. this. 생략 모두 가능.
		
		System.out.println("추가된 요소의 개수: "+ list.size());
		
		//요소를 꺼내기
		for(int i = 0 ; i <list.size();i++)
		{
			int v = list.get(i);	//언박싱
			System.out.println(v);
		}
		
		//개선된 for문
		System.out.println("-----개선된 for------");
		//for(타입 변수 : 반복대상)
		
		for(int v : list)
		{
			System.out.println(v);
		}
		
		//super는 그냥 부모를 지칭하는것이고 this는 주소문이다.
		//syso해서 this를 넣어보고 super를 넣어보아라.super는 쓸수없음.
		//super는 부모를 지칭해서 뒤에 뭐를 하려는것임.
		System.out.println("this = "+ this );  	/*this.toString()이 호출되는것.
		
													
													this 는 투스트링이 오버라이딩되서 이렇게 나오도록해놓음*/
		
		list.remove(2);
		
		System.out.println("삭제 후 this: "+list);
		System.out.println("삭제 후 저장된 수: "+list.size());
		
		//정렬
		Collections.sort(list);		//올림차순
		System.out.println(list);
		
		
		Collections.sort(list, Collections.reverseOrder());		//내림차순
		
		System.out.println(list);
		
		
	}                                               
	
	
	
	public static void main(String[] args) 
	{
		new ListExam02(); 	//리스트를 생성할때 ArrayList의 기본생성자가 호출된다.
		
		
		
		
	}

}
