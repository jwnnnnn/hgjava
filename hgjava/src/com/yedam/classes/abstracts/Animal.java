package com.yedam.classes.abstracts;

//추상 클래스
public abstract class Animal {
	private String name;

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}

	public void eat() { //부모 , 자식
		System.out.println("[Animal] 음식을 먹습니다.");
	}

	public abstract void sleep(); // 부모는 기능이 없음 .// 추상메소드 실체가 없음. 구현부분이 없음 . 중괄호가 없음. // 자식클래스에서 반드시 재 정의 해야함 .. overridding.

}