package com.youtube.controller;
import com.youtube.model.User;

public class UserController implements UserControllerInterImpl {

	User user = null;
	
	
	@Override
	public boolean login(String id, String password) {
		// id pass 정도만 체크
		if(user != null && user.getId().equals(id) && user.getPassword().endsWith(password))
		{
			return true;
		}
		return false;
	}

	@Override
	public void signUp(User user) {
		// 
		this.user = user;
	}

	@Override
	public boolean saveData() {
		return false;
	}

	@Override
	public User viewProfile() { //로그인 되어 있는 경우에만;
		
		if(login(user.getId(), user.getPassword()))
		{
			return user;
		}
		
		return null;
	}

	@Override
	public User updateProfile() {
		
		if(login(this.user.getId(), this.user.getPassword()))
		{
			this.user = user;
		}
		
		return this.user;
	}

	@Override
	public void deleteProfile(String id) {
		
		if(user.getId().equals(id))
		{
			user = null;
		}
		
	}

	@Override
	public boolean checkSW(String str) {
		return false;
	}

	@Override
	public boolean isDuplication(Object o, String type) {
		return false;
	}
	
	
}
