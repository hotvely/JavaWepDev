package com.kh.overriding;

import com.kh.overriding.model.*;

public class Application {

	public static void main(String[] args) 
	{
		
		Customer customer1 = new Customer("멍멍이");
		Customer customer2 = new Customer("멍멍이");
		
		System.out.println(customer1);
		System.out.println(customer2);		
		
		System.out.println(customer1.equals(customer2));

		VIPCustomer customer3 = new VIPCustomer("고양이");
		VIPCustomer customer4 = new VIPCustomer("고양이");
		SCustomer customer5 = new SCustomer("고먐미");
		
		System.out.printf("%s님의 등급은 %s이며, 지불해야 하는 금액은 %d이며, 적립된 포인트는 %d입니다.\n",
				customer1.getName(), customer1.calcPrice(100000), customer1.getBonusPoint());
		
		System.out.printf("%s님의 등급은 %s이며, 지불해야 하는 금액은 %d이며, 적립된 포인트는 %d입니다.\n",
				customer2.getName(), customer2.calcPrice(100000), customer2.getBonusPoint());

		
	}

}
