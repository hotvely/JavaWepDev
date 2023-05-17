package com.kh.operator;
import java.util.*;

public class F_Triple {

	
	
	/*
	 * 삼항연산자
	 * [표현법] 조건식 ? 식1 : 식2
	 * 
	 * - 조건식에는 주로 비교, 논리 연산자가 사용됨
	 * - 조건식의 결과가 ture이면 식1, false이면 식2
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		F_Triple triple = new F_Triple();
		triple.method1();
		
	}
	
	
	public void method1()
	{
		int number = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수값 입력 >");
		number = sc.nextInt();
			
		result = (number == 0) ? "0이다" : ((number > 0) ? "양수" : "음수") ;
		System.out.println(result);
		
		
		
		
	}

}
