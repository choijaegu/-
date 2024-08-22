package ex0731;

import java.io.FileInputStream; 
import java.util.Scanner;

public class SystemSetInExam {

	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("src/ex0731/input.txt"));
		//setIN이 스캐너가 안에있는걸 하나씩 읽어줌
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
		   String data = sc.nextLine();
		   System.out.println(data);
		}

	}

}
