package ex0731;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardInputExam 
{
	public KeyboardInputExam ()throws Exception
	{
		//InputStream is = System.in;
		//int i = is.read();			//1byte 읽기.
		
		
		//byte -> Reader로 변환. -> InputStreamReader
		//InputStreamReader is = new InputStreamReader(System.in);
		//int i = is.read();		//한문자 읽기.
		
		
		//System.out.println(i + " = "+ (char)i);
		
		//InputStreamReader ---> BufferedReader로 변환.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String message = br.readLine();
		System.out.println("message = "+ message);
		
		
	}
	
	
	public static void main(String[] args) throws Exception
	{
	
		new KeyboardInputExam();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
