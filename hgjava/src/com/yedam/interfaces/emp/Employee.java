package com.yedam.interfaces.emp;

public class Employee {
	private int EmployeeId; // 사번. 프라이빗으로 정수 필드 선언.
	private String name; // 이름
	private int departmentId; // 부서번호(10:인사 20:개발 30:영업
	private String departmentName; // 부서명
	private int salary; // 급여

	// 생성자
	public Employee() { // 기본생성자.

	}
	
	public Employee(int EmployeeId, String name) {
		this(EmployeeId, name, 100);
	}

	public Employee(int EmployeeId, String name, int salary, int departmentId) {
		this.EmployeeId = EmployeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		if (departmentId == 10) {
			departmentName = "인사";
		} else if (departmentId == 20) {
			departmentName = "개발";
		} else {
			departmentName = "영업";
		}
	}

	public Employee(int EmployeeId, String name, int salary) {
		this(EmployeeId, name, salary, 30);
	}

	//===================   getter , setter  =========================
	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
