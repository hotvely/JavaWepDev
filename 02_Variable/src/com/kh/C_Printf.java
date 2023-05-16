package com.kh;

public class C_Printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("-ㅅ-\n");
		System.out.println("ㅎㅎㅎㅎㅎㅎㅎ");

		// System.out.println("출력하고자하는 형식(포맷)")
		/*
		 * *포맷으로 사용하는 키워드 %d : 정수 %f : 실수 %s : 문자
		 */

		int iNum1 = 10;
		int iNum2 = 20;
		// %숫자 -> 오른쪽 정렬
		// %-숫자 -> 왼쪽 정렬
		System.out.printf("1: " + "%1s\n", "a");
		System.out.printf("2: " + "%2s\n", "a");
		System.out.printf("3: " + "%3s\n", "a");
		System.out.printf("4: " + "%4s\n", "a");
		System.out.printf("5: " + "%5s\n", "a");
		System.out.printf("6: " + "%6s\n", "a");

		System.out.printf("%5d%%\n", iNum1);
		System.out.printf("%d%s\n", iNum2, '%');

		double dNum1 = 1.23456;
		double dNum2 = 3.14;
		float fNum1 = 999.99f;
		// \t -> tab키
		// %f -> 소수점 6번째 까지 보여줌.
		System.out.printf("%.2f\t%.2f\t%.2f \n", dNum1, dNum2, fNum1);
		System.out.println(dNum1);

		char ch = 'a';
		String str = "Hello";
		System.out.printf("%c %s %c\n", ch, str, ch);

		
		// %C, %S 와 같이 자료형을 받는 문자를 대문자로 표현하면 대문자 표기가 됨
		// A HELLO A
		System.out.printf("%c %s %c\n", (char) ((int) ch - 32), str.toUpperCase(), (char) ((int) ch - 32));
		System.out.printf("%C, %S, %C\n", ch, str, ch);

	}

}
