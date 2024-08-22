package ex0710숙제;
/* 최재구.
 * 7월10일.
 * 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 1인당 몇개씩 가질수 있고, 마지막에 몇개가 남는지. 
 */

public class 슬라이드5장숙제 {

	public static void main(String[] args) {
	 int pencils = 534;
	 int students = 30;
	 
	 //학생 한 명이 가지는 연필 수
	 int pencilsPerStudent = (pencils/students);
			 System.out.println(pencilsPerStudent);
	 
	 //남은 연필 수
	 int pencilsLeft = (pencils%students);
	 System.out.println(pencilsLeft);
	}

}
