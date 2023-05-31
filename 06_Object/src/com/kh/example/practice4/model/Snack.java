package com.kh.example.practice4.model;

public class Snack {
	
	/*
	 * 캡슐화 원칙에 따라서 작성함
	 * */
	
	// 멤버 변수는 private으로 ~
	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {}
	public Snack(String kind, String name,
			String flavor, int numOf, int price)
	{
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public String getKind() 
	{
		return kind;
	}
	public void setKind(String kind) 
	{
		this.kind = kind;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getFlavor() 
	{
		return flavor;
	}
	public void setFlavor(String flavor) 
	{
		this.flavor = flavor;		
	}
	public int getNumOf() 
	{
		return numOf;
	}
	public void setNumOf(int numOf) 
	{
		this.numOf = numOf;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	@Override
	public String toString() 
	{
		return "[종류(" + kind + "), 빵이름(" + name + "),"
				+ " 맛(" + flavor + "), 개수(" + numOf + "),"
				+ " 가격(" + price + "), 총금액(" + numOf * price + ")]";
	}

	
}
