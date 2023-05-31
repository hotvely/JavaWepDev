package com.kh.step4.model;

/*
 * 접근제한자 (access modifier) 
 * - 클래스 멤버변수 생성자 메서드에 사용 , 외부로부터 접근제한
 * 
 * private  	같은 클래스 내부에서만 접근가능
 * default  	같은 패키지 내부에서 접근 가능
 * protected 	같은 패키지 내부, 상속관계의 클래스에서 접근가능
 * public		모든 클래스에서 접근 가능;
 * 
 * - 근데 왜씀? > 외부로부터 데이터를 보호하고 불필요한 정보를 감추기 위함
 * 
 * 
 * Contructor (생성자)
 * - 인스턴스 생성될 때 마다 호출 되는 '인스턴스 초기화 메서드'
 * - 인스턴스 변수의 초기화 or 인스턴스 생성시 수행할 작업에 사용
 * 
 * ***** 생성자 이름은 클래스 이름이랑 똑 같 아 야 함.
 * 접근제한자 클래스이름(매개변수..)
 * {
 * 		인스턴스 생성시 수행할 코드 ㅎㅎ;
 *		주로 객체 초기화 코드
 * }
 *	 
 * */
public class Car {

/*
 * 기본 생성자 default constructor 
 * 
 * - 매개변수가 없는 생성자를 기본 생성자라고 함. - 클래스 내부에 직접 만든 생성자가 하나도 없으면 컴파일러가 알아서 기본 생성자를
 * 만들어서 인식하게 됨 ㅎ - 단, 생성자를 하나라도 만들어 놓으면 컴파일러는 기본생성자 안만드니까 직접 만들어야함
 * 
 * 
 */
	public Car() {
	}
	
	public Car(String color, String gearType) {
		
		//this. => 인스턴스 스스로를 가리키는 참조변수 (주소값들고 있는 키워드)
		this.color = color;
		this.gearType = gearType;
		System.out.println(toString());
	}
	
//오버로딩 > 이름이 같더라도 매개변수 타입이나 반환형이 다른 메소드를 재 정의 할 수 있음
	public Car(String color, String gearType, int door) {
		//this. => 인스턴스 스스로를 가리키는 참조변수 (주소값들고 있는 키워드)
		
//		this.color = color;
//		this.gearType = gearType;
		/*
		 * 중복되는 동일 초기화하는 내용의 생성자가 이미 있는 경우 this()로 사용가능
		 * 
		 * */
		this(color, gearType);
		this.door = door;
		System.out.println(toString());
	}
	
	
	
	
	public String toString() {
		return "색상 : " + color 
				+ ", 변속기 : " +gearType 
				+ ", 문의개수 : " + door;  
	}
	
	private String color;
	private String gearType;
	private int door;

}
