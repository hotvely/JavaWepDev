package com.kh.polymorphism;

import com.kh.polymorphism.controller.EmployeeController;
import com.kh.polymorphism.model.child.*;
import com.kh.polymorphism.model.parent.*;

public class Application {

	/*
	 * 다형성(Polymorphism)
	 * 
	 * - 하나의 객체변수가 여러가지 모양과 모습을 가지는 능력 - 부모 타입으로 자식객체를 생성하는 것
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Employee e1 = new Employee("이수근", 12000);
		Employee m1 = new Manager("강호동", 23000, "체육부");
		Employee eg1 = new Engineer("김영철", 56000,"Java",1000);
		Employee s1 = new Secretary("서장훈", 34000, "은행");
		
		System.out.println(e1);
		
		Employee e2 = new Manager("강호동", 23000, "체육부");
		Employee e3 = new Engineer("김영철", 56000,"Java",200);
		Employee e4 = new Secretary("서장훈", 34000, "강호동");
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		
		System.out.println("----------------------------------------------------------------");
		
		
		// 다형성 + 객체배열
		Employee empArr[] = {e1,e2,e3,e4};
		
		for(Employee emp : empArr)
		{
			System.out.println(emp);
		}
		
		
		System.out.println("----------------------------------------------------------------");
		//이름으로 사람찾기
		EmployeeController ec = new EmployeeController();

		Employee find = ec.findEmployeeByName(empArr, "김영철");
		System.out.println(find);
		
		System.out.printf("%s의 연봉 : %d\n", find.getName(), ec.getAnnualSalary(find));

		System.out.printf("전체 사람들의 연봉 총합? > %d\n", ec.getTotalCoast(empArr));
		
		
	}

}
