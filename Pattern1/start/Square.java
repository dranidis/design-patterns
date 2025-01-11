public class Square implements Shape {
	private double width;

	public Square(double w) {
		width = w;
	}

	public double getArea() {
		return width * width;
	}
}
