package com.kh.composite;

/*
 * 오버라이딩
 * 	- 자식클래스에서 부모클래스의 함수를 재정의해서 사용하는 것
 * 
 * 조건
 * 	- 1.부모클래스 함수이름, 매개변수, 리턴타입같아야함
 * 	- 2.접근제어자를 좁은 범위로 변경 X
 * 		(부모함수 protected 일때, protected or public 으로만 변경가능 ~)
 * 
 * 
 * 
 * @Override 애노테이션
 * 	- 명시하지 않더라도 오버라이딩가능
 * 	- 다만, 공동작업시 가시성 혹은 소스 분석을 위해 붙이는 것이 좋긴할듯? 
 * 	  추가로, 해당 함수를 컴파일러에게 오버라이딩 된 함수라고 알려주는 역활을 하긴함
 * 	  따라서 자식 클래스에서 재정의를 잘못하고 있다면 컴파일 에러를 표시해줌 ㅎㅎㅎ
 * 
 * 
 * */

public class VIPCustomer extends Customer
{
	
	private double saleRatio;

	public VIPCustomer() {}

	public VIPCustomer(String name) {
		super(name);
		this.grade = "VIP";
		this.bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		
		return price - (int)(price*saleRatio);
	}
	
	
	
}
