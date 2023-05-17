package com.kh.operator;
import java.util.Scanner;
public class E_LogicOperator {

	
	/*
	 * 논리연산자
	 * -두개의 논리값을 연산해주는 연산자
	 * - 논리연산한 결과마저도 논리값임
	 * 
	 * 논리값 && 논리값 : 둘다 true => true, 둘중하나라도 false => false;
	 * 논리값 || 논리값 : 둘중 하나라도 true => true;
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E_LogicOperator Instance = new E_LogicOperator();
//		Instance.method1();
		Instance.method2();
		
	}
	
	public void method1()
	{
		int number = 0;
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("임의의 정수를 입력 > ");
		number = sc.nextInt();
		
		if(number > 0 && number < 101)
			result = true;
		// result = number > 0 && number < 101;
		
		System.out.println(result);		
	}
	
	public void method2() {
		//사용자가 입력한 문자값이 알파벳 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.printf("알파벳 입력 > ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		if(ch >= 'A' && ch <= 'Z')
		{
			System.out.println("대문자");
		}
		else if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("소문자");
		}
		else
			System.out.println("알파벳이 아님 ㅎㅎ;");
		
		
	}
	
	

}
