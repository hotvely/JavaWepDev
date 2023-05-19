package com.kh.loop;

import java.util.*;

public class C_For {

	Scanner sc = new Scanner(System.in);

	/*
	 * for문 for(초기식 ; 조건식 ; 증감식 ) { // TODO.. 코드 }
	 * 
	 * 주어진 횟수만큼 코드 반복 실행 ! - 초기식은 반복문 시행될때 한번만 실행되는 구문으로 반복문 안에서 사용하게될 변수를 선언 - 조건식의
	 * 결과가 false이면 실행 코드 수행 하지 않고 탈출함 ~ - 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 for문을 제어함
	 * 
	 */

	public static void main(String[] args) {
		C_For cf = new C_For();

//		cf.method1();
//		cf.method2();
//		cf.method3();
//		cf.method5();
//		cf.method6();
//		cf.method7();
//		cf.method8();
//		cf.method9();
//		cf.method10();
//		cf.method11();
//		cf.method12();
//		cf.method13();
//		cf.method14();
//		cf.method15();
		cf.method16();

	}

	public void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
	}

	public void method2() {
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}

	// 1 3 5 7 9
	public void method3() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;

			System.out.println(i);
		}

		for (int i = 1; i < 10;) {
			System.out.println(i);
			i += 2;
		}
	}

	/*
	 * continue 키워드
	 * 
	 * continue 키워드는 반복문 안에서 사용 반복문 안에서 continue키워드를 만나게 되면 현재 구문을 종료 ~ 반복문 벗어나는건
	 * 아니고... 다음 반복 구문을 실행함 ㅎ;
	 * 
	 * 
	 */
	// 반복문으로 1~10 합계
	public void method5() {
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public void method6() {
		System.out.print("숫자 > ");
		int idx = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < idx + 1; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public void method7() {
		// Math.random() -> 범위 : 0.0 ~ 1.0미만 (즉, 특정 랜덤값을 만들고 싶다면 곱해주면 됨~)
		int random = (int) (Math.random() * 10);
		int sum = 0;
		for (int i = 0; i < random + 1; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	/*
	 * H e l l o
	 * 
	 */
	public void method8() {
		String str = "Hello";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public void method9() {
		System.out.print("문자 > ");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public void method10() {

		for (int i = 1; i < 10; i++) {
			System.out.printf(" 2 X %d = %d\n", i, i * 2);
		}
	}

	// 사용자가 입력한 단을 출력
	public void method11() {
		System.out.print("몇 단? > ");
		int dan = sc.nextInt();

		if (dan < 2 || dan > 9) {
			System.out.println("잘못 입력했어욧 !");
			return;
		}

		System.out.printf("구구단 %d단\n", dan);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);

		}
	}

	// 2 ~ 9 출력
	public void method12() {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단입니다");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);

			}
		}

	}

	public void method13() {
		for (int i = 0; i < 4; i++) {
			System.out.print('*');
			for (int j = 0; j < 5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public void method14() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j)
					System.out.print(i + 1);
				else
					System.out.print('*');
			}
			System.out.println();
		}

	}

	public void method15() {
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i + 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public void method16() {
		for (int i = 0; i < 5; i++) {
			
			for (int k = 0; k < 5 - i; k++) {
				System.out.print(' ');
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}

			System.out.println();
		}
	}

}
