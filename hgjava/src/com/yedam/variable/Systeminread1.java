package com.yedam.variable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Systeminread1 {
	public static void main(String[] args) 
			throws FileNotFoundException {
		//표줍 입출력:126 키보드(System.in) , 모니터(System.out).
		InputStream is = new FileInputStream("test.txt");
		Scanner scn = new Scanner(is); // 한라인씩 읽기 nextLine(); 
		
		// 나이(int:age), 키(double:height)
		String name = scn.nextLine();
		int age = Integer.parseInt(scn.nextLine()); // 형변환
		double height = Double.parseDouble(scn.nextLine());
//		Integer age = scn.nextInt();
//		Double height = scn.nextDouble();
		System.out.println(": "+ name);
	
	
	
		scn.close();
	
	
		// 이름은 홍길동, 나이는 20세, 키는 1778.9 입니다.
		
//		System.out.printf("이름은 %s, 나이는 %d, 키는 %.1f" , name , age, height);
		String str = "이름은 %s, 나이는 %d, 키는 %.1f";
		System.out.printf(str, name , age, height);
	
	
	
	
	
	
	}
}
