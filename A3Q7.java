class Point {
    private double x, y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate distance from another point
    public double getDistanceFrom(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

class SimplePolygon {
    protected Point[] points;

    // Constructor
    public SimplePolygon(Point[] points) {
        this.points = points;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        double perimeter = 0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            Point current = points[i];
            Point next = points[(i + 1) % n]; // last connects to first
            perimeter += current.getDistanceFrom(next);
        }
        return perimeter;
    }
}

class Triangle extends SimplePolygon {
    private boolean isEquilateral;

    // Constructor
    public Triangle(Point[] points, boolean isEquilateral) {
        super(points);
        this.isEquilateral = isEquilateral;
    }

    // Override getPerimeter
    @Override
    public double getPerimeter() {
        if (isEquilateral) {
            // Use distance between first and second point
            double sideLength = points[0].getDistanceFrom(points[1]);
            return 3 * sideLength;
        } else {
            // Use base class method
            return super.getPerimeter();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);

        Point[] trianglePoints = {p1, p2, p3};

        Triangle triangle1 = new Triangle(trianglePoints, false);  // Not equilateral
        Triangle triangle2 = new Triangle(trianglePoints, true);   // Equilateral (forced)

        System.out.println("Perimeter of triangle1 (non-equilateral): " + triangle1.getPerimeter());
        System.out.println("Perimeter of triangle2 (equilateral assumption): " + triangle2.getPerimeter());
    }
}
