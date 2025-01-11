// Adapter  : CircleAdapter
// Adaptee	: Circle
// Target 	: Shape

public class CircleAdapter implements Shape {
	private Circle circle;

	public CircleAdapter(Circle c) {
		circle = c;
	}

	public double getArea() {
		return circle.computeArea();
	}
}