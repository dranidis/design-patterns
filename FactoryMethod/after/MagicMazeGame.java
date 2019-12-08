public class MagicMazeGame extends MazeGame {
	// REDEFINITION OF FACTORY METHODS
	public Room makeRoom(int r) {
		return new MagicRoom(r);
	}

	public static void main(String arg[]) {
		MagicMazeGame game = new MagicMazeGame();

		game.move(Room.NORTH);
		game.move(Room.EAST);
		game.move(Room.SOUTH);
		game.move(Room.WEST);

	}
}