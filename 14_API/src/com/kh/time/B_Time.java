package com.kh.time;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Scanner;

public class B_Time {

	/*
	 * Java.time 패키지
	 * - Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공(JDK1.8)
	 * - LocalDate, LocalTime, LocalDateTime, ZonedDateTime 클래스 포함되어 있음
	 * - 날짜와 시간에 대한 다양한 메서드를 제공해줌;
	 * 
	 * */
	public static void main(String[] args)
	{
		B_Time b = new B_Time();
		b.method4();
		
		
		
	}

	
	public void method1()
	{
		
		/*
		 * LocalDateTime 
		 * - 날짜와 시간 정보를 모두 저장할 수 있음
		 * */
 		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 날짜 지정
		LocalDateTime when = LocalDateTime.of(2023,11,1,17,50,00);
		System.out.println(when);
		
		// ZonedDateTime : LocalDateTime(날짜, 시간) + 시간대.(예를들면 서울, 파리, 베를린등등)
		System.out.println("ZonedDateTime > " + ZonedDateTime.now());
		
		// 년, 월, 일, 요일, 시, 분, 초
		System.out.println("년도 > " + now.getYear());
		System.out.println("월 > " + now.getMonth());
		System.out.println("월 > " + now.getMonthValue());
		System.out.println("일 > " + now.getDayOfYear());
		System.out.println("일 > " + now.getDayOfMonth());
		System.out.println("요일 > " + now.getDayOfWeek());
		System.out.println("시 > " + now.getHour());
		System.out.println("분 > " + now.getMinute());
		System.out.println("초 > " + now.getSecond());
		
		System.out.println("============================");
		
		//날짜 조작
		LocalDateTime plusDays = now.plusDays(1).plusMinutes(2).plusYears(1);
		System.out.println("plusDays > " + plusDays);
		System.out.println("isAfter > " + now.isAfter(plusDays)); //plusday보다 나중 날?
		System.out.println("isBefore > " + now.isBefore(plusDays));	// plusday보다 이전 날?
		
		LocalDateTime minusDays = now.minusMonths(2).minusDays(10).minusYears(3);
		System.out.println("minusDays > " + minusDays);
		
		LocalDateTime withDays = now.withYear(2025).withMonth(3).withDayOfMonth(1);
		System.out.println(withDays);
		
		
		System.out.println("------------------------------------");
		
		
		/*
		 * LocalDate > 날짜 정보만 저장
		 * */
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		localDate = LocalDate.of(2023, 11, 1);
		System.out.println(localDate);
		
		localDate = now.toLocalDate();
		System.out.println(localDate);

		/*
		 * LocalTime > 시간정보만 저장
		 * */
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		localTime = LocalTime.of(9, 27,34);
		System.out.println(localTime);
		
		localTime = now.toLocalTime();
		System.out.println(localTime);
		
	}
	
	/*
	 * Period & Duration
	 * - 날짜와 시간 간격을 표현하기 위한 클래스;
	 * - Period > 두 날짜 간의 차이
	 * - Duration > 시간의 차이
	 * 
	 * */
	public void method2()
	{
		/*
		 * between() > 두 날짜의 차이 
		 * */
		LocalDate date1 = LocalDate.of(2023, 1, 1);
		LocalDate date2 = LocalDate.of(2024, 12, 31);
		
		Period p = Period.between(date1, date2);
		System.out.println(p);
		
		System.out.println(p.getYears()  + "년" + p.get(ChronoUnit.YEARS));
		System.out.println(p.getMonths() + "월" + p.get(ChronoUnit.MONTHS));
		System.out.println(p.getDays() + "일" + p.get(ChronoUnit.DAYS));
		
		p = p.plusYears(3).multipliedBy(2); //3년 더하고, 2배 곱함
		System.out.println(p);
		
		System.out.println(date2.plus(p));
		date2 = date2.plus(p);
		System.out.println(date2);
		
		System.out.println("-----------------------");
		
		LocalTime time1 = LocalTime.of(00,00, 00);
		LocalTime time2 = LocalTime.of(10,36, 56);
		
		Duration du = Duration.between(time1, time2);
		System.out.println(du);
		System.out.println(du.getSeconds());
		
		du = du.plusHours(1).dividedBy(60);
		
		LocalTime time = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
			
		
		
		
		
		
		
		
		
	}
	
	
	public void method3()
	{
		// 문자열을 LocalDate로 파싱
		LocalDate date = LocalDate.parse("2023-05-11");
		System.out.println(date);

		date = LocalDate.parse("2023.05.11", DateTimeFormatter.ofPattern("yyyy.MM.dd"));
		System.out.println(date);
		
		date = LocalDate.parse("19930826", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date);
		
		System.out.println("------------------");
		
		/*
		 * DateTimeFormatter
		 * - 날짜와 시간을 포맷팅(Formatting)된 문자열로 변환하는 메서드를 제공하는 클래스
		 * */
		
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yy년 M월 d일 h시 m분 s초");
		System.out.println(today.format(ofPattern));
		
		// DateTimeFormatter에 표준화된 포맷들이 상수로 미리정의 되어있음
		System.out.println(today.format(DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(today.format(DateTimeFormatter.ISO_ORDINAL_DATE));
		
		
		//ZonedDateTime Format
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

	}
	
	// 년 월 일을 입력해서 D day 계산
	public void method4()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 > ");
		int year = Integer.parseInt(sc.nextLine());
		System.out.print("월 > ");
		int month = Integer.parseInt(sc.nextLine());
		System.out.print("일 > ");
		int day = Integer.parseInt(sc.nextLine());

		
		
		//D day 계산기;
		LocalDate nowDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(year, month, day);

		long dDay = ChronoUnit.DAYS.between(nowDate, targetDate);
		dDay = nowDate.until(targetDate, ChronoUnit.DAYS);

		if(dDay == 0)
		{
			System.out.println("오늘!!!!!!!");
		}
		else if(dDay > 0)
		{
			System.out.println("D- " + dDay + "일");
		}
		else
			System.out.println("지정한 날부터 지금까지 " + -(dDay) + "일 지났습니다.");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
