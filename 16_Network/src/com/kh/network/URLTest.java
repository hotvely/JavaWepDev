package com.kh.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL(Uniform Resource Locator)
 * - 인터넷에 존재하는 서버들의 자원에 접근할 수 있는 주소
 * https://www.youtube.com/result?search_query=여행
 * 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링
 * - 프로토콜 : 자원에 접근하기 위해 서버와 통신하는데 사용되는 통신규약! (ex > https)
 * - 호스트명 : 자원을 제공하는 서버의 이름 (ex > www.youtube.com)
 * - 포트번호 : 통신에 사용되는 서버의 포트번호 (ex > 443)
 * - 경로명 : 접근하려는 자원이 저장된 서버상의 위치 (ex > results)
 * - 쿼리(query) : ?이후의 부분 (ex > search_query=여행)
 * 
 * */

public class URLTest {

	
	public static void main(String[] args)
	{
		URLTest u = new URLTest();
		u.mehtod2();
		
	}
	
	public void mehtod1()
	{
		try 
		{
			URL url = new URL("https://www.youtube.com/result?search_query=여행");
			System.out.println("url.getProtocol()" + url.getProtocol());
			System.out.println("url.getHost()" + url.getHost());
			System.out.println("url.getDefaultPort()" + url.getDefaultPort());
			System.out.println("url.getFile()" + url.getFile());
			System.out.println("url.getPath()" + url.getPath());
			System.out.println("url.getQuery()" + url.getQuery());
		
		} 
		catch (MalformedURLException e) {}
	}

	
	public void mehtod2()
	{
		BufferedReader input = null;
		
		
		
		try {
			URL url  = new URL("https://iei.or.kr");
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = "";
			while((line = input.readLine())!= null)
			{
				System.out.println(line);
				
			}
			
			
		} catch (IOException e) {
		}
		finally
		{
			try 
			{
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
			
	}
	
	
	
	
	
	
	
	
	
	

}
