package com.kh.example.practice5.controller;

import com.kh.example.practice5.model.Employee;

public class EmployeeController 
{
	private Employee employee;
	
	public EmployeeController(Employee employee)
	{
		if(employee == null)
			employee = new Employee();
	}
	
	public void add(int empNo,String name,
					char gender, String phone) 
	{
		this.employee.setEmpNo(empNo);
		this.employee.setName(name);
		this.employee.setGender(gender);
		this.employee.setPhone(phone);
	}

	public void add(int empNo,String name,char gender,
					String phone,String dept,
					int salary,double bonus) 
	{
		this.employee.setEmpNo(empNo);
		this.employee.setName(name);
		this.employee.setGender(gender);
		this.employee.setPhone(phone);
		this.employee.setDept(dept);
		this.employee.setSalary(salary);
		this.employee.setBonus(bonus);		
	}
	
	public void modify(String phone)
	{
		this.employee.setPhone(phone);
	}
	public void modify(int salary)
	{
		this.employee.setSalary(salary);		
	}

	public void modify(double bonus)
	{
		this.employee.setBonus(bonus);
	}
	
	public Employee info()
	{
		
		return this.employee;
	}

}