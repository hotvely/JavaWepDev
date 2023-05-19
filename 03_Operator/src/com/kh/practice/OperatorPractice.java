package com.kh.practice;

import java.util.*;

public class OperatorPractice {

	// 호출할때 마다 스캐너 객체를 호출하는것 같아서.. 정적변수로 빼봤어요..
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorPractice op = new OperatorPractice();
		op.method1();
		op.method2();
		System.out.println(op.method3());		
		op.method4();
		System.out.println(op.method5());
		op.method6();
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

	public String method3() {
		// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.

		//  -> 변수 3개를 만들면 메모리 할당이 늘어나서 그냥 하나로 줄이고 분기처리 하고
		// return 키워드로 조건에 맞지 않으면 탈출해서 크진않지만 최적화 해봤어요
		
		int number;
		System.out.printf("숫자1 >");
		number = sc.nextInt();
		
		System.out.printf("숫자2 >");
		if(number != sc.nextInt())
			return "FALSE";
		
		System.out.printf("숫자3 >");
		if(number != sc.nextInt())
			return "FALSE";
		
		return "TRUE";
	}

	public void method4() {
//		키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.

		System.out.printf("숫자 >");
		int number = sc.nextInt();

		System.out.println((number % 2 != 0) ? "홀수" : "짝수");

	}

	public String method5() {
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세초과)인지 출력하세요.

		System.out.printf("나이 >");
		int number = sc.nextInt();
		
		if(number >= 19)
			return "성인";
		else if(number >= 13)
			return "청소년";
		else
			return "어린이";
		
		//삼항 연산자 사실 썩 좋아하진 않기도 하고... 수정했으면 하는 부분이 어떤지 정확하게 모르곘어서 그냥 분기 처리했습니다..ㅠ
		//System.out.println((number >= 19) ? "성인" : (number >= 13) ? "청소년" : "어린이");

	}

	public void method6() {
//		키보드로 사과의 개수와 바구니의 크기(바구니 1개의 들어가는 사과의 개수)를 입력받아 필요한 바구니의 수를 출력하세요.

		System.out.printf("사과개수 >");
		int number = sc.nextInt();
		System.out.printf("바구니크기 >");
		int boxSize = sc.nextInt();
		
		// 코드 중복되는 부분이 있어서 가독성차원에서 변수하나 만들어서 수정했고.. 증감연산자 오늘 배워서 함 써봤습니다~
		int boxCount = number/boxSize;
		System.out.printf("필요한 바구니의 수 > %d\n", (number%boxSize)>0 ? ++boxCount : boxCount);

	}
}
