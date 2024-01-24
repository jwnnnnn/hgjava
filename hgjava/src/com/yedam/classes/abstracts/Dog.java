package com.yedam.classes.abstracts;

public class Dog  extends Animal{
	
	
	@Override
	public void sleep() { //sleep 이라는 선언만 있음 . 자식만.
		System.out.println("[Dog]가 잠을 잡니다.");
	}
}
