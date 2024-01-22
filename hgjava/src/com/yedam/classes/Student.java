package com.yedam.classes;


// 학생번호, 이름, 점수, 키
// 소개(학생번호, 이름, 점수)
public class Student {
	//필드 private 넣으면 외부 클래스에서 직접 값을 부여할 수 없음.
	private String sno; // 초기값 null // >sno >> 필드
	private String sname;
	private int score; // 초기값 0
	private double height; // 초기값 0.0
	private boolean onSchool;
	//생성자 : 없을 경우 기본생성자가 부여됨.new Friend()  반환값이 없음. 있으면 기본생성자도 없음.
	public Student(){
		
	}
	
	public boolean isOnSchool() { // 불린 타입이면 앞에 is를 꼭 붙여야함.. (규칙)
		return onSchool;
	}

	public void setOnSchool(boolean onSchool) {
		this.onSchool = onSchool;
	}

	public Student(String no, String name) {
		sno = no;
		sname = name;
	}
	public Student(String no, String name, int score) {
//		sno = no;
//		sname = name;
		this(no,name);
		this.score = score;//생성자의 변수가 우선값이라 변수명이 같다면 this. 사용하여 구분.
	}
	
	public Student(String sno, String sname, int score, double height) {
		this.sno = sno;
		this.sname = sname;
		this.score = score;
		this.height = height;
	}

	//메소드
	public void showInfo() { //디폴트 접근 제한..
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d점입니다.(키:%.1fcm)\n",this.sno,this.sname,this.score,height);//this는 안넣어도 this있는것으로 간주하긴 함.
	}
	String showInfoStr() {
		return "번호는 "+ this.sno;
	}
	public void setHeight(double height) {//void는 반환값 없음
		if(height < 0) {
			this.height = -height;			
		} else {
			this.height = height;
		}
	}
	public double getHeight() {//double타입을 반환
		return this.height;
	}
	public void setScore(int score) {
		this.score=score;
	}
	public int getScore() {
		return this.score;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSno() {
		return this.sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
