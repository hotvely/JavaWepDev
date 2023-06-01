package com.kh._interface;

import com.kh._interface.step1.*;
import com.kh._interface.step2.*;
import com.kh._interface.step3.*;


/*
 * @@@@@ 추상클래스 -> 미완성 설계도
 * @@@@@ 인터페이스 -> 기본 설계도
 * 
 * */

/*
 * 인터페이스 interface
 * 
 * 접근제어자 interface 인터페이스명 {.....}
 * 
 * - 인터페이스는 개발코드와 객체가 서로 통신하는 접점의 역할
 * - 인터페이스에서 필드는 무조건 상수(final) 필드!
 * - 인터페이스에서 메서드는 무조건 추상 메서드만 가능;
 * - 객체가 구현해야 하는 기능이 존재할때 인터페이스에 추상메서드를 추가해서 객체가 기능을 동작하도록 만들 수 있음
 * - 인터페이스 구현하려면 implements 키워드를 사용해서 구현함
 * - 인터페이스는 다중상속 가능함 !!!!!! (****아주 그냥 이것저것 기능들 전부 다 인터페이스에 몰아버리면 될덧?)
 * - 추상클래스와 조금 다르게 더 강한 강제성을 가짐
 * 
 *** extends / implements
 * - 클래스 상속관계 (extends) (is a), 클래스에 기능(interface)을 추가할 때 (implements (여러개 가능 ~~))  (has a)
 * - 인터페이스 끼리의 상속 관계 에서는 extends -> is a 관계는 무조건 extends라고 보면되고 has a 관계면 그냥 implements 라고 보면 될덧??? 
 * 
 * */

public class Application {

	public static void main(String[] args) {
		Vehicle v[] = {new Bus(),new taxi()};
		v[0].run();
		v[1].run();
		
		
		Player players[] = {new Beginner(), new Advanced(), new Super()};
		for(Player p : players)
		{
			p.showLevelMessage();
			p.run();
			p.jump();
			p.turn();
		}
		
		
		System.out.println("===========================");
		Audio audio = new Audio();
		Television tv = new Television();
		
		audio.turnOn();		
		audio.setVolume(8);
		audio.search("www.KBS.com");
		audio.turnOff();
		System.out.println("===========================");
		
		tv.turnOn();		
		tv.setVolume(12);
		tv.search("www.naver.com");
		tv.turnOff();
	}

}
