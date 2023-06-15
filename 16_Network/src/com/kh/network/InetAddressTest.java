package com.kh.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/*
 * 네트워크
 * - 여러대의 컴퓨터를 통신 회선으로 연결하는 것
 * 
 * 서버(Server)와 클라(Client)
 * - 서비스를 제공하는 쪽이 서버, 제공 받는 쪽이 클라이언트
 * - 클라이언트가 요청(Request)하는 내용을 서버에서 처리하고 응답(Response)을 클라이언트로 보냄
 * 
 * IP 주소
 * - 네트워크 상에서 컴퓨터를 식별하는 번호
 * - xxx.xxx.xxx.xxxx와 같은 형식으로 표현됨 ( xxx는 부호없는 0 ~ 255 정수)
 * - DNS (Domain Name System) 을 통해 해당 도메인의 IP주소를 알아낼 수 있음.
 * 
 * 포트(Port)
 * - IP주소는 네트워크 상에서 컴퓨터를 찾을 때만 사용하고 
 * 	 컴퓨터 내에서 실행하는 프로그램을 선택하기 위해 포트를 사용함
 * - 클라이언트는 서버 연결 요청시 IP주소와 포트 번호를 알고 있어야 한다.
 * - 포트는 0 ~ 65535 까지 범위를 가짐
 * 
 * 
 * InetAddress : IP주소를 다루기 위한 클래스;
 * 
 * 
 * */
public class InetAddressTest {

	public static void main(String[] args) {

		try {
			InetAddress ip = InetAddress.getByName("google.com");
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
			System.out.println("----------------------------");
			
			
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName > " +  ip.getHostName());
			System.out.println("getHostAddress > " +  ip.getHostAddress());
			System.out.println("------------------------------");
			
			
			InetAddress[] ipArr = InetAddress.getAllByName("naver.com");
			for(InetAddress elem : ipArr)
			{
				System.out.println(elem);
			}
			
			
			
			
			
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
