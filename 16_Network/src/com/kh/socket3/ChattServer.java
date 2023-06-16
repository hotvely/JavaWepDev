package com.kh.socket3;

import java.util.*;
import java.net.*;
import java.io.*;

public class ChattServer {

	public static void main(String[] args) 
	{
		try
		{
			ServerSocket serverS = new ServerSocket(60000);
			
			while(true)
			{
				Socket socket = serverS.accept();
				ClientThread clientThread = new ClientThread(socket);
				clientThread.start();
			}
		}
		catch(Exception e) {}
	}
}


class ClientThread extends Thread
{
	Socket socket;
	BufferedReader br;
	PrintWriter pw;
	PrintStream ps;
//	OutputStream os;
	
//	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<>());
	static List<PrintStream> list2 = Collections.synchronizedList(new ArrayList<>());
	
	public ClientThread(Socket socket)
	{
		this.socket = socket;
		try 
		{
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
					
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ps = new PrintStream(socket.getOutputStream());
			pw = new PrintWriter(ps);
//			list.add(pw);
			list2.add(ps);
		} 
		catch (IOException e) {}
		
	}

	public void sendAll(String message)
	{
//		for(PrintWriter pw : list)
//		{
//			pw.println(message);
//			pw.flush();
//		}
		
		//TODO test code
		for(PrintStream pw : list2)
		{
			pw.println(message);
			pw.flush();
		}
		pw.close();
		
		
	}
	
	
	@Override
	public void run()
	{
		String login = socket.getInetAddress() + "님이 접속하셨습니다..";
		System.out.println(login);
		sendAll(login);
		
	
		try 
		{
			while(br != null)
			{
				String line = br.readLine();
				sendAll("[" + socket.getInetAddress() + "]가 보낸 메세지 > " + line);
			} 
		}
		catch (IOException e) 
		{ 
			System.out.println(socket.getInetAddress() + "님이 퇴장했습니다.");
			try 
			{
				br.close();	pw.close();
			} catch (IOException e1) {}
		
		}
	}
}