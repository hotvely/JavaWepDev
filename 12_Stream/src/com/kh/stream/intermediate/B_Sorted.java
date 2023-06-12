package com.kh.stream.intermediate;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import com.kh.model.Student;

/*
 * 정렬
 * - 스트림은 최종 처리 되기 전 주간 단계에서 요소들을 정렬하여 최종 처리 순서를 변경할 수 있다.
 * 
 * - Stream<T>은 요소 객체가 Comparable 인터페이스를 구현해 놓아야 정렬 가능
 * - IntStream, DoubleStream, LongStream은 요소를 오름차순으로 정렬.
 * 
 * */

public class B_Sorted {

	public static void main(String[] args) {
		B_Sorted b = new B_Sorted();
		b.method2();
		
		
	}

	//요소가 기본 자료형 일때 ~
	public void method1()
	{
//		Arrays.stream(new int[] {3,5,1,2,4}).sorted().forEach(System.out::print);
		System.out.println("====method1====");
		Arrays.stream(new int[] {3,5,1,2,4}).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println("====method1====");

	}
	
	//요소가 객체 일때~
	public void method2()
	{
		List<String> names = Arrays.asList("김민수","구관원", "임지우","박승환");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("====method2-1====");
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("====method2-1====");
	
		
		System.out.println("====method2-2====");
		
		List<Student> students = Arrays.asList(
				new Student("김민수", 18, "남자", 80,70),
				new Student("구관원", 12, "남자", 90,50),
				new Student("임지우", 16,"여자", 80,90),
				new Student("박승환", 11,"남자", 70,100));
		
		students.stream().sorted(Comparator.comparing(Student::getAge)).forEach(std -> System.out.println(std));
		
		
		System.out.println("====method2-2====");
	
	
	
	
	}
	
	
	
}
