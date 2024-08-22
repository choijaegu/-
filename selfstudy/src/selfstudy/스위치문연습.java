package selfstudy;

import java.util.Scanner;

public class 스위치문연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		String i = "봄";
		switch(month)
		{
			case 3 , 4 , 5  : i = "봄";break;
			case 6 , 7 , 8 	: i = "여름";break;
			case 9 , 10 , 11 : i = "가을";break;
			case 12 , 1 , 2 : i = "겨울";break;
		}
		System.out.print("현재 계절은 " +i+ "입니다.");
	}
}
