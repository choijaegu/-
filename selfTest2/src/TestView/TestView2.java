package TestView;

import java.util.List;  

import BankService.BankServiceImpl;
import Dto.AccountDto;
import Exception.BalanceLackException;
import Exception.UserAccountNotFoundException;

public class TestView2 
{

	public static void main(String[] args) 
	{
		BankServiceImpl service = new BankServiceImpl();
		
		System.out.println("모든 계좌 목록 보기");
		List<AccountDto> list = service.getAccountList();
		for(AccountDto acc : list )
		{
			System.out.println(acc);
		}
		
		System.out.println("잔고 기준으로 계좌목록 정렬");
		List<AccountDto>list2 = service.getAccountListSortByBalance();
		for(AccountDto acc: list2)
		{
			System.out.println(acc);
		}
		
		System.out.println("UserSeq 기준으로 계좌목록 정렬하기.");
		List<AccountDto>list3 = service.getAccountListSortByUserSeq();
		for(AccountDto acc: list3)
		{
			System.out.println(acc);
		}
		
		System.out.println("해당 계좌 조회");
		try 
		{
		AccountDto dto = service.getUserAccount(111, 111);
		}
		catch(UserAccountNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("출금");
		try 
		{
		int balance2 = service.withdraw(111, 20, 10000);
		System.out.println(balance2);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
			
		
		
	}

}
