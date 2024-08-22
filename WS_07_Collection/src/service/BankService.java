package service;

import java.util.List;  

import dto.AccountDto;
import dto.UserDto;
import Exception.UserAccountNotFoundException;
import Exception.BalanceLackException;

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
             throws BalanceLackException,  UserAccountNotFoundException;
	
	
	
}
