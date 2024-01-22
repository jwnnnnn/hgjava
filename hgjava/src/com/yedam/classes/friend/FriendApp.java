package com.yedam.classes.friend;


// 등록기능 수정기능, 삭제기능, 목록, 단건조회 기능

public class FriendApp {
	//필드 : 친구정보를 저장할 수 있는 배열.
	private Friend[] friends;

	//생성자
	public FriendApp() {
		super();
		friends =  new Friend[100];
	}
	//메소드
	//등록
	public boolean add(Friend frd) {
		for(int i=0;i<friends.length;i++) {
			if(friends[i]==null) {
				friends[i] = frd;
				return true;
			}
		}
		return false;
	}
	//목록
	public Friend[] list() {
		return friends;
	}	
	//수정
	public boolean modify(String fno,String name, String tel, int age) {
		for(int i=0;i<friends.length;i++) {
			if(friends[i] != null && friends[i].getFno().equals(fno)) {
				friends[i].setName(name);
				friends[i].setTel(tel);
				friends[i].setAge(age);
				return true;
			}
		}
		return false;
	}
	//단건 조회
	public Friend get(String fno) {
		for(int i=0;i<friends.length;i++) {
			if(friends[i] !=null&&friends[i].getFno().equals(fno)) {
				return friends[i];
			}
		}
		return null;
	}
	//삭제
	public boolean remove(String fno) {for(int i=0;i<friends.length;i++) {
		if(friends[i] !=null&&friends[i].getFno().equals(fno)) {
			friends[i]=null;
			return true;
			
		}
	}
	return false;
	}
}	
