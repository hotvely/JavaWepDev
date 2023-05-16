package com.kh.practice;

import java.util.*;
import java.util.Scanner;

class Calculator {

	int iNum1, iNum2;

	Calculator(int iNum1, int iNum2) {
		this.iNum1 = iNum1;
		this.iNum2 = iNum2;
	}

	public int plus() {
		return this.iNum1 + this.iNum2;
	}

	public int minus() {
		return this.iNum1 - this.iNum2;
	}

	public int mul() {
		return this.iNum1 * this.iNum2;
	}

	public int div() {
		int result;
		try {
			result = this.iNum1 / this.iNum2;
			return result;
		} catch (ArithmeticException e) {
			result = 0;
		}

		return result;

	}

	public int remain() {
		int result;
		try {
			result = this.iNum1 % this.iNum2;
			return result;
		} catch (ArithmeticException e) {
			result = 0;
		}
		return result;
	}

}

public class VariablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariablePractice VP = new VariablePractice();
		
		VP.method1();
		VP.method2();
		VP.method3();
		VP.method4();
	}

	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("첫 번쨰 정수 입력 > ");
		int iNum1 = sc.nextInt();

		System.out.printf("두 번쨰 정수 입력 > ");
		int iNum2 = sc.nextInt();

		Calculator calc = new Calculator(iNum1, iNum2);

		System.out.printf("더하기 결과 > %d\n", calc.plus());
		System.out.printf("뻬기  결과 > %d\n", calc.minus());
		System.out.printf("곱하기 결과 > %d\n", calc.mul());
		System.out.printf("나누기 결과 > 몫(%d) 나머지(%d)\n", calc.div(), calc.remain());
	}

	public void method2() {
		int adultNum = 2;
		int teenNum = 3;

		int adultPrice = adultCalcPrice(adultNum);
		int teenPrice = teenCalcPrice(teenNum);
		int totalPrice = adultPrice + teenPrice;
		System.out.printf("성인 %d명 : %d\n", adultNum, adultPrice);
		System.out.printf("학생 %d명 : %d\n", teenNum, teenPrice);

		System.out.printf("총 금액 : %d\n", totalPrice);
	}

	public void method3() {
		int x = 5;
		int y = 7;
		int z = 9;

		int temp1, temp2;
		temp1 = x;
		temp2 = z;

		x = y;
		z = temp1;
		y = temp2;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

	public void method4() {

		Scanner sc = new Scanner(System.in);
		System.out.printf("영어단어 입력 > ");
		String str = sc.nextLine();

		System.out.printf("첫번째 문자 : %c\n", (char)str.charAt(0));
		System.out.printf("마지막 문자 : %c\n", (char)(str.charAt(str.length() -1)));
	}

	//
	//
	//
	//
	// function
	public int adultCalcPrice(int adultNum) {
		return 10000 * adultNum;
	}

	public int teenCalcPrice(int teenNum) {
		return 7000 * teenNum;
	}

}
