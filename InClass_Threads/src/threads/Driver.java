package threads;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo obj1 = new ThreadDemo();
		ThreadDemo2 obj2 = new ThreadDemo2();
//		obj1.setPriority(Thread.MAX_PRIORITY);
//		obj2.setPriority(Thread.MIN_PRIORITY);
		obj1.start();
		obj2.start();
		

	}

}
