package com.yedam.classes;

public class HighStudent extends Student {
	private String teacher;
//	//생성자
//	pulic HighStudent() {
//		super();
//		
//	}

	public HighStudent(String sno, String name) {
		super(sno,name); // super > 부모 클래스의 생성자를 호출해서 하위 생성자를 만듦.
	}

	
	public HighStudent ( String sno, String name, int score,String teacher) {
		super(sno,name,score);
		this.teacher = teacher;
	}
	
	//게터 터
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	//부모클래스가 가지고 있는 메소드를 재정의 (overriding)
	public void showInfo() {
		//자식클래스 : teacher 추가 출력.
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d, 선생님은 %s", this.getSno() ,getSname() ,getScore(), teacher); // super 부모클래스를 호출 
	}					// get 메소드를 통해서 불러와야함. 
}