package threads;

public class ThreadDemo2 extends Thread {
	public void run() {
		int value=0;
		for(int i=1;i<8;i++) {
			value = value+i;
			System.out.println("Thread2 value"+value);
		}
	}

}
