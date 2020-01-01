package Thread_2;

public class MoveTest {
	public static void main(String[] args) {
		Thread chairT1 = new Thread(new ChairTask(),"Chair");
		Thread DeskT1 = new Thread(new DeskTask(),"Desk");
		
		chairT1.start();
		DeskT1.start();
	}
}
