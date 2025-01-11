public class PolygonAdapter implements Shape {
    ExtermalPolygon p;

    public PolygonAdapter(ExtermalPolygon p) {
        this.p = p;
    }

    @Override
    public double getArea() {
        return p.calcualateArea();
    }

    
}
