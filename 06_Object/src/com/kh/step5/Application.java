package com.kh.step5;

import com.kh.step5.model.*;

public class Application {

	public static void main(String[] args) {
		Book b1 = new Book("HTML+CSS+JS", 30000, 0.2, "고경희");
		Book b2 = new Book();
		b2.setTitle("리액트 200제");
		b2.setPrice(25000);
		b2.setDiscountRate(0.1);
		b2.setAuthor("이정열");

		System.out.println(b1);
		System.out.println(b2);

		// get이용해서 두 객체의 할인율을 적용한 책 가격을 계산해서 출력
		b1.setPrice((int) (b1.getPrice() * (1 - b1.getDiscountRate())));
		b2.setPrice((int) (b2.getPrice() * (1 - b2.getDiscountRate())));
		System.out.println(b1 + "\n" + b2);
	}

}
