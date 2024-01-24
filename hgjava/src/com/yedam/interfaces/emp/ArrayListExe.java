package com.yedam.interfaces.emp;

import java.util.ArrayList;

public class ArrayListExe {
	public static void main(String[] args) {
		//배열
		Employee[] employeeAry = new Employee[10]; //임플로이 배열에 EmployeeAry을 할당
		employeeAry[0] = new Employee(101,"홍길동"); //일일이 [] 위치에 추가시켜야함
		employeeAry[1] = new Employee(102,"김민석"); //[] 위치값을 다르게해서 할당해야함.
		Employee emp = new Employee(103,"황인만");
		employeeAry[2] = emp;
		employeeAry[2] = null; // [2] 위치에 있는 값을 삭제.
		
		for(int i = 0; i < employeeAry.length; i++) {
			if(employeeAry[i] != null) {
				System.out.println(employeeAry[i].getName());
			}
		}
		
		System.out.println("-------------------------------- 위 배열 ... 밑 컬렉션===");
		
		//컬렉션
		ArrayList<Employee> employeeAryList = new ArrayList<Employee>(); 
		employeeAryList.add(new Employee(101, "최홍길")); // 위치를 지정안해도 순차적으로 할당.
		employeeAryList.add(new Employee(105, "이만기")); // 컬렉션은 그냥 똑같이 add 쓰면됨
		employeeAryList.add(emp);
		employeeAryList.remove(0); // 삭제.
		for (int i = 0 ; i < employeeAryList.size(); i++) {
			System.out.println(employeeAryList.get(i).getName());
		}
		// () << 생성자 호출. //초기값을 10개로 정해놔서 꽉차면 자동으로 늘려줌
	}
}
