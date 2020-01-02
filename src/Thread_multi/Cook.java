package Thread_multi;

public class Cook implements Runnable{
	private Server server;
	
	public Cook(Server server) {
		this.server = server;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) server.askCook(i);
		}catch(Exception e) {
			e.printStackTrace();
			}
	}
}
