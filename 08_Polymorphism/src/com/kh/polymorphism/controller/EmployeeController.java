package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.parent.Employee;
import com.kh.polymorphism.model.child.*;

public class EmployeeController 
{
	// 객체 배열 이름을 매개변수로 받아 일치하는 사람 반환
	public Employee findEmployeeByName(Employee[] ea, String name)
	{
		for(Employee elem : ea)
		{
			if(elem.getName().equals(name))
			{
				return elem;
			}
		}
		return null;
	}
	
	// 연봉계산 , 엔지니어의 경우 보너스 존재함
	public int getAnnualSalary(Employee e)
	{
		int result = e.getSalary() * 12;
		if(e instanceof Engineer)
		{
			result += ((Engineer)e).getBonus();
		}
		return result;
	}
	
	// 전체 연봉 총 합계
	public int getTotalCoast(Employee[] ea)
	{
		int total = 0;
		for(Employee elem : ea)
		{
			total += getAnnualSalary(elem);
		}
		return total;
	}
}
