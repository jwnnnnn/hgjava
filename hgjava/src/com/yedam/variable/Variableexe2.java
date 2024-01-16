package com.yedam.variable;

import java.util.Scanner;

public class Variableexe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // Scanner 입포트 // new 로 객체생성
//		System.out.println("나이를 입력>>> ");
//		int result = scn.nextInt(); // 입력값을 문자열로 반환. //nextInt() > 정수값 //string 문자열로
//		System.out.println("당신의 이름은 " + result + "입니다.");

		System.out.println("이름 입력");
		String myname = scn.nextLine();

		System.out.println("폰 번호 입력");
		String phone = scn.nextLine();

		System.out.println("영어 입력");
		int eng = scn.nextInt();

		System.out.println("수학 입력");
		int mat = scn.nextInt();

		System.out.println("점수 입력");
		int sum = eng + mat;

		System.out.println("이름: " + myname + ", " + "연락처: " + phone);
		System.out.println("영어: " + mat + ", " + "수학: " + eng + ", " + "합계 " + sum + ".");
		// \n 한줄 띄우기
		// scn.close(); Object의 사용 중지를 알리는 역할

	}
}
