package emp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.Student;

public class EmpExe {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		boolean run = true;
		EmpApp app = new EmpApp();

		while (run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:// 번호 이름 점수 입력받기 -> 엔터
					// 사원번호 이름 입사일자 급여.
				System.out.println("사원번호 이름 입사일자 급여 >>>");
				String str = scn.nextLine();
				String[] strAry = str.split(" ");

				SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
				Employee emp = null;
				try {
					emp = new Employee(Integer.parseInt(strAry[0]), strAry[1], sdf.parse(strAry[2]),
							Integer.parseInt(strAry[3]));

				} catch (ParseException e) {
					System.out.println("날짜포맷 오류.");
					break;
				}

				if (app.add(emp)) {
					System.out.println("등록완료");
				} else {
					System.out.println("등록에러");
				}
				break;
			case 2:
				List<Employee> list = app.list();
				for (Employee std : list) {
					System.out.println(std.toString());
				}
				break;
			case 9:
				System.out.println("프로그램 종료.");
				app.save();
				run = false;
			}

		}

		System.out.println("end of prog");
		scn.close();
	}// end of main

	static void write() {
		List<Employee> storage = new ArrayList<>();
		storage.add(new Student(201, "최민규", 80));
		storage.add(new Student(202, "박민규", 85));
		storage.add(new Student(203, "이민규", 90));
		storage.add(new Student(204, "김민규", 95));

		// 컬렉션 정보 출력
		for (Employee std : storage) {
			System.out.println(std.toString());
		}

		try {
			FileWriter fw = new FileWriter("c:/temp/text.dat");
			BufferedWriter bw = new BufferedWriter(fw);

			// 반복
			for (Employee std : storage) {
				String str = std.getSno() + " " + std.getSname() + " " + std.getScore();
				bw.write(str + "\n");
			}
			bw.flush();
			fw.flush();
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void read() {
		// text.dat 파일 읽어서 => Student 정보를 컬렉션 저장.
		List<Student> storage = new ArrayList<>();
		try {
			FileReader fr = new FileReader("c:/temp/text.dat");
			BufferedReader br = new BufferedReader(fr);

			while (true) {
				String read = br.readLine();// 학생번호 이름 점수
				if (read == null) {
					break;
				}
				String[] readAry = read.split(" ");
				Student std = new Student(Integer.parseInt(readAry[0]), readAry[1], Integer.parseInt(readAry[2]));
				storage.add(std);
			}
			br.close();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// 컬렉션 정보 출력
		for (Student std : storage) {
			System.out.println(std.toString());
		}
	}// end read
}
