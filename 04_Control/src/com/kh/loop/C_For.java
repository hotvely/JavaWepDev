package com.kh.loop;

import java.util.*;

public class C_For {

	Scanner sc = new Scanner(System.in);

	/*
	 * for문 for(초기식 ; 조건식 ; 증감식 ) { // TODO.. 코드 }
	 * 
	 * 주어진 횟수만큼 코드 반복 실행 ! - 초기식은 반복문 시행될때 한번만 실행되는 구문으로 반복문 안에서 사용하게될 변수를 선언 - 조건식의
	 * 결과가 false이면 실행 코드 수행 하지 않고 탈출함 ~ - 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 for문을 제어함
	 * 
	 */

	public static void main(String[] args) {
		C_For cf = new C_For();

//		cf.method1();
//		cf.method2();
		cf.method3();
		
		
	}

	public void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
	}

	public void method2() {
		for(int i = 5 ; i > 0; i--)
		{
			System.out.println(i);
		}
	}
	
	
	// 1 3 5 7 9
	public void method3() {
		for(int i = 0; i<10; i++)
		{
			if(i%2 == 0)
				continue;
			
			System.out.println(i);			
		}
		
		for(int i = 1 ; i<10; )
		{			
			System.out.println(i);
			i +=2;
		}
	}

}
