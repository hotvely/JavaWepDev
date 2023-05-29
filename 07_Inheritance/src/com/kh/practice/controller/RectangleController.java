package com.kh.practice.controller;

import com.kh.practice.model.*;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);

		return r.draw() + "넓이 : " + r.getHeight() * r.getWidth();
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return r.draw() + "둘레 : " + 2 * (r.getHeight() + r.getWidth());
	}

}
