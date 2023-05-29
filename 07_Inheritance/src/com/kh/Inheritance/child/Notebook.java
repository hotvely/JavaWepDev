package com.kh.Inheritance.child;

import com.kh.Inheritance.parent.Product;

/*
 * 상속
 * class 자식 extends 부모 {
 * 	//변수
 *	//함수
 *	//등등..
 * }
 * 
 * 장점?
 *  -> 적은양의 코드로 새 클래스 작성 가능 ㅎ;
 *  -> 코드를 공통으로 관리해서 추가나 변경 용이함
 * 	-> 중복 제거되어 프로그램 생산성과 유지보수 좋음 !
 * 
 * 특징?
 * 	-> 클래스 간의 상속은 단일만 가능
 * 	-> 명시되어 있지 않아도 모든 클래스는 Object 클래스 상속(최상단클래스)
 * 	-> Object class 에서 제공되는 함수는 오버라이딩 간웅~
 * 	-> 부모의 생성자, 초기화 블록은 상속 X
 * 	 		(자식 생성시 부모먼저 실행 되기 때문)
 * 
 * 	-> 부모의 private멤버는 상속은 가능하나 접근안됨 -> getter setter
 * 	-> 
 * 
 * */


public class Notebook extends Product
{
//	private String brand;
//	private String pCode;
//	private String name;
//	private int price;
	
	
	
	private String cpu;

	public Notebook() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Notebook(String brand, String pCode, String name, int price, String cpu) 
	{
		//1. super. 멤버변수에 직접 접근 가능
//		super.setBrand(brand);
//		//super.pCoder ;		//<-무조건 부모가 같은 패키지 안에 있어야만 접근 간능
//		super.name = "sssss";
//		super.price = 100000000;
		
		//2. super.setter() 부모의 셋함수 통해서 가능
//		super.setBrand(brand);
//		super.setName(name);
//		super.setpCode(pCode);
//		super.setPrice(price);
//		this.setBrand(brand);
//		setBrand(brand);
		
		//3. 생성자통해서 초기화
		super(brand, pCode, name, price);
		this.cpu = "M2";
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return super.toString() + ", Notebook [cpu=" + cpu + "]";
	}

	
	
	
	
	
}
