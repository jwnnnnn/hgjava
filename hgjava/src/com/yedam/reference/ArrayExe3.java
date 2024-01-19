package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe3 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

//		System.out.println("친구 입력>>>");
//		String name = scn.nextLine();
//		String[] friends = {"홍길동", "김민수", "박선민", "최홍만", "김길동"};
//		// 김민수는 2번째에 있습니다.
//		for (int i = 0; i < friends.length; i++){
//			if (friends[i].equals(name)) {
//				System.out.printf("%s는 %d번쨰에 있습니다" , name , (i + 1) );
//				break;
//			}else {
//				System.out.printf("%s는 없습니다." , name);
//				break;
//			}
//		}
//	}

		boolean isExist = false;
//		System.out.println("\need of prog");

		System.out.println("친구 입력>>>");
		String name1 = scn.nextLine();
		String[] friends1 = { "홍길동", "김민수", "박선민", "최홍만", "김길동" };
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4 };
		int[] score = new int[5]; // new int[] > 방갯수
		score[0] = 67;
		score[1] = 91;
		score[2] = 40;
		score[3] = 50;
		score[4] = 70;
		// 김민수는 2번째에 있습니다.
		for (int i = 0; i < friends1.length; i++) { // 반복문. friends1 의 길이만큼 반복
			if (friends1[i].equals(name1)) { // friends[i] > i는 값. 프렌즈 i의 값이 입력한 name 과 같다면 실행.
				System.out.printf("%s는 %d번쨰에 있습니다 점수는 %d", name1, (i + 1), score[i]); // i + 1은 방번호. +1은 1번부터 출력하기 위해서.
				isExist = true;
			}
		}

		if (!isExist) {
			System.out.println("그런사람은 없습니다");
		}

		System.out.println("\need of prog");

		// 최고점수를 계산하기 위한 변수.
		int max1 = 0;
		String name = "";
		double weight = 0;
		for (int i = 0; i < score.length; i++) {
			if (max1 < score[i]) {
				name = friends1[i];
				weight = dblAry[i];
				max1 = score[i];
			}
//			
		}
	}

	public static void method1() {
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4 };
		String[] friends = { "홍길동", "김민수", "박선민", "최홍만", "김길동"};
		
		
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < dblAry.length; i++) {
			sum += dblAry[i];
		}
		avg = sum / dblAry.length;
		
		System.out.printf("친구의 평균 몸무게는 %.1f 입니다.", avg);
		System.out.println("\need of prog");
	
		
	}
	

////		배열의 값 중에서 제일 큰값을 출력.
//		double max = 0;
//		for (int i = 0; i < dblAry.length; i++) {			
//			max += dblAry[i];
//			if (max > dblAry[i]) {
//				max = dblAry[i];
//			}
//		}
//		System.out.println(max);
//
//	}
}
