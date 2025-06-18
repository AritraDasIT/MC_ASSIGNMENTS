/* Develop an abstract class "GeometricObject" which has two variables "colour" and
"weight"; it would have a constructor function for setting the "colour" as "white"" and the
"weight" as 1.0 as default values. The class should have functions getColour) and getWeight(0 to return the colour and weight values to the caller. The class should have two
abstract methods, findArea) and findCircumference().
Write subclasses of "GeometricObject" called "Triangle", "Circle". Write the methods for
calculating area and circumference of a Triangle'" or a "Circle". */







abstract class GeometricObject {
    String color;
    double weight;

    GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public String getColour() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double findArea();
    public abstract double findCircumference();
}

class Circle extends GeometricObject {
    double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public double findCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends GeometricObject {
    private double a, b, c; // sides of triangle

    public Triangle(double a, double b, double c) {
        super(); // uses default colour and weight
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double findArea() {
        double s = (a + b + c) / 2.0; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    public double findCircumference() {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5.0);
        GeometricObject triangle = new Triangle(3, 4, 5);

        System.out.println("Circle:");
        System.out.println("Colour: " + circle.getColour());
        System.out.println("Weight: " + circle.getWeight());
        System.out.println("Area: " + circle.findArea());
        System.out.println("Circumference: " + circle.findCircumference());

        System.out.println("\nTriangle:");
        System.out.println("Colour: " + triangle.getColour());
        System.out.println("Weight: " + triangle.getWeight());
        System.out.println("Area: " + triangle.findArea());
        System.out.println("Circumference: " + triangle.findCircumference());
    }
}
