package com.kh.socket3;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChattClient 
{
	
	public static void main(String[] args) {
		
		try  
		{
			InetAddress ip = InetAddress.getLocalHost();
			Socket socket = new Socket(ip, 60000);
			System.out.println("********** 서버 연결 완료 **********");
			
			
			
			// 스레드 만들면서 동시에 바로 프로세스 실행 시켜줌
			Thread sendThread = new SendThread(socket);
			sendThread.start();
			
			
			
			
			// 스트림에서 데이터 버퍼를 들고 와서 리더에 넣어준이후에 읽어줌 !
			InputStreamReader isr =	new InputStreamReader(socket.getInputStream());	
			// BufferedReader 객체를 instance화 하는 이유,,가 아마도 서버에서 받아온 데이터 더미들을 
			// 읽기 전에 저장해야 하는 공간이 필요해서 BufferedReader라는 데이터 덩어리 형식으로 잠시 넣어 놓고
			// 돌면서 읽는 것 같은데???
			BufferedReader br = new BufferedReader(isr);
			
			//TODO TestCode...
			PrintWriter pw = new PrintWriter(System.out, true);
			String line = "";
			while((line = br.readLine())!= null)
			{
				pw.println(line);
			}
			//TODO TestCode...
			
			
//			
//			while(br != null)
//			{
//				System.out.println(br.readLine());
//			}
			
			
			
		} 
		catch (IOException e) {System.out.println("********** 서버 종료 **********");}
	}
}


class SendThread extends Thread
{
	Socket socket;
	Scanner sc = new Scanner(System.in);
	
	
	public SendThread(Socket socket)
	{
		this.socket = socket;
	}


	@Override
	public void run() 
	{
		try 
		{
			// 콘솔창(스트림이 도착해야 하는 곳)으로 보낼 버퍼하나를 소켓 스트림 객체를 매개변수로 받아서 생성해 주고
			PrintStream ps = new PrintStream(socket.getOutputStream());
			// 와일문 돌면서 한줄씩 쓰고 저장함
			while(true)
			{
				ps.println(sc.nextLine());
				ps.flush();
			}
			
			// testing
//			PrintWriter pw = new PrintWriter(ps);			
//			while(true)
//			{
//				pw.println(System.in);
//				pw.flush();
//			}
		}
		catch (IOException e) {	}
	}
	
	

	
	
}

