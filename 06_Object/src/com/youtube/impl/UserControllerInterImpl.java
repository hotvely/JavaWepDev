package com.youtube.impl;
import com.youtube.model.User;

public interface UserControllerInterImpl {

	// 로그인
	public boolean login(String id, String password);

	// 회원가입
	public void signUp(User user);
	
	public boolean saveData();

	// 프로필 보기
	public User viewProfile();

	// 프로필 수정
	public User updateProfile();

	// 계정 삭제
	public void deleteProfile(String id);

	// 필요한 함수들..

	public boolean checkSW(String str);

	boolean isDuplication(Object o, String type);

}
