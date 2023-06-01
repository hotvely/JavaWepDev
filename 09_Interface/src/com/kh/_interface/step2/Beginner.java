package com.kh._interface.step2;

public class Beginner implements Player {

	@Override
	public void run() {
		System.out.println("초보자는 천천히 달린당");
	}

	@Override
	public void jump() {
		System.out.println("초보자는 점프를 못배웠다..ㅠㅠ");
	}

	@Override
	public void turn() {
		System.out.println("초보자는 돌줄도 몰라 ....ㅠ");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("");
	}

}
