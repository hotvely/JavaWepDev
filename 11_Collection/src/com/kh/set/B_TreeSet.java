package com.kh.set;

import java.util.*;
import com.kh.set.model.*;

/*
 *  TreeSet
 *  - 저장과 동시에 자동 오름차순 정렬 
 *  - HashSet보다 데이터의 추가, 삭제에 시간 더 걸림;
 *  
 * 
 * */
public class B_TreeSet 
{

	public static void main(String[] args)
	{
		B_TreeSet b = new B_TreeSet();
		b.method2();
		
	}

	
	public void method1()
	{
		Set<String> set = new TreeSet<>();
		set.add("멍멍이");
		set.add("고양이");
		set.add("반달곰");
		set.add("너구리");
		set.add("용가리");
		set.add("멍멍이");
		set.add("꼬꼬댁");
		set.add("호랭이");
		
		System.out.println(set);
	}
	
	public void method2()
	{
		Set<Person> set = new TreeSet<>();
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		
		System.out.println(set);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
