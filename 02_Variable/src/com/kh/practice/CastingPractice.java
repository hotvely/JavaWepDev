package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();
	}
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("문자 > ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		System.out.printf("%c 유니코드 : %d\n" , ch, (int)ch);
		ch++;
		System.out.printf("%c 유니코드 : %d\n" , ch, (int)ch);
		
	}
	public static void method2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("국어 점수 > ");
		int kor = sc.nextInt();
		System.out.printf("영어 점수 > ");
		int eng = sc.nextInt();
		System.out.printf("수학 점수 > ");
		int math = sc.nextInt();
		
		int total =  kor + eng + math;
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f\n", total/(float)3);
	
	}

}
