package com.yedam.api;

public class StringTest {

	public static void main(String[] args) {
		// 1번 문제의 데이터

		String[] jumins = { "970101-1234567", "970101-2234567", "9701011234567", "970101 1234567", "030101 4234567",
				"030101 1234567" };

		for (String ssn : jumins) {
			checkGender(ssn);

		}

		// 2번 문제의 데이터. '길동' 이라는 이름이 몇번 나오는지?

		String[] names = { "김길동", "홍길동", "박살동", "공길동", "채길동", "감골동", "성갈동" };
		int sum = 0; // 합계를 0
		for (int i = 0; i < names.length; i++) { // names의 길이만큼 반복
			if (names[i].indexOf("길동") != -1) { // for 반복문의 name 안 값의 문자열을 길동을 찾음
				sum++; // if 가 맞으면 sum 에 하나씩 넣기.
			}
		}
		System.out.printf("이름이 길동의 수 : %d \n\n", sum);

		int dup = 0;
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			if (name.indexOf("길동") != -1) {
				dup++;
			}
		}

		int sum1 = 0;
		String[] names1 = { "김길동", "홍길동", "박살동", "공길동", "채길동", "감골동", "성갈동" };
		for (String name : names1) {
			if (name.indexOf("길동") != -1) {
				sum1++;
			}
		}
		System.out.printf("이름이 길동의 수 : %d", sum1);

	}

	private static void checkGender(String ssn) {
		String[] names1 = { "김길동", "홍길동", "박살동", "공길동", "채길동", "감골동", "성갈동" };
	
		if (ssn.length() == 13) {
			char sex = ssn.charAt(6);
			switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
			}

		}
		if (ssn.length() == 14) {
			char sex = ssn.charAt(7);
			switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
			}
		}

		int yy = Integer.parseInt(ssn.substring(0, 2));
		boolean before2000 = yy > 23;

		char pos = ssn.charAt(ssn.length() - 7);
		String gender = "여자";

		if (before2000) {
			if (pos == '1') {
				gender = "남자";
			} else if (pos == '2') {
				gender = "여자";
			} else {
				System.out.println("오류");
			}
		} else {
			if (pos == '3') {
				gender = "남자";
			} else if (pos == '4') {
				gender = "여자";
			} else {
				System.out.println("오류");
			}
		}

		String selectedName = "";
		switch (gender) {
		    case "남자":
		        selectedName = names1[0]; // 남자에 대한 이름 선택 (예: "김길동")
		        break;
		    case "여자":
		        selectedName = names1[1]; // 여자에 대한 이름 선택 (예: "홍길동")
		        break;
		}

		System.out.printf("이름: %s%n", selectedName);

	}
}
