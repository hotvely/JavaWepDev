package com.kh.step3;


public class BeepPrintTest1 {

	public static void main(String[] args) {

		BeepThread bt = new BeepThread();
		Thread bThread = new Thread(bt, "bThread");
		bThread.start();
		
		BeepPrintThread bpt = new BeepPrintThread();
		Thread bpThread = new Thread(bpt, "BeepPrintThread");
		bpThread.start();

	}

}
