package com.kh.example.practice4.controller;
import com.kh.example.practice4.model.Snack;

/*
 * 컨트롤러 : 매니저 같은 기능;
 * 
 * */
public class SnackController
{
	private Snack s = new Snack();
	
	public SnackController() {
		
		
	}
	
	//데이터를 setter를 이용해 저장하고 결과 반환
	public boolean saveData(Snack s)
	{
		this.s.setKind(s.getKind());
		this.s.setName(s.getName());
		this.s.setFlavor(s.getFlavor());
		this.s.setNumOf(s.getNumOf());
		this.s.setPrice(s.getPrice());
		
		return true;
	}
	
	public Snack loadData(String fileUrl)
	{
		
		return null;
	}
	
	public Snack confirmData()
	{
		return this.s;
	}

}
