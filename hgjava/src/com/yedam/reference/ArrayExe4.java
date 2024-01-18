package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe4 {
	public static void main(String[] args) {

		Friend f1 = new Friend(); // 초기화. 프렌드 f1 의 초깃값 저장.
		f1.name = "홍길동"; // Friend f1으로 변수를 받고 f1 의 이름을 홍길동으로 저장.
		f1.weight = 67.8;
		f1.score = 80;

		Friend f2 = new Friend();
		f2.name = "홍길동";
		f2.weight = 75.8;
		f2.score = 86;

		Friend f3 = new Friend();
		f3.name = "김민석";
		f3.weight = 79.8;
		f3.score = 88;
		// 새로운 친구
//		String name = "김말숙";
//		double weight = 55.5;
//		int score =88;

		Friend f4 = new Friend();
		f4.name = "김말숙";
		f4.weight = 81.8;
		f4.score = 77;
		// 김말숙 = 88-> 90점으로 변경.

		Friend[] friends = { f1, f2, f3 };
		friends = new Friend[5]; // {null,null,null,null,null,} friends 를 초깃값. > null이 방 갯수만큼.
		friends[0] = f1; // friends 방번호 0에 f1의 요소 값을 저장.
		friends[1] = f2; // friends 방번호 1에 f2의 요소 값을 저장.
		friends[2] = f3; // friends 방번호 2에 f3의 요소 값을 저장.
		friends[3] = f4; // friends 방번호 3에 f4의 요소 값을 저장.

		// 이름 찾기
		Scanner scn = new Scanner(System.in);
		System.out.println("찾을 친구 >>>");
		String fname = scn.nextLine();
		System.out.println("변경점수입력");
		int fscore = Integer.parseInt(scn.nextLine());

		if (friends[i] != null && friends[i].name.equals("김말숙")) { // (if start) // friends의 i번 인덱스 값 중에 null 아닌 것을
		for (int i = 0; i < friends.length; i++) { // (for start)
																		// 실행 && >> 두개 중에
				// 하나라도 false면 실행 x
				// for문의 i번쨰 반복해서 김말숙이라는 사람을 찾고 그 해당하는 friends의 i 값. friends의 i 번째에 있는 점수를 90으로
				// .
				friends[i].score = fscore; // friends의 i 번째에 있는 점수를 90점으로
				
				System.out.printf(" 이름은 %s 몸무게는 %.1fkg 점수는 %d", friends[i].name, friends[i].weight, friends[i].score);
			} // (if end)
		} // (for end)
	
	}

	public static void mathod1() {
		Friend f1 = new Friend(); // 초기화. 프렌드 f1 의 초깃값 저장.
		f1.name = "홍길동"; // Friend f1으로 변수를 받고 f1 의 이름을 홍길동으로 저장.
		f1.weight = 67.8;
		f1.score = 80;

		Friend f2 = new Friend();
		f2.name = "홍길동";
		f2.weight = 75.8;
		f2.score = 86;

		Friend f3 = new Friend();
		f3.name = "김민석";
		f3.weight = 79.8;
		f3.score = 88;
		// 새로운 친구
//		String name = "김말숙";
//		double weight = 55.5;
//		int score =88;

		Friend f4 = new Friend();
		f4.name = "김말숙";
		f4.weight = 81.8;
		f4.score = 77;
		// 김말숙 = 88-> 90점으로 변경.

		Friend[] friends = { f1, f2, f3 };
		friends = new Friend[5]; // {null,null,null,null,null,} friends 를 초깃값. > null이 방 갯수만큼.
		friends[0] = f1; // friends 방번호 0에 f1의 요소 값을 저장.
		friends[1] = f2; // friends 방번호 1에 f2의 요소 값을 저장.
		friends[2] = f3; // friends 방번호 2에 f3의 요소 값을 저장.
		friends[3] = f4; // friends 방번호 3에 f4의 요소 값을 저장.

		// 이름 찾기
		Scanner scn = new Scanner(System.in);
		System.out.println("찾을 친구 >>>");
		String fname = scn.nextLine();
		System.out.println("변경점수입력");
		int fscore = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < friends.length; i++) { // (for start)
			if (friends[i] != null && friends[i].name.equals("김말숙")) { // (if start) // friends의 i번 인덱스 값 중에 null 아닌 것을
																		// 실행 && >> 두개 중에
				// 하나라도 false면 실행 x
				// for문의 i번쨰 반복해서 김말숙이라는 사람을 찾고 그 해당하는 friends의 i 값. friends의 i 번째에 있는 점수를 90으로
				// .
				friends[i].score = 90; // friends의 i 번째에 있는 점수를 90점으로
				friends[i].name = "구구구"; // friends의 i 번째에 있는 이름을 "구구구"으로
				System.out.printf(" 이름은 %s 몸무게는 %.1fkg 점수는 %d", friends[i].name, friends[i].weight, friends[i].score);
			} // (if end)
		} // (for end)

	}
}