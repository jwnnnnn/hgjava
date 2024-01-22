package com.yedam;

import com.yedam.classes.Student;

public class StudentExe {
	public static void main(String[] args) {
		
		Student std = new Student("S001", "홍길동");
		std.setScore(80);
		
		std.showInfo(); // 접근수준 default.. => 다른 클래스나 패키지 public 접근제한으로 확대시켜줘야함. 
	}
}
