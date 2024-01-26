package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharStreamExe {
	static Scanner scn = new Scanner(System.in);

	
	public static void main(String[] args) {
		// 문자기반 입출력.
		try {
			FileReader fr = new FileReader("c:/Temp/text.dat");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String read = br.readLine();
				if(read == null) {
					break;
					}
				System.out.println(read);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void search() {

		// 문자기반 입출력.
		Class cls = CharStreamExe.class;
		String path = cls.getResource("ByteStreamExe.class").getPath();
		System.out.println(path);
		path = "/D:/git/hgjava/hgjava/src/io/ByteStreamExe.java";
		try {
			FileReader fr = new FileReader(path);
			while (true) {
				int read = fr.read();
				if (read == -1) {
					break;
				}
				System.out.print((char) read); // 정수값을 읽어들이려면 char
			}

			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}

	

	static void write() {
		try {
			FileWriter fw = new FileWriter("c:/Temp/text.dat");
			while (true) {
				System.out.println("입력 >>>");
				String str = scn.nextLine();
				if (str.equals("stop")) {
					break;
				}
				fw.write(str);
			}
			fw.flush();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
