package com.kh.webpage.controller;

import java.util.*;
import java.io.*;



import org.json.simple.*;
import org.json.simple.parser.*;


import com.kh.webpage.model.User;


	public class UserController {

	User user = null;
	JSONObject obj = new JSONObject();
	HashMap<Object, User> users = new HashMap<>();
	
	
	public UserController() {}
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
			, String gender, String phone, String nickName) {
		
		//loadJson("./src/test.json");
		
		// id 
		if(this.obj != null && obj.containsValue(id))//json file에 내가 입력한 id가 있음?
		{
			System.out.println("같은 아이디가 존재함 !");
			return;
		}
		
		this.user =  new User();
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
		if((gender == null) || (!gender.equals("m") && !gender.equals("f")))	
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
		
		putJson(obj, user, "src/test.json");
	
		
	}

	public void printAllUser()
	{
		loadJson("src/test.json");
		
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
		
		//임시 데이터 만들어서 저장하고;
//		JSONObject data = new JSONObject();
//		data.put("id",user.getId() /*json array*/);
//		data.put("password", user.getPassword());
//		data.put("name", user.getName());
//		data.put("gender", user.getGender());
//		data.put("email", user.getEmail());
//		data.put("phone", user.getPhone());
//		data.put("year", user.getYear());
//		data.put("month", user.getMonth());
//		data.put("day", user.getDay());
//		data.put("nickName", user.getNickName());
//		data.put(user.getId(), user);
//
//		// 임시 데이터 배열화 한 이후에 클래스 인스턴스 obj 푸시
//		JSONArray jArr = new JSONArray();
//		jArr.add(data);
		obj.put(user.getId(), user);
		
		try (FileWriter file  = new FileWriter(path, true))
		{
			//
			file.write(obj.toJSONString() + "\n");
			file.flush();
			file.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.print(obj);
		
	}
	
	public void loadJson(String path)
	{
		JSONParser parser = new JSONParser();
		try(BufferedReader reader = new BufferedReader(new FileReader(path)))
		{
	        // JSON 파일 읽기
			StringBuilder jsonStr = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) 
            {
                jsonStr.append(line);
            }
			// JSON 문자열 파싱
            JSONObject jsonObject = (JSONObject) parser.parse(jsonStr.toString());
            if(jsonObject == null)
            {
            	System.out.println("데이터가 없어 ㅠㅠ");
            	return;
            }
            
            // 데이터를 HashMap에 저장
            users = new HashMap<>(jsonObject);
            
            // 데이터 확인
            for (HashMap.Entry<Object, User> entry : users.entrySet()) 
            {
                Object key = entry.getKey();
                System.out.println(key);
                User value = (User)entry.getValue();
                System.out.println(value);
                System.out.println(key + ": " + value);
            }
		}
		catch(IOException | ParseException e)
		{
			System.out.println("변환에 실패 혹은 경로 못찾았음 ㅋㅋ ㅠ");
			e.printStackTrace();
		}
	}
}
