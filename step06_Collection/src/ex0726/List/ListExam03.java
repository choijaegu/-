package ex0726.List;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExam03 
{	
	List<Emp> list = new ArrayList<Emp>();				//그래서 배열을 리턴하거나 할때 List<Emp>로 해야 Tress로 바꿀수있음
	/**
	 * 생성자
	 * @param args
	 */
	public ListExam03 ()
	{
		list.add(new Emp(10,"장희정",20,"오리역"));
		list.add(new Emp(50,"이나영",25,"서울"));
		list.add(new Emp(30,"정미미",22,"서울"));
		list.add(new Emp(40,"정나라",30,"오리역"));
		list.add(new Emp(20,"김소희",27,"대구"));
		
		
		for(Emp e:list)
		{System.out.println(e);}
		
		
	}
	
	
	/**
	 * 사원번호에 해당한느 사원정보를 검색
	 * @param args
	 */
	
	public Emp findByEmpno(int empno)
	{
		/*for(int i = 0; i <list.size();i++)
		{
			Emp e=list.get(i);
			if(e.getEmpno()==empno)
			{
				return e;
			}
				
			
		}*/
		for(Emp e : list)
		{
			if(e.getEmpno()==empno)
				return e;
		}
		//못 찾았다.
		return null;
	}
	
	
	
	/**
	 * 
	 * 주소를 인수로 잡다 동일한 주소의
	 * 사원들검색
	 * @param args
	 */
	
	
	public List<Emp> findByAddr(String addr)
	{	
		List<Emp> shallowCopyList = new ArrayList<Emp>();		//얕은 배열 생성해줌.주소는 있지만 안에는 아무것도 들어있는게 없는.
		for(Emp e: list)										//그래서 카운트를 세줄 for문을 또 쓸 필요는 없다.
		{
			if(e.getAddr().equals(addr)) {
				shallowCopyList.add(e);
			}
		}
		
		return shallowCopyList;
	}
	
	/**
	 * 사원번호를 기준으로 정렬하기
	 * :Comparable을 구현한 객체를 정렬 할 수 있다.
	 */
	
	public List<Emp> sortByEmpno()
	{
		List<Emp> sortList = new ArrayList<Emp>(list);	//이렇게 하면 원본은 그대로 sortList가 정렬된것
		
		Collections.sort(sortList);						//int의 Integer는 자동으로 오버라이딩되있어서 그 숫자 원소의 배열이면 따로 임플리먼츠는 안해도 되지만
										
		//그 안에있는 원소들의 비교를 하려면 compare해야함
		
		
		return sortList;
	}
	
	
	
	
	
	/**
	 * 나이를 기준으로 정렬하기
	 * :Comparator
	 */
	public List<Emp> sortByAge()
	{
		List<Emp> sortList = new ArrayList<Emp>(list);
		
		Collections.sort(sortList , new Comparator<Emp>() {		//구현부가없이 끝내야 생성하는것이고 구현부를 생성한거면 Comparator의 구현을 하기위한 바디를 열음.

			@Override											//이 자리에서만 쓸수밖에 없음. 일회성.
			public int compare(Emp o1, Emp o2) {
				System.out.println("나오냐");
				
				
				return o1.getAge()-o2.getAge();
			}
		});
		
		
		return sortList;
	}
	
	
	
	
	public static void main(String[] args) 
	{
			ListExam03 le= new ListExam03();
			System.out.println("1. 사원번호 검색");
			Emp emp = le.findByEmpno(30);
			System.out.println(emp);
			
			System.out.println("2. 주소 검색");
			List<Emp> resultList=le.findByAddr("서울");
			System.out.println(resultList);
			
			System.out.println("3. 사원번호 정렬---");
			resultList = le.sortByEmpno();
			for(Emp e:resultList)
			{
				System.out.println(e);
			}
			
			System.out.println("4. 나이 정렬---");
			resultList = le.sortByAge();
			for(Emp e:resultList)
			{
				System.out.println(e);
			}
	}

}
//////////////////////////////////////////////////
class AgeComparator implements Comparator<Emp>	//조건이 있을때는 Comparator을 많이 씀.
{

	@Override
	public int compare(Emp o1, Emp o2) 
	{
		System.out.println("AgeComparator compare call...");
		return o1.getAge()-o2.getAge();
	}
	
}
