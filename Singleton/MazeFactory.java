public class MazeFactory {
	private static MazeFactory instance;

	protected MazeFactory() {
	}

	public static MazeFactory getInstance() {
		// run with java -Dmagic=y MazeGame
		if (instance == null) {
			// if ( System.getProperty("magic","no").equals("no") )
			instance = new MazeFactory();
			// else
			// instance = new MagicMazeFactory();

			// to set system properties run java with option -D<property>=<value> e.g.
			// java -Dfactory=MagicMazeFactory ...
			/*
			 * String className = System.getProperty("factory","MazeFactory"); try{ instance
			 * = (MazeFactory) Class.forName(className).newInstance(); } catch(Exception e)
			 * { e.printStackTrace(); System.exit(0); }
			 */
		}
		return instance;
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
}