package ex0806.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam 
{

	public ServerExam()			//클로즈를 해줘야하는데 오토 클로즈를 해야함.
	{
		
		try(ServerSocket server=new ServerSocket(8000))
		{
			while(true)
			{
				System.out.println("클라이언트 접속 대기중입니다");
				Socket sk= server.accept();
				System.out.println(sk.getInetAddress()+ "님 접속되었습니다.");
				
				//접속한 클라이언트가 보내온 데이터를 읽기
				
				InputStream is = sk.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String data = br.readLine();
				System.out.println(("클라이언트가 보내온 내용: "+ data));
				
				//접속한 클라이언트에게 데이터 전송하기
				OutputStream os = sk.getOutputStream();
				PrintWriter pw = new PrintWriter(os, true)	;					//printwriter는 bufferd가 안에 있다고 생각	//pirntln하거나 pirntd로 할 수있따.
				pw.println("서버에 접속하신걸 환영합니다.");
				
				sk.close();
				
				System.out.println();
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) 
	{
		new ServerExam ();
		
	}

}
