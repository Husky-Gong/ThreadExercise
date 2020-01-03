package Thread_cond_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Server {
	
	int product = -1;
	Lock lck = new ReentrantLock();
	Condition cond = lck.newCondition();

	
	public void cook(int i) {
		lck.lock();
		try {
			while(this.product != -1) cond.await();
			this.product = i;
			System.out.println("product "+ this.product +" is ready.");
			cond.signalAll();
		}catch(Exception e) {
			e.printStackTrace();
			}finally {
				lck.unlock();
			}
	}

	
	public void getOrder() {
		lck.lock();
		try {
			while(this.product == -1) cond.await();
			System.out.println("Has taken away "+this.product);
			this.product = -1;
			cond.signalAll();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			lck.unlock();
		}
		
	}

}
