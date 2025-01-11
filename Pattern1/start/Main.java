import xxxx.Polygon;

public class Main {
	public static void main(String arg[]) {
		Shape rectangle = new Rectangle(2.0, 5.0);
		AreaPrinter ap = new AreaPrinter(rectangle);
		ap.printArea();

		Shape square = new Square(3.0);
		AreaPrinter sqPrinter = new AreaPrinter(square);
		sqPrinter.printArea();

		ExtermalPolygon polygon = new ExtermalPolygon();
		Shape adapter = new PolygonAdapter(polygon);
		AreaPrinter polPrinter = new AreaPrinter(adapter);
		polPrinter.printArea();
	}
}
