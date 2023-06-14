package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {

//		//1. 데이터 입력
//		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력 > ");
//		System.out.println("입력한 숫자는 " + input + "입니다.");
//		
//		//2. 카운팅 작업
//		for(int i = 10; i >0; i--)
//		{
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {}
//			
//			System.out.println(i);
//		}

		boolValue bV = new boolValue();

		Counting counting = new Counting(bV);
		InputLotto inputLotto = new InputLotto(bV);

		Thread thread1 = new Thread(counting, "Counting");
		Thread thread2 = new Thread(inputLotto, "InputLotto");

		thread1.start();
		thread2.start();

	}

}

class boolValue {
	boolean isEnd = false;
}

class Counting implements Runnable {
	boolValue bv;

	public Counting(boolValue bv) {
		this.bv = bv;
	}

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			try {
				if (bv.isEnd) {
					Thread.interrupted();
				} else {
					System.out.println(i);
					Thread.sleep(1000);					
				}
			} 
			catch (InterruptedException e) {
				break;
			}
		}
		System.out.println("제한 시간 끝났어용!");
		bv.isEnd = true;
	}

}

class InputLotto implements Runnable {

	boolValue bv;

	public InputLotto(boolValue bv) {
		this.bv = bv;
	}

	@Override
	public void run() {
		// 1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력 > ");
		if (bv.isEnd) {
			System.out.println("늦었는디?");
		} else {
			System.out.println("입력한 숫자는 " + input + "입니다.");
			bv.isEnd = true;
		}

	}

}