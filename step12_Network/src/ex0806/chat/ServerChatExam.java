package ex0806.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 클라이언트와 1대1 채팅을 위한 Server
 */




public class ServerChatExam 
{	
	Socket sk;
	public ServerChatExam()
	{
		try(ServerSocket server = new ServerSocket(8000))
		{
			System.out.println("클라이언트 접속 대기중");
			
			sk = server.accept();	//접속대기중
			System.out.println(sk.getInetAddress()+"님과 채팅 시작합니다");
			
			//읽기 Thread
			
			//보내기 Thread
			new SendThread(sk,"SERVER").start();
			
		}
		catch
		(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) 
	{
		new ServerChatExam();

	}//메인 끝

	/**
	 * Inner 클래스 : 서버가 클라이언트가 보내온 데이터를 읽기 하는 스레드
	 */
	class ServerReciveThread extends Thread		//이너클래스라 sk를 따로 가져올 필요없음. 독립적으로 재사용 불가능
	{
		@Override
		public void run()					
		{
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(sk.getInputStream()) ))
				{
				while(true)
				{
					String read = br.readLine();
					
					if(read.equals("exit"))
					{
						break;
					}
					
					System.out.println(read);		//모니터 출력
				}
				
				System.out.println("서버 받는 스레드 종료합니다.");
											
				}
				catch(Exception e)
				{
					e.getStackTrace();
				}
		
		}
		
		
	}
	
	
}//클래스 끝
