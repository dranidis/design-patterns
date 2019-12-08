public class MagicMazeFactory extends MazeFactory {
	// REDEFINITION OF FACTORY METHODS
	public Room makeRoom(int r) {
		return new MagicRoom(r);
	}
}