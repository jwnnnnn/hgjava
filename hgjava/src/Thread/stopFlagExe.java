package Thread;

class PrintThread extends Thread {
	// stop 플래그를 변경.
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() { // run 이라는 메소드를 정리하면서 실행할 작업 정의.
		// stop => true로 변경이 될 때 프로그램 종료 코드 생성.
		while (!stop) {
			System.out.println("실행중...");
		}
		System.out.println("자원정리..");
		System.out.println("실행종료..");
	}
}

public class stopFlagExe {
	public static void main(String[] args) {
		PrintThread thread = new PrintThread();
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.setStop(true); // 스레드 종료 요청
	}
}