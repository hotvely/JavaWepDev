package com.kh.example.practice1.model;

public class Member 
{
	 
	private String memberID, memberPwd, memberName, phone, email;
	int age;
	char gender;
	
	
	
	String getName()
	{
		return memberName;
	}
	
	String setName(String memberName)
	{
		return this.memberName = memberName;
	}
	
	public void changeName(String name)
	{
		setName(name);
	}
	
	public void PrintName()
	{
		System.out.println(this.memberName);
	}
	
}
