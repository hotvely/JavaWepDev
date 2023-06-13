package com.kh.lang;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class A_String {
	
	/* 
	 * API > Application Programming Interface
	 * 
	 * - API : 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스
	 * - 자바에서 API 는 프로그램 개발에 자주 사용되는 클래스 및, 인터페이스의 모음
	 * 
	 * 
	 * java.lang 패키지 > java 프로그램의 기본적인 클래스와 인터페이스를 담고 있는 패키지
	 * - java.lang 패키지에 있는 클래스와 인터페이스는 import없이 사용가능 함 ?!
	 * 
	 * */
	
	public static void main(String[] args)
	{
		A_String a = new A_String();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
		a.method5();
		
	}
	
	/*
	 * String 클래스
	 * - 불변의 클래스 ?? 객체를 생성하면 변경 불가능?
	 * - 변경이 적고 읽기가 많은 경우에 사용하는 것이 좋음
	 * - new 없이도 객체를 생성할 수 있는 유일한 객체
	 * 
	 * */
	

	public void method1()
	{
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		
		System.out.println("str1 == str2 > " + (str1 == str2));
		System.out.println("str2 == str3 > " + (str2 == str3));
		System.out.println("str3 == str4 > " + (str3 == str4));
		System.out.println("---------------------");
		
		// toString() 함수는 String클래스에서 오버라이딩 되어 있기 때문
		System.out.println("str1.toString > " + str1.toString());
		System.out.println("str2.toString > " + str2.toString());
		System.out.println("str3.toString > " + str3.toString());
		System.out.println("str4.toString > " + str4.toString());
		System.out.println("---------------------");
		
		// equals() 함수도 String 클래스에서 오버라이딩 되어 있음
		System.out.println("str1.equals(str2) > " + str1.equals(str2));
		System.out.println("str2.equals(str3) > " + str2.equals(str3));
		System.out.println("str3.equals(str4) > " + str3.equals(str4));
		System.out.println("---------------------");
		
		// hashCode() 함수도 String 클래스에서 오버라이딩 되어 있음;
		System.out.println("str1.hashCode() > " + str1.hashCode());
		System.out.println("str2hashCode() > " + str2.hashCode());
		System.out.println("str3.hashCode() > " + str3.hashCode());
		System.out.println("str4.hashCode() > " + str4.hashCode());
		System.out.println("---------------------");
		
		// 실제 주소값 > System.identityHashCode() > 객체의 고유한 주소값 리턴
		System.out.println("str1주소값 > " + System.identityHashCode(str1));
		System.out.println("str2주소값 > " + System.identityHashCode(str2));
		System.out.println("str3주소값 > " + System.identityHashCode(str3));
		System.out.println("str4주소값 > " + System.identityHashCode(str4));
		
		
	}
	
	
	// String 클래스에서 제공하는 함수들
	public void method2()
	{
		String str1 = "Hello, World!";
		
		// 1. charAt(idx) > char - 전달받은 인덱스 값 위치의 character형 문자를 추출해서 리턴함
		char ch = str1.charAt(3);
		System.out.println("ch > " + ch);
		
		
		// 2. concat(String str) > 전달받은 문자열과 원본 문자열을 하나로 합친 새로운 문자열 생성 리턴
		String str2 = str1.concat("!!!!!!!");
		System.out.println("str2 > " + str2);
		String str3 = str1 + "!!!!!!!";
		System.out.println(str3);
		System.out.println("---------------------");

		
		// 3. substring(int beginIndex) > 문자열의 beginIndex 위치에서 부터 끝까지 문자열 반환
		// 	  subString(int beginIndex, int endIndex) > 두 인덱스 범위 사이의 문자열 반환
		String str4 = str1.substring(6);
		System.out.println("str4 > " + str4);
		String str5 = str1.substring(2,7);
		System.out.println("str5 > " + str5);
		System.out.println("---------------------");

		
		// 4. indexOf(String str) > 전달받은 str의 시작 인덱스 리턴;
		//	  indexOf(char ch) > 전달받은 ch의 인덱스를 리턴;
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.indexOf("wr"));		// 포함되어있지 않으면 return -1;
		
		System.out.println(str1.indexOf("World"));
		System.out.println(str1.indexOf('!'));
		System.out.println(str1.indexOf('?'));
		System.out.println("---------------------");
		
		
		// 5. replace (char oldChar, char newChar) > old문자 -> new문자로 변경해서 문자열 반환
		String strReplace = str3.replace('!', '?');
		System.out.println(strReplace);
		System.out.println(str1.replace('l', 'c'));
		System.out.println("---------------------");

		
		// 6. toUpperCase() / toLowerCase() > 문자열을 모두 대 소문자로 변경해서 반환함
		System.out.println(str1.toUpperCase());
		System.out.println(str3.toLowerCase());
		System.out.println("---------------------");
		
		
		// 7. trim() > 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성해서 반환
		String str6 = "                       ?!?!?aaaa ___     ";
		System.out.println("trim전 > " + str6);
		System.out.println("trim후 > " + str6.trim());
		System.out.println("---------------------");

		
		// 8. toCharArray() > 문자열을 char[] 로 반환해줌;;
		char[] arr = str1.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		
		// 9. static valueOf([기본자료형, 문자배열, 객체 등등등])
		//			> 정적 함수는 매개변수로 입력받는 값을 문자열로 변경후 반환
		String str9 = String.valueOf(true);
		String str10 = String.valueOf(arr);
		String str11 = String.valueOf(3.1415f);
		System.out.println(str9 + " / " + str10 + " / " + str11);
		
		
	}
	
	
	
	/*
	 * StringBuilder & StringBuffer
	 * - 가변의 클래스 > 내부의 문자열을 수정할 수 있음 ??????
	 * - 16개의 문자를 저장할 수 있는 버퍼가 미리 생성되고, 문자가 저장됨에 따라서 자동으로 증가!
	 * - StringBuilder 와 StringBuffer의 차이점 > 동기화의 여부 ...ㅠㅠ 동기화 ㅠㅠ
	 * - 멀티 스레드 환경에서는 StringBuffer 사용 권장, 단일 스레드 환경에서는 StringBuilder 권장.
	 * 
	 * */
	public void method3() 
	{
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1의 문자열 길이 > " + sb1.length());
		System.out.println("sb1의 버퍼의 크기 > " + sb1.capacity());
		
		// StringBilder 의 클래스 생성자에 정수값을 전달해 주면 해당 크기만큼 버퍼 생성
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2의 문자열 길이 > " + sb2.length());
		System.out.println("sb2의 버퍼의 크기 > " + sb2.capacity());		
		
		StringBuilder sb3 = new StringBuilder("Hello");
		System.out.println("sb3의 문자열 길이 > " + sb3.length());
		System.out.println("sb3의 버퍼의 크기 > " + sb3.capacity());		
		sb3.append("1234567890123456");
		System.out.println(sb3);
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
		
	
	
	}

	
	public void method4()
	{
		StringBuilder sb = new StringBuilder("Hello, ");
		
		// 1. append(String str) > 문자열에 str문자열을 추가해서 반환
		sb.append("World!");
		System.out.println(sb);
		
		
		// 2. insert (int offset, String str) > 문자열의 offset위치 부터 str을 추가해서 반환
		sb.insert(sb.length(), "?????");
		System.out.println(sb);
		
		
		// 3. delete (int start, int end) > start ~ end-1 까지의 인덱스에 해당하는 문자열 삭제
		sb.delete(1, 6);
		System.out.println(sb);
		
		
		// 4. reverse() > 문자열의 순서를 역으로 바꿈
		sb.reverse();
		System.out.println(sb);
		
		
		StringBuilder sb2 = new StringBuilder("Java Programming");
		// IPA avaJ
		sb2.delete(5, sb2.length());
		sb2.insert(sb2.length(), "API" ).reverse();
		
		
		System.out.println(sb2);
				
	}
	
	
	public void method5()
	{
		// 구분자를 이용해서 문자열을 분리하는 법
		String str = "Java,Oracle,JDBC,HTML,CSS,JavaScript,jQuery,Servlet,JSP,MyBatis,Spring,React";
		
		
		// 1. String 클래스의 split(String regex) > 입력받은 구분자로 분리해서 문자열 배열로 반환
		String[] strArr = str.split(",");
		System.out.println(Arrays.toString(strArr));
		System.out.println("length > " + strArr.length);
		
		for(String s : strArr)
		{
			System.out.println(s);
		}
		
		System.out.println("-------------");
		
		
		// 2. StringTokenizer 객체를 이용
		// 			> java.util패키지에서 제공, 
		//			> 객체 생성 시 생성자로 전달받은 문자열을 구분자를 이용하여 분리
		//			> 분리된 최소 단위를 토큰이라 부름
		//			> countTokens : 토큰의 개수
		// 			> hasMoreTokens : 남아있는 토큰이 있는지 확인
		//			> nextToken : 토큰을 하나씩 꺼내옴
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("문자열의 개수 > " + st.countTokens());
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());			
		}
		
	}
	
	
	
}
