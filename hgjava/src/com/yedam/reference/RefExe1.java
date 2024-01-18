package com.yedam.reference;

public class RefExe1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 100;
		System.out.println(n1 == n2); //값을 비교
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		System.out.println(str1 == str2); // String 은 ==은 값 비교 불가
		System.out.println(str1.equals(str2)); // String 의 값을 비교 .  비교대상1.equals.(비교대상2)
		
		int[] intAry = new int[10]; //배열을 가진게 아닌 주소값을 가지고 있음
		System.out.println(intAry); //주소값
		intAry = null; // 참조값 x
		System.out.println(intAry[0]);
 }
}