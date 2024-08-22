package view;

import java.util.List;      

import dto.AccountDto;
import dto.UserDto;
import service.BankService;
import service.BankServiceImpl;
import java.lang.Exception;
import Exception.UserAccountNotFoundException;

public class TestView {
	
	static int balance;
	
	public static void main(String[] args) {
		System.out.println("***1. 고객seq에 해당하는 계좌정보 검색하기 *****");
		BankService service = new BankServiceImpl();		//앞에는 인터페이스로 바꿔주는게 더 좋은거다.
		
        List<AccountDto> accountList = service.getAccountList(100);
		
		if(accountList.isEmpty()) {
			System.out.println("회원의 계좌정보가 없습니다.");
		}else {
			System.out.println("회원계좌개수 : " + accountList.size());
			for(AccountDto dto : accountList) {
				System.out.println(dto); //accountSeq | accountNumber | balance | userSeq
			}
		}
		
/////////////////////////////////////////////////////////////////////////		
		System.out.println("\n***2. userSeq에 해당하는 고객의 정보 *************");
		UserDto userDto = service.getUserDetail(300);
		if(userDto!= null) {
		  System.out.println(userDto);
			
		}else {
			System.out.println("회원의 정보가 없습니다.");
		}
//////////////////////////////////////////////////////////////////////////
		System.out.println("\n***3. 선택한 계좌의 정보 *************");
		AccountDto accountDto = new AccountDto();
		try 
		{	
		accountDto = service.getUserAccount(222, 40);
		}
		
		catch (UserAccountNotFoundException u)
		{
			System.out.println(u.getMessage());
			
		}
		System.out.println(accountDto);
		
		
		System.out.println("\n***4. 출금 *************");
		
	
		try
		{
		balance = service.withdraw(222, 10, 100);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(balance);
		
	}//메인끝

}// 클래스 끝





