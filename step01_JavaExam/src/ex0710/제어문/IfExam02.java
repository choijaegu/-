package ex0710.제어문;

public class IfExam02 {
  public static void main(String[] args) {
	//1~12사이에 난수 발생한다.
	  int i = (int)(Math.random()*12) + 1;
	//발생한 난수가 1이면 일요일, 2이면 월요일, 3이면 화요일, 4이면 수요일
	  //5이면 목요일 6이면 금요일, 이외의 수는 토요일 출력한다.
	  
	   char ch='토';
	   if (i==1) {
		   ch='일';
	   }else if (i==2)
		   ch='월';
		   else if (i==3) 
	       ch='화';
		   else if (i==4) 
		       ch='수';
		   else if (i==5) 
		       ch='목';
		   else if (i==6) 
		       ch='금';
	   System.out.println(i+"는"+ch+"요일입니다");}
}

	   
