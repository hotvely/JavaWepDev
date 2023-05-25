package com.kh.step5.model;

/*
 * 생성자가 private?
 * 생성을 못함; ㅋㅋ
 * -> 해결방법 : 싱글톤 (single ton)  
 * 			  단, 메모리를 공유 하므로 프로그램당 싱글톤 클래스는 하나씩만 존재해얀함
 * private static Book singleton = new Book();
 * public static Book getInstnace() 
 * {
 * 		if(singleton == null) singleton = new Book();
 * 		return singleton;
 * }
 * 
 * */

public class Book {

	/*
	 * 캡슐화 (Encapsulation) - 정보 은닉 > 외부에서 접근할때 정보를 숨기고 내부 연산을 통해서만 접근 가능하게 함 - 외부에서
	 * 특정 객체의 데이터 및 함수 접근을 못하게 막고, 유지보수나 확장시 오류를 최소화 할 수 있음 - 갹채 내부 정보손상, 오용방지, 조작법이
	 * 바뀌어도 사용방법 자체를 유지하고, 데이터 변경시 타 객체에 영향을 주지 않아서 독립성이 좋음 - 처리된 결과 사용으로 이식성이 좋고,
	 * 객체를 모듈화 할 수 있어서 새로운 시스템 구성이 좋음
	 */
	private String title;
	private String author;
	private Integer price;
	private Double discountRate;

	// ------------constructor
	public Book() {
	};

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	};

	public Book(String title, int price, double discountRate, String author) {
		this(title, author);
		this.price = price;
		this.discountRate = discountRate;
	};
	// ------------constructor

	// ------------setter getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	/*
	 * Object -> java에서 사용되는 자료형 클래스의 최상위 클래스
	 * 언리얼의 actor같은 느낌? 
	 * 그래서 integer형으로 뭔가 바꾸고 싶으면 parsing 함수 매개변수가
	 * String형 밖에 못받으니까.. 만약에 그렇게 바꾸고 싶으면 걍 string형 변환 해서 파싱해주면 됨;
	 * 
	 * */
	public void setPrice(Object price) {
		this.price = Integer.parseInt(String.valueOf(price));
	}
	public void setPrice(int price)
	{
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	// ------------setter getter

	public String toString() {
		return "title(" + title + ")" + " author(" + author + ")" + " price(" + price + ")" + " discountRate("
				+ discountRate + ")";
	}

}
