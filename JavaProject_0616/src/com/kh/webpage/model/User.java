package com.kh.webpage.model;



public class User {


	private String email;
	private String phone;
	private String id;
	private String password;
	private String name;
	private Integer year, month, day;
	private String nickName;
	private String gender;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	// get set 
	
	
	


	
}
