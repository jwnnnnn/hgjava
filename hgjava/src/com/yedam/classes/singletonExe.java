package com.yedam.classes;

public class singletonExe {
	public static void main(String[] args) {
		singleton s1 = singleton.getInstance();   //new singleton(); // << 싱글턴 프라이빗 타입은 안됨
		singleton s2 = singleton.getInstance();   //인스턴스를 공용으로 쓰겠다는 의미.
		
		System.out.println(s1 == s2); //인스턴스의 주소값이 같음.
	}
}
