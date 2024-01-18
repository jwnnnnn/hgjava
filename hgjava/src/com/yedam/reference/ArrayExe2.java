package com.yedam.reference;

public class ArrayExe2 {
	public static void main(String[] args) {
		int[] scores = new int[10];
		System.out.println(scores[0]);

		scores[2] = 40;

		scores = new int[5];
		scores[0] = 78;
		scores[1] = 82;
		scores[2] = 77;
		scores[3] = 91;
		scores[4] = 85;

		int sum = 0;
		// 80 점 이상인 학생은 3명 입니다.
		// 90 점 이상인 학생으 ? 명입니다.
		// 없으면 이상학생은 없습니다.
		for (int i = 0; i < scores.length; i++) { // scores 의 크기만큼 반복.
			// System.out.println("scores[" + i + "} => " +scores[i]);
			if (scores[i] >= 80) {
//			System.out.println("인덱스: " + i);
				sum++;
			}
		}
		System.out.println("80점 넘는 학생 수는" + sum);
		System.out.println("end of prog");

		int sum1 = 0;

		for (int i = 0; i < scores.length; i++) {

			if (scores[i] >= 90) {
				sum1++;
			}
		}
		if (sum1 > 0) {
			System.out.println("90점 넘는 학생은 " + sum1 + "명 입니다.");

		} 
		else {
			System.out.println("없습니다");

		}

	}
}
