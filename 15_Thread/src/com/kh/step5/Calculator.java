package com.kh.step5;

public class Calculator {
	
	private int memory;
	public int getMemory() {
		return memory;
	}
	
	
	/*
	 * 동기화 (Synchronized)
	 * - 스레드가 사용중인 객체의 작업이 끝날 때 까지 사용중인 객체에 다른 스레드에서 접근 할 수 없게 하는 것
	 * - 단, 동기화 처리는 무거워서 해당하는 기능에만 처리해야 함 !
	 * */
	
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+" : "+ this.memory);
	}
	
	
}
