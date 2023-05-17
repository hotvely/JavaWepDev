package com.kh.practice;

import java.util.*;

public class OperatorPractice {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorPractice OP = new OperatorPractice();
		OP.method1();
		OP.method2();
		OP.method3();		
 		OP.method4();
		OP.method5();
		OP.method6();
	}

	public void method1() {
		// 모든 사람이 연필을 골고루 나눠가지려고 한다. 인원 수와 연필 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 연필 개수와 나눠주고 남은 연필의 개수를 출력하세요

		System.out.printf("인원수 >");
		int personNum = sc.nextInt();
		System.out.printf("연필개수 >");
		int penCount = sc.nextInt();

		System.out.printf("1인당 연필 > %d\n", penCount / personNum);

		System.out.printf("남는개수 > %d\n", penCount % personNum);
	}

	public void method2() {
		// 키보드로 입력 받은 숫자를 산술 연산자만 사용해서 십의 자리 이하는 버리는 코드를 작성하세요.
		// 만약 432이라면 400, 111이라면 100이 출력됩니다.

		System.out.printf("숫자 >");
		int number = sc.nextInt();

		System.out.println(number - number % 100);

	}

	public void method3() {
		// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.

		System.out.printf("숫자1 >");
		int number1 = sc.nextInt();
		System.out.printf("숫자2 >");
		int number2 = sc.nextInt();
		System.out.printf("숫자3 >");
		int number3 = sc.nextInt();

		System.out.println((number1 != number2) ? false : (number2 != number3) ? false : true);

	}

	public void method4() {
//		키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.

		System.out.printf("숫자 >");
		int number = sc.nextInt();

		System.out.println((number % 2 != 0) ? "홀수" : "짝수");

	}

	public void method5() {
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세초과)인지 출력하세요.

		System.out.printf("나이 >");
		int number = sc.nextInt();

		System.out.println((number >= 19) ? "성인" : (number >= 13) ? "청소년" : "어린이");

	}

	public void method6() {
//		키보드로 사과의 개수와 바구니의 크기(바구니 1개의 들어가는 사과의 개수)를 입력받아 필요한 바구니의 수를 출력하세요.

		System.out.printf("사과개수 >");
		int number = sc.nextInt();
		System.out.printf("바구니크기 >");
		int boxSize = sc.nextInt();
		
		System.out.printf("필요한 바구니의 수 > %d\n", (number%boxSize)>0 ? number/boxSize + 1 : number/boxSize);

	}
}
