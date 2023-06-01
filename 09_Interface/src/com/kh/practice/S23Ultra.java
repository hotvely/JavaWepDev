package com.kh.practice;

public class S23Ultra extends SmartPhone implements Pen {
	String name;
	String brand;

	public S23Ultra(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}

	@Override
	public boolean pen() {
		return true;
	}

	@Override
	public void printInformation(String name, String brand) {
		System.out.println(this.name + "는 " + this.brand +"에서 만들어졌고 제원은 다음과 같다");
		System.out.println("스마트폰 이름 > " + this.name);
		System.out.println("전화 걸기 > " + makeCall());
		System.out.println("전화 받기 > " + takeCall() );
		System.out.println("촬영방식 > " + picture());
		System.out.println("펜 탑재? > " + pen());
		
	}

	@Override
	public String picture() {
		return "2억 화소 카메라";
	}


	@Override
	public String makeCall() {		
		return "번호를 누르고 통화버튼을 누름";
	}


	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}
	
}


