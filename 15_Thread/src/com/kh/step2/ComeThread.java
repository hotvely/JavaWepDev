package com.kh.step2;

/*
 * 스레드 생성 방법
 * 
 * 2. Runnable 인터페이스 구현하는 방법
 * - Runnable 인터페이스의 run() 함수를 오버라이딩
 * - Thread 객체 생성 시 생성자의 Runnable 인터페이스를 구현한 객체를 매개값으로 전달후 start() 호출
 * 		
 * * Thread, Runnable 두 방법이 큰 차이는 없지만.. Runnable 인터페이스를 구현하는것이
 * 	 코드의 일관성 유지와 재사용성이 높아 보다 객체지향적인 방법이다.
 * 
 * */
public class ComeThread implements Runnable
{

	@Override
	public void run()
	{
		for(int i = 0; i < 20; i++)
		{
			
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {}
			
			String name = Thread.currentThread().getName();
			System.out.println("CurrThread :: " + name);
		}
		
	}
	
	
	
	
	
	
}
