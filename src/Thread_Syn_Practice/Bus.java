package Thread_Syn_Practice;

public class Bus implements Runnable{
	
	private Bridge bridge;
	
	public Bus(Bridge bridge) {
		this.bridge = bridge;
	}

	@Override
	public void run() {
		bridge.busPass();
	}
	
}
