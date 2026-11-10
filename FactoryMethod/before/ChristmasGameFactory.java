
public class ChristmasGameFactory implements GameFactoryI {
	public Wall createWall() {
		return new ChristmasWall();
	}

	// Factory method
	public Room createRoom(int i) {
		return new ChristmasRoom(i);
	}
}
