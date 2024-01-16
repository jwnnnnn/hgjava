package com.yedam.variable;

public class Variableexe1 {
	public void sum() {
		int n2;
	}
	public static void main(String[] args) {
		// let n = '10';
		
		int n1 = 100; // int(기본데이터타입) 값이 담겨져 있는 주소값.  > wrapper클래스 : integer.
		n1 = -2147483648;
		System.out.println(Integer.MAX_VALUE);
		
		
		long n2 = 2147483647L;//long > 무한정 큰 값을 담고 싶을 때
		n2 = -2147483647L; 
		
		double n3 = Math.random(); // 0포함 ~ 1제외 임의의 실수. double > 반환되는 타입
		
		int n4 = (int) (Math.random() * 10); // 0 ~ 10 임의 실수  / int n4 에 변수 할당 /double > 소수
		String str = "홍길동"; // String > 첫글자 대문자 : 클래스라는 의미 . 참조값
		
		// int n2  < 처럼 위에 선언한 변수를 두번 선언 불가. | 선언 되어져 있는 블록안에서만 불러옴 . 다른 퍼블릭에선 각자 다름

		// byte = -128 ~ 127;
		short s1 = 32767;
		short s3 = (short) (s1 - 30); // 원래는 되는데 자바에서는 int // 왼쪽항 = 오른쪽항 : 항상 타입이 동일해야함.
		
		double d1 =  (double) 40; // < 왼쪽 오른쪽 타입 맞추기.
		
		
 	}
}
