package com.yedam.operator;

import java.util.Scanner;

public class OperaterExe1 {
	public static void main(String[] args) {
	
		
		
		// 사용자 값을 입력: 정수입력.
		// 누적값은 ?? 입니다.
		
		Scanner scn = new Scanner(System.in);
		int result = 0;
		while(true) {
			System.out.println("정수를 입력하세요");
			String input = scn.nextLine();
			if(input.equals("quit")) {
				break;
			}
			try {				// !!	
				result += Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println(" 잘못된 값");
			}
//			result += Integer.parseInt(input);
		}
	
		System.out.printf("누적값은 %d 입니다. \n", result);
		System.out.println("end of prog");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void method1() {
		
		int sum =  (1 + 2) * 3 ;
		sum += 5; 	//sum += 원래 있던 sum에 5를 더하고 누적시켜 출력
		System.out.println(sum);
		
		String str = "";
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력하세요>>>.");  		//조건이 되면 반복.
			String input = scn.nextLine();
			if(input.equals("quit")) {
				break;
			}
			str += input + " ";
		}
		System.out.printf("누적내용: %s", str +"\n");
	}
}

 