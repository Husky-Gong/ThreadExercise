package Thread_1;

public class ChairThread extends Thread{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+"::"+i);
		}
	}
	
	public void start() {
		super.start();
		System.out.println("yizi");
	}
}
