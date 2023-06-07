package com.kh.practice2;

import java.util.*;


public class Application 
{
		
	public static void main(String[] args) 
	{
		Application app = new Application();
		// 로또 당첨 번호 추첨.
		Set<Integer> winNum = app.setNumber();
		System.out.println(winNum.size());
		Set<Integer> myNum = new TreeSet<>();

		int count = 0;
		boolean isSame = false;
		while(!isSame)
		{
			// 내꺼 로또 번호 랜덤 추첨 ㅎ;
			myNum = app.setNumber();
			
			System.out.println("로또 번호 > " + winNum);
			System.out.println("내 로또 번호 > " + myNum);
	
			if(myNum.equals(winNum))
			{
				isSame = true;
			}
			else
			{
				myNum.clear();
			}

			count++;
			
		}
		
		System.out.println(count);
		
	}
	
	public Set<Integer> setNumber()
	{
		Set<Integer> temp = new TreeSet<>();
		
		while(temp.size() < 6)
		{
			int randValue = (int)(Math.random() * 43 + 1);
			
			if(!temp.contains(randValue))
			{
				temp.add(randValue);				
			}
			
		}
		return temp;
	}

	
}
