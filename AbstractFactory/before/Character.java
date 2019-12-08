public class Character {
	Room currentRoom;

	public void setCurrentRoom(Room room) {
		currentRoom = room;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void move(int direction) {
		currentRoom.getSide(direction).enter(this);
	}
}