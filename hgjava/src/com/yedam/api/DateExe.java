package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExe {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
		System.out.println(sdf.format(today)); // 데이터타입을 스트링타입으로 변환
		System.out.println(today.toLocaleString());
		
		
		try {
			sdf.parse("2020/01/05 12:12:12");  //스트링타입을 데이터타입으로 변환.
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(today);
		
		Date now = new Date();
		
		System.out.println(today.before(now)); // 두개의 날짜로 트루 폴스 비교 .
		
		LocalDate Id = LocalDate.now();
		System.out.println(Id.toString());
		
		LocalTime It = LocalTime.now();
		System.out.println(It.toString());
		
		LocalDateTime Idt = LocalDateTime.now();
		System.out.println(Idt.toString());
		
		String result = Idt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(result);
	}
}
