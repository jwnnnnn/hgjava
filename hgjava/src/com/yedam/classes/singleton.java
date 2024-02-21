package com.yedam.classes;


//전체프로그램에서 인스턴스를 하나만 생성.
public class singleton {
	// 1. 생성자 private 선언.
	// 2. Singleton 타입의 필드 선언.
	// 3. 인스턴스를 반환하도록 getInstance() 제공.
	
	
	private  singleton() { //반환 값 없음.
		
	}
	private static singleton instance = new singleton(); // 클래스의 초깃값은 null  , 필드선언.
	
	public static singleton getInstance() {
		return instance; // 겟 인스턴스에 인스턴스를 반환.
		
		
	}
	
}
//e