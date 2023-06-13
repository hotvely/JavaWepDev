package com.kh.time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class A_Date {

	public static void main(String[] args) 
	{
		A_Date a = new A_Date();
//		a.method3();
		a.practice();
	}
	
	/*
	 * Date
	 * - java.util 패키지에 속한 날짜와 시간을 다룰 목적으로 만들어진 클래스 (JDK 1.0)
	 * - Date의 메서드는 대부분 deprecated(비권장) 되어 있지만 여전히 사용중...
	 * */
	public void method1()
	{
		Date today = new Date();
		System.out.println(today);
		
		// 1970년 1월 1일 00시 -> 한국 표준시간(KST)으로 출력 될 땐
		// 						, 그리니치 평균시(GMT)보다  +9 증가된 시간으로 표시됨
		Date when = new Date(0);
		System.out.println(when);
		System.out.println("-----------------------------");
		
		//Deprecated된 기능들;
		System.out.println("getYear > " + (today.getYear()+1900) + "년");
		System.out.println("getMonth > " + (today.getMonth() + 1) + "월");
		System.out.println("getDate > " + (today.getDate()) + "일");
		System.out.println("getHours > " + (today.getHours()%12) + "시");
		System.out.println("getMinutes > " + (today.getMinutes()) + "분");
		System.out.println("getSeconds > " + (today.getSeconds()) + "초");
		System.out.println("-----------------------------");
		
		/*
		 * SimpleDateFormat 클래스 : 날짜 데이터를 원하는 형태로 출력할 수 있도록 해 주는 클래스
		 * - y(년), M(월), D(년의 몇번째 일), d(월의 몇번째 일), E(요일),
		 *   a(오전/오후), H(시간0~23), h(시간1~12), m(분), s(초)
		 * */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 (E) aa h시 mm분 ss초");
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
			
		
		
		
		
	}
	
	
	/*
	 * Calendar
	 * - Date 클래스를 개선한 추상 클래스..???!!! (JDK 1.1)
	 * - 여전히 단점 존재함; 
	 * */
	public void method2()
	{
//		Calendar cal = new Calendar();		//안됨 (추상 클래스는 객체 생성 안되니깡)
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		today = new GregorianCalendar(); //태국만 BuddhistCalendar
		System.out.println(today);
		System.out.println("-------------------------------------");
		
		System.out.println("YEAR : " + today.get(Calendar.YEAR)+ "년");
		System.out.println("MONTH : " + (today.get(Calendar.MONTH)+1) + "월") ;
		System.out.println("DATE : " + today.get(Calendar.DATE)+ "일");
		System.out.println("H : " + today.get(Calendar.HOUR)+ "시");
		System.out.println("H : " + today.get(Calendar.HOUR_OF_DAY)+ "시");
		System.out.println("M : " + today.get(Calendar.MINUTE)+ "분");
		System.out.println("S : " + today.get(Calendar.SECOND)+ "초");
		System.out.println("-------------------------------------");
		
		// 날짜 지정
		Calendar date = Calendar.getInstance();
		date.set(2023, Calendar.MAY, 15);
		System.out.println(date);
		System.out.println(date.getTime());
		
		long timeInMillis = date.getTimeInMillis();
		System.out.println("1000분의 1초 > " + timeInMillis);
		long second = timeInMillis/1000;
		long min = second / 60;
		long hour = min / 60;
		long day = hour / 24;
		long year = day / 365;
		System.out.println(1970 + year);
		// SimpleDateFormat 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(date.getTime());
		System.out.println(formatDate);
		
	}

	/*
	 * Date와 Calendar간의 변화
	 * 
	 * */
	public void method3()
	{
		//1. Calendar -> Date
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		System.out.println(d);
		
		
		
		//2. Date -> Calendar
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		System.out.println(cal2.getTime().toString());
		
	}
	
	
	public void practice()
	{
		// 내가 태어난 날을 yyyy/MM/dd 형태로 입력 받아 해당 날짜가 무슨 요일이었는지, 
		//지금까지 며칠이 지났는지 계산
		//입력된 형식이 잘못된 경우 다시 입력;
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{	
			Calendar cal = Calendar.getInstance();
			Integer year = null;
			Integer month = null;
			Integer day = null;
			
			try
			{
				System.out.print("년도/월/일 형식으로 입력해주세요 > ");
				String str = sc.nextLine();
				if(!str.contains("/"))
				{
					System.out.println("/을 포함해서 제대로 년/월/일을 입력해 주세요.");
					continue;
				}
				List<String> arr = Arrays.asList(str.split("/"));
				if(arr.size() ==  3)
				{
					year = Integer.parseInt(arr.get(0));
					month = Integer.parseInt(arr.get(1));
					day = Integer.parseInt(arr.get(2));
					if(month > 12 || month < 0 || day < 0 || day > 31)
					{
						System.out.println("태어난 달,날 지대로 ㄱㄱ");
						continue;
					}
				}
			}
			
			catch(Exception e)
			{
				System.out.println("숫자만ㄱㄱ !!");
				continue;
			}

			
			switch(month)
			{
			case 1: month = cal.JANUARY;
				break;
			case 2:	month = cal.FEBRUARY;
								
				if(year / 4 == 0)
				{// 평년 28일까지 있
					
					if(year / 400 == 0)
					{// 4로 나눠 떨어지면서 400으로도 나눠 떨어지는 해 (100년으로 기본적으로 나눠 떨어질 꺼니까 그건 생략)
						// 그러면 윤년
						if(day > 29)
						{
							System.out.println("입력하신 년도는 윤년이라 29일 까지 밖에 업서염");
							continue;
						}
					}
					else if(year / 100 == 0)
					{// 4로 나눠 떨어지면서 100으로 나눠 떨어지는해 ( 400으로도 나눠 떨어지는건 위에서 거를예정)
						// 평년
						if(day > 28)
						{
							System.out.println("입력하신 년도는 평년이라 28일 까지 밖에 업서염");
							continue;
						}
					}
					else
					{// 4로 나눠 떨어지나 100이나 400으로 나눠 지지 않는 해
						// 윤년
						if(day > 29)
						{
							System.out.println("입력하신 년도는 윤년이라 29일 까지 밖에 업서염");
							continue;
						}
					}
				}
				else // 4로 아예 나눠 떨어지지 않아서 그냥 무조건 평년
				{
					if(day > 28)
					{
						System.out.println("입력하신 년도는 평년이라 28일 까지 밖에 없서염");
						continue;
					}
				}
				break;
			case 3: month = cal.MARCH;
				break;
			case 4: month = cal.APRIL;
				break;
			case 5: month = cal.MAY;
				break;
			case 6: month = cal.JUNE;
				break;
			case 7: month = cal.JULY;
				break;
			case 8: month = cal.AUGUST;
				break;
			case 9: month = cal.SEPTEMBER;
				break;
			case 10: month = cal.OCTOBER;
				break;
			case 11: month = cal.NOVEMBER;
				break;
			case 12: month = cal.DECEMBER;
				break;
			default:
				month = null;
				break;
			}
			
			if(month != null)
			{
				
				cal.set(year, month, day);
				Date date = new Date(cal.getTimeInMillis());
				SimpleDateFormat sdf = 
						new SimpleDateFormat("yyyy-MM-dd (E)요일에 태어났습니다.");
				System.out.println(sdf.format(date));
				long a = Calendar.getInstance().getTimeInMillis() - cal.getTimeInMillis();
				System.out.printf("그동안 %d일이 지났네요 ~\n",  a /(1000*60*60*24) );
				
				return;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
