package com.kh.step2;

/*
 * 멤버 변수
 * - 기본적으로 사용하는 지역변수들
 * 
 * 인스턴스변수
 * - 각 인스턴스의 개별적인 저장공간
 * - 인스턴스 생성 후, '참조변수.인스턴스변수명'으로 접근
 * - 인스턴스를 생성할 때 생성되고, 참조변수가 없으면 가비지 컬렉터가 삭제함
 * 
 * 클래스 변수
 * - 같은 클래스의 모든 인스턴스들이 공유하는 변수
 * - 인스턴스 생성없이 '클래스이름.클래스변수명'으로 접근 가능
 * - 클래스가 메모리에 올라가면 생성되고 프로그램 종료시 소멸 
 * 
 * */

public class Card {
	// 인스턴스 변수
	public int number;		//숫자
	public String kind;		//모양
	
	// 클래스 변수
	public static int width = 100;
	public static int height = 250;
	
	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		System.out.println();
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 3;
		
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.printf("첫번째 카드는 %s %d 두번째 카드는 %s %d\n", c1.kind, c1.number, c2.kind, c2.number);
		System.out.printf("첫번쨰 카드 w(%d) h(%d) 두번째 카드 w(%d) h(%d)\n",c1.width, c1.height, c2.width, c2.height);

		
		
	}
	

}
