package ex0806.chat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
*	키보드 입력을 받아서 상대측에게 데이터 전송하는 thread
*/

public class SendThread extends Thread 
{	
	Socket sk;
	String name;
	
	public SendThread(Socket sk, String name)
	{	
		
		super(name);		//Thread 이름 만들어주는것
		
		this.sk = sk;
		this.name = name;
	}
	@Override 
	public void run()
	{
		//키보드 입력 받기
	
		try(Scanner sc = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true))
		{
			while(true)
			{
			String inputData = sc.nextLine();
			if(inputData.equals("exit"))
			{	
				pw.println(inputData);
				break;
			}
			else
			{
				pw.println(name +"가 보낸 내용: "+ inputData);
			}
			}//while 끝
			System.out.println(name + "의 보내는 스레드 종료합니다. ^^");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println(name + "==> 종료합니당~~");
			System.exit(0);
		}
	}//run 끝

}//클래스 끝
