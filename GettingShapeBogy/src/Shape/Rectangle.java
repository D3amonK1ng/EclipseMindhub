package Shape;

public class Rectangle implements GeometricFigure{
	Point lowerLeft, upperRight;

    public Rectangle(Point lowerLeft, Point upperRight) {
        this.lowerLeft = lowerLeft;
        this.upperRight = upperRight;
    }
    
    public boolean contains(Point p) {
        return p.x >= lowerLeft.x && p.x <= upperRight.x && p.y >= lowerLeft.y && p.y <= upperRight.y;
    }
    
    @Override
	public double calculateArea() {
        return Math.abs((upperRight.x - lowerLeft.x) * (upperRight.y - lowerLeft.y));
    }
}
