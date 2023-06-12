package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;

import com.kh.model.Student;

/*
 * 
 * 매핑
 * - 다른 타입으로 변환하는것;
 * */
public class C_Mapping {

	public static void main(String[] args) {
		C_Mapping c = new C_Mapping();
		c.method3();

	}

	// mapXXX() : 요소를 대체하는 요소로 구성된 새로운 스트림 생성
	public void method1()
	{
		List<Student> students = Arrays.asList(
				new Student("김민수", 18, "남자", 80,70),
				new Student("구관원", 12, "남자", 90,50),
				new Student("임지우", 16,"여자", 80,90),
				new Student("박승환", 11,"남자", 70,100));
		
		students.stream().map(student -> student.getName()).forEach(System.out::println);
		students.stream().map(Student::getName).forEach(System.out::println);
		
		System.out.println();

		//수학평균
		double avg = students.stream().mapToInt(Student::getMath).average().getAsDouble();
		System.out.println(avg);
		
		
	}
	
	// flatMapXXX():하나의 요소를 복수의 요소로 구성된 새로운 스트림 생성
	public void method2()
	{
		List<String> list = Arrays.asList("Java11 Lambda","StreamAPI Filtering Sorted Mapping");
		list.stream()
		.flatMap(str -> Arrays.stream(str.split(" ")))
		.forEach(str -> System.out.println(str));;
		
		
		
		
	}
	
	// asDoubleStream() : int long -> double
	public void method3()
	{
		Arrays.stream(new int[] {1,4,6,2,7}).distinct().sorted()
		.asDoubleStream().forEach(System.out::println);
	}

}
