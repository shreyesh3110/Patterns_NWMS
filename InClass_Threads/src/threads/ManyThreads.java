package threads;

public class ManyThreads extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<4;i++) {
			TestThread myThread = new TestThread(i);
			myThread.start();
		}
	}

}
