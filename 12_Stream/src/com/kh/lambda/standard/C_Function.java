package com.kh.lambda.standard;

import java.util.function.*;

import com.kh.model.*;

/*
 * Function
 * - Function 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 추상 메서드를 갖고 있음
 * - applyXXX() 추상 메서드는 주로 매개값을 리턴값으로 매핑하는 역활을 함
 * 
 * 
 * */
public class C_Function {

	public static void main(String[] args) 
	{
		Student student = new Student("김경미" ,20 , "여자", 90,30);
		C_Function c = new C_Function();
//		c.method1(student);
		c.method3(student);
		
		
	}

	//Function<T,R> :  T to mapping R and return;
	public void method1(Student student) 
	{
//		Function<Student, String> function = s -> s.getName();
		Function<Student, String> function = Student::getName;
		
		System.out.println("이름 > " + function.apply(student));
	}
	
	// BiFunction<T,U,R> : T and R to mapping R and return
	public void method2() 
	{
		BiFunction<String, Integer, Student> biFunction = (name, age) -> new Student(name, age);
		System.out.println(biFunction.apply("최승환", 15));
		
	}
	
	//ToIntFunction<T>  : T to mapping integer type
	public void method3(Student student)
	{
		System.out.print("수학점수 > ");
		printValue(student, s -> s.getMath());
		System.out.print("영어점수 > ");
		printValue(student, s -> s.getEngilsh());
		
		
		
		System.out.printf("합계 > ");
		printValue(student, s -> s.getMath() + s.getEngilsh());
		
		
		System.out.printf("평균 > ");
		printValue(student, s-> (s.getMath() + s.getEngilsh())/2);
	
	}
	
	public void printValue( Student student, ToIntFunction<Student> function)
	{
		System.out.println(function.applyAsInt(student));
	}

}
