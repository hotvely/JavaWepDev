package com.kh._abstract.step2;

public class BulgogiPizza extends Pizza{

//	
//	public BulgogiPizza() {
//		// TODO Auto-generated constructor stub
//	}

	public BulgogiPizza(int price, String storeName) {
		super(price, storeName);

		// super()와 같은 의미..
		this.price = price;
		this.storeName = storeName;
	}

	@Override
	public void topping() 
	{
		System.out.println("불고기를 토핑으로 올림!");
	}

}
