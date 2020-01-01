package Thread_Syn_Practice2;

public class BridgeTest2 {
	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		
		Thread bus1 = new Thread(()->{
			try {
				bridge.busRun();
			}
			catch(Exception e){
				e.printStackTrace();
				}
		}  );
		
		Thread train1 = new Thread(()->  {
			try {
				bridge.trainRun();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}) ;
		
		bus1.start();
		train1.start();
	}
}
