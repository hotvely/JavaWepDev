package com.kh.step1;

/*
 * 스레드 생성 방법
 * 
 * 1. Thread 클래스를 상속받는 방법
 * - Thread 클래스를 상속 후에 run() 함수를 오버라이딩
 * - Thread 클래스를 상속한 자식 클래스를 생성후 start() 함수 호출
 * 
 * */
public class ComeThread extends Thread
{
	int sec = 0;
	
	public ComeThread(String name, int sec) {
		super(name);
		this.sec =sec;
	}
	
	public void run()
	{
		/*
		 * sleep() > 지정된 시간동안 스레드를 멈추게 제어함
		 * sleep()에 의해서 일시 정지 상태가 된 스레드는 자정된 시간이 끝나거나,
		 * interrupt()가 호출되면 interruptedException이 발생되어 실행대기 상태가 됨
		 * 
		 * */
		for(int i = 0; i < 20; i++)
		{
			
			try 
			{
				Thread.sleep(1000* sec);
			}
			catch (InterruptedException e) {}
			
			String name = Thread.currentThread().getName();
			System.out.println("CurrThread :: " + name + ", " + i);
		}
	}
	
	
	
	
}
