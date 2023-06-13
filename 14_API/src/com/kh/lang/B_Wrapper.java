package com.kh.lang;

import java.sql.Wrapper;

public class B_Wrapper {

	/*
	 * Wrapper 클래스
	 * - 기본 자료형을 객체로 포장해 주는 클래스
	 * - 기본 자료형으로 사용해도 되지만 해당 기본 타입을 객체로 취급해서 처리해야 하는 경우 사용
	 * Integer.parseInt(); 와같은경우.
	 * 
	 * Boxing > 기본 자료형을 Wrapper클래스로 포장해 주는것
	 * UnBoxing > Wrapper 클래스를 기본 자료형으로 변경해 주는것
	 * 
	 * */
	
	public static void main(String[] args)
	{
		B_Wrapper b = new B_Wrapper();
//		b.method1();
		b.method2();
		
		
		
	}
	
	
	public void method1()
	{
		//Boxing : 기본 자료형 -> Wrapper
		double dNum1 = 3.14;
		double dNum2 = 3.14;
		
		// 1. 객체 생성을 통한 방법 (비권장 : Deprecated)
		Double double1 = new Double(dNum1);
		Double double2 = new Double(dNum2);
		System.out.println("dNum1 == dNUm2 > " + (dNum1 == dNum2));		//t
		System.out.println("dNum2 == double2 > " + (dNum2 == double2));	//t
		System.out.println("double1 == double2 > " + (double1 == double2));	//f

		//클래스에서 제공하는 함수 사용가능
		System.out.println("equals > " + double1.equals(double2));	//t
		System.out.println("----------------");
		
		
		
		// 2. 객체를 직접 생성하지 않고 정적 함수(valueOf)를 통한 방법
		Double double3 = Double.valueOf(1.12);
		Double double4 = Double.valueOf("1.11");
		System.out.println(double3 + " / " + double4);
		System.out.println("----------------");
		

		
		// 3. auto boxing : 같은 타입만 가능..
		Integer integer = 5;
		Double double5 = 3.55;
		System.out.println(integer + " / " + double5);
		System.out.println("----------------");
		
		
		
		// UnBoxing : Wrapper 객체 -> 기본자료형 
		// 1. Wrapper 객체 함수를 통한 방법
		double dNum3 = double1.doubleValue();
		double dNum4 = double2.doubleValue();
		System.out.println(dNum3 + " / " + dNum4);
		
		
		
		// 2. Wrapper 클래스의 정적 함수를 통한 방법
		double dNum5 = Double.parseDouble("34.78");
		int iNum = Integer.parseInt("19");
		
		
		
		// 3. auto Unboxing 통한 방법
		double dNum6 = double1;
		double dNum7 = double3;
		
		// 자바 1.9 버전 이후로는 boxing, unboxing 기능을 쓰지 않도록 Deprecated 되어 있음;
		// 
		
	}
	
	
	// String 과 Wrapper 클래스 간의 변경
	public void method2()
	{
		String str1 = "10";
		String str2 = "3.14";

		// 1. 문자열을 기본 자료형으로 변경 : Wrapper 클래스에서 제공하는 parse 함수 사용
		int iNum = Integer.parseInt(str1);
		double dNum = Double.parseDouble(str2);
		System.out.println(iNum + dNum);
		
		
		
		// 2. 기본 자료형을 문자열로 변경
		// String의 valueOf() 함수 사용
		String str3 = String.valueOf(iNum);
		String str4 = String.valueOf(dNum);
		System.out.println(str3 + str4);
		// Wrapper 클래스의 valueOf().toString() 함수 이용
		String str5 = Integer.valueOf(iNum).toString();
		String str6 = Double.valueOf(dNum).toString();
		System.out.println(str5 + str6);
		
		
	
		
		
	}
	
	
	
	
	

}
