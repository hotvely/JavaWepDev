package com.kh.loop;

import java.util.*;

public class D_While {

	Scanner sc = new Scanner(System.in);

	public void method1() {
	}

	public void method2() {
	}

	public void method3() {
		while (true) {
			int input = 0;
			System.out.print("숫자 > ");
			int num = sc.nextInt();

			if (num == input)
				break;

		}
	}

	public void method4() {
		int num = 2;
		do {
			System.out.println(num);
		} while (num < 0);
	}

	/*
	 * 숫자 맞추기 게임
	 * 1~100
	 * 임의 랜덤 값 맞추면됨
	 * */
	public void method5() {
		
		System.out.println("*** 숫자맞추기 게임 ***");
		int idx = 1;
		int randNum = (int)(Math.random() * 100) + 1;
		while(true)
		{
			System.out.print("숫자 > ");
			int input = sc.nextInt();
			if(input == randNum)
			{
				System.out.printf("%d번 만에 맞췄네용 대단해요ㅎ", idx);				
				break;
			}
			else
			{
				if(input < randNum)
				{
					System.out.println("더 큰 수를 입력하세용");
				}
				else if(input > randNum)
				{
					System.out.println("더 작은 수를 입력하세용");					
				}
				idx++;
			}
		}
	}
	
	public static void main(String[] args) {
		D_While dw = new D_While();
//		dw.method3();
//		dw.method4();
		dw.method5();
		
	}

}
