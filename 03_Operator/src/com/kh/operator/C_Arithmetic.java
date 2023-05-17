package com.kh.operator;

public class C_Arithmetic {

	/*
	 * 산술연산자  '+' '-' '*' '/' '%'
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a = 6;
		int b= 10;
		int c = 16;
		int d = 2;
		int e = 6;
		int f = 5;
		int g = (--b) + (d--);
		int h = 2;
				//6 + 21 % 9
		int i = (a++) + b / (--c / f)  * (g-- - d) % (++e + h);
		System.out.println(i);
	}

}
