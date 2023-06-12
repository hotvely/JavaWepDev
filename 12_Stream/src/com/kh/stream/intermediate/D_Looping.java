package com.kh.stream.intermediate;

import java.util.Arrays;

/*
 * 반복
 * - 요소 전체를 반복하는 역할
 * - peek() : 중간 처리 단계에서 전체 요소를 반복
 * - forEach() : 최종 처리 단계에서 전체 요소 반보옥.....
 * 
 * */

public class D_Looping {

	public static void main(String[] args) {

		int sum = 0;
		int values[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		// 무조건 중간 처리 호출은 최종 처리 메서드 호출되어야 동작함;
		sum = Arrays.stream(values)
				.filter(i -> i%2 == 0 )
				.peek(value -> System.out.println(value))
				.sum();
		System.out.println(sum);
		
		System.out.println("==============");
		
		//최종 처리 메서드는 다른 최종 처리 메서드를 호출 할 수 없음;
		Arrays.stream(values)
		.filter(i -> i % 2 == 0)
		.forEach(value -> System.out.println(value));

		
		
	}

}
