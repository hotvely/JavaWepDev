package com.kh._abstract;

import com.kh._abstract.step1.*;
import com.kh._abstract.step2.*;

public class Application {

	/*
	 * 추상클래스 abstract class
	 * 접근제어자 abstract class 클래스명 {...}
	 * 
	 * - 미완성 클래스로 추상 메서드를 포함한 클래스
	 * - 미완성 클래스라 new 연산자를 통해 객채 생성 불가능
	 * - 일반적인 멤버(필드,메서드)도 포함 가능 (c계통의 언어에서 헤더 파일 같은 느낌이랄까...???)
	 * - 추상 클래스로 객체를 생성할 순 없지만 참조형 변수타입으로는 사용가능함 (배열, 제네릭등등)
	 * - 상속 관계로 구성되어 있으면 다형성 적용 가능;
	 * 
	 * 
	 * 추상함수 abstract method
	 * 접근제어자 abstract 반환자료형 함수이름(매개변수...);
	 * 
	 * - 미완성 함수로 {내용이} 구현되지 않은 함수
	 * - 추상함수가 있으면 클래스도 추상클래스로 변경 해 주어야함
	 * - 상속관계에 있는 자식클래스에는 무조건 재정의 해 주어야함
	 * - override 해주지 않으면 컴파일 에러남
	 * - 자식 클래스에 강제성을 부여할 수 있음
	 *  
	 * */
	
	public static void main(String[] args) {
		
//		Sports sport = new Sports(100);			//<- 추상클래스라 객체 안만들어짐;
		
		// 객체는 못만들지만.. 배열과 같은 형태의 자료형으로는 만들 수 있??이왜진?????
		Sports sports[] = new Sports[2];
		sports[0] = new BasketBall(5);
		sports[1] = new FootBall(11);
		
		for(Sports s : sports)
		{
			System.out.println(s);
		}
		
		Pizza pizza[] = {new BulgogiPizza(32900, "피자헛"),
						new PotatoPizza(27900, "도미노피자"),
						new PineApplePizza(23000, "피자알볼로")};
		
		
		for(Pizza p : pizza)
		{
			p.makePizza();
		}
		
	}

}
