package ex0806.chat;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientChatExam
{
	
	public ClientChatExam()
	{	
		try 
		{
		Socket sk = new Socket("192.168.0.18",8000);
		
		System.out.println("서버와 채팅 시작합니다.");
		
		//보내는 스레드
		new SendThread(sk, "CLIENT").start();
		
		//받는 스레드
		new Thread(()->{
			try(BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream())))
			{
				while(true)
				{
					String inputData = br.readLine();
					if(inputData.equals("exit"))
						break;
					
					System.out.println(inputData);
				}
				System.out.println("클라이언트 받는 스레드 종료합니다.");
			}
			catch(Exception e)
			{
			//e.printStackTrace();
			System.out.println("서버프로그램 종료 하겠습니다~~^^");
			System.exit(0);
			}
		}).start();
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		new ClientChatExam();
	}

}
