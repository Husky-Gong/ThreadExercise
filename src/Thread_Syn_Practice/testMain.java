package Thread_Syn_Practice;

public class testMain {
	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		
		Bus b1 = new Bus(bridge);
		Train t1 = new Train(bridge);
		
		Thread th1 = new Thread(b1,"Bus");
		Thread th2 = new Thread(t1, "Train");
		
		th1.start();
		th2.start();
	}
}
