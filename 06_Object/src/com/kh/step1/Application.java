package com.kh.step1;
import com.kh.step1.model.TV;

public class Application
{

	/*
	 * 객체 : 실제로 존재하는 것 사물과 같은 유형적인것 뿐만 아니라, 개념이나 논리와 같은 무형적인 것도 포함
	 * 
	 * 객체지향 OOP (Objected oriented programming) - 프로그램을 개발하는 기법으로 객체들을 만들고, 객체를 연결해서
	 * 프로그램을 완성하는 기법; - 객체 지향 프로그래밍 특성을 지원하는 언어를 OOP라고 함. - 코드의 재 사용성이 높고 유지보수가 용이함;
	 * 
	 * 객체지향 프로그래밍의 특징 - 추상화 : 객체들이 가진 공통의 특성을 이용해 불필요한 특성은 제거하는 과정 - 캡슐화 : 객체의 속성
	 * field 와 기능 method 를 하나로 묶고 실제 구현 내용을 감추는 것 - 상속 : 하나의 객체가 가지고 있는 속성과 기능을 다른
	 * 객체가 물려받아 사용할 수 있도록 하는것 - 다형성 : 같은 타입이지만 실행결과가 다양한 객체를 이용할 수 있는 성질
	 * 
	 * 
	 * 클래스 - 객체의 특성(속성, 기능)을 정의해 놓은 설계도의 개념 - 객체의 속성은 필드(변수)를 통해 정의하고 - 객체의 기능은 함수를
	 * 통해서 정의함
	 * 
	 * [표현법] 접근제한자 예약어 class 클래스이름 {//Todo............} - 클래스 이름은 작성 규칙에 따라 대문자로 시작
	 * - 파일 이름은 반드시 선언된 클래스 이름과 같아야함 - 접근 제한자는 public , default 설정가능 - 클래스는 필드, 메소드,
	 * 생성자(constructor)로 구성 - 클래스 작성시 객체 지향 언어의 특징중 추상화(Abstraction)&
	 * 캡슐화(Encapsulation)가 적용되어야 함. -
	 * 
	 * - 하나의 파일당 클래스는 여러개가 존재 할 수 있지만 public 클래스는 하나만 존재 하여야 함
	 * 
	 */

	public static void main(String[] args) 
	{

		/*
		 * 객체생성 [표현법] 클래스 변수이름 = new 클래스();
		 * 
		 * - new연산자로 객체 생성하고 , 객체는 Heap메모리에 데이터를 저장하고 주소값을 참조 - 객체의 주소값을 참조타입인 변수에 저장해서
		 * 객체 사용함;
		 * 
		 */

		TV tv = new TV(true, 12); // <- 객체 생성 : 메모리할당을 한다는 의미이고 메모리에 객체의 구성요소인 내부 정보(변수 함수등등) 모든 데이터가 메모리에 저장된다는
//									// 의미임.
//		tv.channelUp();
//		tv.channelUp();
//		tv.channelDown();
//		tv.channelUp();
//		tv.channelDown();
//		tv.channelDown();
//		tv.channelUp();
//		tv.channelUp();
//		
//		System.out.println("TV상태 : " + tv.getPower());
//		System.out.println("TV채널 : " + tv.getChannel());
	}

}

/*
class TV {
	// 속성(property) == 멤버변수, 특성(attribute)

	private boolean power; // 전원상태(on off)
	private int channel = 1; // 현재 채널?

	TV() {
	}

	TV(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
	}

	boolean getPower() {
		return this.power;
	}

	boolean setPower(boolean power) {
		return this.power = power;
	}

	int getChannel() {
		return channel;
	}

	int setChannel(int channel) {
		return this.channel = channel;
	}

	// 기능(function) : 메소드 (method)

	void power() { // tv를 키거나 끄는 기능
		this.power = !this.power;
	}

	void channelUp() { // 채널 업!
		++this.channel;
	}

	void channelDown() { // 채널 다운!
		--this.channel;
	}

}
*/