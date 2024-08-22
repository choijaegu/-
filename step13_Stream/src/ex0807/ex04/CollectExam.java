package ex0807.ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam 
{

	
	public CollectExam ()
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student("희정", "여", 85));
		list.add(new Student("효민", "여", 90));
		list.add(new Student("재석", "남", 70));
		list.add(new Student("민서", "남", 75));
		list.add(new Student("나영", "여", 90));
		
		//남 학생만 list로 만들고 싶다.
		List<Student>maleList = list.stream()
		.filter(s->s.getGender().equals("남"))			//boolean형으로 트루인것들을 모아라.
		//.collect(Collectors.toList());
		.toList();
		maleList.stream().forEach(m->System.out.println(m));
		
		System.out.println("-------List--> Map으로 변환-----");
		//학생의 이름을 key, 학생의 점수를 value로 갖는 Map을 만들고 싶다.
		
		Map<String,Integer> map = list.stream()
								.collect(Collectors.toMap(st->st.getName(), st->st.getScore()));
		
		System.out.println(map);
	}
	
	
	
	public static void main(String[] args) 
	{
		new CollectExam ();
	}
	

}
