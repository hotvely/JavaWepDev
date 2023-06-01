package com.kh.practice;

public class Application {

	public static void main(String[] args) 
	{
		IPhone14Pro iphone = new IPhone14Pro("iPhone 14 Pro", "Apple");
		iphone.printInformation("iPhone 14 Pro", "Apple");
		
		System.out.println();
		
		S23Ultra s23 = new S23Ultra("S23 Ultra", "Samsung");
		s23.printInformation("S23 Ultra", "Samsung");
	}
}
