package com.kh.practice1.compare;

import java.util.Comparator;

import com.kh.practice1.model.Music;

public class TitleAscending implements Comparator<Music> {
	
	
	/*
	 * 두 개의 매개값으로 전달된 객체를 비교
	 * - 같으면 0 반환;
	 * - 처음이 뒤보다 크면 1
	 * - 비교대상보다 작으면 -1
	 * 
	 * */
	
	@Override
	public int compare(Music o1, Music o2)
	{
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
