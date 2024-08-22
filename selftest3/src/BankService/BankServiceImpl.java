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
import Exception.BalanceLackException;
import Exception.UserAccountNotFoundException;

public class BankServiceImpl implements Comparator<AccountDto> , BankService
{	
	List<UserDto>userList = new ArrayList<>();
	List<AccountDto>accList = new ArrayList<>();
	
	public BankServiceImpl()
	{
		userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
		userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
		userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
		
		accList.add(new InstallAccountDto(20,"00200202002002",1000,111,12,10000));
		
		accList.add(new SavingAccountDto(10,"00100101001001",500,111,100));
		
		accList.add(new LoanAccountDto(60,"00600606006006",500,333,"HOUSE"));
		accList.add(new LoanAccountDto(30,"00300303003003", 0,111,"Building"));
		
		accList.add(new LoanAccountDto(50,"00500505005005", 200,222,"CAR"));
		accList.add(new SavingAccountDto(40,"00400404004004",1000,222,50));
		
		
	}
	
	public List<AccountDto> getAccountList(int userSeq)
	{	
		List<AccountDto>resultList = new ArrayList<AccountDto>();
		for(AccountDto acc :accList )
		{
			if(acc.getUserSeq()==userSeq)
			{
				resultList.add(acc);
				
			}
			
		}
		return resultList;
	}	
	
	public UserDto getUserDetail(int userSeq)
	{
		for(UserDto user:userList)
		{
			if(user.getUserSeq()==userSeq)
			{
				return user;
			}
			
		}
		return null;
		
	}
	
	public List<AccountDto> getAccountList()
	{
		return accList;
		
	}
	
	public List<AccountDto> getAccountListSortByBalance()
	{
		List<AccountDto>sortList = new ArrayList<AccountDto>(accList);
		Collections.sort(sortList);
		return sortList;
		
	}
	
	public List<AccountDto> getAccountListSortByUserSeq()
	{
		List<AccountDto>sortList2 = new ArrayList<AccountDto>(accList);
		Collections.sort(sortList2,(o1,o2)-> o2.getUserSeq()-o1.getUserSeq());
		return sortList2;
	}

	@Override
	public int compare(AccountDto o1, AccountDto o2) {
	
		return Integer.compare(o1.getUserSeq(), o2.getUserSeq());
	}

	@Override
	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException 
	{
		for(AccountDto acc : accList)
		{
			if(acc.getUserSeq()==userSeq && acc.getAccountSeq()==accountSeq)
			{
				return acc;
			}
				
		}
		
		throw new UserAccountNotFoundException();
	}

	@Override
	public int withdraw(int userSeq, int accountSeq, int amount)
			throws BalanceLackException, UserAccountNotFoundException 
	{
		AccountDto acc = getUserAccount(userSeq, accountSeq);
		if(acc.getBalance()-amount>=0)
		{
			acc.setBalance(acc.getBalance()-amount);
			return acc.getBalance();
			
		}
		
		throw new BalanceLackException();
		
	}
	
	
	
	
}
