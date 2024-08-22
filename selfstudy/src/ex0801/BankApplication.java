package ex0801;

import java.util.Scanner;

public class BankApplication 
{
	Scanner sc = new Scanner(System.in);
	Account acc[] = new Account[100];	
	static int count = 0;
	
	
	
	public void Insert()
	{
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.print("계좌번호: ");
		String accountNum = sc.nextLine();
		System.out.print("계좌주: ");
		String name = sc.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());
		
		acc[count++]= new Account(accountNum, name, balance);
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
		List();
		
		
	}
	
	public void List()
	{
		for(int i = 0; i<count; i++)
		{
			System.out.println(acc[i].getAccountNum()+"  "+acc[i].getName()+"  "+acc[i].getBalance());
			
			
			
			
		}
		
		
		
		
	}
	
	public void Save()
	{
		System.out.println("계좌번호: ");
		String accountNum = sc.nextLine();
		for(int i = 0; i<count; i++)
		{
			if(acc[i].getAccountNum().equals(accountNum))
			{
			System.out.println("예금액: ");
			int money = Integer.parseInt(sc.nextLine());
			acc[i].setBalance(acc[i].getBalance()+money);
			List();
			return;
			}
			
			
		}
		System.out.println("일치하는 계좌가 없습니다.");
		
	}
	
	public void Out()
	{
		System.out.println("계좌번호: ");
		String accountNum = sc.nextLine();
		for(int i = 0; i < count; i++)
		{
			if(acc[i].getAccountNum().equals(accountNum))
			{
			System.out.println("출금액: ");
			int money = Integer.parseInt(sc.nextLine());
			acc[i].setBalance(acc[i].getBalance()-money);
			List();
			return;
			}
			
		}
		System.out.println("일치하는 계좌가 없습니다.");
		
	}
	
	
	
	
	public BankApplication()
	{
		boolean run = true;

		while(run)
		{
			
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------");
			
			System.out.print("메뉴선택=>");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu)
			{
				case 1:Insert();
				break;
				
				case 2:List();
				break;
				
				case 3:Save();
				break;
				
				case 4:Out();
				break;
	
				case 5: System.out.println("프로그램을 종료합니다.");
						run = false;
						break;
			
						
				default : System.out.println("메뉴를 다시 선택해주세요.");		
			}
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		new BankApplication();
	}

}
