package Thread_multi;

public class Kfc {
	public static void main(String[] args) {
		Server server = new Server();
		
		Cook cook = new Cook(server);
		Customer customer = new Customer(server);
		
		Thread cookThread = new Thread(cook,"cook Thread.");
		Thread custThread = new Thread(customer, "customer Thread.");
		
		
		custThread.start();
		cookThread.start();
	}
}
