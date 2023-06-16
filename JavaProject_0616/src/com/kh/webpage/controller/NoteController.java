package com.kh.webpage.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.webpage.model.*;

public class NoteController {
	
	Scanner sc = new Scanner(System.in);

	UserController uc = new UserController();
	List<Note> notes = new ArrayList<>();
	User writerUser = null;
	
	//C	 : 쪽지 작성	-> 로그인 된 회원만 가능!
	public void addNote(User writer, User recipient)
	{
		if( writer != null)
		{
			if(recipient == null)
			{
				System.out.println("응? 존재하지 않는 유전데요");
			}
			else
			{
				System.out.println("쪽지 내용 > ");
				String str = sc.nextLine();
				LocalDate now = LocalDate.now();
				
				notes.add(new Note(str, writer, now));
				System.out.println("쪽지 객체를 정상적으로 생성함.");
				recipient.setNotes(notes);
			}
			
			uc.fileSave(recipient);		
		}
		
	}
	
	
	//R	 : 쪽지 목록 보기
	public void viewAllNote( User recipient)
	{
		int idx = 0;
		for(Note elem : recipient.getNotes())
		{
			System.out.println((idx + 1) + "번 쪽지 > " + elem);
		}
			
	}
	

	
		
	//D	 : 쪽지 삭제	
	public void deleteNote(User recipient)
	{
		viewAllNote(recipient);
		
		System.out.print("삭제할 쪽지 번호 > ");
		int idx = Integer.parseInt(sc.nextLine());
		
		notes.remove(idx);
		System.out.println("쪽지를 정상적으로 제거했습니다.");
		uc.fileSave(recipient);		
		System.out.println("유저의 쪽지 정보를 업데이트 헀습니다.");
	}
	
}
