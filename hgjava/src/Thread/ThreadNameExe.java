package Thread;

class ThreadA extends Thread {

	public ThreadA() {
		setName("Thread-A");
	}

	class ThreadB extends Thread {
		public ThreadB() {
			setName("Thread-B");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 1; i++) {
			System.out.println("Thread이름 : " + getName()); // Thread 이름 출력
		}
	}
}

public class ThreadNameExe {
	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println("시작 Thread이름=> " + mainThread.getName());

		Thread threadA = new ThreadA();
		System.out.println("Thread이름 => " + threadA.getName());
		threadA.start();

		Thread threadB = new ThreadA();
		System.out.println("Thread이름 => " + threadB.getName());
		threadB.start();

		System.out.println("end of main");

	}
}
