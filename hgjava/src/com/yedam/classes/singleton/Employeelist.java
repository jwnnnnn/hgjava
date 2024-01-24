package com.yedam.classes.singleton;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Employeelist {

	Scanner scn = new Scanner(System.in);

	// 싱글턴. =========

	private static Employeelist instance = // 필드
			new Employeelist();

	private Employeelist() {
	} // 외부에서 접근하지 못하도록 프라이빗 생성자 생성.

	public static Employeelist getInstance() {
		return instance; // > 메소드.
	}
	
	Employee[] list = null; // 사원을 담아놓기 위한 Employee 배열의 리스트 생성.
	int empNum; // 현재의 사원인원수. 호출 할 떄마다 empNum의 값을 증가하도록.
	
	// 추가기능... =========

	// 사원수 입력 초기화.
	public void init() {
		System.out.println("사원수>>");
		int num = scn.nextInt(); // 1.사원수 선언
		list = new Employee[num]; // 2.리스트 배열의 크기 선언.
		empNum = 0;
	} // 사원수를 입력 받으면 리스트 배열의 크기를 선언. ,

	// 사원정보가 들어오면 입력 => 배열추가.

	public void input() { // void 리턴값이 없다는 것임.
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
//	public Employee[] list() {
//		return instance;
//	}
	
	
	// 사번에 해당하는 이름 출력.
	public String search(int empId) { // 해당사번이 있으면 이름 반환. 없으면 "" << 공백으로 반환하도록.
		for (int i = 0; i < empNum; i++) {
			if (list[i].getEmployeeId() == empId) {
				return list[i].getName();
			}
		}
		return null;

	}

	public void print() {
		for (int i = 0; i < empNum; i++) {
			System.out.printf("사원번호 : %d \t 사원이름 : %s \t 급여 : %d", list[i].getEmployeeId(), list[i].getName(),
					list[i].getSalary());
		}

	}
	
	public int sum() {
		int total = 0;
		for (int i = 0; i <empNum; i++) {
			total += list[i].getSalary();
		}
		return total;
	}
}
