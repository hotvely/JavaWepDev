package com.kh.example.practice1;
import com.kh.example.practice1.model.Member;

public class Run {

	public static void main(String[] args) {

		Member member = new Member();
		member.changeName("멍멍이");
		member.PrintName();
		
		
		// default 접근 제한자 -> 같은 폴더 안에 있어야지만 사용 가능 ! ㅜㅜㅜㅜㅜㅜ
		// 						즉,,,,, 만약에 다른 폴더에 있으면 그냥 public get set 으로 다 풀어줘야 됨;;;;;;;;;
		
		// protected -> 같은 폴더 안에서 상속 관계에 있어야지만..
		
//		member.phone = "0000";
//		member.age = 100;
	}

}
