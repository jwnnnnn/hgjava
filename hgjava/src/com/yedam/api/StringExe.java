package com.yedam.api;

public class StringExe {
	public static void main(String[] args) {
		String str = "";
		str = new String("Hello");
		str.getBytes(); // 해당되는 문자열의 각각의 값을 바이트로 출력.
		byte[] bytes = str.getBytes();
		for (byte b : bytes) {
			System.out.println(b);
		}
		str = new String(new byte[] { 72, 101, 108, 108, 111 }); // 직접하는 방법
	
		int pos = str.indexOf("a");
		System.out.println("1은 " + pos + " 위치에 있음");
		
		char chr = str.charAt(0);
		System.out.println(chr);
	}
}
