package com.kh._abstract.step2;

public class PineApplePizza extends Pizza 
{
	
//	public PineApplePizza() {
//		// TODO Auto-generated constructor stub
//	}

	public PineApplePizza(int price, String storeName) {
		super(price, storeName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void topping() {
		System.out.println("파인애플을 토핑으로 올림!");
	}

}
