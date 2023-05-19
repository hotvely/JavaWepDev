package com.kh.loop;

import java.util.*;

class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LoopPractice lp = new LoopPractice();
//		lp.method1();
//		lp.method2();
//		lp.method3();
//		lp.method4();
//		lp.method5();
//		lp.method6();
	}

	/*
	 * 사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오. 사용자 입력 : 5 5 4 3 2 1
	 */
	public void method1() {
		System.out.print("숫자 > ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}

	}

	// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
	public void method2() {

		int number = 1;
		int total = 0;
		while (true) {

			if (number % 2 != 0) {
				total += number;
			} else {
				total -= number;
			}

			if (total >= 100)
				break;

			number++;
		}
		System.out.println(number);
	}

	/*
	 * 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요.
	 * 
	 * 문자열 : banana 문자 : a banana 안에 포함된 a 개수 : 3
	 * 
	 */
	public void method3() {
		System.out.print("문자열 > ");
		String str = sc.next();

		System.out.print("검색할 문자 > ");
		char ch = (sc.next()).charAt(0);

		int idx = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				idx++;
			}
		}
		System.out.println(idx);

		char[] arr = new char[str.length()];
		arr = str.toCharArray();
		int count = 0;
		for (char c : arr) {
			if (ch == c) {
				count++;
			}
		}

	}

	/*
	 * 0이 나올 때까지 숫자를 출력하시오. (random 사용!) 7 3 4 2 3 4 0
	 */
	public void method4() {

		while (true) {
			int randNum = (int) (Math.random() * 11);
			System.out.println(randNum);
			if (randNum == 0)
				break;

		}
	}

	/*
	 * 주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)
	 * 
	 * 1 : 3 2 : 2 3 : 1 4 : 0 5 : 4 6 : 0
	 * 
	 */
	public void method5() {

		// hashmap 중괄호 초기화;;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>() {
			{
				put(1, 0);
				put(2, 0);
				put(3, 0);
				put(4, 0);
				put(5, 0);
				put(6, 0);
			}
		};

		// 주사위 열번 굴리기 ~
		int randNum;
		for (int i = 0; i < 10; i++) {
			// 랜덤 숫자 뽑고
			randNum = (int) (Math.random() * 6) + 1;
			System.out.println(randNum);
			Integer value = hm.get(Integer.valueOf(randNum));
			hm.put(randNum, ++value);
		}

		for (int i = 1; i < 7; i++) {
			System.out.printf("눈의 개수 %d개 : %d\n", i, (int) hm.get(i));
		}

	}

	/*
	 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고,
	 * 사용자에게는 직접 가위바위보를 받으세요. 사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
	 * 
	 * 
	 * 당신의 이름을 입력해주세요 : 
	 * 가위바위보 : 가위 
	 * 컴퓨터 : 가위 
	 * 박신우 : 가위 비겼습니다.
	 * 
	 * 가위바위보 : 가위 
	 * 컴퓨터 : 바위 
	 * 박신우 : 가위 졌습니다 ㅠㅠ
	 * 
	 * 가위바위보 : 보
	 *  컴퓨터 : 바위 
	 *  박신우 : 보 이겼습니다 !
	 */
	public void method6() {

		int winCount = 0, sameCount = 0, loseCount = 0;

		String comRSP = "";
		String playerRSP = "";
		
		boolean winCheck = false;
		System.out.print("당신의 이름 > ");
		String name = sc.next();
		
		String str = "";
		
		while (true) {
			
			int randNum = (int)(Math.random()*3) + 1;
			
			switch(randNum)
			{
			case 1:
				comRSP = "가위";
				break;
			case 2:
				comRSP = "바위";
				break;
			case 3:
				comRSP = "보";
				break;
			}
			
			
			System.out.print("가위바위보 선택 > ");
			playerRSP = sc.next();
						
			System.out.printf("컴퓨터 > %s\n", comRSP);
			
			
			switch(playerRSP)
			{
			case "가위":
				if(comRSP.equals("바위"))
				{
					// 컴퓨터가 이김
					loseCount++;
					str = "졌습니다";
				}
				else if(comRSP.equals("보"))
				{
					//플레이어가 이김.
					winCount++;
					winCheck = true;
					str = "이겼습니다";
				}
				else
				{
					//비김
					sameCount++;
					str = "비겼습니다";
				}
				break;
			case "바위":
				if(comRSP.equals("보"))
				{
					// 컴퓨터가 이김
					loseCount++;
					str = "졌습니다";
				}
				else if(comRSP.equals("가위"))
				{
					//플레이어가 이김.
					winCount++;
					winCheck = true;
					str = "이겼습니다";
				}
				else
				{
					//비김
					sameCount++;
					str = "비겼습니다";
				}
				break;
			case "보":
				if(comRSP.equals("가위"))
				{
					// 컴퓨터가 이김
					loseCount++;
					str = "졌습니다";
				}
				else if(comRSP.equals("바위"))
				{
					//플레이어가 이김.
					winCount++;
					winCheck = true;
					str = "이겼습니다";
				}
				else
				{
					//비김
					sameCount++;
					str = "비겼습니다";					
				}
				break;
			}
			
			System.out.printf("%s님 > %s %s\n",name, playerRSP, str);
			
			if (winCheck)
				break;
			
			

		}
		
		
		System.out.printf("W count > %d\n", winCount);
		System.out.printf("S count > %d\n", sameCount);
		System.out.printf("L count > %d\n", loseCount);
		
	}

}