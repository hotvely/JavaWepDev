package com.kh.condition;
import java.util.*;


public class B_Switch
{

	Scanner sc = new Scanner(System.in);
	
	/*
	 * 
	 * switch case
	 * switch(조건식)
	 *  {
	 * 		case 값1:
	 * 			//TODO...
	 * 			break;
	 * 		case 값2:
	 * 			//TODO...
	 * 			break;
	 * 
	 *  	default:
	 *  		//TODO... 아무런 조건 만족하지 않는 디폴트 값인경우;
	 *  		break;
	 *  }
	 * 
	 * */
	
	public static void main(String[] args)
	{
		B_Switch bs = new B_Switch();
//		bs.method1();
//		bs.practice1();
		bs.practice2();
	}
	
	public void method1()
	{
		//1 빨강
		//2 파랑
		//3  초록
		// 잘못하면 잘못입력했다
		System.out.print("정수 입력 > ");
		int numCheck = sc.nextInt();
		String str = "";
		switch(numCheck)
		{
		case 1:
			str = "빨간색";
			break;
		case 2:
			str = "파란색";
			break;
		case 3:
			str = "초록색";
			break;
		default:
			str = "잘못입력했네용 :)";
			break;		
		}
		System.out.println(str);		
	}
	
	public void practice1()
	{
		//1. 관리, 글쓰기, 읽기
		//2. 글쓰기, 읽기
		//3. 읽기
		
		System.out.print("정수 입력 > ");
		int numCheck = sc.nextInt();
		String str = "";
		switch(numCheck)
		{
		case 1:
			str = "관리";
			System.out.println(str);
		case 2:
			str = "글쓰기";
			System.out.println(str);
		case 3:
			str = "읽기";
			System.out.println(str);
		}
		
	}
		
	public void practice2()
	{
		/*
		 * 월 입력 -> 계절
		 * 3 4 5 봄
		 * 6 7 8 여름
		 * 9 10 11 가을
		 * 12 1 2 겨울
		 * 
		 * */
		
		System.out.print("몇 월? > ");
		int numCheck = sc.nextInt();
		String str = "";
		
		switch(numCheck)
		{
		case 3:
		case 4:
		case 5:
			str = "봄";
			break;
		case 6:
		case 7:
		case 8:
			str = "여름";
			break;
		case 9:
		case 10:
		case 11:
			str = "가을";
			break;
		case 12:
		case 1:
		case 2:
			str = "겨울";
			break;
		
		default:
			str = "1월 부터 12월까지 밖에 없는디 ?";
			break;
		}
		System.out.println(str);
		
	}
		
	
	
	
	
}
