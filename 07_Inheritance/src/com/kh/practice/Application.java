package com.kh.practice;

import java.util.*;

import com.kh.practice.controller.*;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public static void main(String[] args) 
	{
		Application app = new Application();

		app.mainMenu();
	}

	public void mainMenu() 
	{
		while(true)
		{
			System.out.println("===== 메뉴 =====");
			System.out.print("1. 원\n2. 사각형\n9. 끝내기\n메뉴번호 > ");
			int menuIdx = Integer.parseInt(sc.nextLine());
			
			switch(menuIdx)
			{
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				return;
			default:
				System.out.println("1,2,9 번만 입력가능");
				break;
			}
		}
	}

	public void circleMenu() 
	{
		System.out.println("===== 원 메뉴 =====");
		System.out.print("1. 원 둘레\n2. 원 넓이\n9. 메인으로\n메뉴 번호 > ");
		int menuIdx = Integer.parseInt(sc.nextLine());
		switch(menuIdx)
		{
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			break;
		default:
			System.out.println("1,2,9 번만 입력가능");
			break;
		}
	}

	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.print("1. 사각형 둘레\n2. 사각형 넓이\n9. 메인으로\n메뉴 번호 > ");
		int menuIdx = Integer.parseInt(sc.nextLine());
		switch(menuIdx)
		{
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
			break;
		default:
			System.out.println("1,2,9 번만 입력가능");
			break;
		}
		
	}

	public void calcCircum() {
		
		int arr[] = cirInterface();
		System.out.println(cc.calcCircum(arr[0], arr[1], arr[2]));
	}

	public void calcCircleArea() {
		int arr[] = cirInterface();
		System.out.println(cc.calcArea(arr[0], arr[1], arr[2]));
	}
	
	public void calcPerimeter() {
		int arr[] = recInterface();
		
		System.out.println(rc.calcArea(arr[0],arr[1],arr[2],arr[3]));
	}

	public void calcRectArea() {
		int arr[] = recInterface();
		
		System.out.println(rc.calcArea(arr[0],arr[1],arr[2],arr[3]));
	}
	
	public int[] recInterface() {
		int tempArr[] = new int[4];
		
		System.out.print("x 좌표 > ");
		tempArr[0] = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 > ");
		tempArr[1] = Integer.parseInt(sc.nextLine());
		System.out.print("높이 > ");
		tempArr[2] = Integer.parseInt(sc.nextLine());
		System.out.print("너비 > ");
		tempArr[3] = Integer.parseInt(sc.nextLine());
		
		return tempArr;
	}
	
	public int[] cirInterface()
	{
		int tempArr[] = new int[3];
		System.out.print("x 좌표 > ");
		tempArr[0] = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 > ");
		tempArr[1] = Integer.parseInt(sc.nextLine());
		System.out.print("반지름 > ");
		tempArr[2] = Integer.parseInt(sc.nextLine());
		
		return tempArr;
	}


	
	
}
