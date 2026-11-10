public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }


    public void assertArea(Rectangle r) {
        r.setLength(5);
        r.setWidth(4);
        if (r.area() == 20) {
            System.out.println("Area is correct: " + r.area());
        } else {
            System.out.println("Area is incorrect: " + r.area());
        }
    }

    public static void main(String[] args) {
        Square sq = new Square(5);
        sq.setLength(4);
        sq.setWidth(10);
        System.out.println("Square area: " + sq.area()); // Should be 4
        Square square = new Square(5);
        square.assertArea(square); // This should print "Area is correct: 25.0"
        Rectangle rectangle = new Rectangle(5, 4);
        square.assertArea(rectangle); // This should print "Area is correct: 20.

    }
}


