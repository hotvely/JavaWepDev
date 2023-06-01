package com.kh._interface.step3;

public interface Searchable
{
	void search(String url);
	
	// 아래 함수들이 있어도 Television 클래스에서 사용하는데 문제가 없음,
	// 어차피 미완성 함수들이고 재정의해야 하기 때문임
	public void turnOn();
	void turnOff();
	
}
