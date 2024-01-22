package com.yedam.classes;

// 학생의 정보를 관리하는 기능을 구현.
public class StudentApp {
	//필드
	private static Student[] students;//초기값은 null
	
	//생성자
	
		static {students = new Student[10];}
	
	//메소드.
	//등록
	public static boolean add(Student std) {
		for(int i = 0; i < students.length;i++) {
			if(students[i] == null) {
				students[i] = std;
				return true;
			}
		}
		return false;
//		System.out.println("입력성공");
	}
	//목록
	public static Student[] list() {
		return students;
	}
	//수정.(학생번호-점수)
	public static boolean modify(String sno, int score) {
		for(int i=0; i<students.length;i++) {
			if(students[i] !=null && students[i].getSno().equals(sno)) {
				students[i].setScore(score);
				return true;
			}
		}
		return false;
	}
	//삭제
	public static  boolean remove(String sno) {
		for(int i=0; i<students.length;i++) {
			if(students[i] !=null && students[i].getSno().equals(sno)) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}
	//단건조회
	public static Student get(String sno) {
		for(int i=0;i<students.length;i++) {
			if(students[i] !=null&&students[i].getSno().equals(sno)) {
				return students[i];
			}
		}
		return null;
	}
	
	public static boolean dupc(String sno) {
		for(int i=0; i<students.length;i++) {
			if(students[i]!=null && students[i].getSno().equals(sno)) {
				return true;
			}
		}return false;
	}
}