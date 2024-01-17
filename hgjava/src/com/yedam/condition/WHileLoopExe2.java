package com.yedam.condition;

import java.util.Scanner;

public class WHileLoopExe2 {
	public static void main(String[] args) {
		
		
	Scanner scn = new Scanner(System.in)	;
	 int random = (int) (Math.random() * 10) +1 ; // 0 ~ 1까지의 임의의 실
	 while(true) {
	 System.out.println("값입력 >>");
		 int a = scn.nextInt();
		 if(random == a) {
			 System.out.printf("임의값 %d \n" , random);
			 break;
		 }if (random < a) {
		  System.out.printf("임의 값은 %d 보다 큽니다" , a);
		  System.out.println(random);
		  continue;}
//		 }else {
			 System.out.printf("임의 값은 %d 보다 작니다", a);
//		 }
			 
		 
	 }
		System.out.println("end of prog");
	
		
	}
}
