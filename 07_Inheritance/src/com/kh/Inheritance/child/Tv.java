package com.kh.Inheritance.child;

import com.kh.Inheritance.parent.Product;
public class Tv extends Product
{
//	private String brand;
//	private String pCode;
//	private String name;
//	private int price;
	private int inch;

	public Tv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tv(String brand, String pCode, String name, int price, int inch) {
		super(brand, pCode, name, price);
		this.inch = inch;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString() + ", Tv [inch=" + inch + "]";
	}

	
}
