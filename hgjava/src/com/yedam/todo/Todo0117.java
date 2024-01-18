package com.yedam.todo;

import java.util.Scanner;

public class Todo0117 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
//		System.out.println("사람 수 입력");
//		int num = Integer.parseInt(scn.nextLine());
//		
//		
//		String[] phone;
//		String[] name;
//		
//		
//		
//		
//		
//		System.out.println("친구 이름을 입력하세요");
//		String name = scn.nextLine();
//		System.out.println("연락처를 입력하세요");
//		String phone = scn.nextLine();
//		
//		while() {
//			
//			
//			
//		}
		
		
		//친구 3명의 이름과 연락처를 입력하도록.. 메세지출력.
		//입력완료.
		
		//이름 : 홍길동
		//연락처: 010-1111-2222
		
//		=====================
		//이름 : 김길동
		//연락처: 010-1111-2222
				
//		=====================
		//이름 : 박길동
		//연락처: 010-1111-2222

//		=====================
	
		
		String[] strAry = new String[6];
		int idx = 0;
		for (int i = 1 ; i<=3; i++) {
			System.out.println("이름>>");
			strAry[idx++] = scn.nextLine();
			System.out.println("연락처>>");
			strAry[idx++] = scn.nextLine();
		}
		for (int i = 0; i < strAry.length; i++) { // 6번 반복. 
			if(i % 2 == 0) { //이름 출력
				System.out.println("이름" + strAry[i]);
			}else {
				System.out.println("연락처" + strAry[i]);
				System.out.println("=================");
			}
		}
	}
	
		

		
		
		
		
		
		

}
