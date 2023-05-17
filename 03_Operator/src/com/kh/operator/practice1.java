package com.kh.operator;
import java.util.*;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		practice1 p = new practice1();
		
		p.method2();
		

	}
	
	public void method1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수1 >");
		int num1 = sc.nextInt();
		
		System.out.printf("정수2 >");
		int num2 =sc.nextInt();
		
		
		String result  = (num1 * num2 > 100) ? "100이상" : "100이하" ;
		
		
		System.out.println(result);			
	}
	public void method2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("문자 입력 >");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		
		String result  = ((ch >= 'A') && (ch <= 'Z')) ? "대문자" : 
			((ch >= 'a')&&(ch <= 'z')) ? "소문자" : "알파벳이아니네 ㅎㅎ;" ;
		
		
		System.out.println(result);			
	}
}
