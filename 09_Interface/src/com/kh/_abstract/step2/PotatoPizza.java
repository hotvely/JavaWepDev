package com.kh._abstract.step2;

public class PotatoPizza extends Pizza 
{
//	public PotatoPizza() {
//		// TODO Auto-generated constructor stub
//	}

	public PotatoPizza(int price, String storeName) {
		super(price, storeName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void topping() {
		System.out.println("감자를 토핑으로 올림!");
	}

}
