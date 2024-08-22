package TestView;

import java.util.List;

import BankService.BankService;
import Dto.AccountDto;

public class TestView2 
{

	public static void main(String[] args) 
	{
		BankService service = new BankService();
		
		System.out.println("모든 계좌 목록 보기");
		List<AccountDto> list = service.accountAllSearch();
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
		
	}

}
