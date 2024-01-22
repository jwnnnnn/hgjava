package com.yedam.classes.friend;

public class Friend {
	
	//필드
	private String fno;
	private String name;
	private String tel;
	private int age;
	
	//생성자
	public Friend(String fno, String name, String tel, int age) {
		super();
		this.fno = fno;
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	public Friend() {}
	
	
	//메소드
	void showInfo() {
		System.out.printf("이름 : %s, 전화번호 : %s, 나이 : %d\n", this.name, this.tel, this.age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFno() {
		return fno;
	}
	public void setFno(String fno) {
		this.fno = fno;
	}
	
	
}
