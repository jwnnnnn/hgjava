package com.yedam.interfaces.emp;

import java.util.Scanner;

//배열 [] :   Employee[]
public class EmployeeArray implements EmployeeList {
	// 싱글턴.
	
	// ====================================================
	Employee[] list;
	Scanner scn = new Scanner(System.in);
	private static EmployeeArray instance = new EmployeeArray(); // 객체의 초깃값은 null

	private EmployeeArray() {} //생성자

	int empNum; // 컬렉션에는 필요없음.

	public static EmployeeArray getInstance() { //메소드
		return instance;
	}
	// ==================================================== app 인스탠스의 메소드.
	@Override
	public void init() {
		System.out.print("사원수>>");
		int num = scn.nextInt(); // 1.사원수 선언
		list = new Employee[num]; // 2.리스트 배열의 크기 선언.
		empNum = 0;
	}

	@Override
	public void input() {
		if (empNum == list.length) {
			System.out.println("입력초과");
			return;
		}
		System.out.printf("%d 사번", empNum);
		int no = scn.nextInt();

		System.out.println("이름>");
		String name = scn.next();

		System.out.println("급여 >");
		int sal = scn.nextInt();

		list[empNum++] = new Employee(no, name, sal);
		// 호출 할때마다 즐가 , 처리를 다한 다음 증가시킴.

	}

	@Override
	public String search(int empId) {
		for (int i = 0; i < empNum; i++) {
			if (list[i].getEmployeeId() == empId) {
				return list[i].getName();
			}
		}
		return null;

	}

	@Override
	public void print() {
		for (int i = 0; i < empNum; i++) {
			System.out.printf("사원번호 : %d \t 사원이름 : %s \t 급여 : %d\n\n", list[i].getEmployeeId(), list[i].getName(),
					list[i].getSalary());
		}

	}

	@Override
	public int sum() {
		int total = 0;
		for (int i = 0; i < empNum; i++) {
			total += list[i].getSalary();
		}
		return total;

	}
	// =======================================================
}
