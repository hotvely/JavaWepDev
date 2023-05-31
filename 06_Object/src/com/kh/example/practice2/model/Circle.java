package com.kh.example.practice2.model;



/*
 *	public : + 
 * 	private : -
 *
 */



public class Circle {

	// default member
	final static double PI = 3.14;
	
	
	// public member
	public int radius = 1;
	
	// public function
	public Circle()
	{ 
		printInfo();
	}
	
	public void incrementRadius() {
		radius ++;
		printInfo();
	}
	
	
	
	
	// private function
	private void printInfo() {
		System.out.printf("원의둘레(%.3f) 넓이(%.3f)\n", 2 * PI * radius, PI * Math.pow(radius, 2));
	}

}
