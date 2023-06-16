package com.kh.webpage.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.text.DateFormatter;

public class User implements Serializable , Comparable<User>{

	private String id;
	private String password;
	private String name;
	private String phone;
	private String nickName;
	private String email;
	private LocalDate birthday;
//	private Integer year, month, day;
	private String gender;
	
	int noteCount = 0;
	private List<Note> notes;

	public User() {}
	
	public User(String id, String password, String name, String phone, String nickName,
			String email, LocalDate birthday, String gender) {

		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.nickName = nickName;
		this.email = email;
		this.birthday = birthday;
//		this.year = year;
//		this.month = month;
//		this.day = day;
		this.gender = gender;
	}


	

	// get set 
	
	
	
	public String getEmail() {
		return email;
	}

	public int getNoteCount() {
		return noteCount;
	}

	public void setNoteCount(int noteCount) {
		this.noteCount = noteCount;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
		noteCount++;
		System.out.println("유저데이터에 쪽지 데이터 정상 로드함.");
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

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
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
	public String toString() {
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yy년 M월 d일");
		return "User [id(" + id + "), pass(" + password + "), 이름(" + name + "), phone(" + phone + "), 닉네임("
				+ nickName + "), email(" + email + "), 생년월일(" + birthday.format(ofPattern) + "), gender("
				+ gender + ")]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthday, email, gender, id, name, nickName, password, phone);
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
		return Objects.equals(birthday, other.birthday) && Objects.equals(email, other.email)
				&& Objects.equals(gender, other.gender) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(nickName, other.nickName)
				&& Objects.equals(password, other.password) && Objects.equals(phone, other.phone);
	}

	@Override
	public int compareTo(User o) {
		return this.name.compareTo(o.getName());
	}


	
	
	


	
}
