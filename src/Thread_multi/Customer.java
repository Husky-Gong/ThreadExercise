package Thread_multi;

public class Customer implements Runnable{
	private Server server;
	
	public Customer(Server server) {
		this.server = server;
	}
	
	@Override
	public void run() {
		try {
			/* Because there is no parameter in giveproduct, customer thread will
			 * not change the product value in server.Thus, if customer enters the
			 * kfc first, he will launch the wait() and let the cook thread run.
			 */
			for(int i=0;i<10;i++) server.giveProduct();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
