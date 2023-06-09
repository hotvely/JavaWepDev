package com.kh.webpage.controller;

import java.util.*;
import java.util.stream.Stream;
import java.io.*;
import java.time.LocalDate;

import org.json.simple.*;
import org.json.simple.parser.*;

import com.kh.webpage.model.User;

	enum CheckList
	{
		NONE,
		EMAIL,
		NICKNAME,
		PHONE,
		
		
		END,
	}

	public class UserController {

	Scanner sc = new Scanner(System.in);
	private User user = null;
	
	public User getUser()
	{
		return this.user;
	}
	public void setUser(User user)
	{
		this.user = user;
	}

	public User findUser(String id)
	{
		return users.get(id);
	}
	
	
	HashMap<String, User> users = null;
	List<String> userIdArr = null;
	ObjectOutputStream oos = null;
	String fileName = "src/users.obj";
	
	
	
	
	public UserController() {
		users = fileRead();
		if(users != null || !users.isEmpty())
		{
			userIdArr = new ArrayList<>(users.keySet());		
		}
	}
	
	// 로그인
	public boolean logIn(String id, String password) {
		
		if(users.containsKey(id) && users.get(id).getPassword().equals(password))
		{
			user = users.get(id);
			return true;
		}
		
		return false;
	}

	///존재하면 true , 없으면 false;
	public boolean duplicationOBJCheck(Object obj, CheckList check)
	{

		switch(check)
		{
		case NONE:
			System.out.println("어.. 유저 정보 checkList 데이터 잘못 넣은거 같은데??");
			break;
		case EMAIL:			
			for(String id : userIdArr)
			{
				if(users.get(id).getEmail().equals(obj))
				{
					//같은 이메일이 존재 하는데?????
					return true;
				}
			}			
			break;
		case NICKNAME:
			for(String id : userIdArr)
			{
				if(users.get(id).getNickName().equals(obj))
				{
					//같은 닉네임이 존재 하는데?????
					return true;
				}
			}	
			break;
		case PHONE:
			for(String id : userIdArr)
			{
				if(users.get(id).getPhone().equals(obj))
				{
					//같은 핸드폰이 존재 하는데?????
					return true;
				}
			}	
			break;
		case END:
			break;
			
		}
		
		return false;
	}
	
	// 회원가입
	public void signUp (String id, String password, String email
			, String name, LocalDate birthday
			, String gender, String phone, String nickName) {
		
		if(users == null || users.isEmpty())
			
		
		
		// id 
		if(!users.isEmpty() && users.containsKey(id))//user 데이터 정보들에 내가 입력한 id가 있음?
		{
			System.out.println("같은 아이디가 존재함 !");
			return;
		}
		
		this.user = new User();
		this.user.setId(id);
				
		// pass
		// - 비밀번호 입력 (특수문자(@, !) 포함해야 함.) 
		if(!checkSW(password))
			return;	
		this.user.setPassword(password);
		
		
		// email
		// 맵핑한 데이터가 있는상태이면서, 
		if(!users.isEmpty() && duplicationOBJCheck(email, CheckList.EMAIL))	
		{
			System.out.println("같은 이메일 있는딩?>");
			return;
		}
		this.user.setEmail(email); 
		
		// name
		this.user.setName(name);
	
		// birthday
		this.user.setBirthday(birthday);
		
		// gender
		if((gender == null) || (!gender.equals("m") && !gender.equals("f")))	
			return;

		this.user.setGender(gender);
		
		// phone
		// - 핸드폰 버노 (KT, SKT, LG 통신사 선택.)
		if(phone == null || !phone.contains("-") || phone.length() != 13 || duplicationOBJCheck(phone, CheckList.PHONE))
		{
			System.out.println("같은 핸드폰 존재하넹ㅎㅎ;");
			return;		
		}
		this.user.setPhone(phone);
		
		// nickName
		if(!users.isEmpty() && duplicationOBJCheck(nickName, CheckList.NICKNAME))
		{
			System.out.println("같은 닉네임 존재하넹ㅎㅎ;");
			return;
		}		
		this.user.setNickName(nickName);
		
		
		
		fileSave(this.user);
		
	}

	public void printAllUser()
	{
		users = fileRead();

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
	public void updateProfile(int menuNum) {
		switch(menuNum)
		{
		case 1:	//비번
			System.out.print("비밀번호 입력 하세요(특문포함) > ");
			String pass = sc.nextLine();
			if(checkSW(pass))
			{
				getUser().setPassword(pass);
				System.out.println("비번 변경완료");
			}
			else
				System.out.println("특수문자가 없거나 불가능한 비밀번호입니다.");
			break;
			
		case 2:	// 폰변경
			System.out.print("핸드폰번호를 입력 하세요 > ");
			String phone = sc.nextLine();
			if(duplicationOBJCheck(phone, CheckList.PHONE))
			{
				System.out.println("중복되는 핸드폰이 있는디?");
				return;
			}
			getUser().setPhone(phone);
			System.out.println("폰번호 변경완료");
			break;
			
		case 3:	//닉네임
			System.out.print("닉네임 입력 하세요 > ");
			String nickName = sc.nextLine();
			if(duplicationOBJCheck(nickName, CheckList.NICKNAME))
			{
				System.out.println("중복되는 닉네임이 있는디?");
				return;
			}
			getUser().setNickName(nickName);
			break;
			
		case 4:	// 메일
			System.out.print("메일을 입력 하세요 > ");
			String email = sc.nextLine();
			if(duplicationOBJCheck(email, CheckList.EMAIL))
			{
				System.out.println("중복되는 E-mail이 있는디?");
				return;
			}
			getUser().setNickName(email);
			break;
			
		case 99:
			
			return;			
		}
	}

	// 계정 삭제
	public boolean deleteProfile() {
		users.remove(getUser().getId());
		return true;
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


}
