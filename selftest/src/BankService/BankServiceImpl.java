package BankService;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Dto.AccountDto;
import Dto.InstallAccountDto;
import Dto.LoanAccountDto;
import Dto.SavingAccountDto;
import Dto.UserDto;



public class BankServiceImpl  implements BankService
{
	List<AccountDto>accList = new ArrayList<>(10);
	List<UserDto>userList = new ArrayList<>(5);
	
	public BankServiceImpl()
	{
		userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
		userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
		userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
		
		accList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );
		
		accList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
		
		accList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
		accList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );
		
		accList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );
		
		accList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
		accList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );
		
		
	
	}
	
	public List<UserDto> UserAllSearch()
	{
		
		return userList;
	}
	
	public List<AccountDto> getAccountList()
	{
		return accList;
	}
	
	public List<AccountDto> getAccountList(int userSeq)
	{	
		List<AccountDto>accountlist = new ArrayList<AccountDto>();
		for(AccountDto account : accList )
		{
			if(account.getUserSeq()==userSeq)
			{
				accountlist.add(account);
			}
		}
		return accountlist;
	}
	
	public UserDto getUserDetail(int userSeq)
	{
		for(UserDto  user: userList)
		{
			if(user.getUserSeq()==userSeq)
			{
				return user;
			}
		}
		return null;
	}
	
	public List<AccountDto> getAccountListSortByBalance()
	{
		List<AccountDto>sortedAccList = new ArrayList<AccountDto>(accList);
		Collections.sort(sortedAccList);
		
		return sortedAccList;
		
	}
	
	public List<AccountDto> getAccountListSortByUserSeq()
	{
		List<AccountDto>sortedAccList = new ArrayList<AccountDto>(accList);
		Collections.sort(sortedAccList, (AccountDto o1, AccountDto o2)->
										o1.getUserSeq() - o2.getUserSeq());
	
		return sortedAccList;
		
		
	}

	@Override
	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException {
		
		return null;
	}

	@Override
	public int withdraw(int userSeq, int accountSeq, int amount)
			throws BalanceLackException, UserAccountNotFoundException {
	
		return 0;
	}

	
	
	
}

class AccountSortImpl implements Comparator<AccountDto>
{
	public int compare(AccountDto o1, AccountDto o2)
	{
		return o1.getUserSeq()-o2.getUserSeq();
	}
	
	
	
	
}

