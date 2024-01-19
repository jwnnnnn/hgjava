package com.yedam.todo;

import java.util.Scanner;

import com.yedam.reference.Friend;

public class Todo0118 {
	public static void main(String[] args) {
		boolean run = true;
		
		String tel;
		int age;
		Scanner scn = new Scanner(System.in);
		Friend[] friends = new Friend[5];
		while (run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.점수조회 6.분석 9.종료"); // 점수조회 : 점수가 큰 사람만 조회 // 분석: 평균점수: 85, 최고점수: 출력
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				System.out.print("이름 >>>");
				String name = scn.nextLine(); // 이름이 name에 담겨짐
				System.out.print("몸무게 >>>");
				Double weight = Double.parseDouble(scn.nextLine()); // 몸무게가 weight 에 담겨짐
				System.out.print("점수 >>>");
				int score = Integer.parseInt(scn.nextLine()); // 점수가 score 에 담겨짐

				Friend friend = new Friend();
				friend.name = name;
				friend.weight = weight;
				friend.score = score;
				// 비어있는 위치 한건입력 종료.
				for (int i = 0; i < friends.length; i++) { // friends.length 배열의 크기만큼 반복
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
				System.out.println("정상적 입력");
				break;
			case 2: // 조회
				// 전체모록.. 이름 : 홍길동 . 몸무게 77.3;;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.printf("이름 : %s  점수: %d  몸무게%.1f\n", friends[i].name, friends[i].score,
								friends[i].weight);
					}
				}
				break;
			case 3:
				boolean isExist = false;
				weight = (double) 0;
				score = 0;
				System.out.print("조회할 이름>>>");
				name = scn.nextLine();
				System.out.print("바꾸실 점수를 말씀하세요");
				String sscore = scn.nextLine();
				if (!sscore.equals("")) {
					score = Integer.parseInt(sscore);
				}
				// 존재여부 체크
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].name.equals(name)) {
						friends[i].score = (score != -1) ? score : friends[i].score; // 0 아 아니면 바꼈다는 의미. 안바뀌면 < : 바뀌면 >
//						friends[i].weight = (weight != 0) ? weight : friends[i].weight;
						isExist = true;
					}
				}
				if (!isExist) {
					System.out.println("찾는 이름이 없습니다");
					break;

				}
				System.out.println("수정완료");

				break;
			case 4:
				System.out.print("삭제할 이름");
				name = scn.nextLine();

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].name.equals(name)) {
						friends[i] = null;
						break; // 반복문 브레이크
					}
				}
				System.out.println("삭제완료");
				break; // case에 대한 브레이크
			case 5:
				// 점수조회 : 점수가 큰 사람만 조회
				int sum = 0;

				for (int i = 0; i < friends.length; i++) {
//					if (friends[i] != null) {
//						sum += friends[i].score;
//					}
					if (friends[i] != null && sum < friends[i].score) {
						sum = friends[i].score;
					}
				}
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].score == sum) {
						System.out.println(friends[i].name);
					}
				}

				System.out.print(sum);
				break;

			case 6:
				// 분석: 평균점수: 85, 최고점수: 출력
				int sum1 = 0;

				for (int i = 0; i < friends.length; i++) {
//					if (friends[i] != null) {
//						sum += friends[i].score;
//					}
					if (friends[i] != null && sum1 < friends[i].score) {
						sum1 = friends[i].score;
					}
				}
				for (int i = 0; i < friends.length; i++) {

					if (friends[i] != null && friends[i].score == sum1) {
						System.out.println(friends[i].name);
					}
				}
				int cnt = 0;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						cnt++;
					}
					double avg = sum1 / cnt;
					System.out.println(avg);
				}

				System.out.print(sum1);
				break;
			case 9: // 종료
				run = false;
				System.out.println("종료합니다");
				// (switch end)

				System.out.println("end of prog");

			}
		}
	}
}