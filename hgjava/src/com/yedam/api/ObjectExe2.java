package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

public class ObjectExe2 {
	public static void main(String[] args) {
		// String 타입의 Set 사용 
		Set<String> set = new HashSet<String>();
		set.add("김길동");
		set.add("박길동");
		set.add("홍길동");
		set.add("박길동\n\n"); // 중복저장 안됨.

		// 중복 제거된 이름 출력
		for (String name : set) { // for .. of ..
			// set 반복적으로 실행할 변수
			// name set 의 담겨져있는 값을 담아오기위한 변수
			System.out.println(name);
		}
		// Member 객체를 저장하는 Set
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김길동", 20)); // 객체생성.
		members.add(new Member("홍길동", 22));
		members.add(new Member("박길동", 24));
		// 동일한 멤버를 두 번 추가 (중복 제거해야함.)
		members.add(new Member("박길동", 24));
		
		// 각 멤버의 정보 출력
		for (Member mem : members) {
			System.out.println(mem.toString());
		}
	}
}
