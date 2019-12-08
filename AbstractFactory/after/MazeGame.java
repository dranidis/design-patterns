public class MazeGame {
	private Character character = new Character();
	private Maze maze;

	public MazeGame(MazeFactory factory) {
		maze = createMaze(factory);
	}

	public void move(int direction) {
		character.move(direction);
	}

	public Maze createMaze(MazeFactory factory) {
		Maze maze = factory.makeMaze();

		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door door = factory.makeDoor(r1, r2);

		door.open();

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSide(Room.NORTH, factory.makeWall());
		r1.setSide(Room.EAST, door);
		r1.setSide(Room.SOUTH, factory.makeWall());
		r1.setSide(Room.WEST, factory.makeWall());

		r2.setSide(Room.NORTH, factory.makeWall());
		r2.setSide(Room.EAST, factory.makeWall());
		r2.setSide(Room.SOUTH, factory.makeWall());
		r2.setSide(Room.WEST, door);

		r1.enter(character);
		return maze;
	}

	public static void main(String arg[]) {
		// MazeGame game = new MazeGame (new MazeFactory()) ;
		MazeGame game = new MazeGame(new MagicMazeFactory());

		game.move(Room.NORTH);
		game.move(Room.EAST);
		game.move(Room.SOUTH);
		game.move(Room.WEST);

	}
}