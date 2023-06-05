package com.kh.practice1;
import java.io.FileNotFoundException;
import java.io.IOException;


public class E_SubClass extends E_SuperClass{

//	@Override
//	public void method()
//	{
//		// 오버라이딩 시에는 throws 작성 하지 않아도 됨.
//	}
	
//	@Override
//	public void method() throws IOException
//	{
//		// 부모 클래스의 메서드와 같은 Exception을 throws하는 것은 가능
//	}
	
//	@Override
//	public void method() throws Exception
//	{
//		// 부모 클래스 메서드 보다 더 상위 타입의 exception은 throws불가능
//	}
	
	@Override
	public void method() throws FileNotFoundException 
	{
		// 부모 클래스 메서드 보다 하위 타입은 throws 가능
	}
	
	
	
	
}
