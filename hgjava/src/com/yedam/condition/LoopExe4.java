package com.yedam.condition;

public class LoopExe4 {
	public static void main(String[] args) {

		// 별찍기
		for (int j = 10; j > 0; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			} // end
			System.out.println();
		}

	}

	public static void method1() {

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				int num = j;
				System.out.printf("%d * %d = %d \t", num, i, (i * num));
				if (num == 9) {
					System.out.println("줄바꿈");
				}
			}
		}

	}

	public static void method2() {

		// 끝.

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				int num = j;
				if (num < 5) {
					System.out.printf("%d * %d = %d \t", num, i, (i * num));
				} else if (num == 9) {
					System.out.printf("%d * %d = %d \t", num, i, (i * num));
//		  }else {
//			  System.out.println("");
				}
//		  System.out.printf("%d * %d = %d \t", num , i , (i*num));
				if (num == 9) {
					System.out.println();
				}
			}
		}
	}

}
