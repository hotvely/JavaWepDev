package com.kh;

public class B_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B_Casting b = new B_Casting();
		// b.autoCasting();
		b.casting();
	}

	/*
	 * * 형변환 (casting) - 값의 타입을 다른 타입으로 변환하는것 - boolean을 제외한 기본형은 서로 변환이 가능
	 * 
	 */

	/*
	 * * 자동변환 (묵시적) - 강제로 변환해줄 필요가 없음 - 작은자료형 -> 큰자료형 (short -> int)
	 */

	public void autoCasting() {
		byte b = 10;
		short s = b; // byte -> short
		int i = s; // short -> int
		float f = s; // short -> float
		long l = i; // float -> long
		double d = f; // float -> double

		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("f : " + f);
		System.out.println("l : " + l);
		System.out.println("d : " + d);
	}

	public void casting() {
		double d = 4.12345678904567890; // 15자리
		float f = (float) d; // 6자리
		int i = (int) f;
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		System.out.println("i : " + i);

		char ch = 'a';
		// char <-> int : 각 문자들마다 고유한 숫자가 지정되어 있어 쌍방향으로 형변환 가능 (유니코드)
		// char는 음수값 저장 물가
		int num = 'A';
		System.out.println((int) ch);
		num += 1;
		System.out.println((char) num);

	}
}
