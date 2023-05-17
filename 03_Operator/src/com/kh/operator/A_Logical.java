package com.kh.operator;

public class A_Logical {

	
	/*
	 * 논리 부정 연산지
	 * [표현법] !논리값(true, false)
	 * 
	 * - 논리값을 반대로 바꾸는 연산자
	 * (true -> false / false -> true)	 * 
	 * 
	 * */
	public void LogiCal()
	{
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(!b1);
		System.out.println(!b2);
		
	}
	
	
	
	public static void main(String[] args)
	{
		A_Logical lg = new A_Logical();
		lg.LogiCal();
		
		
		
	}
	
	
}
