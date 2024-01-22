package com.yedam.classes.inherit;

import lombok.Data;

@Data
public class UnivFriend extends Friend {
	// 학교 , 전공
	
	private String univ;
	private String major;
	
	@Override
	public void changeInfo(String info1, String info2) {
		this.univ = info1;
		this.major = info2;
	}
}
