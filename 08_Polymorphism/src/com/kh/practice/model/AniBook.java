package com.kh.practice.model;

public class AniBook extends Book 
{
	private int accessAge;


	public AniBook() {
	}

	/**
	 * @param title
	 */
	public AniBook(String title, int accessAge) {
		super(title);
		this.accessAge = accessAge;
		// TODO Auto-generated constructor stub
	}


	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return super.toString() + "/ AniBook [accessAge=" + accessAge + "]";
	}
	
	
	
	
}
