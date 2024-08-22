package ex0731;

import java.io.File;

import javax.swing.JOptionPane;

public class FileExam 
{
	
	public FileExam() throws Exception
	{	
		String filePath = JOptionPane.showInputDialog("파일경로는?");
		
		System.out.println("filePath = "+filePath);
		
		
		
		
		File file = new File(filePath); 		//절대경로	- > C:/Edu or 현재 프로젝트기준 내부에 있는걸 다루고 싶다면 src/.....
		if(file.exists())
		{
			System.out.println("존재합니다.");
			if(file.isDirectory())				//파일은 isFile
			{
				System.out.println(filePath+"폴더 정보입니다.");
				String fnames[] = file.list();
				for(String name : fnames)
				{
					System.out.println(name);
					
				}
				System.out.println("******************");
			}
			else
			{
				System.out.println(filePath+"파일 정보입니다.");
				System.out.println("file.canRead() = "+file.canRead());
				System.out.println("file.canWrite() = "+file.canWrite());
				System.out.println("file.getname() = "+file.getName());
				System.out.println("file.getAbsolutePath() = "+file.getAbsolutePath());
				System.out.println("file.length()); = "+file.length());
			}
		}
		else
		{
			System.out.println("없으니까 만들게요.");
			//파일 or 폴더를 생성할수 있다.(대신 두개를 동시에는 안된다.)
			
			//file.createNewFile();		//파일생성
			file.mkdir();	//폴더생성
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws Exception				//예외처리를 안해서 멈추는건 어쩔수없다.
	{
		new FileExam();
	}
}
