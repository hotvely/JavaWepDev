package com.kh.step2;

public class GoThread implements Runnable{


	@Override
	public void run()
	{
		for(int i = 0; i < 20; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			System.out.println("CurrThread :: " + Thread.currentThread().getName() + i);
		}
	}
	
	
}
