package com.kh.Inheritance;

import com.kh.Inheritance.child.*;

public class Application {

	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("애플","a1111", "맥북 프로", 2790000, "M2");
		SmartPhone smartPhone = new SmartPhone("삼성", "s2222", "S23 울트라", 1590000, "KT");
		Tv tv = new Tv("엘지", "42LX3QKNA", "올레드 Flex", 3999999, 42);
		
		System.out.println(notebook);
		System.out.println(smartPhone);		
		System.out.println(tv);
	
	}

}
