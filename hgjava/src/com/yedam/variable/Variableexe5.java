package com.yedam.variable;

public class Variableexe5 {
	public static void main(String[] args) {
		
		double d1 = 10;
		double result = d1 + 20; // 20 은 정수인데 앞의 double 떄문에 (double) 이 내장되서 계산.
		
		// char 65536개 .  0 ~ 65536 유니코드 문자값
//		1) char는 Character의 약자
//		2) 단 하나의 문자만 저장
//		3) 2byte
//		4) char 타입의 리터럴은 작은 따옴표(' ')로 감싸서 표현
//		5) 컴퓨터 내부에 저장될 땐 정수로 치환 (아스키 코드)
		
		int sum = 60;
		result = (sum * 1.0 / 7); //소숫점까지 나옴. 
		System.out.println(result);
		
		sum = Integer.parseInt("1") + 3; //integer.parseInt("?") > 정수로 전환 // Double.parseDuble> 더블타입으로 // 영어는 정수로 못바꿈		
		System.out.println(sum);  
		
		
		for (int i = 0; i < 10; i++) {
		int temp = (int) (Math.random() * 25 ) +97;
		System.out.println((char)temp);
		}
	}
}
