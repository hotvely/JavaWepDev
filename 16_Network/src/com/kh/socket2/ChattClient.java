package com.kh.socket2;

import java.io.*;
import java.net.*;

public class ChattClient {

	BufferedReader br = null;
	// 키보드로 입력 받은 데이터를 읽어서 서버로 보냄
	// 다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력함
	public static void main(String[] args) {
		try 
		{			
			InetAddress ip  = InetAddress.getLocalHost();

			Socket s = new Socket(ip.getHostAddress(), 60000);
			System.out.println("Client Socket Creating... ");
			
			// 스트림
			// 서버로 보낼 메세지 저장할 리더
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// 서버로 보낼 라이터
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			// 서버에서 다시 되 받아온 메세지 저장할 리더;;
			BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String message = "";
			while((message = br.readLine())!= null)
			{
				//서버로 보낼꺼임
				pw.println(message);
				System.out.println("내가 보낸 메세지 > " + br2.readLine());
			}		
			
			pw.println();
			s.close();
		}
		catch (IOException e){}
	}

}
