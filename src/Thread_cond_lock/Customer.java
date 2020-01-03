package Thread_cond_lock;

public class Customer implements Runnable{
	private Server server;
	
	Customer(Server server){
		this.server = server;
	}
	@Override
	public void run() {
		try {
			for(int i = 0; i<=9; i++) {
				server.getOrder();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
