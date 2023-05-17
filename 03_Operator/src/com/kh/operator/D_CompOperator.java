package com.kh.operator;
import java.util.*;
public class D_CompOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 101;
		Scanner sc = new Scanner(System.in);
		

		System.out.println("a가 짝수인가 :" + (a % 2 == 0));
		System.out.println("a가 홀수인가 :" + (a % 2 != 0));

		System.out.print("첫번째 정수> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수> ");
		int num2 = sc.nextInt();		
		
		System.out.println("첫번째가 두번째 보다 큽니까 > " + (num1 > num2));
		System.out.println("첫번째 정수가 짝수입니까 > " + (num1 % 2 == 0));
		System.out.println(num2 > 'A');

		
	}

}
