package emp;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// 초기화 (데이터 활용 컬렉션)
// 추가 
// 목록
// 종료(컬렉션 -> 파일저장)
public class EmpApp {

	List<Employee> storage = new ArrayList<Employee>();

	public void init() {
		try {

			File file = new File("c:/Temp/emp.dat");
			if (!file.exists()) {
				file.createNewFile();
			} else {
//				file.delete();
				System.out.println(file.lastModified());
				// val/1000/60/60/24/365 
			}

			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			storage = (List<Employee>) ois.readObject(); // 바이트 => 객체생성(역직렬화).
//			ois.close();
//			fis.close();

		} catch (EOFException e) {

		} catch (FileNotFoundException fe) {
			System.out.println("파일이 없습니다.");
		} catch (Exception ee) {
			System.out.println("알 수 없는 오류.");

		}
	}

	// 생성자
	public EmpApp() {
		init();
	}

	// 등록
	public boolean add(Employee emp) {
		return storage.add(emp);
	}

	// 목록
	public List<Employee> list() {
		return storage;
	}

	public void save() {
		// 기본스트림 -> 보조스트림 -> 저장.
		try {
			FileOutputStream fos = new FileOutputStream("c:/Temp/emp.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(storage); // 객체타입을 파일에 쓰기.

			oos.flush();
			fos.flush();
//			fos.close();
//			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
