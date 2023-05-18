package com.kh.condition;

import java.util.*;

public class A_if 
{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		A_if _if = new A_if();
		
//		_if.method3();
//		_if.method4();
//		_if.method5();
//		_if.practice1();
		_if.practice2();
		
	}
	
	public void method1() {}

	public void method2() {}
	
	public void method3() {
		String name = "";
		System.out.print("이름 > ");
		name = sc.nextLine();
		
		if(name.equals("멍멍이"))
		{
			System.out.printf("안녕 ~ %s", name);
		}
		else
			System.out.println("멍멍이가 아니네 ㅠㅠ");		
	}
	public void method4() {
		System.out.printf("숫자 > ");
		int number = sc.nextInt();
		
		if(number > 0)
			System.out.println("양수");
		else if(number < 0)
			System.out.println("음수");
		else
			System.out.println("0");
		
	}
	
	public void method5()
	{
		System.out.printf("점수 > ");
		int score = sc.nextInt();
		char grade = 'A';

		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';	
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';

		System.out.println(grade);
	}
	
	public void practice1()
	{
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i <3; i++)
		{		System.out.printf("number > ");
			int number = sc.nextInt();
			if(number % 2 == 0)
				arr.add(number);
		}
		
		// null check
		if(arr.contains(null))
			return;
		
		for(int i : arr)
			System.out.println(i);
	}

	public void practice2()
	{
		System.out.print("정수 > ");
		int num = sc.nextInt();
		String str;
		
		if(num < 0)
			str = "minus";
		else if(num > 0)
			str = "plus";
		else
			str = "zero";
			
		System.out.println(str);
		
		if(num % 2 != 0)
			str = "even";
		else
			str = "odd";
		
		System.out.println(str);
		
	}
	
	
	
	
}

