package com.kh.practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * CheckedException
 * - Exception을 상속하고 있는 예외들
 * - 컴파일 시 예외처리 코드가 있는지 검사하는 예외
 * - 예외 처리(try-catch, throws)가 되어 있지 않으며녀 컴파일 에러를 발생시킴
 * - 조건문이나 소스코드 수정으로 해결되지 않는 경우 > 주로 외부 매개체와 입출력이 일어날 때 발생
 * - 
 * 
 * */

public class D_CheckedException {

	public static void main(String[] args) 
	{
//		try
//		{
//			new D_CheckedException().method1();
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//		System.out.println("==================");
		
		
		new D_CheckedException().method3();
		
		
		
	}

	public void method1() throws IOException
	{
		method2();
	}
	
	public void method2() throws IOException
	{
		throw new IOException();
	}
	
	public void method3()
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.text");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
