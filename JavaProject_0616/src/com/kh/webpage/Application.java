package com.kh.webpage;

import com.kh.webpage.model.*;
import com.kh.webpage.controller.*;

import java.util.Scanner;

public class Application {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		

		UserController uctr = new UserController();
		Application application = new Application();

		application.PrintMenu(uctr);
		

		
		
//		Snack s = new Snack(kind, name, flavor, numOf, price);
//		scr.saveData(s);
//		if (scr.saveData(s))
//			System.out.println(scr.confirmData());
		
	}
	
	public void InitApplication()
	{
		// 웹, 어플, 프로그램 실행시 사용자 동의 없이 실행 해야 하는 부분 !
		
		// 동영상 재생
		
		//
	}
	
	public int selectMenu() 
	{

		System.out.print("1.회원가입\n2.로그인\n3.게시판보기\n999.프로그램종료");
		System.out.print("\n메뉴 번호 > ");
		int menuNum = Integer.parseInt(sc.nextLine());
	
		return menuNum;
	}
	
	public void createAccount(UserController uctr)
	{
		System.out.print("id > ");
		String id = sc.nextLine();
		
		System.out.print("pass > ");
		String password = sc.nextLine();
		
		System.out.print("이름 > ");
		String name = sc.nextLine();
		
		System.out.print("성별(남자면 m, 여자면 f) > ");
		String gender =  sc.nextLine();
		System.out.print("년 > ");		
		Integer year = Integer.parseInt(sc.nextLine());
		System.out.print("월 > ");		
		Integer month = Integer.parseInt(sc.nextLine());		
		System.out.print("일 > ");		
		Integer day = Integer.parseInt(sc.nextLine());
		
		System.out.print("핸드폰 > ");
		String phone = sc.nextLine();
		
		System.out.print("email > ");
		String email = sc.nextLine();
		
		System.out.print("nickName > ");
		String nickName = sc.nextLine();
		
		//컨트롤러를 이용해 객체에 데이터 할당해줌
		uctr.signUp(id, password, email, name, year, month, day, gender, phone, nickName);
		
	}
	
	public void logIn(UserController uctr) {
		System.out.print("아이디 > ");
		String id = sc.nextLine();
		System.out.print("비밀번호 > ");
		String password = sc.nextLine();
		
		if(uctr.logIn(id, password))	//성공
		{
			System.out.println("로그인 성공");
			MemberMenu(uctr);
		}
		else	//실패
		{
			System.out.println("로그인 실패");
		}
		
	}
	
	public void PrintMenu(UserController uctr)
	{
		while(true)
		{
			
			
			switch(selectMenu())
			{
			case 1:
				createAccount(uctr);
				break;
			case 2:
				logIn(uctr);
				break;
			case 3:
				uctr.printAllUser();
				break;
			case 4:
				break;
			case 5: 
				break;
			case 999:
				return;
			default:
				break;
			}
		}
	}
	
	public void MemberMenu(UserController uctr)
	{
		while(true)
		{
			//TODO 회원 전용 메뉴. 작성 요망.
			System.out.print("1.로그아웃(이전페이지 돌아가기)\n2.마이페이지\n3.게시판보기\n");
			System.out.print("\n메뉴 번호 > ");
			int menuNum = Integer.parseInt(sc.nextLine());

			switch(menuNum)
			{
			case 1:
				uctr.setUser(null);
				return;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				break;
			
			}
			
		}
		
	}
	
	
	

}
