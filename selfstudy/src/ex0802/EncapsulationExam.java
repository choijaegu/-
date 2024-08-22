package ex0802;

import java.util.Scanner;

public class EncapsulationExam 
{
	Scanner sc = new Scanner(System.in);
	int weight = 80;
	String password = "1234";
	boolean result;
	
	public int getWeight(String password)
	{	
		result = isPassword(password);
		if(result)
		{
			return weight;
		}
		else 
		{
		System.out.println("비밀번호 불일치");
		return 0;
		}
		
	}
	
	
	public void setWeight(String password, int newWeight)
	{
		
		if(true == isPassword(password))
		{
			this.weight = newWeight;
			System.out.println("변경된 몸무게: "+this.weight);
		}
		
		
		
	}
	
	public void setPassword(String password, String newPassword)
	{
		if(true == isPassword(password))
		{
			this.password = newPassword;
			System.out.println("변경된 비밀번호: "+this.password);
		}
		
		
	}
	
	
	
	
	
	public boolean isPassword(String password)
	{
		if(this.password.equals(password))
		{
			return true;
		}
		return false;
		
	}
	
	
	
	
	
	public EncapsulationExam()
	{
		boolean run = true;
		
		while(run)
		{
			System.out.println("***************************************************");
			System.out.println("1.몸무게 검색 2.몸무게 변경 3.비밀번호 변경 4.종료");
			System.out.println("***************************************************");
			
			System.out.print("메뉴선택 =>");
			int menu = sc.nextInt();
			
			switch(menu)
			{
				case 1:
						System.out.println("비밀번호를 입력해주세요");
						String password = sc.next();
						int i = getWeight(password);
						System.out.println("몸무게: "+i);
						break;
			
				case 2:
						System.out.println("비밀번호를 입력해주세요");
						String password1 = sc.next();
						System.out.println("변경하실 몸무게를 적어주세요.");
						int newWeight = sc.nextInt();
						setWeight(password1,newWeight);
						break;
						
				case 3:
						System.out.println("기존 비밀번호를 입력해주세요");
						String password2 = sc.next();
						System.out.println("변경할 비밀번호를 입력해주세요");
						String password3 = sc.next();
						setPassword(password2,password3);
						break;
			
				case 4:
						System.out.println("프로그램을 종료합니다.");
						run = false;
						break;
			
				default : System.out.println("메뉴 선택이 올바르지 않습니다.");
							break;
			
			
			
			
			
			}
			
		}
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		new EncapsulationExam();
	}
	

}
