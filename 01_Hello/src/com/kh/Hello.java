/*
 * 패키지(package)
 * - 폴더를 만들어서 파일을 저장하고 관리하듯이 패키지를 만들어 클래스를 저장, 관리한다.
 * - 패키지는 클래스를 유일하게 만들어주는 식별자 역활을 함.
 * - 모든 클래슨느 하나의 패키지에 속하고, 패키지가 선언되지 않는 클래스는 자동으로 
 * 	 이름없는 패키지(default)에 속하게 됨.
 * 
 * */

package com.kh;
import java.util.ArrayList;

/*
 * 클래스(class)
 * - 자바에서 모든 코드는 반드시 클래스 안에 존재해야 하며,
 * 	 서로 관련된 코드들을 그룹으로 나누어 별도의 클래스를 구성함.
 * - 클래스들이 모여 하나의 Java 프로그램을 구성함.
 * */

public class Hello {		// 클래스 명은 클래스 파일명과 동일해야 함.

	/*
	 * 메소드(method)
	 * - 클래스의 기능(동작)에 해당하는 구현 부분이다.
	 * - 해당 메소드 호출시 메소드의 블럭({})에 해당하는 부분을 실행함.	 * 
	 */
	
	// 실행 메소드(main 함수) : 자바 프로그램 실행 시 java.exe에 의해 가장 먼저 호출됨
	// 모든 클래스가 main 함수를 가지고 있어야 하는 것은 아니지만, 하나의 java 애플리케이션에는 
	// main 함수를 포함한 클래스가 하나이상 존재해야 함 !!!
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
	}

}


/*
 * 네이밍 규칙 
 * - 패키지명 : 소문자, 회사간에 패키지가 중복되지 않도록 회사의 도메인 이름으로 패키지를 생성
 * - 클래스명 : 대문자로 시작, 여러개의 단어가 있을 때에는 단어 앞자리마다 대문자 표기(낙타등표기법)
 * 				ex) public class Hello
 * - 메소드명 : 소문자로 시작, 여러개의 단어가 있을 때에는 단어 앞자리마다 대문자 표기
 * 				ex) private void showInfo()
 * 
 * 
 * 자바의 특징
 * - 객체지향(Object-Oriented-Programming, OOP) 언어.
 * - 자동으로 메모리 관리함(Garbage Collection)
 * - 운영체제에 독립적임 (JVM , Java Virtual Machine)
 * - 네트워크와 분산처리를 지원 (Java API)
 * - 멀티 쓰레드 지원
 * - 동적로딩 지원함
 * 
 *  
 *  JDK > JRE > JVM
 *  - JDK (Java Development Kit) : 개발환경 도구
 *  	= JRE + 실행파일(bin / javac.exe / java.exe 등등)
 *  - JRE (Java Runtime Environment) : 자바실행 환경
 *  	= JVM + Java API
 *  - JVM (Java Virtual Machine) : 자바 가상 머신
 *  
 *  
 *  자바프로그램 실행 단계
 *  - 확장가자 .java인 소스파일을 작성
 *  - 작성된 소스파일을 컴파일러(java.exe)로 컴파일하여, 확장자가 .class인 바이트코드(기계어)로 변역
 *  - 번역된 바이트코드(기계어)를 JVM의 자바 인터프리터(java.exe)를 이용해 실행
 *  
 *  
 * */






