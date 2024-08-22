package TestView;

import java.util.List; 

import BankService.BankServiceImpl;
import Dto.AccountDto;
import Dto.UserDto;

public class TestView 
{

	
	public static void main(String[] args) 
	{
		BankServiceImpl service = new BankServiceImpl();
		
		System.out.println("전체 고객 검색");
		List<UserDto>resultList = service.UserAllSearch();
		for(UserDto user:resultList)
		{
			System.out.println(user);
		}
		
		System.out.println("전체 계좌 검색");
		List<AccountDto>resultList2 = service.getAccountList();
		for(AccountDto acc :resultList2 )
		{
			System.out.println(acc);
		}
			
		System.out.println("고객 Seq 100에 해당하는 계좌정보 조회");
		List<AccountDto>resultList3 = service.getAccountList(111);
		for(AccountDto acc : resultList3)
		{
			System.out.println(acc);
		}
		
		System.out.println("고객 Seq 300에 해당하는 고객정보 조회");
		UserDto user = service.getUserDetail(300);
		System.out.println(user);
	}

}
