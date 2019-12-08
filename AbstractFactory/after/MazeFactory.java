public class MazeFactory {
	// FACTORY METHODS with default implementations
	public Maze makeMaze() {
		return new Maze();
	}

	public Room makeRoom(int r) {
		return new Room(r);
	}

	public Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}

	public Wall makeWall() {
		return new Wall();
	}
}