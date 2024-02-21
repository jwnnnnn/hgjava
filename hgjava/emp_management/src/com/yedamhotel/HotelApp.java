package com.yedamhotel;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class HotelApp {
	final static int MAX = 12;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HotelDAO hdao = new HotelDAO();

		boolean run = true;
		int menu = 0;

		while (run) {
			boolean run1 = true;
			while (run1) {
				System.out.println("\t  ●호텔 예약 프로그램●");
				System.out.println("\t1.고객\t2.관리자\t4.프로그램 종료");
				System.out.print("\t해당하는 번호를 입력해주세요\n\t▶");
				menu = scn.nextInt();
				scn.nextLine();
				if (menu == 1 || menu == 2) {
					run1 = false;
				} else if (menu == 4) {
					System.out.println("\t*프로그램을 종료합니다*");
					return;
				} else {
					System.out.println("\t!**다시 입력해 주세요**!");
				}
			}
			switch (menu) {
			case 1:// 고객페이지
				boolean run2 = true;
				while (run2) {
					System.out.println("\t1.객실정보, 2.예약하기, 3.예약취소 4.고객 페이지 나가기 ");
					System.out.print("\t해당하는 번호를 입력해주세요\n\t▶");
					menu = scn.nextInt();
					scn.nextLine();
					switch (menu) {
					case 1: // 객실정보
						System.out.println("==================================================================================================");
						System.out.println("||\t객실 번호\t||\t객실 타입\t||\t객실 가격\t\t||\t객실 상태\t||\t최대 인원 수\t||");
						System.out.println("==================================================================================================");
						List<Room> list = hdao.getList();
						for (Room room : list) {
							System.out.println("||\t【" + room.getRoomno() + "】\t||\t" + room.getRoomtype()
									+ "\t||\t￦ " + room.getRoommoney() + "(원)\t||\t" + room.getRoomstate()
									+ "\t||\t     (" + room.getMaxperson() + ")\t||");
							
						}
						System.out.println("==================================================================================================");
						break;

					case 2:// 예약하기

						System.out.print("\t예약할 객실 번호를 입력해주세요\n\t▶");
						int rno = scn.nextInt();

						System.out.print("\t이름 ▶ ");
						String name = scn.next();
						System.out.print("\t연락처 ▶ ");
						String phone = scn.next();
						System.out.print("\t아이디 입력 ▶");
						String id = scn.next();
						System.out.print("\t체크인 날짜 ▶");
						String ci = scn.next();
						System.out.print("\t체크아웃 날짜 ▶");
						String co = scn.next();
						System.out.print("\t투숙인원 ▶");
						int pr = scn.nextInt();
						scn.nextLine();

						if (hdao.insertCus(name, phone, id, ci, co, pr, rno)) {
							System.out.println("\t( " + rno + " )번 객실에 예약이 완료되었습니다.");
						} //else if() {
							
						//}
						else {
							System.out.println("\t이미 예약되었거나 예약할 수 없는 객실을 입력하였습니다.\n!** 객실 번호를 확인해주세요");
						}
						break;
					case 3:// 예약취소
						System.out.print("\t객실 번호를 입력해주세요 ▶\n\t");
						int rmno = scn.nextInt();
						scn.nextLine();
						System.out.print("\t아이디를 입력해주세요 ▶\n\t");
						String id1 = scn.nextLine();

						if (hdao.deleteCus(rmno, id1)) {
							System.out.println("\t( " + rmno + " )번 객실에 예약이 취소되었습니다.");
						} else {
							System.out.println("\t이미 취소되었거나 예약된 정보가 없습니다..\n\t!** 객실 번호를 확인해주세요**!");
						}
						break;
					case 4:// 종료
						System.out.println("\t고객페이지에서 나갑니다.");
						run2 = false;
					}// switch 2
				} // while2
				break;

			case 2:// 관리자 페이지

				while (true) {
					System.out.print("\t아이디를 입력하세요\n\t▶");
					String id2 = scn.nextLine();
					System.out.print("\t비밀번호를 입력하세요\n\t▶");
					String pw2 = scn.nextLine();
					UserApp uapp = new UserApp();

					User user = uapp.login(id2, pw2);

					if (user != null) {
						System.out.printf("\t!**환영합니다 %s 님**!\n", user.getName());
						break;
					} else {
						System.out.println("\tid와 pw를 확인하세요");
					}
				}

				boolean run3 = true;
				while (run3) {
					System.out.println(
							"================================메뉴===============================================");
					System.out.println("||\t1.예약내역\t\t2.체크인,체크아웃날짜변경\t\t3.체크아웃\t\t4.로그아웃\t||");
					System.out.println(
							"==================================================================================");
					System.out.print("\t해당하는 번호를 입력해주세요\n\t▶");
					menu = scn.nextInt();
					scn.nextLine();
					switch (menu) {
					case 1:// 예약 확인
						List<Customer> list1 = hdao.getList2();

						if (list1.size() > 0) {
							System.out.println("==========================================================================================================================================");
							System.out.println(
									"||\t이름\t||\t연락처\t\t||\tID\t||\t체크인\t\t||\t체크 아웃\t\t||\t방 번호\t||\t인원\t||");
							System.out.println("==========================================================================================================================================");
							for (Customer cus : list1) {
								System.out.println("||\t" + cus.getName() + "\t||\t" + cus.getPhone() + "\t||\t"
										+ cus.getId() + "\t||\t" + cus.getCheckin() + "\t||\t" + cus.getCheckout()
										+ "\t||\t" + cus.getRoomno() + "\t||\t(" + cus.getInperson() + ")\t||\t");
							}
							System.out.println("==========================================================================================================================================");
						} else {
							System.out.println("\t예약된 내역이 없습니다.");
						}
						break;

					case 2:// 체크인,체크아웃 변경

						System.out.print("\t변경할 고객의 id를 입력하세요 \n\t▶");
						String id = scn.nextLine();
						System.out.print("\t변경할 입실 날짜를 입력하세요 \n\t▶");
						String ci = scn.nextLine();
						System.out.print("\t변결할 퇴실 날짜를 입력하세요 \n\t▶");
						String co = scn.nextLine();

						if (hdao.updateCus(id, ci, co)) {
							System.out.println("\tID가 " + id + "인 고객의 입시,퇴실 날짜를 변경하였습니다.");
						}
						break;

					case 3:// 체크아웃
						System.out.print("\t객실 번호를 입력해주세요\n\t▶");
						int rmno = scn.nextInt();
						scn.nextLine();

						if (hdao.deleteCus(rmno)) {
							System.out.println("\t( " + rmno + " )번 객실에서 체크아웃되었습니다.");
						} else {
							System.out.println("\t이미 체크아웃 하였거나 객실번호가 잘못되었습니다.\n!** 객실 번호를 확인해주세요**!");
						}
						break;
					case 4:// 종료
						System.out.println("\t*로그아웃을 안료하였습니다.*");
						run3 = false;

					}
				}

			}// switch 1
		} // while 1
	}// main
}// class
