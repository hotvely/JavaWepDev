package com.youtube.controller;

import java.util.ArrayList;
import java.util.List;

import com.youtube.model.User;

public class UserController {
	
	 User user = new User();
	
	// 로그인
	public boolean logIn(String id, String password) {

		if (user.getId() == null || user.getPassword() == null)
			return false;

		if (this.user.getId().equals(id) 
				&& this.user.getPassword().equals(password))
			return true;

		return false;
	}

	// 회원가입
	public User signUp(String id, String password, String email, String name, Integer year,
			Integer month, Integer day, Character gender, String phone, String nickName) 
	{

		User user = new User();



		return user;
	}

	public boolean saveData() {
		
		return false;
	}
	
	// 프로필 보기
	public User viewProfile() {

		return null;
	}

	// 프로필 수정
	public User updateProfile() {

		return null;
	}

	// 계정 삭제
	public boolean deleteProfile() {

		return false;
	}

	// 필요한 함수들..

	public boolean checkSW(String str) {

		boolean swExist = false;
		List<Character> list = new ArrayList<>();
		for (char ch : str.toCharArray()) {// 입력받은 비밀번호 하나씩 list에 넣어서 체크하면 끗임 !
			list.add(ch);
		}

		if (list.contains('@') || list.contains('!'))
			swExist = true;
		return swExist;
	}

	boolean isDuplication(Object o, String type) {
		// DB에서 매개변수로 받은 type의 데이터들을 찾은 이후에 o가 이미 있는지 정렬후 찾든 암튼 찾으면됨.
		// 있으면 true, 없으면 false;

		return false;
	}

	// 필요한 함수들..
}
