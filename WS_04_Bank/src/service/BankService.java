package service;
/**
 * 고객과 계좌에 관련된 서비스  
 * (Business Logic 을 처리하는 객체)
 * */

import dto.AccountDto;  
import dto.UserDto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class BankService {
	List<UserDto> uList = new ArrayList<UserDto>(5); 
	List<AccountDto> accList = new ArrayList<AccountDto>(); //기본이 10개이므로 굳이 적을필요없음.
	
	
	public BankService() {
		//배열 생성
		 uList.add (new UserDto(100, "장희정", "8253jang@daum.net", "010-8875-8253", false));
		 uList.add (new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false));
		 uList.add (new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false));
		 uList.add (new UserDto(400, "삼순이", "sam@daum.com", "010-2222-2222", false));
		 
		 
		 //계좌는 6개 정도
		 accList.add (new AccountDto(1, "1111-11111", 1000000, 100));
		 accList.add (new AccountDto(2, "2222-22222", 250000, 100));
		 accList.add (new AccountDto(3, "3333-33333", 350000, 100));
		 
		 accList.add (new AccountDto(4, "4444-44444", 150000, 200));
		 accList.add (new AccountDto(5, "5555-55555", 250000, 200));
		 
		 accList.add (new AccountDto(6, "6666-66666", 350000, 300));
		 
		 System.out.println("---세팅완료!!----");
		 
		 
	}//생성자 끝
	
   
	/**
	 * 특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	 * @param. int userSeq
	 * @return List<Acclist>
	*/
			
	public UserDto findByName(int userSeq)
	{
		for(UserDto u : uList)
		{
			if(u.getUserSeq()==userSeq)
			{
				return u;
			}
		}
		return null;
		
	}
	
	
	public List<AccountDto> findByAccount(int userSeq) 
	{
		List<AccountDto> shallowCopyList = new ArrayList<AccountDto>();
		for(AccountDto a : accList)
		{
			if(a.getUserSeq() == userSeq)
			{
				shallowCopyList.add(a);
			}
			
			
		}
		return shallowCopyList;
		
		
			
		
	}
	
	
	public List<AccountDto> findByAllaccount()
	{
		return accList;
	}
	
	public List<AccountDto> sortByBalance()						//외부에 구현객체 만들어서 하는 방법.
	{
		List<AccountDto> sortList = new ArrayList<AccountDto>(accList);
		
		Collections.sort(sortList);
		
		return sortList;
	}
	
	
	/*public List<AccountDto> sortByUserSeq()						//인수에 직접 구현하는 방법 - Anonymous Inner type.
	{
		List<AccountDto> sortList = new ArrayList<AccountDto>(accList);
		
		Collections.sort(sortList, new Comparator<AccountDto>()		//인터페이스 생성이 아닌 구현을 하기위해 바디를 연것.
		//Anonymous Inner type이라고 함.
		{	
			@Override
			public int compare(AccountDto o1, AccountDto o2)			//이름이 없는 애 이기 때문에 sort만들고 사라짐.
			{															//메모리에 안 만들어짐.
				return o1.getUserSeq()-o2.getUserSeq();
			}
			
		}
		);
		
		return sortList;
	}*/
	
	//람다식.(아무떄나 쓰는게 아닌 람다를 써야하는 상황이 있음).
	
	public List<AccountDto> sortByUserSeq()
	
	{
		List<AccountDto> sortList = new ArrayList<AccountDto>(accList);
		Collections.sort(sortList, (o1,o2) ->  o1.getUserSeq()-o2.getUserSeq() );
		//sortList 뒤에 Comparator가 오는건 당연한건데 Comparator는 implements가 자동으로 
		//	되는 것이므로 이렇게 쓰면됨.
		
		return sortList;
	}
}




////////////////////////////////////////////////////////////
class AccountSortImpl implements Comparator<AccountDto> 		//재사용성이 높음.
{
	public int compare(AccountDto o1, AccountDto o2)
	{
		return o1.getUserSeq()-o2.getUserSeq();
	}
	
	
	
	
	
	
	
}






