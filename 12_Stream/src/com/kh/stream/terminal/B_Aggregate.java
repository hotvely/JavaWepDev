package com.kh.stream.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class B_Aggregate {

	/*
	 * 집계
	 * - 최종처리 기능
	 * 		- count() : 요소의 개수 리턴
	 * 		- sum() : 합
	 * 		- average() : 요소 전체 평균
	 * 		- max() : 최대값
	 * 		- min() : 최소값
	 * 		- findFirst() : 첫번째 요소 반환
	 * 
	 * 
	 * 커스텀 집계
	 * - 스트림에서 기본 집계 메서드를 제공하지만 다양한 집계 결과를 만들 수 있도록 reduce() 메서드도 제공함
	 * 
	 * */
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6};
		long l = Arrays.stream(array).count();
		System.out.println(l);
		
		System.out.println(Arrays.stream(array).sum());
		
		/*
		 * Optional 클래스
		 * - 스트림의 최종 결과 값을 저장하는 객체이며 단순히 값만 저장하는 것이 아니라, 
		 *   값의 존재 여부를 확인하고 값이 존재 하지 않는 다면 디폴트 값을 설정할 수 있는 객체
		 * 
		 * - getXXX() : 저장되어 있는 값으 얻기 위해 사용
		 * 
		 * - isPresent() : 값이 저장되어 있는지 검사
		 * 
		 * - orElse() : get()과 동일하게 저장되어 있는 값을 얻어오는데, 값이 저장되어 있지 않으면 디폴트 값 지정;
		 *  
		 **/
		OptionalDouble average = Arrays.stream(array).average();
		System.out.println("평균 : " + average.getAsDouble());
		
		OptionalInt max = Arrays.stream(array).max();
		if(max.isPresent())
			System.out.println(max.orElse(-1));
		
		OptionalInt min = Arrays.stream(array).min();
		if(min.isPresent())
			System.out.println(min.orElse(-1));
		
		OptionalInt first = Arrays.stream(array).findFirst();
		System.out.println(first.getAsInt());
	
	
		//커스텀 집계
//		Arrays.stream(array).filter(value -> value % 2 == 0).reduce((x,y) -> x* y).ifPresent(value -> System.out.println());
		IntStream stream = Arrays.stream(array).peek(value -> System.out.print(value + "여기까지가 stream\n"));
		System.out.println("stream > " + stream);
		
		IntStream filter = stream.filter(value -> value % 2 == 0).peek(value -> System.out.println(value));
		System.out.println("filter > " + filter);
		

		
		OptionalInt reduce = filter.reduce((x,y) -> x*y);
		System.out.println("reduce > " + reduce + " reduce.getAsInt > " + reduce.getAsInt());
		
		
		
	}

}
