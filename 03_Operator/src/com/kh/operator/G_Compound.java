package com.kh.operator;

public class G_Compound {

	/*
	 * 복합 대입 연산자 - 산술연산자와 대입연산자가 결합되어 있는 상태 - 연산처리 속도가 빨라지므로 사용하는걸 권장 ex) += *= /=
	 * %= 등등~
	 * 
	 * int a = 0; a = a + 3; (== a += 3;)
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G_Compound Comp = new G_Compound();
		Comp.method1();
		
		
		
	}

	public void method1() {
		int number = 12;
		String str = "Hello";
		number += 3;
		System.out.println(number);
		
		number -= 5;
		System.out.println(number);
		
		str += 'a';
		System.out.println(str);
		
		
		
		
		str += "ttt";
		System.out.println(str);
		
		
	}

}
