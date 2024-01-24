package com.yedam.interfaces;

public class OracleDB implements DAO {
	//implemebts DAO << 인터페이스 다오의 값 들고옴. 하나라도 메소드가 차이나면 에러.
	// 구현클래스이름 implements 인터페이스 이름
	public void insert() {
		System.out.println("[Oracle] 입력.");
	}

	public void update() {
		System.out.println("[Oracle] 수정.");
	}

	public void delete() {
		System.out.println("[Oracle] 삭제.");
	}
}
