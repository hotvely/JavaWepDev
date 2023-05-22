package com.kh;

import java.util.Arrays;

public class B_Dimension {

	/*
	 * 다차원 배열.
	 * int arr[][] = new int[행][열];
	 * int arr[][] = {{1,2,3},{2,15,47},{3,51,23},{28,13,41}};
	 * 
	 * 
	 * 
	 * 
	 * */
	public void method1()
	{
		int arr[][] = {{1,2,3},{4,5,6}};
		int arr2[][] = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int[] i : arr2)
		{
			for(int j : i)
			{
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		for(int[] i : arr2)
		{
			System.out.println(Arrays.toString(i));
		}
		
		
	}
	
	
	/*
	 * 중첩 반복문을 이용한 초기화;
	 * 
	 * 
	 * */
	public void method2()
	{
		int[][] arr = new int[3][5];
		int value = 1;
		
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++) 
			{
				arr[i][j] = value++;
			}
		}
		
		for(int[] i : arr)
		{
			System.out.print(Arrays.toString(i));
		}
		
		
	}
	
	/*
	 * 가변배열
	 * List a = new ArrayList();
	 * 
	 * */
	public void method3() {
		int arr[][] = {{1,2},{3,4},{5,6},{7,8}};
		for(int[] i : arr)
		{
			System.out.print(Arrays.toString(i));
		}
	}
	
	
	/*
	 * [Java, Oracle, JDBC]
	 * [HTML, CSS, JavaScript, jQuery]
	 * [Servlet, JSP, MyBatis]
	 * [Spring, React]
	 * 
	 * */
	public void method4()
	{
		String arr[][] = {	{"Java", "Oracle", "JDBC"},
							{"HTML", "CSS", "JavaScript, jQuery"},
							{"Servlet", "JSP", "MyBatis"},
							{"Spring", "React"}	
						 };
		
		
		
		for(String[] i : arr)
		{
			System.out.println(Arrays.toString(i));
		}
						
		
	}
	
	
	
	public static void main(String[] args) {
		
		B_Dimension bd = new B_Dimension();
		
		bd.method4();
		
	}

}
