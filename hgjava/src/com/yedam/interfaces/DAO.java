package com.yedam.interfaces;
	//인터페이스는 필드를 선언핤 수 없ㅇ다.
public interface DAO {
	int VER = 1; // 값이 할당되면 바꿀 수 없음.
	//인터페이스 안의 메소드들은 전부 추상메소드 .
	//final == 상수. 대문자로 쓰는게 관례
	//규칙
	public void insert(); // 추상메소드  중괄호 필요 x
	public void update();
	public void delete();
	
}
