package com.yedam.classes;

public class StudenExe {
	public static void main(String[] args) {
		HighStudent histd = new HighStudent("T001", "홍길동", 90, "김썜");

		System.out.println(histd.getSno());
		System.out.println(histd.getTeacher());
		histd.showInfo(); // 부모클래스의 멤버.

		System.out.println("\n-----------------------------------------------\n");

		// 부모클래스의 참조변수에 자식클래스의 인스턴스를 대입.
		Student std = (Student) new HighStudent("T002", "박길동", 80, "김썜"); // 자식 클래스의 인스턴스
		if (std instanceof HighStudent) {
			HighStudent hstd = (HighStudent) std;
			System.out.println(hstd.getTeacher()); // getTeacher 김쌤 호출.
		} //부모클래스는 자식클래스로 형변환 x   || 자식클래스는 부모클래스 + 자기자신 (자식클래스)로 강제형변환 가능.
		Student std1 = new Student("T003", "박석민", 80);
		if (std1 instanceof HighStudent) {
			HighStudent hstd1 = (HighStudent) std1;
			System.out.println(hstd1.getTeacher());
		}

		HighStudent hsdtd = (HighStudent) std; // 스튜던트 타입. 부모타입을 자식타입으로 변환하고 싶을 떄는 강제형변환을 해야함.
		System.out.println((HighStudent) std);
//		System.out.println((hstd.getTeacher());

//		System.out.println(std.getTeacher()); //부모 클래스를 선언했는데 자식클래스를 사용불가.

		Student[] students = new Student[10];
//		HighStudent[] hiStudents = new HighStudent[10];
		students[0] = new Student("S001", "김니석", 90);
		students[1] = histd; // highStudent 부모값으로 자동형변환 됨.
		std.showInfo();
		System.out.println("\n------------------------------------------\n");

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].showInfo();
			}
		}

		long ln1 = 10; // 큰 범위변수 = 작은 범위값. // 자동형변환

	}
}
