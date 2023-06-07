package com.kh.set;

import java.util.*;
import com.kh.set.model.*;

/*
 * Set의 특징
 * - 중복 X 순서 X
 *  
 * HashSet
 * - Set을 인터페이스화한 컬렉션  
 * 
 * */

public class A_HashSet 
{
	
	public static void main(String[] args) {
		A_HashSet a = new A_HashSet();
		a.method2();
	}
	

	public void method1()
	{
		Set<String> set = new HashSet<>();
		
		set.add("멍멍이");
		set.add("고양이");
		set.add("너구리");
		set.add("반달곰");
		set.add("멍멍이");
		set.add("멍멍이");
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("멍멍이"));
		
		set.remove("반달곰");
		System.out.println(set);
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set);
	}
	
	
	public void method2()
	{
		Set<Person> set = new HashSet<>();
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));

		/*
		 * 객체 주소값을 가지고 비교하기 때무네 new키워드 쓰면 다른 객체로 인식해서 중복제거 X
		 * -> Person class 에서 hashCode(), equals() 메서드 재정의 하믄 댐
		 * */
		System.out.println(set);
		System.out.println(set.size());
		
		/*
		 * Iterator
		 * - 컬렉션에 저장된 요소 접근하는데 사용하는 인터페이스;
		 * - iterator()를 호출해서 Iterator를 구현한 객체 얻어서 사용함
		 * 
		 * 
		 * */
		Iterator<Person> iter = set.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
			// iter.next() <- 다음 요소의 주소값 반환해주는듯?
		}
		
		
		
		
	}
	
	
	
	
	
	
}


