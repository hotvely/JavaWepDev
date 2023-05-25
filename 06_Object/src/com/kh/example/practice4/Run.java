package com.kh.example.practice4;

import com.kh.example.practice4.model.*;
import com.kh.example.practice4.controller.*;
import java.util.*;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SnackController scr = new SnackController();

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

		String aaa = "010-3333-3333";
		System.out.println(Integer.parseInt(aaa));
		try {
			Integer.parseInt(aaa);
		}
		catch (NumberFormatException e)
		{
			
		}
		System.out.println(Integer.parseInt(aaa));
		
		
		String kind, name, flavor;
		int numOf, price;
		System.out.print("스낵류를 입력하세요.\n");
		System.out.print("종류 > ");
		kind = sc.nextLine();
		System.out.print("이름 > ");
		name = sc.nextLine();
		System.out.print("맛 > ");
		flavor = sc.nextLine();
		System.out.print("개수 > ");
		numOf = Integer.parseInt(sc.nextLine());
		System.out.print("가격 > ");
		price = Integer.parseInt(sc.nextLine());
		Snack s = new Snack(kind, name, flavor, numOf, price);
		scr.saveData(s);
		if (scr.saveData(s))
			System.out.println(scr.confirmData());

	}

}
