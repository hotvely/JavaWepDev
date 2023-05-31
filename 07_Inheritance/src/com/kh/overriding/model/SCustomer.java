package com.kh.overriding.model;

public class SCustomer extends Customer
{
	private double saleRatio;
	public SCustomer() {}
	public SCustomer(String name) {
		super(name);
		this.grade = "Silver";
		this.bonusRatio = 0.03;
		saleRatio = 0.05;
	}
	
}
