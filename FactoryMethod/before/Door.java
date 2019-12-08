public class Door implements MapSite {
	private Room room1;
	private Room room2;
	private boolean isOpen;

	public Door(Room r1, Room r2) {
		room1 = r1;
		room2 = r2;
	}

	public void open() {
		isOpen = true;
	}

	private Room otherSideFrom(Room r) {
		if (r == room1)
			return room2;
		else
			return room1;
	}

	public void enter(Character c) {
		if (isOpen) {
			System.out.println("You passed through the door");
			otherSideFrom(c.getCurrentRoom()).enter(c);
		} else
			System.out.println("Door is closed. You hurt your nose!");
	}
}