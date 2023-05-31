package com.kh.practice.controller;

import com.kh.practice.model.*;

public class LibraryController {
	private Member member = null;

	private Book[] bookList = new Book[4];
	{
		bookList[0] = new CookBook("김대석 셰프의 집밥 레시피", true);
		bookList[1] = new CookBook("에브리데이 베이글", false);
		bookList[2] = new AniBook("원피스 105", 19);
		bookList[3] = new AniBook("최애의 아이 10", 15);
	}

	// 멤버 생성자 이용해서 멤버정보 추가
	public void insertMember(String name, int age) {
		member = new Member(name, age);
	}

	public Member myInfo() {
		return member;
	}

	// 매개변수로 받은 키워드가 포함된 제목을 가진 책 1권 반환
	public Book searchBook(String keyword) {
		for (Book elem : bookList) {
			if (elem.getTitle().contains(keyword)) {
				return elem;
			}
		}
		return null;
	}

	//
	public Book[] viewBooks() {
		return bookList;
	}

	/*
	 * 대여할 책의 인덱스를 매개변수로 받아서 조건에 따라 처리;?? 조건 -만화책 (AniBook)인 경우 나이제한 -요리책
	 * (CookBook)인 경우 쿠폰이 있냐 없냐?
	 */
	public boolean rentBook(int index) 
	{
		Book book = bookList[index];
		if(book == null)
			return false;

		if (book instanceof AniBook) 
		{
			if (member.getAge() >= ((AniBook)book).getAccessAge()) 
			{
				System.out.println("대여 성공!");
				member.setBook(book);
				return true;
			}
			System.out.println("나이 제한으로 대여 불가능!");
			return false;
		} 
		else if(book instanceof CookBook)
		{
			if(book instanceof CookBook && ((CookBook) book).isCoupon())
			{
				int coupon = member.getCookCoupon();
				member.setCookCoupon(++coupon);
				member.setBook(book);
				return true;
			}			
		}		
		return false;
	}
}
