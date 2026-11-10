public class ChristmasRoom extends Room {
    public ChristmasRoom(int roomNo) {
        super(roomNo);
    }

    @Override
    public void enter(Character c) {
        super.enter(c);
        System.out.println("Merry Christmas! You feel a warm holiday spirit in room nr " + getRoomNumber() + ".");
    }

}
