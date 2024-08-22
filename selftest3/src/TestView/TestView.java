package TestView;

import java.util.List;

import BankService.BankService;
import BankService.BankServiceImpl;
import Dto.AccountDto;
import Dto.UserDto;

public class TestView 
{

	public static void main(String[] args) 
	{
		BankService service = new BankServiceImpl();
		
		System.out.println("특정 사용자의 계좌목록");
		List<AccountDto>list = service.getAccountList(100);
		for(AccountDto acc:list )
		{
			System.out.println(acc);
			
		}
		
		System.out.println("특정 사용자의 고객 정보");
		UserDto user = service.getUserDetail(300);
		System.out.println(user);
		
	}
}
