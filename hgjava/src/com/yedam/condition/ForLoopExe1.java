package com.yedam.condition;

public class ForLoopExe1 {
	public static void main(String[] args) {
		//
//		for(int i = 1 ; i <= 10; i++) { //i+=2 i값이 2씩증가
//			System.out.println(i); //i는 블록 안에서만 활동
//			if( i > 5) {
////				System.out.println(i);
//				break;
//			}
//			System.out.println(i);
//		}
		
//		System.out.println(i); //i 는 블록 밖에서는 에러
		
		
		// 1 ~ 10까지의 합을 계산
		
		int sum = 0 ;
		for (int i = 0; i<=10; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
			sum += i;
			}
			
		
		}
		System.out.printf("누적값은 %d\n", sum);
		
		
		// 1 ~ 31
		System.out.printf("%3s", "");
		for (int i = 1; i <= 31; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
		
		
	}
}
