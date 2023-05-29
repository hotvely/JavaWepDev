package com.kh.webpage.controller;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.*;

import com.kh.webpage.model.User;


public class UserController {

	User user = new User();
	JSONObject obj = new JSONObject();
	
	
	
	public UserController() {		
		obj = loadJson(".\\test.json");
		
	}
	
	/*
	 * 
	 * 
	 * FileOutputStream		<- 이미지 파일, row byte
	 * */
	
	// 로그인
	public boolean logIn(String id, String password) {
		
		if(this.user.getId() == null 
				|| this.user.getPassword() == null)
			return false;
		
		if(this.user.getId().equals(id) 
				&& this.user.getPassword().equals(password))
			return true;
		
		
		return false;
	}

	// 회원가입
	public void signUp (String id, String password, String passwordComp
			, String email, String name, Integer year, Integer month, Integer day
			, Character gender, String phone, String nickName) {
		
		
		
		// id 
		if(this.obj != null && obj.containsValue(id))//json file에 내가 입력한 id가 있음?
		{
			System.out.println("같은 아이디가 존재함 !");
			return;
		}

//			if(isExistInDB(this.user.getId(), "String"))		//<- T : String , true(중복)
//				return;
		this.user.setId(id);
				
		// pass
		// - 비밀번호 입력 (특수문자(@, !) 포함해야 함.) 
		if(!checkSW(password))
			return;	
		// - 비밀번호 확인
		if(this.obj != null && obj.containsValue(password))
			return;
		this.user.setPassword(password);
		
		// email
		if(this.obj != null && obj.containsValue(email))		//<- T : String , true(중복)
			
			return;
		this.user.setEmail(email); 
		
		// name
		this.user.setName(name);
	
		// birthday
		this.user.setYear(year);
		this.user.setMonth(month);
		this.user.setDay(day);
		
		// gender
		if((gender == null) || (!gender.equals('m') && !gender.equals('f')))	
			return;

		this.user.setGender(gender);
		
		// phone
		// - 핸드폰 버노 (KT, SKT, LG 통신사 선택.)
		if(phone == null)
			return;
		
		if(phone.length() > 11)
		{
			String temp = null;
			for(char ch : phone.toCharArray())
			{
				if(ch != '-')
					temp += ch;
			}
			phone = temp;
		}
		this.user.setPhone(phone);
		
		// nickName
		if(this.obj != null && obj.containsValue(nickName))		//<- T : String , true(중복)
			return;
		this.user.setNickName(nickName);
		
		putJson(obj, this.user ,".\\test.json");
	
		
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
	
	
	boolean isExistInDB(Object o, String type)
	{
		// DB에서 매개변수로 받은 type의 데이터들을 찾은 이후에 o가 이미 있는지 정렬후 찾든 암튼 찾으면됨.
		// 있으면 true, 없으면 false;
		
		
		return false;
	}
	
	void putJson(JSONObject obj, User user, String path)
	{
		
//		Json데이터 추가 하는 방법 블로그.
//		https://hianna.tistory.com/627
		JSONArray jArr = new JSONArray();
		JSONObject jObj = new JSONObject();
		
		
		
		jObj.put("id",user.getId() /*json array*/);
		jObj.put("password", user.getPassword());
		jObj.put("name", user.getName());
		jObj.put("gender", user.getGender());
		jObj.put("email", user.getEmail());
		jObj.put("phone", user.getPhone());
		jObj.put("year", user.getYear());
		jObj.put("month", user.getMonth());
		jObj.put("day", user.getDay());
		jObj.put("nickName", user.getNickName());
		
		jArr.add(jObj);
		obj.put("data", jArr);
		
		
		try 
		{
			//
			FileWriter file  = new FileWriter(path);
			file.write(obj.toJSONString());
			file.flush();
			file.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	void getJson()
	{
		
	}
	
	public void saveFile(String path)
	{
		 try 
		 {			
            // 1. 파일 객체 생성
            File file = loadFile(path);
 
            // 2. 파일 존재여부 체크 및 생성
            if (!file.exists()) {
                file.createNewFile();
            }
 
            // 3. Writer 생성
//            FileWriter fw = new FileWriter(file, true);
//            PrintWriter writer = new PrintWriter(fw, true);
 
            // 4. 파일에 쓰기 and json 만들어보기.
            
            // json
            putJson(obj, this.user, path);
            // text
//            writer.printf("%s %s %s %c %s %s %s %s %s %s\n", 
//            		this.user.getId(),
//            		this.user.getPassword(),
//            		this.user.getName(),
//            		this.user.getGender(),
//            		this.user.getEmail(), 
//            		this.user.getPhone(),            		
//            		String.valueOf(this. user.getYear()) ,
//            		String.valueOf(this. user.getMonth()),
//            		String.valueOf(this. user.getDay()),
//            		this.user.getNickName()
//            		);
//            
//            // 5. PrintWriter close
//            writer.close();
            
            
            System.out.println("회원가입성공");
		 } 
		 catch (IOException e) 
		 {
	            e.printStackTrace();
		 }
    }
	
	public JSONObject loadJson(String path)
	{
		JSONParser parser = new JSONParser();
		try
		{
			if(obj == null)
				return null;
	        // JSON 파일 읽기
			Object obj = parser.parse(new FileReader(path));
        	JSONObject jsonObject = (JSONObject)obj;
//      	
        	System.out.println(jsonObject);
        	
        	return jsonObject;
		}
		catch(IOException | ParseException e)
		{
			System.out.println("변환에 실패 혹은 경로 못찾았음 ㅋㅋ ㅠ");
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	public File loadFile(String path)
	{
		char str[] = new char[100];
		try
		{
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			
			int cnt;
			while((cnt = fileReader.read(str)) != -1)
			{
				String data = new String(str, 0, cnt);
				System.out.println(data);
			}
			
			fileReader.close();	
			return file;
		}
		catch(IOException e) 
		{
			e.printStackTrace();	
			return null;
		}
		
		
	}
}
