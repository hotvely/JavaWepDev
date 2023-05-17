package com.kh.operator;

public class B_Increment {

	
	/*
	 * 증감연산자
	 * [표현법] (증감연산자)값; 또는 값(증감연산자)
	 * 
	 * - 값을 1씩 증가, 감소 시키는 연산자 ++ / --
	 * 
	 * - 1. ++a => 먼저 a값을 1더한후에 그 값을 다시 a에 넣어줌
	 * - 2. a++ => a에 값을 먼저 넣은 후에 값을 1증가 시킴
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		
		System.out.println(number);
		System.out.println(number++);
		System.out.println(number);
		System.out.println(++number);
		System.out.println(number++);
	}

}
