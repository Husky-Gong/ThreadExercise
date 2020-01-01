package Thread_Syn_Practice;

public class Bridge {
	public Bridge() {}
	
	public synchronized void busPass() {
		System.out.println("Bus......");
		
		try {
			Thread.sleep(9000);
		}catch(Exception e) {e.printStackTrace();}
	}
	
	public synchronized void trainPass() {
		System.out.println("Train......");
		
		try {
			Thread.sleep(9000);
		}catch(Exception e) {e.printStackTrace();}
	}
}
