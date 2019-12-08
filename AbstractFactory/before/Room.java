public class Room implements MapSite {
	public static final int NORTH = 0;
	public static final int SOUTH = 1;
	public static final int WEST = 2;
	public static final int EAST = 3;

	private int roomNumber;
	private MapSite sides[] = new MapSite[4];

	public Room(int roomNo) {
		roomNumber = roomNo;
	}

	public void setSide(int direction, MapSite mapSite) {
		sides[direction] = mapSite;
	}

	public MapSite getSide(int direction) {
		return sides[direction];
	}

	public void enter(Character c) {
		c.setCurrentRoom(this);
		System.out.println("You entered room " + roomNumber);
	}
}