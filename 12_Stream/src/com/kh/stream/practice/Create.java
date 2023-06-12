package com.kh.stream.practice;

import java.util.stream.*;
import java.util.*;

import com.kh.model.Student;

/*
 * Stream ?
 * - 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 방법
 * 
 * 특징 ?
 * - 데이터를 읽기만 하고 변경X -> readOnly
 * - Iterator 처럼 일회용 (필요하면 다시 생성)
 * - 내부 반복 처리
 * 
 * 종류 ?
 * - java.util.stream 패키지에 존재하고, BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있음
 * 
 * Stream API
 * - 스트림은 자바 8부터 추가된 기능으로 컬렉션의 요소들을 하나씩 참조해서 람다식으로 처리할 수 있도록 해 주는 반복자
 * - 내부 반복자를 사용해서 중간처리(intermediate), 최종처리(terminal) 작업을 수행
 * 		-중간처리
 * 		-최종처리 : 반복, 카운팅, 평균, 총합등의 집계 처리
 * - 중간 처리와 최종처리 메서드를 구분하는 방법은 리턴형으로 알 수 있음
 * 		- 리턴타입이 Stream이면 중간처리,
 * 		- 리턴타입이 기본타입이거나 , Optional 객체라면 최종 처리 함수
 * - 지연된 연산 : 최종 연산 수행되기 전까지는 중간 연산이 수행되지 않음;
 * 
 * 
 * */


public class Create {

	public static void main(String[] args) 
	{
		Create c = new Create();
		c.method2();
		
		
		
		
		
	}

	// 숫자 범위로 스트림을 생성하는 법?
	// - IntStream, LongStream, DoubleStream의 range(), rangeClosed() 메서드 이용해서 생성
	public void method1()
	{
		// 첫번째 매개 값 ~ 두번째 매개 값 '이전'까지의 값을 요소로 가지는 스트림 객체를 
		IntStream stream = IntStream.range(1, 10);
		int sum = stream.sum();
		System.out.println("range의 sum : " + sum);
		
		// 첫번째 매개 값 ~ 두번째 매개 값 '까지'의 값을 요소로 가지는 스트림 객체를 
		stream = IntStream.rangeClosed(1, 10);
		System.out.println("rangeClosed의 sum :" + stream.sum());
		

	}
	
	
	
	
	/*
	 * 배열로부터 스트림을 생성하는 방법
	 * - Arrays.stream(배열) 함수로 스트림을 생성함
	 * - 각 스트림(Stream, IntStream, ....) 의 of(배열) 함수로 스트림 생성함
	 * 
	 * */
	public void method2()
	{

		String[] names = {"멍멍이","고양이","냐옹이","호랭이","귀요밍","코끼리"};
//		for(String s : names) {
//			System.out.println(s);
//		}
		
		
		Stream<String> stream = Arrays.stream(names);
		stream.forEach(name -> System.out.println(name));
		Stream<String> stream2 = Stream.of(names);
		
		
		ArrayList<Student> std = new ArrayList<>();
		{
			std.add(new Student("멍멍이", 3, "남자", 55, 77));
			std.add(new Student("고양이", 5, "여자", 22, 58));
			std.add(new Student("너구리", 1, "남자", 55, 77));
			std.add(new Student("호랭이", 12, "남자", 43, 13));
			std.add(new Student("짹짹이", 9, "여자", 27, 47));
			std.add(new Student("귀요밍", 22, "여자", 79, 71));
			std.add(new Student("핫블리", 31, "남자", 58, 95));
		}
		Stream<ArrayList<Student>> test = Stream.of(std);
		Stream.of(std).forEach(obj -> Stream.of(obj).forEach(elem -> System.out.println( elem)));
		
	}
	
	/*
	 * 컬렉션으로부터 스트림으르 생성하는 방법
	 * - 컬렉션의 stream() 함수 이용해서 생성
	 * */
	public void method3()
	{
		List<String> names = Arrays.asList("김민소", "김종휘", "이지훈", "김지은");
		names.stream().forEach(name -> System.out.println(name));
		
		for(String s : names)
		{
			System.out.println(s);
		}
		
		
	}
	
}
