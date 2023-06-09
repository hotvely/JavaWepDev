package com.kh.lambda.practice;

/*
 * 람다식 ? (Lambda Expressions)
 * - 자바에서 함수적 프로그래밍을 위해서 자바8부터 람다식을 지원함
 * - 람다식은 매개변수를 가지는 함수와 같은 코드 블록이지만, 런타임 시에는 인터페이스에 익명구현객체를 생성
 * - 람다식을 사용하면 코드가 간결해지고, 컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 가져올 수 있음
 * - 쉽게 말해서 이름없는 익명함수라는 것 @@ (자바스크립트에서는 화살표 함수)
 * 
 * 
 * */
public class Application{

	public static void main(String[] args) 
	{
		Application app = new Application();
		int a = 10;
		int b =  3;
		System.out.println(app.plus(a, b));
		System.out.println(app.minus(a, b));	//....와 같이 사용 하는 부분을
		
		MathInterface plusLambda = (int x, int y) -> { return x + y;};
		MathInterface minusLambda = (int x, int y) -> x - y;
		MathInterface multipleLambda = (int x, int y) -> x * y;
		MathInterface divideLambda = (int x, int y) -> x / y;
		
		System.out.println(plusLambda.calc(a, b));
		System.out.println(minusLambda.calc(a, b));
		System.out.println(multipleLambda.calc(a, b));
		System.out.println(divideLambda.calc(a, b));
		
	}
	
	public int plus(int x, int y)
	{
		return x + y;
	}
	
	public int minus(int x, int y)
	{
		return x - y;
	}
	
	public int multiple(int x, int y)
	{
		return x * y;
	}
	
	public int divide(int x, int y)
	{
		return x / y;
	}


	
	
}
