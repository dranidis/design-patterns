public class MazeChristmasGame {


	public static void main(String arg[]) {
		MazeGame game = new MazeGame(
			new ChristmasGameFactory()
		);

		game.move(Room.NORTH);
		game.move(Room.EAST);
		game.move(Room.SOUTH);
		game.move(Room.WEST);

	}
}