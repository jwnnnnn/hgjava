package com.yedam.classes.friend;

import java.util.Scanner;

public class FirendExe {
	static Scanner scn = new Scanner(System.in);
	static FriendApp app = new FriendApp();
	static UserApp uapp = new UserApp();
	static String name="";
	static String tel ="";
	static String fno ="";
	static int age = 0;
	
	
	
	public static void insert() {
		System.out.println("번호>>>");
		fno = scn.nextLine();
		System.out.println("이름>>>");
		name = scn.nextLine();
		System.out.println("전화번호>>>");
		tel = scn.nextLine();
		System.out.println("나이>>>");
		age = Integer.parseInt(scn.nextLine());
		Friend frd = new Friend(fno,name,tel,age);
		if(app.add(frd)) {
			System.out.println("입력성공");
		}else {
			System.out.println("입력성공");
		}
	}
	public static void list() {
		Friend[] list = app.list();
		for(int i=0; i<list.length;i++) {
			if(list[i]!=null) {
				list[i].showInfo();
			}
		}
		System.out.println("조회완료");
	}
	public static void update() {
		System.out.println("수정할 친구 번호를 입력하세요");
		fno=scn.nextLine();
		if(app.get(fno)==null) {
			System.out.println("친구번호를 확인하세요");
			return;
		}
		System.out.println("바뀐 이름>>>");
		name=scn.nextLine();
		System.out.println("바뀐 전화번호>>>");
		tel=scn.nextLine();
		System.out.println("바뀐 나이>>>");
		age = Integer.parseInt(scn.nextLine());
		
		if(app.modify(fno, name, tel, age)) {
			System.out.println("수정완료");
		}else {
			System.out.println("잘못된 친구번호입니다.");
		}
	}
	public static void delete() {
		System.out.println("삭제할 친구번호>>>");
		fno=scn.nextLine();
		if(app.remove(fno)) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제실패");
		}
	}
	public static void main(String[] args) {
		//메뉴 : 1.등록 2.목록 3.수정 4.삭제 9.종료
		//사용자의 입력/처리결과 콘솔출력

		int menu = 0;
		boolean run=true;
		//로그인 기능.(id,pw,name)
		
		while(true) {
			System.out.println("id>>>");
			String id = scn.nextLine();
			System.out.println("pw>>>");
			String pw = scn.nextLine();
			User user=uapp.login(id, pw);
			if(user != null) {
				System.out.printf("%s님 환영합니다.\n",user.getName());
				break;
				}
			System.out.println("id,pw 확인필요");
			}
		while(run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 9.종료");
			menu=Integer.parseInt(scn.nextLine());
			switch(menu) {
			
			case 1 : //등록
				insert();
				break;
			case 2 : //목록
				list();
				break;
			case 3 : //수정
				update();
				break;
			case 4 : //삭제
				delete();
				break;
			case 9 : //종료
				System.out.println("종료합니다");
				run=false;
			}
		}
	}
		
}
