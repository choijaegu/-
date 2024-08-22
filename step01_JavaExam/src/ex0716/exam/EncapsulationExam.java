package ex0716.exam;

import java.util.Scanner;


public class EncapsulationExam 
{
	
	
	int weight = 80;
	
	String password = "1234";
	
    public int getPathword(String password)
    {
    	if(isPathword(password))
    	{
    		System.out.println("몸무게: ");
    		return weight;
    		
    	}
    	
    	else
    	{
    		System.out.println("비밀번호가 틀립니다.");
    		return 0;
    	}
    	
    	
    }
    
    public void setWeight (String password, int newWeight)
    { 	
    	{
    		if(isPathword(password))
    		{	
    			this.weight = newWeight;
    			
    			System.out.println(newWeight+"로 변경이 완료되었습니다.");
    			
    		}
    		else
    		{
    			System.out.println("비밀번호가 틀렸습니다.");
    		}
    	}
    }
    
    
    public void settPathword(String oldPath, String newPath)
    {		
    		
    		if(isPathword(oldPath))
    			{
    				this.password = newPath;

					System.out.println("변경이 완료되었습니다.");
    			}
    		else
    			{
    				System.out.println("비밀번호가 틀렸습니다.");
    			}
    			
    }
    
    	boolean isPathword(String password)
    	{
    		if(this.password.equals(password))
    		return true;
    		else 
    		return false;
    	}
    
	
	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			boolean run=true;

			EncapsulationExam gP1 = new EncapsulationExam();
			
			while(run) 
			{	
				
				System.out.println("---------------------------------------------------------------------");
				System.out.println("1.몸무게 검색  | 2.몸무게 변경   | 3. 비밀번호 변경  |  9.종료");
				System.out.println("---------------------------------------------------------------------");
				System.out.print("선택> ");
				
				int menu = sc.nextInt();
						
				switch(menu)
				{
				case 1: 
					System.out.println("비밀번호를 입력해주세요.");
					String password1 = sc.next();
					
				
					int gP2 = gP1.getPathword(password1);
					System.out.println(gP2);
					break;
				
				case 2:
					System.out.println("비밀번호를 입력해주세요.");
					String password2 = sc.next();
					int newWeight = sc.nextInt();
					
					
					gP1.setWeight(password2, newWeight);
					
					break;
					
				case 3:
					System.out.println("비밀번호를 입력해주세요.");
					String password3 = sc.next();
					System.out.println("변경하려는 비밀번호를 입력해주세요.");
					String password4 = sc.next();
					
					gP1.settPathword(password3, password4);
					
					break;
					
				case 9:
					run = false;
					
							
				}System.out.println("프로그램을 종료한다.");
			}
	}

}
