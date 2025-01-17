package TestView;

import java.util.Comparator;
import java.util.List;

import BankService.BankService;
import BankService.BankServiceImpl;
import Dto.AccountDto;

public class TestView2 
{

	
	public static void main(String[] args)
	{
		BankService service = new BankServiceImpl();
		
		System.out.println("모든 계좌 목록");
		
		List<AccountDto>list = service.getAccountList();
		for(AccountDto  acc: list )
		{
			System.out.println(acc);
		}
		
		System.out.println("잔고 기준으로 정렬한 계좌 목록");
		
		List<AccountDto>list2 = service.getAccountListSortByBalance();
		list2.sort(Comparator.reverseOrder());
		for(AccountDto acc: list2)
		{
			System.out.println(acc);
		}
		
		System.out.println("고객SEQ 기준으로 정렬한 계좌 목록");
		List<AccountDto>list3 = service.getAccountListSortByUserSeq();
		for(AccountDto acc: list3)
		{
			System.out.println(acc);
		}
		
		System.out.println("고객이 있나용");
		try 
		{
		AccountDto acc = service.getUserAccount(111, 10);
		System.out.println(acc);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("잔액 있나용");
		try
		{
		int newBalance = service.withdraw(111, 10, 1000);
		System.out.println(newBalance);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
