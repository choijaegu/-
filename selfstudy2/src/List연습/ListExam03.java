package List연습;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 



public class ListExam03 
{
	List<Emp>list = new ArrayList<Emp>();
	
	
	
	public Emp findByEmpno(int Empno)
	{
		for(Emp e :list   )
		{
			if(e.getEmpno()==Empno)
			{
				return e;
			}
			
		}
		return null;
		
	}
	
	public List<Emp> findByAddr(String addr)
	{
		List<Emp> shallowlist = new ArrayList<Emp>();
		for(Emp  e : list )
		{
			if(e.getAddr().equals(addr))
			{
				shallowlist.add(e);
			}
		}
		return null;
		
	}
	
	public List<Emp> sortByEmpno()
	{
		List<Emp>sortList = new ArrayList<Emp>(list);
		
		Collections.sort(sortList, (Emp o1,Emp o2)->o1.getEmpno()-o2.getEmpno());
		return sortList;
		
	}
	
	
	
	
	
	public ListExam03()
	{
		/**
		 * 생성자
		 * @param args
		 */
		
		list.add(new Emp(10,"장희정",20,"오리역"));
		list.add(new Emp(50,"이나영",25,"서울"));
		list.add(new Emp(30,"정미미",22,"서울"));
		list.add(new Emp(40,"정나라",30,"오리역"));
		list.add(new Emp(20, "김소희",27,"대구"));
		
		for(Emp e: list)
		{
			System.out.println(e);
		}
		
		System.out.println("1. 사원번호 검색");
		Emp emp = findByEmpno(30);
		System.out.println(emp);
		
		System.out.println("2. 주소 검색");
		List<Emp> resultList = findByAddr("서울");
		System.out.println(resultList);
		
		System.out.println("3. 사원번호 정렬");
		resultList = sortByEmpno();
		for(Emp e: list )
		{
			System.out.println(e);
		}
		
		System.out.println("4. 나이 정렬");
		resultList = sortByAge();
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		new ListExam03();
		
	}

}
