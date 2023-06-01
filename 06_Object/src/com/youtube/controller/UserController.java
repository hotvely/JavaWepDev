package com.youtube.controller;

import java.util.ArrayList;
import java.util.List;

import com.youtube.model.User;

public class UserController implements UserControllerInterImpl {

	@Override
	public boolean logIn(String id, String password) {
		return false;
	}

	@Override
	public User signUp(String id, String password, String email, String name, Integer year, Integer month, Integer day,
			Character gender, String phone, String nickName) {
		return null;
	}

	@Override
	public boolean saveData() {
		return false;
	}

	@Override
	public User viewProfile() {
		return null;
	}

	@Override
	public User updateProfile() {
		return null;
	}

	@Override
	public boolean deleteProfile() {
		return false;
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
