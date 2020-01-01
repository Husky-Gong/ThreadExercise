package Thread_Syn_Practice2;

public class Bridge {
	public Bridge() {}
	
	public synchronized void busRun() {
		try {
			System.out.println("bus......");
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void trainRun() {
		try {
			System.out.println("train......");
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
			}
	}
}
