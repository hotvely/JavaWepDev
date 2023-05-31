package com.kh.example.practice5;

import java.util.Scanner;

import com.kh.example.practice5.controller.EmployeeController;
import com.kh.example.practice5.model.Employee;

public class Application {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		Employee viewEmployee = new Employee();		
		// Employee 객체 받는 이유 : 나중에 DB에서 데이터를 받아 와서 controller로 넘겨주는 과정을 
		//						 임시로 Employee객체 생성해서 넘겨주는 느낌으로.
		
		EmployeeController employeeController = new EmployeeController(viewEmployee);
		Application application = new Application();
		
		while(true)
		{
			int menuIdx = application.employeeMenu();
			switch(menuIdx)
			{
			case 1:	//사원 정보 추가
				application.insertEmp(employeeController);
				break;
			
			case 2:	//사원 정보 수정
				application.updateEmp(employeeController);
				break;
			
			case 3:	//사원 정보 출력
				application.printEmp(employeeController);
				break;
			
			case 9:	//프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("1,2,3,9번 메뉴만 선택 간웅");
				break;
			}
		}
		
	}

	public int employeeMenu() 
	{

			System.out.print("1.사원 정보 추가\n2.사원 정보 수정\n3.사원 정보 출력\n9.프로그램 종료");
			System.out.print("메뉴 번호 > ");
			int menuNum = Integer.parseInt(sc.nextLine());
	
		return menuNum;
	}
	
	public void insertEmp(EmployeeController employeeController) 
	{
		System.out.print("사원 번호 > ");
		int empNo = Integer.parseInt(sc.nextLine());

		System.out.print("사원 이름 > ");
		String name = sc.nextLine();
		
		System.out.print("사원 성별 > ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("전화 번호 > ");
		String phone = sc.nextLine();
		
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) > ");
		char addInfo = sc.nextLine().charAt(0);
		
		if(addInfo == 'y' || addInfo == 'Y')
		{
			System.out.print("사원 부서 > ");
			String dept = sc.nextLine();

			System.out.print("사원 연봉 > ");
			int salary = Integer.parseInt(sc.nextLine());
			
			System.out.print("보너스 율 > ");
			double bonus = Double.parseDouble(sc.nextLine());
			employeeController.add(empNo, name, gender, phone, dept, salary, bonus);
		}	
		else
			employeeController.add(empNo, name, gender, phone);
		
	}
	
	public void updateEmp(EmployeeController employeeController) 
	{
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.print("1.전화 번호\n2.사원 연봉\n3.보너스 율\n9.돌아가기\n");
		System.out.print("메뉴 번호를 누르세요 > ");
		int idx = Integer.parseInt(sc.nextLine());
		
		switch(idx)
		{
		case 1:
			System.out.print("전화 번호 입력 > ");
			employeeController.modify(sc.nextLine());;
			break;
		case 2:
			System.out.print("사원 연봉 입력 > ");
			employeeController.modify(Integer.parseInt(sc.nextLine()));
			break;
		case 3:
			System.out.print("보너스 율 입력 > ");
			employeeController.modify(Double.parseDouble(sc.nextLine()));
			break;			
		case 9:
			System.out.println("기존 메뉴로 돌아갑니다.");
			return;
		default:
			System.out.println("1,2,3,9번중 하나만 입력하세요");
			break;	
		}
		
		
	
	}
	
	public void printEmp(EmployeeController employeeController) 
	{
		System.out.println(employeeController.info());
	}
}
