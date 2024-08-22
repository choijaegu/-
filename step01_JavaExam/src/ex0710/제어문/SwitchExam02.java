package ex0710.제어문;

public class SwitchExam02 
{

	public static void main(String[] args) 
	{
		int a = (int)(Math.random()*12)+1;
		//28일 -2 , 30일 - 4 6 9 11. 나머지 31일
		int b = 31;
        switch (a) {
        case 2 : b=28	; break;
        case 4 :        
        case 6 : 	    
        case 9 : 	   
        case 11 : b=30	; break;//콤마는 자바 14버전 이상부터 가능 ex_case 4,6,9,11 / break를 생략하고 {} 도 가능/
        
        default : b=31	;
        }
        System.out.println(a+"월은 "+b+"일 입니다.");
        //
        if(a==2) b=28;
        else if(a==4||a==6||a==9||a==11) b=30;
        else b=31;
        System.out.println(a+"월은 "+b+"까지 입니다.");
	}
	
}
