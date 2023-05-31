package com.kh.practice.model;

public class CookBook extends Book 
{
	private boolean coupon;		//요리쿠폰 여부

	public CookBook() {
		// TODO Auto-generated constructor stub
	}

	public CookBook(String title, boolean coupon) {
		super(title);
		this.coupon = coupon;
		// TODO Auto-generated constructor stub
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return super.toString() + "/ CookBook [coupon=" + coupon + "]";
	}
	
	
	
	
}
