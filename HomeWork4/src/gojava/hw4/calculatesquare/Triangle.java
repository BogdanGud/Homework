package gojava.hw4.calculatesquare;


public class Triangle extends Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double calculateSquare() {
        return (side / 2) * height;
    }
}
