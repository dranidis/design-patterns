public class Main {
	public static void main(String arg[]) {
		Rectangle rectangle = new Rectangle(2.0, 5.0);
		AreaPrinter ap = new AreaPrinter(rectangle);
		ap.printArea();

		// What about circles?
		// There is an existing class Circle which I want to use
		// since it already calculates the area but
		// It does not implement the Shape interface.
		// Circle class does not have a getArea method
		// (it has a computeArea method).
	}
}
