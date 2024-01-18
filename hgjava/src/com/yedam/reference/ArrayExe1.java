package com.yedam.reference;

public class ArrayExe1 {
	public static void main(String[] args) {
		//선언.
		int[] intAry = {10, 20, 30};    //정수(int)타입의 [] 배열을 가짐 .. 중괄호 {} 써야함 //intAry[0]  >> 요소는 인트 int 
		int[][] intArray = {{10,20}, {30,40}, {50}}; //인트를 담고 있는 배열의 그 요소)를 다시 배열(안의 값 > 정수 x 배열 o)로
		// intArray[0] === int[] 정수x 배열 , intArray[0][0] === int 정수

		
		String[] strAry = new String[5]; // 크기 선언.
		strAry = new String[] {"Hello","World","nice"};
		System.out.println(strAry[2]);
		
		for(String elem : strAry) {
			System.out.println(elem);
		}
		
	}
}
