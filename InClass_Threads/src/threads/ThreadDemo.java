package threads;

public class ThreadDemo extends Thread {
	public void run() {
		int value = 0;
		for(int i=1;i<5;i++) {
			value = 3*i+i*3;
			System.out.println("Thread1 value "+value);
		}
	}
}
