package ex0806.url;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnectionExam 
{
	
	public URLConnectionExam ()
	{
		try
		{
			URL url = new URL("https://www.naver.com/");
			BufferedReader br =
					new BufferedReader(new InputStreamReader(url.openStream() ));
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0806/url/naver.html"));
			//파일로 저장하기
			
			while(true)
			{	
				String data = br.readLine();
				if(data == null)break;
				System.out.println(data);
				bw.write(data);		
				bw.newLine();
				bw.flush();
			}
			
			
		}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String[] args) 
	{
		new URLConnectionExam();
	}

}
