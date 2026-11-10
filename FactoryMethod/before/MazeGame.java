public class MazeGame {
	protected Character character = new Character();
	protected Maze maze;
	private GameFactoryI gf;

	public MazeGame(GameFactoryI gf) {
		this.gf = gf;
		maze = createMaze();
	}

    public void move(int direction) {
		character.move(direction);
	}

	public Maze createMaze() {
		maze = new Maze();

		Room r1 = gf.createRoom(1);
		Room r2 = gf.createRoom(2);
		Door door = new Door(r1, r2);

		door.open();

		maze.addRoom(r1);
		maze.addRoom(r2);

		Wall wall = gf.createWall();
		r1.setSide(Room.NORTH, wall);
		r1.setSide(Room.EAST, door);
		r1.setSide(Room.SOUTH, wall);
		r1.setSide(Room.WEST, wall);

		r2.setSide(Room.NORTH, wall);
		r2.setSide(Room.EAST, wall);
		r2.setSide(Room.SOUTH, wall);
		r2.setSide(Room.WEST, door);

		r1.enter(character);
		return maze;
	}

	public static void main(String arg[]) {
		MazeGame game = new MazeGame(new GameFactory());

		game.move(Room.NORTH);
		game.move(Room.EAST);
		game.move(Room.SOUTH);
		game.move(Room.WEST);

	}
}