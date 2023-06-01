package com.kh._interface.step2;

public class Super implements Player {

	@Override
	public void run() {
		System.out.println("숙련가는 개 빨리 달림");
	}

	@Override
	public void jump() {
		System.out.println("숙련가는 높이 뛸 수 있음");
	}

	@Override
	public void turn() {
		System.out.println("드디어 한바뀌는 턴 할 수 있음 ㅠ 감격 ㅠㅠ");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("\n====== 고인물 레벨 ======");
	}

}
