package com.kh.webpage.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class User implements Serializable , Comparable<User>{

	private List<Video> videos;
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
			Integer day, String nickName, String gender) 
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

	@Override
	public int hashCode() {
		return Objects.hash(day, email, gender, id, month, name, nickName, password, phone, videos, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(day, other.day) && Objects.equals(email, other.email)
				&& Objects.equals(gender, other.gender) && Objects.equals(id, other.id)
				&& Objects.equals(month, other.month) && Objects.equals(name, other.name)
				&& Objects.equals(nickName, other.nickName) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(videos, other.videos)
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "User [videos=" + videos + ", email=" + email + ", phone=" + phone + ", id=" + id + ", password="
				+ password + ", name=" + name + ", year=" + year + ", month=" + month + ", day=" + day + ", nickName="
				+ nickName + ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(User o) {
		return this.name.compareTo(o.getName());
	}


	
	
	


	
}
