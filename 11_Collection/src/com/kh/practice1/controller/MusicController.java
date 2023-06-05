package com.kh.practice1.controller;

import java.util.*;

import com.kh.practice1.model.*;
import com.kh.practice1.compare.*;

public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	
	
	public boolean addList(Music music)
	{
		// 마지막 리스트에 객체 저장
		try
		{
			list.add(music);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean addAtZero(Music music)
	{
		// 첫 번째 리스트에 객체 저장
		try
		{
			list.add(0,music);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<Music> printAll()
	{
		
		// List 반환
		return list;
	}
	
	public Music searchMusic(String title)
	{
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		for(Music music : list)
		{
			for(int i = 0; i<title.length(); i++)
			{
				if(music.getTitle().contains(Character.toString(title.charAt(i))))
				{
					return music;
				}
			}
			
		}
		
		return null;
	}
	
	public Music removeMusic(String title)
	{
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		
		for(Music music : list)
		{
			if(music.getTitle().equals(title))
			{
				list.remove(music);
				return music;
			}
		}
		
		return null;
	}
	
	public Music setMusic(String title, Music music)
	{
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
		Scanner sc = new Scanner(System.in);
		
		for(Music elem : list)
		{
			if(elem.getTitle().equals(title))
			{
				music = elem;
				break;
			}
		}
		
		
		if(music != null)
		{
			Music temp = new Music(music.getTitle(), music.getArtist());
			
			System.out.print("수정할 곡 명 > ");
			String reTitle = sc.nextLine();
			System.out.print("수정할 가수 명 > ");
			String reArtist = sc.nextLine();
			
			music.setTitle(reTitle);
			music.setArtist(reArtist);
			
			System.out.println(temp + "의 값이 변경되었습니다.");
			
			return music;
		}
		else
		{
			System.out.println("수정할 곡이 없습니다.");
			return null;
		}

	}
	
	public ArrayList<Music> ascTitle()
	{
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
		
//		TitleAscending ta = new TitleAscending();
		// 리스트 곡 명 오름차순 정
		Collections.sort(list, new TitleAscending());
		return list;
	}
	
	public ArrayList<Music> descArtist()
	{
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
	
		ArtistAscending aa = new ArtistAscending();
		// 리스트 가수 명 내림차순 정렬
		Collections.sort(list, aa.reversed());
//		Collections.reverse(list);
		
		return list;
	}
}
