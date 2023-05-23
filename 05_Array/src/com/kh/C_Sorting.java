package com.kh;

import java.util.*;

public class C_Sorting {

	public void method1() {
		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 2, 3, 5, 21, 1, 54, 21, 5, 7, 312, 6, 236, 1, 6672 };

		// 1. 오름차순 정렬
		Arrays.sort(arr);

		// 2. 내림차순

		Arrays.sort(arr, Collections.reverseOrder());

		int copy[] = new int[arr.length];
		int idx = 0;
		for (int i : arr) {
			copy[(arr.length - 1) - idx] = arr[idx];
			idx++;
		}

	}

	public void method2() {
		String[] arr = { "사과", "바나나", "망고", "복숭아", "수박" };
		// 오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, Collections.reverseOrder());
	}

	public void method3() {
		int score[] = { 79, 88, 91, 44, 100, 55, 95 };
		int temp[] = new int[score.length];
		Arrays.sort(score);
		temp = score.clone();

		int minMaxSum = temp[0] + temp[score.length - 1];
		System.out.println(minMaxSum);

	}

	/*
	 * 선택 정렬 (selection sort) - 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고, ( 아예 데이터 교환이 일어남 )
	 * 그 다음 작은 데이터를 선택해 앞에서 두번째 데이터와 바꾸는 과정을 반복 - 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식
	 * - 데이터 양이 적을땐 좋음, 하지만 100개 이상의 자료에서는 급격한 속도의 저하;;;;
	 * 
	 */
	public void method4() {
		// 선택 정렬 (selection sort)
		// - 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고, ( 아예 데이터 교환이 일어남 )
		// 그 다음 작은 데이터를 선택해 앞에서 두번째 데이터와 바꾸는 과정을 반복
		// - 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식
		// - 데이터 양이 적을땐 좋음, 하지만 100개 이상의 자료에서는 급격한 속도의 저하;;;;

		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					continue;
				}

			}

		}
		System.out.println(Arrays.toString(arr));

	}

	/*
	 * 삽입정렬(insertion sort) 동작 원리는 직관적, 선택 정렬에 비해 구현 난ㄴ이도가 높음 필요할때만 위치 바꿔서 '데이터가 거의
	 * 정렬되어 있음'
	 * 
	 * 
	 */
	public void method5() {
		int arr[] = {8,5,6,2,4 };
		for(int i = 0; i < arr.length-1;)
		{// 처음 요소 부터 하나씩 볼껀데..
			//만약에 내가 지금 찍은 요소가 다음것 보다 크면 !
			// 다음꺼랑 내꺼랑 바꾸고 한자리씩 다 밀어줘야함.
			if(arr[i] > arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i = 0;
			}
			else
				i++;
		}
		
	}
	
	
	/*
	 * 버블 정렬(bubble sort) - 인접한 두수를 비교해서 큰수를 뒤로 보내는 것이 특징 - 구현이 쉽다, 다른 정렬에 비해 느림;
	 * 역순은 더더더더더더더 느림;;;;;;;;
	 * 
	 * 
	 */
	public void method6() {

		int arr[] = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		C_Sorting cs = new C_Sorting();
		cs.method5();
	}

}
