package com.kh.loop;

import java.util.*;

public class D_While {

	Scanner sc = new Scanner(System.in);

	public void method1() {
	}

	public void method2() {
	}

	public void method3() {
		while (true) {
			int input = 0;
			System.out.print("숫자 > ");
			int num = sc.nextInt();

			if (num == input)
				break;

		}
	}

	public void method4() {
		int num = 2;
		do {
			System.out.println(num);
		} while (num < 0);
	}

	/*
	 * 숫자 맞추기 게임
	 * 1~100
	 * 임의 랜덤 값 맞추면됨
	 * */
	public void method5() {
		
		System.out.println("*** 숫자맞추기 게임 ***");
		int idx = 1;
		int randNum = (int)(Math.random() * 100) + 1;
		while(true)
		{
			System.out.print("숫자 > ");
			int input = sc.nextInt();
			if(input == randNum)
			{
				System.out.printf("%d번 만에 맞췄네용 대단해요ㅎ", idx);				
				break;
			}
			else
			{
				if(input < randNum)
				{
					System.out.println("더 큰 수를 입력하세용");
				}
				else if(input > randNum)
				{
					System.out.println("더 작은 수를 입력하세용");					
				}
				idx++;
			}
		}
	}
	
	/*
	 * ---------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 
	 * ---------------------------------
	 * 선택 > 1 
	 * 예금액 > 5000
	 * 
	 * ---------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 
	 * ---------------------------------
	 * 선택 > 2
	 * 출금액 > 2000
	 * 
	 * ---------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 
	 * ---------------------------------
	 * 선택 > 3
	 * 잔고 > 3000
	 * 
	 * ---------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 
	 * ---------------------------------
	 * 선택 > 4
	 * 종료 ~~
	 * 
	 * */
	public void method6() {
		
		int accountMoney = 0;
		boolean run = true;
		
		while(run)
		{			
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("---------------------------------");

			System.out.print("번호 선택 > ");
			// parsing 조금 더 안전한 형변환.
			int input = Integer.parseInt(sc.nextLine());
			
			switch(input)
			{
			case 1:
				System.out.print("예금액 > ");
				int inputMoney = Integer.parseInt(sc.nextLine());
				accountMoney += inputMoney;				
				break;
			case 2: 
				System.out.print("출금액 > ");
				inputMoney = Integer.parseInt(sc.nextLine());
				accountMoney -= inputMoney;
				break;				
			case 3:
				System.out.printf("잔고 > %d\n", accountMoney);
				break;
			case 4:
				System.out.println("종료하겠습니다.");
				run = false;
				break;
			default:
				System.out.println("1~4까지 번호를 입력하세용.");				
				break;			
			}

//			case 4: break;로 제어 하려면 아래 코드 필요함.
//			return;으로 제어 하면 필요 없음;
//			if(input == 4)
//				break;
//			
			
		}

		
		
		
		
	}
	
	
	public static void main(String[] args) {
		D_While dw = new D_While();
//		dw.method3();
//		dw.method4();
//		dw.method5();
		dw.method6();
		
	}

}
