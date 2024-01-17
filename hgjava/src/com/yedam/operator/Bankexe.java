package com.yedam.operator;

import java.util.Scanner;

// 은행계좌. 더하거나 빼거나 최대금액 10만원 . 10만원 초과 입금 x
public class Bankexe {
	public static void main(String[] args) {
		//(sum > 90) ? "a" : "b" ; 삼항 연산자
		// 입금, 출금, 잔고, 종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
//		 case 1  < 단순히 값이 들어와야됨
		while (run) {
			System.out.println("1.입금, 2.출금, 3.잔고, 4.종료.");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				System.out.println("입금액>> ");
				int in = Integer.parseInt(scn.nextLine());
				
				if ((balance + in ) < 100000) {
					balance += in;
					System.out.println(balance);
					System.out.println("저장성공");
				} else {
					System.out.println("입금x");
				}

				break;
			case 2:
				System.out.println("남은 금액은" + balance + "입니다");
				System.out.println("출금액>>");
				int out = Integer.parseInt(scn.nextLine());
				
				if((balance - out) >= 0) {
				balance -= out;
				System.out.println(balance);
				System.out.println("출금성공");}
				else {
					System.out.println("출금x");
				}
				break;
			case 3:
				System.out.println("잔고>>");
				System.out.println(balance);
				break;
			case 4:
//				System.out.println("종료");
				run = false;
//					

			}
		}
		System.out.println("end of prog.");
	}
}
