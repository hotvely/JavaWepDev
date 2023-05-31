package com.kh.step3;
import com.kh.step3.model.Calculator;

public class Application {

	public static void main(String[] args) {

		/*
		 * (참조)변수 호출 방법 : 참조변수.변수;
		 * 메소드 호출 방법 : 참조변수.메서드이름(값1, 값2, ...);
		 * 
		 * 
		 * 
		 * */
		
		Calculator cc = new Calculator();
		System.out.println(cc.max(100, 4215));
		System.out.println("----------------------------");
		
		/*
		 * 인스턴스 메서드
		 * - 인스턴스 생성 후, 참조변수.메서드이름(); 으로 호출
		 * - 인스턴스 변수나 메서드와 관련된 작업을 하는 메서드
		 * 
		 * 클래스 메서드(static)
		 * - 객체 생성 없이, 클래스이름.메서드이름(); 으로 호출
		 * - 인스턴스 변수나 인스턴스 메서드와 관련 없는 작업을 하는 메서드
		 * 
		 * */
			
//		System.out.println(cc.sub(10, 7));
//		System.out.println(cc.mul(3, 2));
//		System.out.println(cc.div());
//		
		System.out.println(cc.factorial(5));
		
		String str = "apple";
		for(char ch : str.toCharArray())
		{
			System.out.println("////");
		}
		
	}

}
