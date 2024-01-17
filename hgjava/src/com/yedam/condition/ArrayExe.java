package com.yedam.condition;

public class ArrayExe {
	public static void main(String[] args) {
		//
//		intAry[2] = 40;
//		System.out.println(intAry);
//		
//		
//		intAry[1] = 100;
//		System.out.println(intAry[1] + ", 크기:" + intAry.length);
//		
//		문자열 배열
		String[] strAry = { "hong",  "park", "kim" };  // 문자열 배열 . 정수가 들어오면 안됨. "" 안에 넣어야함. 
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		//

		
		int[] intAry;  // int[] 정수를 담을 수 있는 배열
		
//		intAry = new int[] { 10 , 20 , 30 , 40 , 50} ;  //새로운 정수 배열 만들기 ? =new int[] { ? ? ? ? ?}
		
		
		intAry = new int[10]; // 자릿수 10개를 만드는 초깃값이라 안에 리스트는 0이 10개임 //intAry의 방갯수 생성
//		for (int i = 0; i < 10; i++) {
//			System.out.println(intAry[i]);
//		}
		
		
		//배열의 값을 저장
		for (int i = 0; i < 10; i++) { 
			intAry[i] = (int) (Math.random() * 10);
		}

		
		//		// 2, 3의 배수의 값을 int sum2, sum3에 저장.
		int sum2, sum3;
		sum2 = sum3 = 0;
		
		
		
		for (int i = 0; i < 10; i++) {
//			intAry[i] = (int) (Math.random() * 10);
			System.out.println(intAry[i]);
			if(intAry[i] % 2 == 0) {
				sum2 += intAry[i];
			}
			else if (intAry[i] % 3 == 0) {
				sum3 += intAry[i];
			}
		
		}
		System.out.println(sum2 + sum3);
		
		
		
	}
}
