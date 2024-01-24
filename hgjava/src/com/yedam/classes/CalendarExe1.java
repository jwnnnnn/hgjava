package com.yedam.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class CalendarExe1 {

	public static void main(String[] args) {
		drawCalendar(2024, 2);
//		Scanner scn = new Scanner(System.in);
		Date date = new Date();
//		date.setYear(123);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try { 
			date = sdf.parse("2024-01-01"); // String => Date
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(date.getMonth());
		drawCalendar (date);

	}
	
	static void drawCalendar (Date date) {
		
	}
	
	static void drawCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1); // 월 -1을 해야 해당 월

		int pos = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		// cal.get(Calendar.YEAR) > 년도 값으로 나타내는 것을 보기쉽게.
		// cal.get(Calendar.MONTH) > 월. 1월 = 0 0부터 시작임.
		// cal.get(Calendar.DATE) > 일. 현재 일자 그대로 보여줌
		// cal.get(Calendar.DAY_OF_WEEK) > 요일 1부터 일요일임.

		// 요일출력
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "  Sat \n" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%5s", days[i]);
		}
		// 1일의 요일지정
		for (int p = 0; p < pos; p++) {
			System.out.printf("%5s", "");
		}
		// 날짜 출력
		for (int d = 1; d <= lastDate; d++) {
			System.out.printf("%5d", d);
			if (d % 7 == (7 - pos)) {
				System.out.println();

			}
		}

	}
}
