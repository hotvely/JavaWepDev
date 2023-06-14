package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest2 {
	
	boolean inputCheck = false;
	
	public static void main(String[] args) {
		
		InputThreadTest2 process = new InputThreadTest2();
		
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


		boolValue2 bV = new boolValue2();

		Thread thread1 = new Thread(new Counting2(bV, process));
		Thread thread2 = new Thread(new InputLotto2(bV, process));

		thread1.start();
		thread2.start();

	}

}

class boolValue2 {
	boolean isEnd = false;
}

class Counting2 implements Runnable {
	boolValue2 bv;
	InputThreadTest2 process;
	
	public Counting2(boolValue2 bv, InputThreadTest2 process) {
		this.bv = bv;
		this.process = process;
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
		process.inputCheck = true;
		System.exit(0);
	}

}

class InputLotto2 implements Runnable {

	boolValue2 bv;
	InputThreadTest2 process;

	public InputLotto2(boolValue2 bv, InputThreadTest2 process) {
		this.bv = bv;
		this.process = process;		//위와 같은 의미, 위에는 그냥 클래스 하나 새로 생성해서 쓰고 있는거고,
									//아래는 그냥 메인함수 들어있는 어플리케이션 클래스에서 변수 생성해서 데이터 공유 하고 있는 상황인 것 뿐;
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
			process.inputCheck = true;
		}
		
	}

}