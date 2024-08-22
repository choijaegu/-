package com.ws03.dto;

/**
 *  고객의 계좌정보 관리하는 객체
 * */
public class AccountDto 
{
  private String accountSeq;
  private String accountNumber;
  private int userSeq;
  private int balance;
 
  public AccountDto() {};
  
  public AccountDto(String accountSeq, String accountNumber, int userSeq, int balance)
  {
	  this.accountSeq = accountSeq;
	  this.accountNumber = accountNumber;
	  this.userSeq = userSeq;
	  this.balance= balance;
  }

public String getAccountSeq() {
	return accountSeq;
}

public void setAccountSeq(String accountSeq) {
	this.accountSeq = accountSeq;
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public int getUserSeq() {
	return userSeq;
}

public void setUserSeq(int userSeq) {
	this.userSeq = userSeq;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}
  
}
