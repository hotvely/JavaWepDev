package com.kh.webpage.controller;

import java.util.*;
import java.util.stream.Stream;
import java.io.*;



import org.json.simple.*;
import org.json.simple.parser.*;

import com.kh.webpage.model.User;


	public class UserController {

	private User user = null;
	public User getUser()
	{
		return this.user;
	}
	public void setUser(User user)
	{
		this.user = user;
	}
//	JSONObject obj = new JSONObject();
	HashMap<String, User> users = new HashMap<>();
//	List<User> users = new ArrayList<>();
	String fileName = "src/users.obj";
	
	public UserController() {
		users = fileRead();
	}
	/*
	 * 
	 * 
	 * FileOutputStream		<- 이미지 파일, row byte
	 * */
	
	// 로그인
	public boolean logIn(String id, String password) {
		
		if(users.containsKey(id) && users.get(id).getPassword().equals(password))
		{
			user = users.get(id);
			return true;
		}
		
		return false;
	}

	// 회원가입
	public void signUp (String id, String password, String email
			, String name, Integer year, Integer month, Integer day
			, String gender, String phone, String nickName) {
		
		//loadJson("./src/test.json");
		
		
		// id 
		if(users.containsKey(id))//user 데이터 정보들에 내가 입력한 id가 있음?
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
		this.user.setPassword(password);
		
		
		// email
		if(users.containsValue(email))		//<- T : String , true(중복)
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
//		
//		if(phone.length() > 11)
//		{
//			String temp = null;
//			for(char ch : phone.toCharArray())
//			{
//				if(ch != '-')
//					temp += ch;
//			}
//			phone = temp;
//		}
		this.user.setPhone(phone);
		
		// nickName
		if(users.containsValue(nickName))		//<- T : String , true(중복)
			return;
		this.user.setNickName(nickName);
		
		//putJson(obj, user, "src/test.json");
		fileSave(this.user);
		
	}

	public void printAllUser()
	{
		users = fileRead();
//		List<User> value = new ArrayList<>(users.values());
//		value.sort(User::compareTo);
//		for(User elem : value)
//		{
//			System.out.println(elem);
//		}
		for(var key : users.keySet())
		{
			System.out.println(users.get(key));
		}
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
	

	public void fileSave(User user) 
	{	
		ObjectOutputStream oos = null;
		
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream(fileName, true));
			oos.writeObject(user);
			oos.flush();
			System.out.println("users.obj 파일에 정보 저장완료");
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				oos.close();
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public HashMap<String,User> fileRead() {
		HashMap<String, User> hMap = new HashMap<>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try
//		(FileInputStream fis = new FileInputStream(fileName))
		{
			fis = new FileInputStream(fileName);
			
			while(true)
			{
				// while 문 안에서는 ObjectInputStream객체만 생성해 줘야함.;;;;;
				ois = new ObjectInputStream(fis);
				
				User user = (User)ois.readObject();
				hMap.put(user.getId(), user);
			}
		}
		catch(EOFException e)
		{
			
		}
		catch (Exception e)
		{
			System.out.println("파일이 없넹;");
		}
		finally
		{
			try 
			{
				if(ois != null)
					ois.close();
				if(fis != null)
					fis.close();
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return hMap;
	}

	/*
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
	*/
}
