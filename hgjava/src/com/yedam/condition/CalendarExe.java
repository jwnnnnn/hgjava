package com.yedam.condition;

public class CalendarExe {
	public static void main(String[] args) {

		int month = 3;
		// 변수: 월의 1이 오는 위치.
		int pos = 1;
		// 변수ㅣ 월의 마지막날짜.
		int lastDate = 31;
		switch (month) {
		case 1:
			pos = 1; lastDate = 31;
			break;
		case 2:
			pos = 4; lastDate = 29;
			break;
		case 3:
			pos = 5; lastDate = 31;
			break;
		}
		// 수정
//		System.out.println

		String[] days ={"Sun" , "Mon" , "Tue",  "Wed",  "Thr" , "Fri",  "  Sat \n"};
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%5s", days[i]);
		}
		for (int j = 0; j < pos; j++) { 
			System.out.printf("%5s", "");
		} 
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%5d", i);
			if (i % 7 == (7 - pos)) {
				System.out.println();
			}
		}
	}
}
