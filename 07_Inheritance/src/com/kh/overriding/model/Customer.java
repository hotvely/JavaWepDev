package com.kh.overriding.model;

/*
 * Object
 * 모든 클래스는 Object 클래스의 후손
 * 즉, 최상단 클래스는 항상 Object임 
 * -> Object 클래스에 있는 모든 메서드를 사용가능.
 * 
 * 
 * 
 * 
 * 
 * */


public class Customer extends Object
{
	private String name;		//고객 이름
	protected String grade;		//고객 등급
	protected int bonusPoint;		//보너스 포인트
	protected double bonusRatio;	//보너스 적립 비율
	
	public String getName()
	{
		return this.name;
	}

	public int getBonusPoint()
	{
		return this.bonusPoint;
		
	}
	
	public Customer() {}
	
	public Customer(String name) 
	{
		this.name = name;
		this.grade = "Silver";
		this.bonusRatio = 0.01;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", grade=" + grade 
							+ ", bonusPoint=" + bonusPoint 
							+ ", bonusRatio=" + bonusRatio + "]";
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Customer c = (Customer)obj;
		if(this.name.equals(c.name))
		{
			return true;
		}
		
		return false;
	}
	
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		
		return price;
	}
	
	
}
