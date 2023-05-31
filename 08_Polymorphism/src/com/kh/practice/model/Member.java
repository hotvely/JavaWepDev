package com.kh.practice.model;

public class Member 
{
	private String name;
	private int age;
	private int CookCoupon;		//요리쿠폰개수
	private Book book;			//대여중인 책 1권 (has a)
	
	public Member() {}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCookCoupon() {
		return CookCoupon;
	}

	public void setCookCoupon(int cookCoupon) {
		CookCoupon = cookCoupon;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", CookCoupon=" + CookCoupon + ", book=" + book + "]";
	}
	
}
