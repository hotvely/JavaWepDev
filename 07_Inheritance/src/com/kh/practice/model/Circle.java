package com.kh.practice.model;

public class Circle extends Point {
	private int radius;

	public final double PI = 3.14;
	
	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + "Circle [radius=" + radius + "]";
	}

	@Override
	public String draw() {

		return super.draw() + "반지름 : " + radius + " / " ;
	}

}
