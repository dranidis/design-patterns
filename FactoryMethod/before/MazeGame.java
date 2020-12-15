public class MazeGame {
	private Character character = new Character();
	private Maze maze;

	public MazeGame() {
		maze = createMaze();
	}

	public void move(int direction) {
		character.move(direction);
	}

	public Maze createMaze() {
		maze = new Maze();

		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Door door = new Door(r1, r2);

		door.open();

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSide(Room.NORTH, new Wall());
		r1.setSide(Room.EAST, door);
		r1.setSide(Room.SOUTH, new Wall());
		r1.setSide(Room.WEST, new Wall());

		r2.setSide(Room.NORTH, new Wall());
		r2.setSide(Room.EAST, new Wall());
		r2.setSide(Room.SOUTH, new Wall());
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