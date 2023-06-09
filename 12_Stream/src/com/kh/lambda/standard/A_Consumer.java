package com.kh.lambda.standard;

import java.util.function.*;

/*
 * 표준 함수적 인터페이스
 * - 자바 8부터 빈번히 사용되는 함수적 인터페이스는 java.util.function 표준 API 패키지로 제공 ㅎㅎ
 * - 자바 8부터 추가되거나 변경된 API는 이 표준 함수적 인터페이스들을 매개타입으로 사용
 * - 용도에 따라서 크게 Consumer, Supplier, Function, Operator, Predicate 로 구분함
 * 
 * 
 * Consumer 
 * - Consumer 함수적 인터페이스는 '리턴값이 없는' accept() 추상 메서드를 가지고 있음
 * - accept() 추상메서드는 오로지 매개값을 소비하는 역할을 함 ...????? 뭔소리야;
 * - 
 * 
 * */



public class A_Consumer 
{

	public static void main(String[] args) 
	{
			
		A_Consumer a = new A_Consumer();
		a.method4();
		
		
		
		
	}

	// Consumer<T> : T객체를 받아서 소비함;
	public void method1()
	{
//		Consumer<String> consumer = (String str) -> {
//			System.out.println(str + "이게 뭔 개소리야;");
//		};
//		consumer.accept("???????????Consumer 는 한개의 매개값(제네릭으로 지정된 타입)을 받아서 소비함.");
		
//		Consumer<String> consumer = str -> System.out.println(str);
		
	}
	
	
	//BiConsumer<T, U> : T U 받아서 소비함
	public void method2()
	{
		BiConsumer<String, String> biConsumer = (str, str1) -> System.out.println(str + " 이랑 " + str1 + " 두개 같이쓰네 아오 람다식 진짜로 - -^");
		biConsumer.accept("거지같은거", "난 람다식이 싫어어");
		
	}
	
	
	
	// IntCounsumer : int 값 받아서 소비
	// LongConsumer 
	// DoubleConsumer
	public void method3()
	{
		IntConsumer intConsumer = (interger) -> System.out.println(interger + 100);
		intConsumer.accept(111);
		DoubleConsumer dConsumer = (value) -> System.out.println("DoubleConsumer 는 하나의 double 타입 값을 받아서 소모함 > " + value);
		dConsumer.accept(3.14);
		
		
	}
	
	//ObjIntConsumer<T> : T객체와 int 값을 받아서 소비함
	//ObjLongConsumer<T> 
	//ObjDoubleConsumer<T> 
	public void method4()
	{
		ObjIntConsumer<Student> objIntConsumer = (obj , value) -> System.out.println( obj.stdClass + "" + obj.name + "님의 값은 " + value + "입니다.");
		objIntConsumer.accept(new Student("멍멍이", "B반"), 100);
	}
	
	class Student
	{
		String name;
		String stdClass;
		public Student(String name, String stdClass) {this.name = name; this.stdClass = stdClass;}
	}
	
	
	
	
	
}
