package com.kh._interface.step2;

public class Advanced implements Player {

	@Override
	public void run() {
		System.out.println("모험가는 조금 빠르게 달림");
	}

	@Override
	public void jump() {
		System.out.println("모험가는 약하게 점프할 수 있음");
	}

	@Override
	public void turn() {
		System.out.println("모험가는 턴은 아직 못배움 ㅠㅠㅠ");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("\n====== 중급자 레벨 ======");
	}

}
