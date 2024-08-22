package ex0710.제어문;

public class SwitchExam01 {

	public static void main(String[] args) {
		int no = (int)(Math.random()*12+1);
		char ch='토';
		switch( no ) {
		case 1 : ch='일' ; break;
		case 2 : ch='월' ; break;
		case 3 : ch='화' ; break;
		case 4 : ch='수' ; break;
		case 5 : ch='목' ; break;
		case 6 : ch='금' ; break;
		default : ch='토';
		}
	System.out.println(no+"는"+ch+"요일입니다.");
				
	}

}
