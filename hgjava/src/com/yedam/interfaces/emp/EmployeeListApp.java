package com.yedam.interfaces.emp;

import java.util.Scanner;

public class EmployeeListApp {
	public static void main(String[] args) {
		EmployeeList app = EmployeeArray.getInstance();//앱에 정리되어있던 기능들을 통해서 내부적인 처리를 다르게 만들어볼 계획
						   //EmployeeArrayList.getInstance(); << 컬렉션으로 할당
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		boolean run = true;

		while (run) {
			System.out.println("1.사원수 2.사원입력 3.사원리스트 4.검색 5. 9.종료");
//			System.out.println("선택>");
			menu = scn.nextInt();

			if (menu == 1) {
				app.init();
				
			} else if (menu == 2) {
				app.input();
				
			} else if (menu == 3) {
				app.print();
				
			} else if (menu == 4) {
				System.out.println("조회할 사번 >>");
				int no = scn.nextInt();
				String name = app.search(no);
				if (app.search(no).equals("")) {
					System.out.println("공백을 입력 할 수 없습니다.");
				} else {
					System.out.printf("%s\n",name);
					
				}
			} else if (menu == 5) {
				// app. sum()
				
				System.out.printf("급여의 합계는 %d 입니다.\n\n", app.sum());
			} else if (menu == 9) {
				run = false;
				break;
			} else {
				System.out.println("잘못된 번호입니다.");
			}
		}
		System.out.println("end of prog");
	}
}
