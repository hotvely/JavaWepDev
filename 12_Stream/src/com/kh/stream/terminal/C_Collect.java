package com.kh.stream.terminal;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.kh.model.*;

public class C_Collect {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("멍멍이", 17, "남자", 90, 100),
				new Student("고양이", 16, "남자", 70, 80),
				new Student("너구리", 15, "여자", 80, 90),
				new Student("비둘기", 14, "남자", 100, 70),
				new Student("호랑이", 18, "남자", 90, 60));
		
		// 1. list collection -> 수학 점수가 90이상인 사람들
		ArrayList<Student> list = students.stream()
							.filter(student -> student.getMath() >= 90).sorted(Comparator.reverseOrder())
					//		.collect(Collectors.toList());
							.collect(Collectors.toCollection(()-> new ArrayList<>()));
		
//		list.stream().forEach(value -> System.out.println(value));
		
		
		// 2. Set 컬렉션으로 수집 -> 중학생인 사람만 ;
		Set set = students.stream()
					.filter(student -> student.getAge() >= 13 && student.getAge() <= 16).sorted()
//					.peek(value -> System.out.println(value))
//					.collect(Collectors.toSet());
					.collect(Collectors.toCollection(()-> new HashSet<>()));
		
		
		// 3. Map 컬렉션으로 수집
		Map<String, Integer> map = students.stream()
									.collect(Collectors.toMap(value -> value.getName(), value-> value.getAge()));
		HashMap<String, Integer> hMap = (HashMap<String,Integer>)map;
		Stream.of(map).forEach(value -> System.out.println(value));
		
	}

}
