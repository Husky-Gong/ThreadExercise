package Thread_Senior;

public class Thread_Group {
	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("First group.");
		System.out.println(group.getName());
		
		Thread th = new Thread(group, ()->{
			try {
				String groupName = Thread.currentThread()
						.getThreadGroup()
						.getName();
				String threadName = Thread.currentThread().getName();
				
				System.out.println("Thread Group: "+groupName+"  Thread Name:  "+threadName);
			}catch(Exception e) {
				System.err.println("Error");
				e.printStackTrace();}
		}) ;
		
		th.start();
	}
}
