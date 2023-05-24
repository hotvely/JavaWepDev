package com.kh.step3.model;

import java.util.*;
/*
 * 메서드
 * - 어떤 작업을 수행하기 위한 명령문의 집합
 * - 어떤 값을 입력받아서 처리하고, 그 결과를 돌려준다
 * - 단, 입력받는 값이 없을 수도 있고, 결과를 돌려주지 않을 수 도 있음
 * - 하나의 메서드는 한 가지 기능만 수행하도록 작성하는 것을 권고함
 * 
 * [접근제한자] [리턴타입 자료형] 이름 (매개변수) { // 내용 }
 * 
 * */

public class Calculator {

	public int a = 0;
	public int b = 10;

	static Scanner sc = new Scanner(System.in);

	public static boolean func(Object obj, String s) throws ClassNotFoundException {
		return Class.forName(s).isInstance(obj);
	}

	public int max(int a, int b) {
//		if(a > b)
//			return a;
//		else
//			return b; 	
		return (a > b ? a : b);
	}

	public int sub(int a, int b) {
		return a + b;

	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static String div() {

		Integer a = null, b = null;
		try {
			System.out.print("숫자1 > ");
			a = Integer.parseInt(sc.nextLine());
			System.out.print("숫자2 > ");
			b = Integer.parseInt(sc.nextLine());

			if (b <= 0)
				div();
		} catch (NumberFormatException e) {
			div();
		}

		return "몫은 " + quoient(a, b) + " 나머지는 " + remainder(a, b);

	}

	public static int quoient(Integer a, Integer b) {
		return a / b;
	}

	public static int remainder(Integer a, Integer b) {
		return a % b;
	}

	
	/*
	 * 재귀함수 
	 * - 메서드 내부에서 자기 자신 반복적으로 호출하는 함수
	 * - 반복문으로도 바꿀 수 있고, 반복문보다는 성능이 안좋음
	 * 
	 * */
	public int factorial(int n)
	{
		/*
		 * 팩토리얼;
		 * 
		 * */
//		if(n == 0)
//		{
//			return 1;
//		}
//		else
//			return n * factorial(n-1);
		
		return (n == 0 ? 1 :  n * factorial(n-1));
		
	}
	
	
	
}
