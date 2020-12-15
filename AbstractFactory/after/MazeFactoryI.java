public interface MazeFactoryI {
	public Maze makeMaze();
	public Room makeRoom(int r);
	public Door makeDoor(Room r1, Room r2);
	public Wall makeWall();
}