package Thread_Senior;

public class DeamonThread {
	public static void main(String[] args) {
		Thread th = new Thread(()-> {
			while(true) {
				System.out.println(Thread.currentThread().getName()+"::TTTT");
			}
		},"Deamon Thread");
		
		th.setDaemon(true);
		th.start();
		System.out.println("Main end...");
	}
}
