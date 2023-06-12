package com.kh.lambda.standard;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.kh.model.*;


/*
 * Predicate
 * - Predicate 함수적 인터페이스는 매개변수와 boolean값 리턴하는 testXXX() 가상함수를 가지고 있음
 * - testXXX() 가상함수는 매개값을 조사해서 true or false 를 리턴함
 * */
public class E_Predicate {

	public static void main(String[] args) 
	{
		Student std1 = new Student("구민지", 20, "여자", 80, 70);
		Student std2 = new Student("윤종빈", 16, "남자", 100, 90);

		E_Predicate e = new E_Predicate();
//		e.method1(std2);
//		e.method2(std1, std2);
		e.method3();

	}
	
	// Predicate<T>  : T를 조사
	public void method1(Student stud)
	{
		Predicate<Student> pred = std -> std.getGender().equals("남자");
		System.out.println(pred.test(stud));
		
	}
	
	
	// BiPredicate<T,U> : T U 객체들을 비교조사
	public void method2(Student std1, Student std2)
	{
		BiPredicate<Student, Student> biP = (s1, s2) -> s1.getGender().equals(s2.getGender());
		System.out.println(biP.test(std1, std2));
		
	}
	
	// IntPredicate : int 조사
	public void method3()
	{
		IntPredicate ip = i -> i > 100;
		System.out.println(ip.test(1));
		System.out.println(ip.test(999));
		
		
	}
	
	
	
}
