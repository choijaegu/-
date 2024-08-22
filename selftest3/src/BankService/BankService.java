package BankService;

import java.util.List;

import Dto.AccountDto;
import Dto.UserDto;
import Exception.BalanceLackException;
import Exception.UserAccountNotFoundException;

public interface BankService 
{
	List<AccountDto> getAccountList(int userSeq);
	
	UserDto getUserDetail(int userSeq);
	
	List<AccountDto> getAccountList();
	
	List<AccountDto> getAccountListSortByBalance();

	List<AccountDto> getAccountListSortByUserSeq();
	
	AccountDto getUserAccount(int userSeq, int accountSeq) 
			 throws UserAccountNotFoundException;
	
	int withdraw(int userSeq, int accountSeq, int amount) 
			 throws BalanceLackException, UserAccountNotFoundException;
}
