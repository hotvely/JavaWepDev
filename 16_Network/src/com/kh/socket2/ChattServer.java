package com.kh.socket2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {

	// 클라이언트가 보낸 메세지를 받아서 다시 클라에게 보냄
	
	public static void main(String[] args) {
		try 
		{
			ServerSocket server = new ServerSocket(60000);
			System.out.println("Server Ready");
			Socket s = server.accept();
			System.out.println("Client 접속");
			
			//----------입출력 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
			
			String getMessage = "";
			while((getMessage = br.readLine())!= null)
			{
				System.out.println("서버에서 받은 메세지 > " + getMessage);
				writer.println(getMessage);
			}	
			//----------입출력 스트림

			
			
			br.close();
			
		} 
		catch (IOException e) {}
	}
	
	

}
