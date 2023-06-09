package com.kh.lambda.standard;

import java.util.function.*;

/*
 * Supplier
 * - Supplier 함수적 인터페이스는 매개변수가 없고 리턴 값이 있는 getXXX() 추상 메서드를 갖고 있음
 * - getXXX() 추상 메서드는 데이터를 리턴(공급)하는 역할을 함
 * 
 * */

public class B_Supplier {

	public static void main(String[] args) {
		B_Supplier b = new B_Supplier();
		b.method3();
	}

	// Supplier<T> : T리턴
	public void method1() {
		Supplier<String> sup = () -> "그냥 겟함순데?" + "Supplier 는 제네릭으로 지정된 타입 객체 리턴함";
		System.out.println(sup.get());
	}

	// BooleanSupplier > boolean 리턴
	public void method2()
	{
		boolean boolValue = true;
//		if(boolValue == true)
//			boolValue = false;
		BooleanSupplier sup = () -> boolValue;
		System.out.println(sup.getAsBoolean());
		
	}
	
	//IntSupplier > return int
	//DoubleSupplier > return double
	//LongSupplier > return long;	
	public void method3()
	{
		LongSupplier longSupplier = () -> 234567890L;
		System.out.println(longSupplier.getAsLong());
		
	}
	
}
