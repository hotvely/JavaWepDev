package com.kh.practice1;


/*
 * UnCheckedException
 * - RunTimeException을 상속하고 있는 예외들
 * - 컴파일 시 예외처리 코드가 있는지 검사하지 않는 예외
 * - 프로그램 실행할 때 문제가 발생되는 것으로 조건문들을 통해서 처리 가능
 * */
public class C_UnCheckedException {

	
	public static void main(String[] args) {
		C_UnCheckedException c = new C_UnCheckedException();
		c.method4();
		
		
	}

	
	// ArrayIndexOutOfBoundsException	배열 범위 벗어났을 때, 잘못된 인덱스 값에 접근하는 경우
	public void method1()
	{
		String str[] = {"Hello Java",
						"No I mean It",
						"Nice to meet you"};
		int i = 0;
		while (i < 4)
		{
			try
			{
				System.out.println(str[i]);
				i++;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
				System.out.println(e.getMessage());
				return;
			}
		}
	}
	
	// NegativeArraySizeExceptionS
	public void method2()
	{
		try
		{
			int arr[] = new int[-1];
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//ArithmeticException
	public void method3()
	{
		try {
			int result = 10/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//NullPointerException
	public void method4()
	{
		// null 인 참조 변수로 객체의 멤버 참조시도시 예외 발생
		String str = null;
		try
		{
			str.charAt(0);
		}
		catch(Exception e)		
		{
			e.printStackTrace();
		}
	}
	
	
	
}
