package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList <Employee> 컬렉션 타입. // ArrayList<Employee>
public class EmployeeArrayList implements EmployeeList{

	
	// ===================================================
	
	ArrayList<Employee> list;
	Scanner scn = new Scanner(System.in);
	
	private static EmployeeArrayList instance = new EmployeeArrayList(); // 필드
	
	private EmployeeArrayList() {} //생성자
	
	public static EmployeeArrayList getInstance() { //메소드
		return instance;
	}
	
	// ===================================================
	
	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println("초기화 완료.");
	}

	@Override
	public void input() {
		System.out.printf("%d 사번", list.size());
		int no = scn.nextInt();

		System.out.println("이름>");
		String name = scn.next();

		System.out.println("급여 >");
		int sal = scn.nextInt();
		
		list.add(new Employee(no,name,sal));
	}

	@Override
	public String search(int empId) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEmployeeId() == empId) {
				return list.get(i).getName();
			}
		}
		return "";
	}

	@Override
	public void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("사원번호 : %d \\t 사원이름 : %s \\t 급여 : %d" ,
			list.get(i).getEmployeeId(), list.get(i).getName(),list.get(i).getSalary());
		}
	}

	@Override
	public int sum() {
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getSalary();
		}
		return total;
	}
	
	// ===================================================
}
