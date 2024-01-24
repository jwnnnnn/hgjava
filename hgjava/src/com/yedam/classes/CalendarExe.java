package com.yedam.classes;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExe {
	public static void main(String[] args) {
		final int num = 10; // final >> 상수. , 한번 값을 할당하고 나면 바꿀 수 없음
		Scanner scn = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();
		cal.set(2024, 1, 1);
		
//		System.out.println(Calendar.YEAR);
//		System.out.println("year: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("last Date: " + cal.getActualMaximum(Calendar.DATE));

		// cal.get(Calendar.YEAR) > 년도 값으로 나타내는 것을 보기쉽게.
		// cal.get(Calendar.MONTH) > 월. 1월 = 0 0부터 시작임.
		// cal.get(Calendar.DATE) > 일. 현재 일자 그대로 보여줌
		// cal.get(Calendar.DAY_OF_WEEK) > 요일 1부터 일요일임.

		drawCalendar(2020, 5);

//		Calendar cal2 = Calendar.getInstance();
//		System.out.println(cal1 == cal2);
		// 각각 다른 인스턴스를 만들어줌./

		

				
		

	static void drawCalendar(int year, int month) {
		// (2024, 1)

	}

}
