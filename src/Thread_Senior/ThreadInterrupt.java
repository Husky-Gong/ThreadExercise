package Thread_Senior;

public class ThreadInterrupt {
//	public static void main(String[] args) {
//		Thread th = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try {
//					Thread.sleep(9999999);
//				}catch(Exception e) {
//					System.err.println("Blocked thread has been interrupted.");
//					e.printStackTrace();
//				}
//			}
//		},"Blocked Thread...") ;
//		
//		th.start();
//		
//		th.interrupt();
//	}
	public static void main(String[] args) {
		Thread th = new Thread(()->{
			try {
				Thread.sleep(9999999);
			}catch(Exception e) {
				System.err.println("Blocked thread has been interrupted...");
				e.printStackTrace();
			}
		});
		
		th.start();
		
		th.interrupt();
	}
}
