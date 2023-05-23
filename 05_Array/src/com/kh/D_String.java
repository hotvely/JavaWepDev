package com.kh;
import java.util.*;

public class D_String {
	
	/*
	 * String 문자열 : 문자의 배열
	 * 문자는 'a' , 문자열은  "ABC" 로 나타냄
	 * 
	 * - String.charAt(int idx); idx번째 요소 문자를 char형식으로 반환하는 함수
	 * 
	 * - String.toCharArray(); 모든 문자가 들어있는 String문자열을 -> char[]형식의 데이터를 반환해줌
	 * 
	 * */
	
	
	/*
	 * ArrayIndexOutOfBoundsException
	 * 
	 * -> 배열의 인덱스 범위 벗어나서 발생;
	 * 
	 * */
	public static void main(String[] args) {
		
		char arr[] = "Hello, World".toCharArray();
		for(char c : arr) {
			System.out.print(c);
		}
		
		
		
	}

}
