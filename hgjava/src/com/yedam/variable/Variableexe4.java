package com.yedam.variable;

public class Variableexe4 {
	public static void main(String[] args) {
		
		// true /false >> boolean
		boolean isTrue = 10 > 20;
		// boolean > type . isTrue > 변수. = ?
		isTrue = update(10);

		if (isTrue) {
			System.out.println("참값");
		} else {
			System.out.println("거짓값");
		}
		// 키워드 Member 입력 m1 > 변수
		Member m1 = new Member(); // new 라는 키워드로 해당되는 Member() 데이터타입 호출 .
		m1.name = "홍길동";
		m1.age = 20;
		m1.height = 167.8;

		Member m2 = new Member(); // Member => 타입 | m2 => 변수 =| new Member(); > 비어있는 초깃값
		m2.name = "김민수";
		m2.age = 20;
		m2.height = 172.5;

		isTrue = m1.height > m2.height;
		isTrue = m1.age == m2.age;
		isTrue = m1 == m2;

		System.out.println(m1);
		System.out.println(m2);
		
		byte a= 10;
		int b = (int) a ; // 강제 형 변환   작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입 >> 잘 안씀.
	} // end of main

	// static > 메소드 사용할 준비 | 없으면 new 로 메소드 하나 만들어서 사용
	public static boolean update(int arg) {
		return arg % 2 == 0; // f / t
	} // end of update

} // end of class
