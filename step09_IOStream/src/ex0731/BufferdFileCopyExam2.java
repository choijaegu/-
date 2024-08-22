package ex0731;

import java.io.BufferedInputStream; 
import java.io.BufferedOutputStream;
import java.io.FileInputStream; 
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class BufferdFileCopyExam2 
{	FileInputStream fis;
	FileOutputStream fos;
	public BufferdFileCopyExam2(String readFileName, String writeFileName)
	{
		//readFileName 파일을 읽어서 writeFileName에 저장
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try 
		{	
			long start = System.nanoTime();
			bis =	new BufferedInputStream(new FileInputStream(readFileName));
			bos =	new BufferedOutputStream(new FileOutputStream(writeFileName));
		
			fos = new FileOutputStream(writeFileName, true);	
			
			int i = 0;
			while((i=bis.read()) != -1) 
			//읽은 i를 fos에 저장하면 댐
			{
				bos.write(i);
			}
			long end = System.nanoTime();
			
			System.out.println("Buffered 없는 경우: "+ (end - start)+"ns");
			
			System.out.println("파일 복사되었습니다.");
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{	
			try {
			if(bis != null)				
			{
				bis.close();
			}
			if(bos !=null)
			{
				bos.close();
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		String readFileName = JOptionPane.showInputDialog("읽을 파일명?");
		String writeFileName = JOptionPane.showInputDialog("저장 할 파일명?");
				
		new BufferdFileCopyExam2(readFileName, writeFileName);
	}

}
