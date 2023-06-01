package com.kh._abstract.step1;

public abstract class Sports 
{
	protected int numberOfPlayers;		//참여하는 사람의 수

	public Sports(int numberOfPlayers) 
	{
		this.numberOfPlayers = numberOfPlayers;
	}
	
	/*
	 * 추상 메서드 (abstract method)
	 * - 중괄호 {} 구현 되지 않음
	 * - 미완성된 추상 메서드가 있다는 얘기는 클래스도 미완성이라는 얘기;
	 * - 즉, 미완성인 클래스로는 객체도 생성 불가능
	 * 
	 * 특징 : 자식클래스에서 무조건 재정의 하고 하지 않으면 에러
	 * 
	 */
	public abstract void rule();
	
	
}
