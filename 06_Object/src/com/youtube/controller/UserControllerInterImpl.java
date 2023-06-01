package com.youtube.controller;
import com.youtube.model.User;

public interface UserControllerInterImpl {

	// 로그인
	public boolean logIn(String id, String password);

	// 회원가입
	public User signUp(String id, String password, String email, String name, 
						Integer year, Integer month, Integer day,
						Character gender, String phone, String nickName);

	public boolean saveData();

	// 프로필 보기
	public User viewProfile();

	// 프로필 수정
	public User updateProfile();

	// 계정 삭제
	public boolean deleteProfile();

	// 필요한 함수들..

	public boolean checkSW(String str);

	boolean isDuplication(Object o, String type);

}
