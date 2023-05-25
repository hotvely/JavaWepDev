package com.kh.webpage.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.kh.webpage.model.User;


public class UserController {

	User user = new User();

	public UserController() {		

	}
	
	/*
	 * 
	 * 
	 * FileOutputStream		<- 이미지 파일, row byte
	 * */
	
	
	//데이터를 setter를 이용해 저장하고 결과 반환
	public boolean saveData(User user)
	{
		// 세이브? -> 우선 null이나 쓰레기값 들어있는지 확인하고,
		// 			그 이후에 file에 txt 데이터로 넣어주자.
		
		if(user.getEmail() != null)
			this.user.setEmail(user.getEmail());
		this.user.setEmail(user.getEmail()); 
		this.user.setPhone(user.getPhone()); 
		this.user.setId(user.getId()); 
		this.user.setPassword(user.getPassword()); 
		this.user.setName(user.getName()); 
		this.user.setYear(user.getYear()); 
		this.user.setMonth(user.getMonth());
		this.user.setDay(user.getDay()); 
		this.user.setNickName(user.getNickName()); 
		this.user.setGender(user.getGender()); 	
		
		return true;
	}
	
	public void saveFile(String filestr)
	{
		 try 
		 {
			 
            // 1. 파일 객체 생성
            File file = new File(filestr + "testData.txt");
 
            // 2. 파일 존재여부 체크 및 생성
            if (!file.exists()) {
                file.createNewFile();
            }
 
            // 3. Writer 생성
            FileWriter fw = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fw);
 
            // 4. 파일에 쓰기
            writer.printf("%s %s %s %s %s %s %s %s %s %c\n", 
            		this.user.getEmail(), 
            		this.user.getPhone(),
            		this.user.getId(),
            		this.user.getPassword(),
            		this.user.getName(),
            		String.valueOf(this. user.getYear()) ,
            		String.valueOf(this. user.getMonth()),
            		String.valueOf(this. user.getDay()),
            		this.user.getNickName(),
            		this.user.getGender()
            		);
            
            // 5. PrintWriter close
            writer.close();
	 
		 } 
		 catch (IOException e) 
		 {
	            e.printStackTrace();
		 }
    }
	
	
}
