package com.kh;

import java.util.*;
import java.util.ArrayList;



public class A_Variable
{
	public static void main(String[] args)
	{

		// 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
		A_Variable v = new A_Variable();
		
		//실행한 클래스로 메소드 호출
		v.printValue();
	}
	
	public void printValue()
	{
		System.out.println(10 * 2 * 3.141592);
		System.out.println(10*10*3.141592);
		
		System.out.println("----------------------");
		
		
		//변수를 사용하면?
		int r = 10;
		double pi = 3.141592;
		System.out.println(r*2*pi);
		System.out.println(r*r*pi);		
		final int test = 0;
		
	}
	
	public void variableTest()
	{
		/*
		 * *변수의 선언
		 * [표현법] 자료형 변수명;
		 * 
		 * - 자료형은 어떤 값을 저장할지, 어떤크기의 메모리를 할당받을지에 대한 정보
		 * - 변수명은 변수의 이름으로 값을 일고, 쓰고, 지우는 작업을 할 때 사용
		 * 
		 * *변수의 초기화
		 * [표현법] 변수명 = 값(리터럴);
		 * 
		 * - 변수에 처음으로 값을 저장하는 것
		 * - '='은 오르쪽 데이터를 왼쪽 변수에 대입(저장)하는 연산자
		 *  
		 * */
		
		
		// * 기본 자료형 (Primitive type)
		// 실제 값을 저장
		// 1) 논리형
		boolean bl;	//1byte
		bl = true;
		boolean isFalse;
		isFalse = false;
		
		// 2) 문자형
		char ch = 'a';	//2byte
		
		// 3) 정수형
		byte bNum = 8;	//1byte(8bit)
		short sNum = 192;	//2byte(16bit)
		int iNum = 123151;	//4byte(32bit)
		long lNum = 93728169L;	//8byt
				
		// 4) 실수형
		float fNum = 3.14f;
		double dNum = 3.14;
		
		// * 참조자료형 (Reference type)
		// 주소값 저장
		String name = "아아앙";
		
		
		// 변수의 명명 규칙
		// 1) 대소문자 구분된다.
		int number;
		int NUMBER;
		int Number;
		// 2) 숫자로 시작하면 안된다
		int a6g4e2;
		// 3) 특수문자는 '_', '$' 만 사용가능
		// 4) 예약어(Reserved word)를 사용하면 안됨
		// 5) 낙타표기법 (numberSize, arrayList, isDo ... etc)
				
	}
	
	public void constant()
	{
		/*
		 * * 상수
		 * [표현법] final 자료형 변수명;
		 * 
		 * - 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용
		 * - 초기화 이후 값 변경 불가능
		 * 
		 * 명명규칙
		 * - 상수변수 네이밍은 항상 대문자 !
		 * final int VARIABLE = 999; (C++에서 사용하던것과 마찬가지)
		 * 
		 * 
		 * */
		final int A = 10;
		
	}
	
	
	
}
