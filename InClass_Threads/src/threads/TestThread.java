package threads;

public class TestThread extends Thread{
	private int threadNumber;
	public TestThread(int threadNb) {
		threadNumber = threadNb;
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" From Thread "+threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
