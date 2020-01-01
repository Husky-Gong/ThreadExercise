package Thread_1;

public class MoveTest {
	public static void main(String[] args) {
		ChairThread chairT1 = new ChairThread();
		DeskThread deskT2 = new DeskThread();
		
		chairT1.setName("Chair Thread");
		deskT2.setName("Desk Thread");
		
		chairT1.start();
		deskT2.start();
	}
}
