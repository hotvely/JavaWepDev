package com.kh.array.practice1;
import java.util.Arrays;

import com.kh.array.practice1.model.*;

/*
 * 객체배열
 * 
 * */


public class Application {

	public static void main(String[] args) {
		
		Student stuArr[] = new Student[5];
		
		stuArr[0] = new Student("김길동", "자바", 100);
		stuArr[1] = new Student("박길동", "디비", 90);
		stuArr[2] = new Student("이길동", "화면", 95);
		stuArr[3] = new Student("정길동", "서버", 85);
		stuArr[4] = new Student("홍길동", "디비", 20);
		
		for(Student s : stuArr)
		{
			System.out.println(s);
		}
		
	}

}
