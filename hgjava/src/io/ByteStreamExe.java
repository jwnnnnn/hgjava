package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamExe {

	public static void main(String[] args) {
		// 문자기반 입출력.
		System.out.println("end of file");
	}

	
	static void read() {

		// 입력출력 = > 복사 .
		try {
			FileInputStream fis = new FileInputStream("c:Temp/lll.exe");
			FileOutputStream fos = new FileOutputStream("c:Temp/copy2.exe");

			// 보조스트림. Buffered ..
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

//			byte[] byteAry = new byte[100]; // 100바이트씩 읽어드림
			while (true) {
				int buf = bis.read();// fis.read();
				if (buf == -1) {
					break;
				}
				// fos.write(buf);
				bos.write(buf);
			}
			bos.flush();
			bos.close();
			fos.flush();
			fos.close();
			bis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void read1() {

		try {
			FileInputStream fis = new FileInputStream("c:Temp/sample.dat");
			while (true) {
				int bytes = fis.read(); // 하나하나 바이트 값으로 읽어드림. //eof => -1 반환.
				if (bytes == 1) {
					break;
				}
				System.out.println(bytes);

			}
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// 바이트 출력 스트림.
	static void write() {

		try {
			FileOutputStream fos = new FileOutputStream("c:Temp/sample.dat");
			fos.write(10); // 바이트 기반이라 메모장으로 봐도 파악 x
			fos.write(20);
			fos.write(30);
			fos.flush(); // 쓰고나면 비우는 것
			fos.close(); // 자원환원.

		} catch (Exception e) { // IO 예외가 상위클래스 > Exception 은 제일 상위
			e.printStackTrace();
		}
	}
}
