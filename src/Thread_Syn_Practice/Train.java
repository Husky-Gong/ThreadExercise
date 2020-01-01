package Thread_Syn_Practice;

public class Train implements Runnable{
	Bridge bridge;
	
	public Train(Bridge bridge) {
		this.bridge = bridge;
	}

	@Override
	public void run() {
		bridge.trainPass();
	}
}
