package view;

import dto.AccountDto;  
import dto.UserDto;
import service.BankService;
import java.util.List;
import java.util.ArrayList;

public class TestView {

	public static void main(String[] args) {
		System.out.println("***1. 고객 seq 100 에 해당하는 계좌정보 검색하기 *****");
		BankService service = new BankService();
        List<AccountDto> resultList = new ArrayList<AccountDto>();
        UserDto user = new UserDto();
        resultList = service.findByAccount(100);
        user = service.findByName(100);
        System.out.println(user.getName()+"님의 계좌개수: "+resultList.size()+"개");
        System.out.println(resultList);
		
		
		
		
		System.out.println("\n\n***2. userSeq에  해당하는 고객의 정보 *************");
		user = service.findByName(300);
		if(user != null)
		{System.out.println(user.getName()+"님의 고객 정보");
		System.out.println(user);}
		else
		{
			System.out.println("회원의 정보가 없습니다.");
		}
		
		System.out.println("\n\n***3. 모든 계좌정보 조회*************");
		resultList = service.findByAllaccount();
		System.out.println(resultList);
		
		
		System.out.println("\n\n***4.잔액기준으로 정렬 *************");
		resultList = service.sortByBalance();
		for(AccountDto a:resultList)
		{
			System.out.println(a);
		}
		
		System.out.println("\n\n***5.고객코드기준으로 정렬 *************");
		resultList = service.sortByUserSeq();
		for(AccountDto a:resultList)
		{
			System.out.println(a);
		}
		
		
		
		
	}//메인끝

}// 클래스 끝





