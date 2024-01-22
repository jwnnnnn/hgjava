package com.yedam.classes;

// 실행 클래스.
public class StudentExe {
	public static void main(String[] args) {
		Student s1 = new Student("S001","홍길동",80,178.9);//인스턴스 생성. 생성자 호출
		System.out.println(s1.getSname());
		System.out.println(s1.getSno());
		System.out.println(s1.getScore());
		System.out.println(s1.getHeight());
		s1.setHeight(-167);
		s1.showInfo();
		
		Student s2 = new Student("S002", "김길동");
		s2.setScore(85);
		s2.showInfo();
		
		Student s3 = new Student("S003", "박길동", 90);
		s3.showInfo();
	}
}
