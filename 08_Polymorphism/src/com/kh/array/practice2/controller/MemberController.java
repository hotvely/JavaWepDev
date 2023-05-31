package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.*;

public class MemberController {

	private Member[] m = new Member[3];
	public int count = 0;

	public void insertMember(Member m) {
		if(count < 3)
		{
			this.m[count++] = m;
		}
		else
			System.out.println("멤버가 꽉찼는데요?");
	}

	public boolean updateMember(String id, String name, String password, String email) {
		
		int idx = 0;
		for(idx = 0; idx < m.length; idx++)
		{
			if(m[idx].getId().equals(id))
			{	
				m[idx].setName(name);
				m[idx].setPassword(password);
				m[idx].setEmail(email);
				return true;
			}
		}
		return false;
	}

	public int checkId(String id) {
		// 0이면 중복 아니면 -1
		

		if(count != 0)
		{
			for(Member member : m)
			{		
				if(member == null)
					return -1;
				
				if(member.getId().equals(id))
					return 0;
			}
		}
		return -1;
	}

	public Member[] printAll() {
		
		return m;
	}

}
