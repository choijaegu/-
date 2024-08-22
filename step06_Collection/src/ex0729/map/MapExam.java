package ex0729.map;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapExam 
{	
	Map<Integer, String> map = new HashMap<>();					//map에 넣을떄는 put, 꺼낼떈 get.
	public MapExam()
	{
		String re = map.put(10, "희정");						//put의 리턴은 value를 리턴하는데
																	//key 중복이 아니면 null
																//key 중복이면 같은 key의 해당하는 velue를 
																//수정하기 전에 수정전 value를 리턴해준다.
		System.out.println("re = "+re);
		
		re = map.put(30, "나영");
		System.out.println("re = "+re);
		
		re = map.put(40, "희정2");
		System.out.println("re = "+re);	
		
		map.put(20, "미미");
		map.put(50, "소희");
											
		System.out.println("저장된 개수: "+map.size());
		System.out.println("map = "+map);						//map은 들어가는 순서와 상관없음.
		
		//Map의 key와 value를 조회.
	
		//하기전에 모든 key들의 정보를 조회하는게 중요.
		Set<Integer> set = map.keySet();
		Iterator<Integer> keys=set.iterator();
		while(keys.hasNext())
		{
			int key = keys.next();
			String value = map.get(key);
			System.out.println(key+" | "+value);
		}
		
		//개선된 for문
		for(int key: set)
		{
			String value = map.get(key);
			System.out.println(key+" | "+value);
		}
		
		System.out.println("-----------Map.Entry<K,V>----------------------");
		
		Set<Map.Entry<Integer, String>> entrySet =  map.entrySet();			//<아우터이름.안에있는 이름> 이라는 뜻
		Iterator<Map.Entry<Integer, String>> it= entrySet.iterator();
		
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " | " + entry.getValue());
			
		}
		
		System.out.println("-----개선된 for변경------------------------------");
		for(	Map.Entry<Integer, String> entry  : map.entrySet())
		{
			System.out.println(entry.getKey() + " | "+ entry.getValue());
		}
		
		}
		
		
	
		
	
	
	
	public static void main(String[] args) throws  IOException
	{
		new MapExam();
		new Test03();

	}

}
	
class Test03
{
	Test03()	
	{	Properties pro = new Properties();
		
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("initinfo");
		try {
		pro.load(inputStream);
		}
		catch(IOException i)
		
		{
			i.printStackTrace();
		}
		for (  String key   : pro.stringPropertyNames()   )
		{
			String value = pro.getProperty(key);
			System.out.println(key + " = "+ value);		//map은 순서하고 관련없음.
		}
		
		
	}
}

