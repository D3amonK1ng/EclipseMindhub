package Shape;

public class Circle implements GeometricFigure{
	Point center;
    int radius;
    
    public boolean contains(Point p) {
        double distance = Math.sqrt(Math.pow(p.x - center.x, 2) + Math.pow(p.y - center.y, 2));
        return distance <= radius;
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
	public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
