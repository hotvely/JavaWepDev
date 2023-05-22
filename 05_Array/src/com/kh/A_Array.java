package com.kh;
import java.util.*;



public class A_Array {

	Scanner sc = new Scanner(System.in);
	
	
	/*
	 * 배열 Array
	 * 
	 * 
	 * 1. 선언
	 * 자료형[] 이름 = new 자료형[사이즈]
	 * int[] arr = new int[2];
	 * 
	 * 
	 * 2. 배열의 초기화
	 * arr = {1,2,3,4,5};
	 * 자료형[] 이름 = new 자료형[사이즈]
	 * 
	 * 
	 * 3. 선언 초기화 동시
	 * int[] arr = {1,2};
	 * 
	 * */
	
	
	// 배열의 선언과 초기화
	// 1) 배열 변수와 인덱스를 이용해 초기화
	public void method1()
	{
		int[] score = new int[5];
		/*
		 * 기본 자료형 : 스택 메모리에 변수값이 저장되어 있음
		 * 참조 자료형 : 실제 데이터는 힙 메모리에 저장하고, 스택에는 힙메모리 주소값이 저장되어 있음.
		 * 
		 * */

		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
		
		System.out.println(score);
	}
	
	public void method2()
	{
		
		int[] arr = new int[]{100,90,80,70,60};
		
		for(int i =0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	
	}
	
	public void method3()
	{
		int score[] = new int[5];
		int num = 100;
		int idx = 0;
		/*
		 * 향상된 for문
		 * - 자바 5부터 배열 및 컬렉션 객체를 조금 더 쉽게 처리할 목적으로 제공
		 * - 증감식 사용 하지 않고 요소의 개수 만큼 반복해서 for문 사용함
		 * */
		for(int s : score)
		{			
			s = num - (  idx * 10);
			idx++;
			System.out.println(s);
		}		
	}
	
	
	/*
	 * 3명 키 입력받아 저장하고 평균값 구하기
	 * 
	 * */
	
	public void method4()
	{
		// 배열
		float arrKey[] = new float[3];
		// 가변배열;
//		List<Float> arrKey2 = new ArrayList<Float>();
		
		int idx = 0;
		
		while(idx < 3)
		{
			System.out.print("키 > ");
			try 
			{
				Float key = Float.parseFloat(sc.nextLine());
				arrKey[idx] = key;
//				arrKey2.add(key);
				idx++;
			}
			catch (NumberFormatException e)
			{
				System.out.println("소수점을 포함한 실수만 입력 바랍니다.");
				continue;
			}			
		}
		
		float totalKey = 0;
		for(float f : arrKey)
		{
			totalKey += f;
		}
		System.out.printf("평균키(배열) > %.2f\n",  totalKey/3);		
		
//		totalKey = 0;
//		for(float f  : arrKey2)
//		{
//			totalKey +=  f;
//		}		
//		System.out.printf("평균키(가변배열) > %.1f\n",  totalKey/3);		
	}
	
	
	// 배열의 복사 
	// 1. 얕은 복사 (주소값복사)
	// 2. 깊은 복사 (내용물까지 복사)
	public void method5()
	{
		int arr[] = {1,23,4};
		
		
		// 얕은 복사
//		int arrCopy[] = arr;
		int arrCopy[] = new int[arr.length];
		// 깊은 복사
		int idx = 0;
		
		//for문을 이용한 깊은 복사
//		for(int i : arr)
//		{
//			arrCopy[idx] = i;
//			idx++;
//		}
		
		
		
//		for문을 이용하지 않은 깊은 복사 ~ :) 이거 좋당 ㅎㅎㅎㅎ  ****연습연습***
//		
//		1) copyOf
//		copyOf 사용하면.. 초기화를 null값으로 둬도 괜찮!
//		arrCopy = Arrays.copyOf(arr, arr.length);		
//		
//		2) System.arraycopy(arrCopy, idx, arrCopy, idx, idx)
//		System.arrayopy(arr, 0, arrCopy, 0, arr.length);
//		
//		이거 개 좋네 ㄹㅇ,
//		3) arr.clone()
		arrCopy = arr.clone();
		
		arrCopy[1] += 12;
		
		System.out.println("arr > "+Arrays.toString(arr));
		System.out.println("arrCopy > "+Arrays.toString(arrCopy));		
		System.out.println("-------------------");
		
		System.out.println("주소값 출력 ~ > " + arr);
		System.out.println("주소값 출력 ~ > " + arrCopy);		

		System.out.println();
		System.out.println("arr's HashCode > "+arr.hashCode());
		System.out.println("arrCopy's HashCode > "+arrCopy.hashCode());
		
		
//		깊은 복사로 주소값이 다른데 ... 내용물이 같다고 equal함수가 true를 반환하는가?
//		: 배열 내부 값들이 같다면 equals는 true를 반환하게 됨. 즉, 주소값이 아닌 데이터값들 비교 이므로 조심해서 사용하쟈.
//		-> 그래서 그냥 주소값을 비교 하고 싶으면... hash코드를 비교하거나 그냥 배열의 이름으로 비교를 하면 될듯?
		System.out.println(Arrays.equals(arr, arrCopy));
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		A_Array a_arr = new A_Array();
		a_arr.method5();
		
		
		
	}

}
