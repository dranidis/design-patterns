public class MazeGame {
	private Character character = new Character();
	private Maze maze;

	public MazeGame() {
		maze = createMaze();
	}

	public void move(int direction) {
		character.move(direction);
	}

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

	public Maze createMaze() {
		Maze maze = makeMaze();

		Room r1 = makeRoom(1);
		Room r2 = makeRoom(2);
		Door door = makeDoor(r1, r2);

		door.open();

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSide(Room.NORTH, makeWall());
		r1.setSide(Room.EAST, door);
		r1.setSide(Room.SOUTH, makeWall());
		r1.setSide(Room.WEST, makeWall());

		r2.setSide(Room.NORTH, makeWall());
		r2.setSide(Room.EAST, makeWall());
		r2.setSide(Room.SOUTH, makeWall());
		r2.setSide(Room.WEST, door);

		r1.enter(character);
		return maze;
	}

	public static void main(String arg[]) {
		MazeGame game = new MazeGame();

		game.move(Room.NORTH);
		game.move(Room.EAST);
		game.move(Room.SOUTH);
		game.move(Room.WEST);

	}
}