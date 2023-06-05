package com.kh.practice1;

/*
 * Error
 * 1. Compile-time Error
 * - 컴파일 시 발생하는 에러;
 * - 
 * 
 * 2. Run-time Error
 * - 프로그램 실행시 발생하는 에러
 * - error : 프로그램 코드에 의해 수습되지 않는 오류, 예를들어 중괄호 뺀다던지.. 메모리 부족이나 스택오버플로우?
 * - 예외 (exception) : 코드로 수습되는 오류, 예를 들어.. 형변환시 변환 잘못했을 경우?
 * 	Object -> Throw -> Exception/Error
 * 
 * 3. Logical Error
 * - 실행은 되지만, 의도와 다르게 동작함  
 * 
 * */

/*
 *  try - catch 
 *  try 
 *  { 
 *   	//todo.. 
 *   예외 발생할 가능성이 있는 코드 ~ 
 *  } 
 *  catch(예외클래스 e) 
 *  { 
 * 		//todo..
 *	 try에서 예외가 발생시 처리할 구문 
 *  }
 *  finally //<- 있어도 없어도 상관없! 
 *  { 
 *  	//todo..
 *   예외가 발생하든 안하든 무조건 실행할 코드이기 때문....;;; 주로 자원반납 코드 작성시 사용함 
 *   ex) close() 메모리 정리코드 
 *  }
 * 
 * 
 */
/*
 * 예외 처리시 call msg func
 * - printStackTrace() : 예외발생 당시의 호출 스택(call stack)에 있었던 메서드 정보와 예외 메시지를 화면에 출력해줌
 * - getMessage() : 발생한 예외 클래스의 instance에 저장된 메시지를 얻을 수 있음
 * 
 * */

public class A_TryCatch {
	public static void main(String[] args) {
		try {
			throw new Exception();		//고의로 예외 발생시킴
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
