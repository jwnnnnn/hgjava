package Resutdy;

import java.util.Scanner;

import com.yedam.reference.Friend;

public class restudy0118 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		
		
		
		
	} // (main end)

	public static void method1() {

		Scanner scn = new Scanner(System.in);
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4 };
		String[] friends = { "홍길동", "김민수", "박선민", "최홍만", "김길동" };

		double avg = 0;
		double sum = 0;
		for (int i = 0; i < dblAry.length; i++) {
			sum += dblAry[i];
		}
		avg = sum / dblAry.length;

		System.out.printf("친구의 평균 몸무게는 %.1f 입니다.", avg);
		System.out.println("\nend of prog");
		// 친구 이름을 호출하고 점수 알기 ================== 끝

		System.out.println("친구 이름을 입력 >>");
		String name = scn.nextLine();

		for (int i = 0; i < friends.length; i++) { // (for start)
			if (name.equals(friends[i])) { // (if start)
				System.out.printf("이름 : %s 몸무게 : %.1f", friends[i], dblAry[i]);
			} // (if end)
		} // (for end)

		// 배열의 값중에 가장 큰 값 출력 ================= 끝

		double max = 0;
		for (int i = 0; i < dblAry.length; i++) {
			if (max < dblAry[i]) {
				max = dblAry[i];
			}
		}
		System.out.println(max);

		// 친구 이름을 호출하고 그 사람이 몇번쨰에 있는지 확인.
		System.out.println("친구 이름 >>");
		String name2 = scn.nextLine();
		
		for (int i = 0; i < friends.length; i++) {
			if (name2.equals(friends[i])) {
				// 이름 입력 , 점수 변경 =========================================== 끝
				Friend f1 = new Friend(); // 초기화. 프렌드 f1 의 초깃값 저장.
				f1.name = "홍길동"; // Friend f1으로 변수를 받고 f1 의 이름을 홍길동으로 저장.
				f1.weight = 67.8;
				f1.score = 80;
				
				Friend f2 = new Friend();
				f2.name = "박길동";
				f2.weight = 75.8;
				f2.score = 86;
				
				Friend f3 = new Friend();
				f3.name = "김민석";
				f3.weight = 79.8;
				f3.score = 88;
				
				Friend f4 = new Friend();
				f4.name = "김말숙";
				f4.weight = 81.8;
				f4.score = 77;
				// 김말숙 = 88-> 90점으로 변경.
				
				Friend[] friends = { f1, f2, f3 };
				friends = new Friend[5];
				friends[0] = f1;
				friends[1] = f2;
				friends[2] = f3;
				friends[3] = f4;
				
				// 이름을 입력하고 점수 변경하기
				System.out.println(" 이름을 입력 >>>");
				String name = scn.nextLine();
				System.out.println("바꿀 점수");
				int changeScore = Integer.parseInt(scn.nextLine());
				
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].name.equals(name)) {
						friends[i].score = changeScore;
						System.out.printf("이름 : %s  | 점수 : %d \n", friends[i].name, friends[i].score);
					}
				}
				
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null)
						System.out.printf("%s의 몸무게는 %.1fkg 점수는 %d 입니다.\n", friends[i].name, friends[i].weight,
								friends[i].score);
				}
				System.out.printf(" %s 는 %d 에 있습니다", name2, (i + 1));
			}
		}
	} // method1 end
} // (class end)