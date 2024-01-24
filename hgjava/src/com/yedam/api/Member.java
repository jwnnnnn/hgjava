package com.yedam.api;

public class Member extends Object {
	String name;
	int age;

	Member() {
	} // 멤버의 기본생성자

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	} // 멤버의 메소드

	// name 만 같으면 논리적으로 동일한 객체,,,,,

	public int hashCode() {
		return this.name.hashCode(); // name 의 스트링 타입을 가지고와서 그대로 씀. 문자형식 반환.
	}

	@Override
	public boolean equals(Object obj) {
		Member target = (Member) obj;
		{
			if (this.name.equals(target.name) && this.age == target.age) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "이름은 " + name + ", 나이는 " + age;
	}

}
