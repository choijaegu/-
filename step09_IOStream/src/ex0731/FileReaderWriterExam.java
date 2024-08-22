package ex0731;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterExam 
{

	public FileReaderWriterExam()					
	{
		//문자단위로 파일읽기 => Buffered 이용
		//문자단위로 파일 저장 = 쓰기 -> Buffered 이용
		
		try(BufferedReader br = new BufferedReader(new FileReader("src/ex0731/test.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0731/jang.txt"));)				//reader계열이냐 input스트림계열이냐에 따라 결과값이 달라짐.
		{
			/*while(true)
			{
				
				int i = br.read();	//하나의 문자 읽기. 그래서 우리가 반복문에 돌림.
				if(i==-1)break;
				System.out.println(i+" = "+ (char)i);
			}*/
			
			
			while(true) 
			{
			//한줄읽기
			String data = br.readLine();			//FileReader만 쓰면 readLine은 쓸 수 없다.
			if(data == null)break;
			System.out.println("data = " + data);
			}
			
			//저장 = 쓰기 = 출력
			bw.write("오늘은 수요일");
			bw.newLine();							//그냥 write는 13,10숫자를 넣어야 줄바뀜.
			bw.write("힘들어요");
			
			//bw.flush();  어짜피 트라이구문 나가면 자동으로 나가짐.
			
			
			
			
			
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static void main(String[] args) 
	{
		
		new FileReaderWriterExam();
	}

}
