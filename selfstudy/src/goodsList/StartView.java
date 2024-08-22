package goodsList;

import java.util.List;
import java.util.ArrayList;


public class StartView 
{	
	
	List<Goods> list = new ArrayList<Goods>();
	
	public StartView()
	{	
		list.add(new Goods("A01" , "새우깡" , "2500" , "짜고 맛나다."));
		list.add(new Goods("A02" , "고구마깡" , "3500" , "고구마맛이고 달다."));
		list.add(new Goods("A03" , "감자깡" , "5000" , "감자맛에 고소한 맛"));
		list.add(new Goods("A04" , "허니버터칩" , "2200" , "달콤하다"));
		list.add(new Goods("A05" , "콘칩" , "3000" , "고소하다."));
		
		
	}
	
	public static void main(String[] args) 
	{
		StartView start = new StartView();
		System.out.println("********프로그램을 시작합니다.*********");
		
		
		
	}
	
	
	
	
}
