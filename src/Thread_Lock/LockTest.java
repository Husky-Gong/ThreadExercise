package Thread_Lock;

public class LockTest {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(1);
		
		new Thread(()->{
			while(true) {
				myList.add(1);
			}
		}, "Thread 1").start();
		
		new Thread(()->{
			while(true) {
				myList.size();
			}
		},"Thread 2").start();
	}
}
