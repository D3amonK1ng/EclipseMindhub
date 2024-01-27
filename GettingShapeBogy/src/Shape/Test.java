package Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	class Point {
	    int x, y;

	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	}

	abstract class GeometricFigure {
	    abstract double calculateArea();
	}

	class Rectangle extends GeometricFigure {
	    Point lowerLeft, upperRight;

	    public Rectangle(Point lowerLeft, Point upperRight) {
	        this.lowerLeft = lowerLeft;
	        this.upperRight = upperRight;
	    }
	    
	    public boolean contains(Point p) {
	        return p.x >= lowerLeft.x && p.x <= upperRight.x && p.y >= lowerLeft.y && p.y <= upperRight.y;
	    }

	    @Override
	    double calculateArea() {
	        return Math.abs((upperRight.x - lowerLeft.x) * (upperRight.y - lowerLeft.y));
	    }
	}

	class Circle extends GeometricFigure {
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
	    double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}

	class Triangle extends GeometricFigure {
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
	    double calculateArea() {
	        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
	    }
	}

	class GeometricFigureContainer<T extends GeometricFigure> {
	    private List<T> figures;

	    public GeometricFigureContainer() {
	        figures = new ArrayList<>();
	    }

	    public void addFigure(T figure) {
	        figures.add(figure);
	    }

	    public T get(int index) {
	        return figures.get(index);
	    }

	    public List<T> getAllByArea(double area) {
	        List<T> result = new ArrayList<>();
	        for (T figure : figures) {
	            if (figure.calculateArea() == area) {
	                result.add(figure);
	            }
	        }
	        return result;
	    }

	    public double getTotalArea() {
	        double totalArea = 0;
	        for (T figure : figures) {
	            totalArea += figure.calculateArea();
	        }
	        return totalArea;
	    }

	    public List<T> getAllContaining(Point p) {
	        List<T> result = new ArrayList<>();
	        for (T figure : figures) {
	        }
	        return result;
	    }

	    public T getBiggest() {
	        if (figures.isEmpty()) {
	            return null;
	        }
	        T maxFigure = figures.get(0);
	        for (T figure : figures) {
	            if (figure.calculateArea() > maxFigure.calculateArea()) {
	                maxFigure = figure;
	            }
	        }
	        return maxFigure;
	    }

	    public T getSmallest() {
	        if (figures.isEmpty()) {
	            return null;
	        }
	        T minFigure = figures.get(0);
	        for (T figure : figures) {
	            if (figure.calculateArea() < minFigure.calculateArea()) {
	                minFigure = figure;
	            }
	        }
	        return minFigure;
	    }

	    public void orderDescending() {
	        Collections.sort(figures, (figure1, figure2) -> {

	            double area1 = figure1.calculateArea();
	            double area2 = figure2.calculateArea();
	            return Double.compare(area2, area1);
	        });
	    }
	}
}

