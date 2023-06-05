package com.kh.practice1;

import java.io.IOException;

/*
 * 예외처리 떠넘기기 > throws 키워드
 * 
 * 리턴타입 함수이름 (매개변수...) throws 예외클래스1, 예외클래스2, ...(여러개 가능) 
 * {
 * 		//todo..
 * }
 * 
 * */
public class B_Throws {

	public static void main(String[] args) {
		
		try 
		{
			new B_Throws().method1();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void method1() throws IOException, ClassNotFoundException
	{
		System.out.println("method1() 호출");
		method2();
		System.out.println("method1() 종료");
	}
	
	public void method2() throws IOException, ClassNotFoundException
	{
		System.out.println("method2() 호출");
		method3();
		System.out.println("method2() 종료");
	}
	
	public void method3() throws IOException, ClassNotFoundException
	{
		System.out.println("method3() 호출");
		System.out.println("method3() 종료");
		
		int random = (int)(Math.random() * 3 + 1);
		
		if(random == 1) 
		{
			throw new ClassNotFoundException();
		}
		else
		{
			throw new IOException();
		}

		

	}
	
	
}
