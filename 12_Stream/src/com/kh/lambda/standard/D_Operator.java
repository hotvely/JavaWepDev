package com.kh.lambda.standard;
import com.kh.model.*;
import java.util.function.*;

/*
 * Operator
 * - Operator 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 추상함수를 가지고 있음
 * - applyXXX() 추상함수는 주로 매개값을 이용해서 연산하고 동일 타입으로 결과 리턴하는 역활을 함
 * 
 * */
public class D_Operator {

	public static void main(String[] args) 
	{
		D_Operator d = new D_Operator();
		d.method3();
		
	}

	// IntBinaryOperator : 두개의 int연산 
	public void method1()
	{
		IntBinaryOperator ibo = (a,b) -> a+b;
		System.out.println(ibo.applyAsInt(10, 20));
		
	}
	
	
//	IntUnaryOperator : 한개 int연산
	public void method2()
	{
		IntUnaryOperator ino = a -> a* a;
		System.out.println(ino.applyAsInt(5));

	}
	
//	BinaryOperator<T> : T와 T연산후 T리턴;
	public void method3()
	{
		BinaryOperator<Student> bo =  (student1, student2) -> student1.getMath() > student2.getMath() ? student1 : student2;
		Student student1 = new Student("문병철", 18, "남자", 100, 20);
		Student student2 = new Student("신수민", 14, "여자", 80, 100);
		System.out.println(bo.apply(student1, student2));
		bo = BinaryOperator.maxBy((stu1, stu2) -> Integer.compare(stu1.getMath(), stu2.getMath()));
		System.out.println(bo.apply(student1, student2));
		
	}
	
	
	
	
}
