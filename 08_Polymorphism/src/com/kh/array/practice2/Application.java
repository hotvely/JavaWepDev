package com.kh.array.practice2;

import java.util.*;
import com.kh.array.practice2.controller.*;
import com.kh.array.practice2.model.*;

public class Application {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();
	}

	public void mainMenu() {
		while(true) 
		{
			if(mc.count < 3)
			{
				System.out.println("최대 등록 가능한 회원 수는 3명입니다.");
				System.out.printf("현재 등록된 회원 수는 %d명입니다.\n", mc.count);
				System.out.print("1. 새 회원 등록\n2. 회원 정보 수정\n3. 전체 회원 정보 출력\n9. 끝내기\n");
			}
			else
			{
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.print("2. 회원 정보 수정\n3. 전체 회원 정보 출력\n9. 끝내기\n");
			}
			System.out.print("메뉴 번호 > ");
			int idx = Integer.parseInt(sc.nextLine());
			switch(idx)
			{
			case 1:
				if(mc.count < 3)
					insertMember();
				break;
			case 2:
				updateMember();
				break;
			case 3:
				printAll();
				break;
			case 9:
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void insertMember() {
		// 기존 회원 아이디가 있는 경우
		// “중복된 아이디입니다. 다시 입력해주세요.” 출력
		String id;		
		while(true)
		{
			System.out.print("아이디 > ");
			id = sc.nextLine();
			
			if(mc.checkId(id)  < 0)
				break;
			else
			{
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}				
		}
		
		System.out.print("이름 > ");
		String name = sc.nextLine();
		System.out.print("비밀번호 > ");
		String pass = sc.nextLine();
		System.out.print("이메일 > ");
		String email = sc.nextLine();
		char gender;
		while(true)
		{
			System.out.print("성별(M/F) > ");
			gender = sc.nextLine().charAt(0);
			if(gender == 'F' || gender == 'M')
				break;
		}	
		System.out.print("나이 > ");
		int age =Integer.parseInt(sc.nextLine());
		
		Member temp = new Member(id, name, pass, email, gender, age);
		
		mc.insertMember(temp);
	
	}

	public void updateMember() {

		System.out.print("수정할 회원 아이디 > ");
		String id = sc.nextLine();
			
		if(mc.checkId(id) < 0)
		{
			System.out.println("회원 정보가 없습니다.");
			return;
		}
				
	
		System.out.print("수정할 이름 > ");
		String name = sc.nextLine();
		System.out.print("수정할 비밀번호 > ");
		String pass = sc.nextLine();
		System.out.print("수정할 이메일 > ");
		String email = sc.nextLine();
		
		if(mc.updateMember(id, name, pass, email))
		{
			System.out.println("업데이트 완료");
		}
		else
		{
			System.out.println("문제가 생겨서 업데이트 불가능");
		}
		
	}

	public void printAll() {
		Member m[] = mc.printAll();
		for(Member melem : m)
		{
			if(melem == null)
				return;
			System.out.println(melem);
		}
		
	}

}
