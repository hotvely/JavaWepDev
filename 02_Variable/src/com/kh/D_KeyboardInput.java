package com.kh;

import java.util.Scanner;



public class D_KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner - 화면(console)으로 부터 데이터를 "입력"받느느 클래스
		 * 
		 * 1) import java.util.Scanner 2) Scanner 클래스 생성 3) 사용 - 문자열 : sc.next() -
		 * 공백이전까지, sc.nextLine() - 공백포함 다음 라인 - 정수형 : sc.nextInt() - 실수형 :
		 * sc.nextFloat(), sc.nextDouble()
		 * 
		 */

		// 제네릭 클래스인 System 내부의 in 객체 기능을 사용하기 위함
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은? > ");
		String name = sc.nextLine();

		System.out.print("당신의 집은 어디십니까? > ");
		String address = sc.nextLine();

		System.out.print("당신의 나이는? > ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("당신의 키는? (소수점 첫째 자리까지 입력 바랍니다.) > ");
		float height = sc.nextFloat();
		sc.nextLine();

		System.out.print("당신의 성별은 무엇입니까? (남/여) > ");
		String line = sc.nextLine();
		char gender = line.charAt(0);

//		System.out.printf("안녕하세요, %s에 사는 %d살 %s님(%c) 반갑습니다.\n", address, age, name, gender);
//		System.out.println("당신의 키는 : " + height + "cm이군요~ :)");

		System.out.printf("당신의 이름은 %s이고 사는 곳은 %s, 나이는 %d세, 키는 %.1fcm, 성별은 %c입니다.\n", name, address, age, height, gender);
		
		
	}

}
