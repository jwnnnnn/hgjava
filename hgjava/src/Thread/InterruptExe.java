package Thread;

class PrintThread2 extends Thread {

	@Override
	public void run() {
		while (true) {
			
			System.out.println("실행중");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				break; // 스레드를 종료하기 위한 코드작성.
			}
		}
		System.out.println("자원정리..");
		System.out.println("실행종료..");
	}
}

public class InterruptExe {
	public static void main(String[] args) {

		PrintThread2 thread = new PrintThread2();
		thread.start();

		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread.interrupt(); // 실행되는 thread에 interrupted 예외
	}
}
