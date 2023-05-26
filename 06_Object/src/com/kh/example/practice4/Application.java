package com.kh.example.practice4;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

import java.util.*;

public class Application {
	
	public static void main(String[] args) 
	{
		//------------화면------------
		Scanner sc = new Scanner(System.in);
		
		System.out.print("스낵류를 입력하세요.\n");
		
		System.out.print("종류 > ");		
		String kind = sc.nextLine();
		
		System.out.print("이름 > ");		
		String name = sc.nextLine();
		
		System.out.print("맛 > ");		
		String flavor = sc.nextLine();
		
		System.out.print("개수 > ");		
		Integer numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 > ");		
		Integer price = Integer.parseInt(sc.nextLine());
		//------------화면------------	
		
		
		//------------서버------------	
		// 데이터 푸시
		SnackController snackController = new SnackController();
		Snack viewSnack = new Snack(kind, name, flavor, numOf, price);
		
		boolean bl = snackController.saveData(viewSnack);
		//------------서버------------	
		// 서버에서 데이터 받아서 출력		
		System.out.println("저장완료 되었습니다.");
		if(bl)
			System.err.println(snackController.confirmData());
		System.out.println();
		
		
	}

}
