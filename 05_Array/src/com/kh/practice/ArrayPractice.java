package com.kh.practice;
import java.util.*;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ArrayPractice ap = new ArrayPractice();
		ap.method4();
	}
	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		String[] fruits = {"Apple", "Banana", "WaterMelon", "Peach", "Mango"};
		int randNum =  (int)(Math.random()*5);
		System.out.println(fruits[randNum]);
		
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		System.out.print("정수 > ");
		int arrSize = Integer.parseInt(sc.nextLine());
		int[] arr = new int[arrSize];
		for(int i = 0 ; i <arrSize; i++)
		{
			System.out.printf("배열 %d번째 인덱스에 넣을 값 > ", i);
			int idxNum = Integer.parseInt(sc.nextLine());
			arr[i] = idxNum;
		}
		
		System.out.println(Arrays.toString(arr));
		int total = 0;
		for(int i : arr)
		{
			total += i;
		}
		System.out.println(total);
		
	}
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3()
	{
		boolean canOrder = false;
		String menu[] = {"국밥","떡볶이","오뎅탕","사과","참이슬","진로","하이트","켈리","맥스","오비","찡따오","하얼빈","새로"};
		System.out.print("메뉴입력 > ");
		String str = sc.nextLine();
		for(String s : menu)
		{
			if(str.equals(s))
			{
				canOrder = true;
				break;
			}
		}
		
		if(canOrder)
		{
			System.out.println("배달가능!");
		}
		else
			System.out.println("배달 불가능;");
		
	}
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		System.out.print("주민등록번호 > ");
		String str = sc.nextLine();
		
		// 주민등록번호 입력 받아서 personalID 배열에 넣는데, 혹시 -없이 입력하는 경우에는 -추가해줌;
		char[] personalID = new char[14];
		for(int i = 0; i<str.length(); i++)
		{
			// 13보다 작다 == '-' 없다.
			if(str.length() <= 13)
			{
				// index 5까지는 생년월일 앞자리니까 걍 넣고
				if(i < 6)
					personalID[i] = str.charAt(i);
				// 6번째 '-' 추가 해주고 기존 charAt에서 가꾸온 char는 그 뒤로 밀어줌;
				else if(i == 6)
				{
					personalID[i] = '-';
					personalID[i+1] = str.charAt(i);
				}
				else
					personalID[i+1] = str.charAt(i);
			}
			// '-' 포함되어 있을때는 그냥 다 밀어 넣으면됨 ㅎㅎ;;
			else
				personalID[i] = str.charAt(i);
		}
		
		
		// temp배열 하나 만들어서 7번째 이후 부터 '*' 대입해서 뒷자리 가려주기;
		char[] tempPID = new char[14];
		int idx = 0;
		for(char ch : personalID)
		{
			if(idx > 7)
			{
				tempPID[idx] = '*';
			}
			else
			{
				tempPID[idx] = ch;
			}
			System.out.print(tempPID[idx]);
			idx++;			
		}
		
		
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5()
	{
		// 우선 단어 부터 입력 받고.
		System.out.print("단어 입력 > ");
		String str = sc.nextLine();
		
		// 거꾸로 뺄꺼니까 stack함 써봅시다 ~
		Stack<String> stack = new Stack<>();
		// stack의 자료형이 String이니까 string으로 형변환 해서 stack에 넣고 ~
		for(int i = 0 ; i < str.length(); i++)
		{
			stack.push(Character.toString(str.charAt(i)));
		}
		
		// 갯수 만큼 pop해서 뽑아 내면 끗!
		for(int i = 0 ; i < str.length(); i++)
			System.out.print(stack.pop());
		
		
	}
	
}
