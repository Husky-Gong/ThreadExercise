package Thread_multi;

public class Server {
	/*
	 * -1 represents for cook is cooking and customer is waiting. 
	 * Product will be taken once the cook finished.
	 */
	private int product = -1;
	
	public void askCook(int product) throws InterruptedException {
		synchronized(this) {
			while(this.product != -1){
				wait();
			}
			this.product = product;
			
			notifyAll();
			System.out.println("Finished "+product+" product.");
			
		}
	}
	
	public void giveProduct() throws InterruptedException {
		synchronized(this) {
			while(this.product == -1) wait();
			notifyAll();
			System.out.println("Customer has taken "+ this.product+" product.");
			this.product = -1;
		}
	}
}
