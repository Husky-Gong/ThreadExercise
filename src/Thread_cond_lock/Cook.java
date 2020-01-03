package Thread_cond_lock;

public class Cook implements Runnable{
	Server server;
	
	public Cook(Server server) {
		this.server = server;
	};
	
	
	@Override
	public void run() {
		try {
			for(int i = 0; i<=9; i++) {
				server.cook(i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
