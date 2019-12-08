public class MagicRoom extends Room {
	public MagicRoom(int roomNo) {
		super(roomNo);
	}

	public void enter(Character c) {
		c.setCurrentRoom(this);
		System.out.println("You entered a MAGIC room " + getRoomNumber());
	}
}