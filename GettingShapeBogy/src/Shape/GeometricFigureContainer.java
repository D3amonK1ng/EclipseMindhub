package Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeometricFigureContainer <T extends GeometricFigure>{
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
