package Thread_cond_lock;

public class Kfc {
	public static void main(String[] args) {
		Server server = new Server();
		
		Cook cook = new Cook(server);
		Customer customer = new Customer(server);
		
		Thread cookThread = new Thread(cook);
		Thread customerThread = new Thread(customer);
		
		cookThread.start();
		customerThread.start();
	}
}
