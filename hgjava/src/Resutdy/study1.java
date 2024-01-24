package Resutdy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//등록메소드
public class study1 {
	public static void main(String[] args) {
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length:  " + bytes1.length);
		
		String str1 = new String (bytes1);
		System.out.println("bytes->String:  " + str1);
		System.out.println(str1.length());
		
		String subject = "자바 프로그래밍"; // 해당 인트 변수로 문자열 찾기.
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);
		
		if(subject.indexOf("프로그래밍") != -1) { // -1 을 리턴하면 특정 문자열이 포함x
			System.out.println("프로그래밍과 관련");
		}else {
			System.out.println("프로그래밍 x");
		}
	}
}
