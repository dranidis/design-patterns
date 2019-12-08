public class AreaPrinter {
	private Shape shape;

	public AreaPrinter(Shape s) {
		shape = s;
	}

	public void printArea() {
		System.out.println("Shape area : " + shape.getArea());
	}
}
