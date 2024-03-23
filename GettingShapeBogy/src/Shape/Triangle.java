package Shape;

public class Triangle implements GeometricFigure {
	Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean contains(Point p) {
        double alpha = ((b.y - c.y) * (p.x - c.x) + (c.x - b.x) * (p.y - c.y)) /
                ((b.y - c.y) * (a.x - c.x) + (c.x - b.x) * (a.y - c.y));
        double beta = ((c.y - a.y) * (p.x - c.x) + (a.x - c.x) * (p.y - c.y)) /
                ((b.y - c.y) * (a.x - c.x) + (c.x - b.x) * (a.y - c.y));
        double gamma = 1 - alpha - beta;

        return alpha > 0 && beta > 0 && gamma > 0;
    }

    @Override
	public double calculateArea() {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
    }
}
