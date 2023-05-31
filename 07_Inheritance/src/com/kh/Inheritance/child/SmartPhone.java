package com.kh.Inheritance.child;

import com.kh.Inheritance.parent.Product;
public class SmartPhone extends Product
{
//	private String brand;
//	private String pCode;
//	private String name;
//	private int price;
	private String mobileAgency;

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
		super(brand, pCode, name, price);
		this.mobileAgency = mobileAgency;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString() + ", SmartPhone [mobileAgency=" + mobileAgency + "]";
	}

	
	
	
}
