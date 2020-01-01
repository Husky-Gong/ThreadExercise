package Thread_Syn_Practice2;

import Thread_Syn_Practice.Bridge;

public class bridgeTest {
	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		
		Thread bus1 = new Thread(new Runnable() {
			 
			@Override
			public void run() {
				bridge.busPass();
			}
		},"bus Thread");
		
		Thread train1 = new Thread(new Runnable() {
			@Override
			public void run() {
				bridge.trainPass();
			}
		},"train Thread");
		
		bus1.start();
		train1.start();
	}
}
