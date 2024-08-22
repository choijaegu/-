package list연습중;


import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class ListExam03
{
	List<Emp> list = new ArrayList<Emp>();
	
	
	public ListExam03 ()
	{
		list.add(new Emp(10,"장희정",20,"오리역"));
		list.add(new Emp(50,"이나영",25,"서울"));
		list.add(new Emp(30,"정미미",22,"서울"));
		list.add(new Emp(40,"정나라",30,"오리역"));
		list.add(new Emp(20, "김소희", 27,"대구"));
		
		for(Emp e:list)
		{
			System.out.println(e);
		}
		
		
		
		
	}
	
	
	/**
	 * 사원번호에 해당하는 사원정보를 검색
	 * @return 있으면 해당사원리턴,없으면 null
	 * @param int 사원번호
	 */
	
	public Emp findByEmpno(int empno)
	{
		for(Emp e : list)
		{
			if(e.getEmpno()==empno)
				return e;
			
			
			
		}
		
		return null;
	}

	
	/**
	 * 동일한 주소들의 사원들 검색.
	 * 
	 * @param args
	 */
	
	public List<Emp> findByAddr(String addr)
	{
		List<Emp> shallowCopyList = new ArrayList<Emp>();		//얕은 배열 생성해줌. 주소는 있지만 안에는 아무것도 들어있는게
		for(Emp e : list)										//그래서 카운트를 세줄 for문을 또 쓸 필요는 없다.
		{
			if(e.getAddr().equals(addr))
			{
				shallowCopyList.add(e);
			}
			
			
			
			
		}
		
		return shallowCopyList;
		
		
		
	}
	
	/**
	 * 사원번호를 기준으로 정렬하기
	 * :Comparable을 구현한 객체를
	 * @param args
	 */
	
	public List<Emp> sortByEmpno()
	{
		List<Emp> sortList  = new ArrayList<Emp>(list);		//이렇게 하면 원본은 그대로이고 sortList만 정렬할것.
		
		Collections.sort(sortList);							//int의 Integer는 자동으로 오버라이딩 되있어서 그 숫자 원소의 배열이면
															//따로 임플리먼츠를 안해도 되지만 안에있는 원소들을 비교하려면 compare해야함
		
		
		return sortList;
		
		
	}
	
	
	/**
	 * 나이를 기준으로 정렬하기
	 * :Comparator
	 * @param args
	 */
	
	public List<Emp> sortByAge()
	{
		List<Emp> sortList = new ArrayList<Emp>(list);
		
		Collections.sort(sortList, new Comparator<Emp>()	//구현부가 없이 끝내야 생성하는것이고 Comparator의 구현을 하기위한 바디를 열음
				{											//이자리에서만 쓸수밖에 없음. 일회용
					public int compare(Emp o1, Emp o2)		//자꾸 쓰려면 밑에 클래스 따로 열어서 해야함.
					{
						return o1.getAge()-o2.getAge();
					}
			
			
			
			
			
			
			
				});
		
		
		
		return sortList;
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		ListExam03 le = new ListExam03();
		System.out.println("1. 사원번호 검색");
		Emp emp = le.findByEmpno(30);
		System.out.println(emp);
		
		System.out.println("2. 주소 검색");
		List<Emp> resultList = le.findByAddr("서울");
		System.out.println(resultList);
		
		System.out.println("3. 사원번호 정렬---");
		resultList = le.sortByEmpno();
		for(Emp e:resultList)
		{
			System.out.println(e);
		}
		
		System.out.println("4. 나이 정렬----");
		resultList = le.sortByAge();
		for(Emp e:resultList)
		{
			System.out.println(e);
		}
		

	}

}
