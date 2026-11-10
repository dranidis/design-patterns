public class GameFactory implements GameFactoryI {
	// Factory method
	public Wall createWall() {
		return new Wall();
	}

	// Factory method
	public Room createRoom(int i) {
		return new Room(i);
	}
}
