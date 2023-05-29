package com.kh.practice.controller;

import com.kh.practice.model.*;

public class CircleController {
	
	private Circle c = new Circle();

	public String calcArea(int x, int y, int radius) 
	{
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return c.draw() + "넓이 : " + c.PI * c.getRadius() * c.getRadius();
	}
	
	public String calcCircum(int x, int y,int radius)
	{
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return c.draw() + "둘레 : " + c.PI * c.getRadius() * 2;
	}
	
}
