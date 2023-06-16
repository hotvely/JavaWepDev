package com.kh.webpage.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Note implements Serializable{

	private String note;	
	private User writer;
	LocalDate date ;
	
	
	
	/**
	 * @param id
	 * @param comment
	 * @param user
	 * @param date
	 */
	public Note(String note, User writer, LocalDate date) {
		this.note = note;
		this.writer = writer;
		this.date = date;
	}
	
	

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public User getUser() {
		return writer;
	}
	public void setUser(User writer) {
		this.writer = writer;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Note [보낸사람 = " + writer + ", 내용 = " + note + ", 보낸 날 = " + date + "]";
	}

	
	

}