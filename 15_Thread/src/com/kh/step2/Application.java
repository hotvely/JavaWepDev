package com.kh.step2;

/*
 * 프로세스
 * - 운영체제에서 실행 중인 하나의 프로그램(애플리케이션)
 * 
 * 
 * 스레드
 * - 프로세스 내에서 할당된 자원을 이용해 실제 작업을 수행하는 작업 단위
 * - 모든 프로세스는 하나 이상의 스레드를 가지며 각각 독립적인 작업단위를 가짐
 * - 하나의 스레드는 하나의 코드 실행 흐름이기 때문에,
 * 	 하나의 프로세스 내에 여러개의 스레드가 존재하면 여러개의 실행 흐름이 생긴다는 의미임;
 * 
 * 
 * 멀티스레드
 * - 하나의 프로세스 내에서 여러 스레드가 동시에 작업을 수행하는것;
 * 
 * 
 * 
 * */
public class Application {

	public static void main(String[] args)
	{
		//1. 스레드 생성
		ComeThread come = new ComeThread();
		GoThread go  = new GoThread();
		
		Thread tgo = new Thread(go, "GoThread");
		Thread tcome = new Thread(come, "ComeThread");
		
		//2. start 호출
		tcome.start();
		tgo.start();
		
		
	}

}
