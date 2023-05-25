package com.kh.webpage;

import com.kh.webpage.model.*;
import com.kh.webpage.controller.*;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		UserController uctr = new UserController();
//		Snack snack = new Snack();
//		System.out.print("스낵류를 입력하세요.\n");
//		System.out.print("종류 > ");
//		snack.setKind(sc.nextLine());
//		System.out.print("이름 > ");
//		snack.setName(sc.nextLine());
//		System.out.print("맛 > ");
//		snack.setFlavor(sc.nextLine());
//		System.out.print("개수 > ");
//		snack.setNumOf(Integer.parseInt(sc.nextLine()));
//		System.out.print("가격 > ");
//		snack.setPrice(Integer.parseInt(sc.nextLine()));
//		System.out.println("저장 완료 되었습니다.");
//		System.out.println(snack);

		String email, phone, id, password, name, nickName;
		Character gender;
		Integer year, month, day;
		
		
		System.out.print("id > ");
		id = sc.nextLine();
		
		System.out.print("pass > ");
		password = sc.nextLine();
		
		System.out.print("이름 > ");
		name = sc.nextLine();
		
		System.out.print("성별 > ");
		gender = sc.nextLine().charAt(0);
		
		System.out.print("년 > ");		
		year = Integer.parseInt(sc.nextLine());
		System.out.print("월 > ");		
		month = Integer.parseInt(sc.nextLine());		
		System.out.print("일 > ");		
		day = Integer.parseInt(sc.nextLine());
		
		System.out.print("핸드폰 > ");
		phone = sc.nextLine();
		
		System.out.print("email > ");
		email = sc.nextLine();
		
		System.out.print("nickName > ");
		nickName = sc.nextLine();
		
		User user = new User(email,phone, id, password, name, year, month, day, nickName, gender);
		if(uctr.saveData(user))
			uctr.saveFile(".\\");	//txt 파일로 ...
		
		
		
//		Snack s = new Snack(kind, name, flavor, numOf, price);
//		scr.saveData(s);
//		if (scr.saveData(s))
//			System.out.println(scr.confirmData());
		
	}

}
