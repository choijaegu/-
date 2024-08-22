package ex0806.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam 
{
	public ClientExam()
	{
		try(Socket sk = new Socket("192.168.0.6",8000))
		{	//서버에게 데이터 전송
			PrintWriter pw = new PrintWriter(sk.getOutputStream(),true);
			pw.println("아아");
			
			
			//서버가 보내온 데이터 읽기
			BufferedReader br = new BufferedReader
			(new InputStreamReader(sk.getInputStream()));
			String data = br.readLine();
			System.out.println("서버가 보내준 내용: "+ data);
					
		}
		
		
		catch(Exception e)
	
		{
		}
	}
	
	public static void main(String[] args) 
	{
		new ClientExam();
		
	}	
		
}
