package synchronize;

public class Calculator {

	// User1, User2 작업공간.
	private int memory;

	public int getMemory() { // 메모리 출력
		return memory;
	}

	// synchronized 임계영역을 만들어줌. >> 첫번쨰 스레드가 끝이나면 . 두번쨰 스레드가 작업하는걸로 바뀜.
	public synchronized void setMemory(int memory) { // 메모리 저장
		System.out.println(Thread.currentThread());
		this.memory = memory;

		try {
			Thread.sleep(2000); // sleep => 해당되는 스레드의 일시정지를 의미함.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " >> " + this.memory);
	}

}
