package gojava.hw4.calculatesquare;


public class Circle extends Shape {

    private double radius;
    private final double pi;

    public Circle(double radius) {
        this.radius = radius;
        pi = 3.1415;
    }

    @Override
    public double calculateSquare() {
        return pi * (radius * radius);
    }
}
