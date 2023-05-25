package com.kh.webpage.model;

import java.util.ArrayList;
import java.util.List;


public class User {


	private String email;
	private String phone;
	private String id;
	private String password;
	private String name;
	private Integer year, month, day;
	private String nickName;
	private char gender;

	public User() {}
	
	public User(String email, String phone, String id, 
			String password, String name, Integer year, Integer month,
			Integer day, String nickName, char gender) 
	{
		super();
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.nickName = nickName;
		this.gender = gender;
	}

	// get set 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	// get set 
	
	
	

	// 로그인
	public boolean logIn(String id, String password) {
		
		if(id == null || password == null)
			return false;
		
		
		
		if(this.id.equals(id) && this.password.equals(password))
			return true;
		
		return false;
	}

	// 회원가입
	public User signUp(String tempId, String password, String passwordComp
			, String email, String name, Integer year, Integer month, Integer day
			, Character gender, String phone, String nickName) {
		
		User user = new User();
		
		// - 아이디 입력.(중복 아이디 있는지 체크)
//		String tempId = sc.nextLine();
		// 중복체크
		//.. TODO
		if(isDuplication(id, "String"))		//<- T : String , true(중복)
			return null;
		this.id = tempId;
				
		// - 비밀번호 입력 (특수문자(@, !) 포함해야 함.)
//		String tempPassFir = sc.nextLine();
		if(!checkSW(password))
			return null;		
		// - 비밀번호 확인
//		String tempPassSec = sc.nextLine();
		if(!password.equals(passwordComp))
			return null;
		this.password = password;
		
		// - 이메일 입력 (중복이메일 있는지 체크)
//		String tempEmail = sc.nextLine();
		// 중복체크
		// ..TODO
		if(isDuplication(email, "String"))		//<- T : String , true(중복)
			return null;
		this.email = email;

		// - 이름
		this.name = name;
//		
//		// - 생년월일 
		this.year = year;
		this.month = month;
		this.day = day;
		
		// - 남? 여?
//		Character tempGender = sc.nextLine().charAt(0);
		this.gender = gender;

		if(gender == null || gender != '남' || gender != '여')	
			return null;
		
		// - 핸드폰 버노 (KT, SKT, LG 통신사 선택.)
//		String tempPhone = sc.nextLine();
		if(phone == null)
			return null;
		
		if(phone.length() > 11)
		{
			for(char ch : phone.toCharArray())
			{
				if(ch != '-')
					this.phone += ch;
			}
		}
		
		
		// - 닉네임 설정
//		String tempNName = sc.nextLine();
		if(isDuplication(nickName, "String"))		//<- T : String , true(중복)
			return null;
		this.nickName = nickName;
		
		return user;
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
	
	public boolean checkSW(String str)
	{
		
		boolean swExist = false;
		List<Character> list = new ArrayList<>();
		for(char ch : str.toCharArray())
		{// 입력받은 비밀번호 하나씩 list에 넣어서 체크하면 끗임 !
			list.add(ch);
		}
		
		if(list.contains('@') || list.contains('!'))
			swExist = true;
		return swExist;
	}
	
	boolean isDuplication(Object o, String type)
	{
		// DB에서 매개변수로 받은 type의 데이터들을 찾은 이후에 o가 이미 있는지 정렬후 찾든 암튼 찾으면됨.
		// 있으면 true, 없으면 false;
		
		
		return false;
	}
	
	
	
	
	
	
	// 필요한 함수들..
	
}
