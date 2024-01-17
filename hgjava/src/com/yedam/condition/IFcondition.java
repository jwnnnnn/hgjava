package com.yedam.condition;

public class IFcondition {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(Systemin);
		
		boolean isTrue = true;
		isTrue = isTrue != true;
		
		
		if(isTrue) {                        //!isTrue => isTrue 가 아니면.
			// 실행구문.
			System.out.println("참값입니다.");
			
		}	else {
			System.out.println("거짓값입니다.");
		}
		
		System.out.println("end of prog");
	
	
	
//		int score = 80;
//		if(score >= 90) {
//			System.out.println("A학점");
//		} else if (score >= 80) {
//			System.out.println("b학점");
//		}else {
//			System.out.println("c학점");
//		}
//		
//		System.out.println("end of prog");
		
		int score = 95;
		if(score >= 90) {
			System.out.println("A학점");
		} //else{}
		if (score >= 80) {
			System.out.println("b학점");
		} //esle{}
		if (score >= 70 ) {
			System.out.println("c학점");
		} //else {}

		
		System.out.println("end of prog");
	}
}
