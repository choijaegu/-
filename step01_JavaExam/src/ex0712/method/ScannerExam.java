package ex0712.method;

import java.util.Scanner; 

//Scanner라는 객체를 util폴더에 가져와주세요.

/**
    java.util.Scanner 는 사용자로 부터 키보드 입력을 타입별로 받을수 있도록 다양한 메소드를 제공한다.
	 1) 숫자를 입력받을때
          int i = 변수이름.nextInt(); // 개행문자(\n)무시 된다.

	 2) 문자를 입력받을때
	    String data = 변수이름.next(); // 공백없는 입력값 , (개행문자(\n)무시

	 3) 문자열(공백포함) 입력받을때
	     String data = 변수이름.nextLine();// 공백을 포함 문자열 

*/
class  ScannerExam{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //=>개체생성해야함, 걍 외우셈...;
		boolean state=true;
		while(state) 
		{
		System.out.println("1. 성적구하기    2. 종료 ");
		System.out.println("메뉴선택 :");
		int menu = sc.nextInt();
		switch(menu) 
		{
		case 1:
		
		System.out.print("국어점수는 : ");
        int kor = sc.nextInt();//키보드 입력을 기다린다.
        
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        
        System.out.print("이름 :");
        String name = sc.next();
        
        //성적구하기
        System.out.println(name+"님 성적은 "+(kor+eng)+"입니다.");
        break;
		case 2:
			state=false;
        
		
		}
 
	}System.out.println("**End*****");
}
}





