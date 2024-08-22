package selfstudy;

public class SwitchExam {

	public static void main(String[] args) 
	{
		int a = (int)(Math.random()*12)+1;
		int b = 31;
			switch(a) 
			{case 2 : b = 28 ; break;
			 case 4,6,9,11 : b = 30 ; break;
			 default : b = 31 ;
			}
				System.out.println(+a+"월은 "+b+"일 입니다.");

	}

}
