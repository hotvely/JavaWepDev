package com.kh.stream.terminal;

import java.util.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.kh.model.Student;

/*
 * 매칭(Match) : 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 역할
 * - allMatch() : 모든 요소들이 매개 값으로 주어진 Predicate의 조건을 만족하는지 조사
 * - anyMatch() : 최소한 한개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는지 조사;
 * - noneMatch() : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사.... ??????뭔개소리야;
 * 
 * */

public class A_Match {

	public static void main(String[] args)
	{
		A_Match a = new A_Match();
		a.method2();
		
		
		
	}
	
	public void method1()
	{
		boolean result = false;
		int values[] = {2,4,6};
		result = IntStream.of(values).allMatch(i -> i % 2 == 0);
		result = Arrays.stream(values).allMatch(i -> i % 2 == 0);
		System.out.println(result);
		result = Arrays.stream(values).anyMatch(i -> i % 3 == 0);
		System.out.println(result);
		
		result = Arrays.stream(values).noneMatch(value -> value % 5 == 0);
		System.out.println(result);
		
		
	}
	
	public void method2()
	{
		boolean result = false;
		List<Student> students = Arrays.asList(
				new Student("홍수민", 7,"남자", 50,80),
				new Student("강원구", 15,"남자", 90,90),
				new Student("박진실", 15,"여자", 80,50),
				new Student("이주연", 18, "여자", 80,50),
				new Student("최준혁", 14,"남자", 70,90));
		// 나이가 10상 이상인 학생들이 모두 여자인지?
		// 남학생들 중에 평균이 70 이상인 학생이 한명이라도 존재하는지?
		result = students.stream().filter(value -> value.getAge() >= 10).allMatch(value -> value.getGender().equals("여자"));
		System.out.println(result);
		
		result = students.stream()
				.mapToDouble(value -> (value.getMath() + value.getEngilsh())/2.0)
				.anyMatch(value -> value <= 65);
		
		System.out.println(result);
	}
	
	
	
}
