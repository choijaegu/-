package ex0731;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutStreamExam 
{	//byte단위 파일 읽기 = 입력
	
	FileInputStream fis ;
	
	//byte단위 파일 저장 = 쓰기 = 출력
	FileOutputStream fos;
	public FileInputOutStreamExam()
	{	try
		{	
			fis = new FileInputStream("src/ex0731/test.txt");
			/*while(true)
			{ 
			int i = fis.read();
			 if	(i==-1)break;
			System.out.println(i+" "+(char)i);
			}
		}
		*/
			
			//byte배열로 읽기///////////////
			int len = fis.available();
			System.out.println("len = "+len);
			byte[] b_=new byte[len];
			int i = fis.read(b);
			System.out.println("i = "+ i);
			System.out.println("b = "+ b);
			
			//byte배열을 하나의 String을 변환
			String str= new String(b);
			System.out.println("str = "+str);
			System.out.println("-- 파일읽기------");
			////////////파일저장하기///////////////////////
			//fos = new FileOutputStream("src/ew0731/write.txt");// 덮어쓰기
			fos = new FileOutputStream("src/ew0731/write.txt", true);//이어쓰기
			fos.write(54);
			fos.write(32);
			fos.write(22);
			fos.write(54);
			fos.write(11);
			fos.write(35);
			fos.write(47);
			
			String message = "배고파요~~";
			
			fos.write(message.getBytes());
			
			catch(Exception f)
		{
			f.printStackTrace();
		}
		finally 
		{	try 	
			{
			fis.close();
			fos.close();
			}
			catch(Exception f)
			{
				f.printStackTrace();
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		new FileInputOutStreamExam();
	}

}
