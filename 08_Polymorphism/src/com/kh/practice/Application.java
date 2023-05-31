package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.LibraryController;
import com.kh.practice.model.Book;

public class Application 
{
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	
	public static void main(String[] args) 
	{
		Application app = new Application();
		app.mainMenu();		
	}
	
	/*
	 * 
	 * */
	public void mainMenu()
	{
		System.out.print("이름 > ");
		String name = sc.nextLine();
		System.out.print("나이 > ");
		int age = Integer.parseInt(sc.nextLine());
		
		lc.insertMember(name, age);
		boolean check = true;
		while(check)
		{
			System.out.println("=====메뉴=====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 검색하기");
			System.out.println("3. 도서 대여하기");
			System.out.println("4. 프로그램 종료하기");
			System.out.print("메뉴 번호 > ");
			int select = Integer.parseInt(sc.nextLine());
			
			switch(select)
			{
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				searchBook();
				break;
			case 3:
				rentBook() ;
				break;
			case 4:
				check = false;
				break;
			default:
				break;
			}


		}
		
	}
	
	/*
	 * 검색하려는 책 관련 기능
	 * (LibraryController의 searchBook 함수 이용)
	 * */
	public void searchBook()
	{
		System.out.print("검색할 제목 키워드 > ");
		String keyword = sc.nextLine();
		
		System.out.println(lc.searchBook(keyword));		
	}
	
	/*
	 * 빌리려는 책 관련 기능
	 * (LibraryController의 rentBook 함수 이용)
	 * */
	public void rentBook() 
	{
		int count = 0;
		for(Book elem : lc.viewBooks())
		{
			System.out.printf("%d번 도서 : %s\n",count++, elem);
		}
		
		System.out.print("대여할 도서 번호 선택 > ");
		int idx = Integer.parseInt(sc.nextLine());
		
		lc.rentBook(idx);
	
	}

}
