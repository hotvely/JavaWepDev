package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

public class SnackController
{
	Snack snack = new Snack();
	
	
	public boolean saveData(Snack viewSnack)
	{
		this.snack.setKind(viewSnack.getKind());
		this.snack.setName(viewSnack.getName());
		this.snack.setFlavor(viewSnack.getFlavor());
		this.snack.setNumOf(viewSnack.getNumOf());
		this.snack.setPrice(viewSnack.getPrice());
		
		return true;
	}
	
	public Snack confirmData()
	{
		if(snack == null)
			return null;
		return this.snack;
	}
	
	
}
