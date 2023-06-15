package com.kh.webpage;

import com.kh.webpage.model.*;
import com.kh.webpage.controller.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
	
	static Scanner sc = new Scanner(System.in);
	UserController uctr = new UserController();
	NoteController nctr = new NoteController();
	
	
	public static void main(String[] args) {
		


		Application application = new Application();

		application.printMenu();
		

		
		
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

		System.out.print("1.회원가입\n2.로그인\n3.임시관리유저다보기\n999.프로그램종료");
		System.out.print("\n메뉴 번호 > ");
		int menuNum = Integer.parseInt(sc.nextLine());
	
		return menuNum;
	}
	
	public void createAccount()
	{
		System.out.print("id > ");
		String id = sc.nextLine();
		
		System.out.print("pass > ");
		String password = sc.nextLine();
		
		System.out.print("이름 > ");
		String name = sc.nextLine();
		
		System.out.print("성별(남자면 m, 여자면 f) > ");
		String gender =  sc.nextLine();
		System.out.print("생년월일 (ex) 1900년-01월-01일 > ");		
		String birthday = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(birthday);
		
		System.out.print("핸드폰 (ex) 010-0000-0000 > ");
		String phone = sc.nextLine();
		
		System.out.print("email > ");
		String email = sc.nextLine();
		
		System.out.print("nickName > ");
		String nickName = sc.nextLine();
		
		//컨트롤러를 이용해 객체에 데이터 할당해줌
		uctr.signUp(id, password, email, name, birthDate, gender, phone, nickName);
		
	}
	
	public void logIn() {
		System.out.print("아이디 > ");
		String id = sc.nextLine();
		System.out.print("비밀번호 > ");
		String password = sc.nextLine();
		
		if(uctr.logIn(id, password))	//성공
		{
			System.out.println("로그인 성공");
			memberMenu();
		}
		else	//실패
		{
			System.out.println("로그인 실패");
		}
		
	}
	
	public void printMenu()
	{
		while(true)
		{
			
			
			switch(selectMenu())
			{
			case 1:
				createAccount();
				break;
			case 2:
				logIn();
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
	
	public void memberMenu()
	{
		while(true)
		{
			//TODO 회원 전용 메뉴. 작성 요망.
			System.out.print("1.로그아웃(이전페이지 돌아가기)\n2.마이페이지\n3.쪽지메뉴\n");
			System.out.print("\n메뉴 번호 > ");
			int menuNum = Integer.parseInt(sc.nextLine());

			switch(menuNum)
			{
			case 1:
				uctr.setUser(null);
				return;
			case 2:
				myPage();
				break;
			case 3:
				noteMenu();
				break;
			default:
				break;
			
			}			
		}		
	}
	
	public void myPage()
	{
		while(true)
		{
			System.out.print("1.내 정보보기\n2.정보 수정하기\n3.회원탈퇴하기\n99.뒤로가기\n");
			System.out.print("\n메뉴 번호 > ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum)
			{
			case 1:
				System.out.println(uctr.getUser());
				break;
			case 2:
				updateUserInfo();
				break;
			case 3:
				
				break;
			case 99:
				return;
			default:
				break;
			
			}
		}
	}
	
	public void updateUserInfo()
	{
		while(true)
		{
			System.out.print("1.비밀번호재설정\n2.핸드폰번호변경\n3.닉네임변경\n4.e-mail변경\n99.뒤로가기\n");
			System.out.print("\n메뉴 번호 > ");
			int menuNum = Integer.parseInt(sc.nextLine());
			uctr.updateProfile(menuNum);
		}
		
	}
	
	public void noteMenu()
	{
		while(true)
		{
			System.out.print("1.쪽지보내기\n2.쪽지확인하기\n3.쪽지삭제하기\n99.뒤로가기\n");
			System.out.print("\n메뉴 번호 > ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum)
			{
			case 1:
				sendNote();
				return;
			case 2:
				nctr.viewAllNote(uctr.getUser());
				break;
			case 3:
				nctr.deleteNote(uctr.getUser());
				break;
			case 99 : return;
			default:
				System.out.println("1,2,3,99번만 입력바랍니다.");
				break;
			
			}			
			
		}
		
	}
	
	public void sendNote()
	{
		System.out.print("쪽지를 받을 사람 > ");
		String recipient =  sc.nextLine();		
		nctr.addNote(uctr.getUser(), uctr.findUser(recipient));
		
	}
	
	

}
