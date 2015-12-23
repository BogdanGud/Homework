package gojava.hw4.calculatesquare;


public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateSquare() {
        return sideA * sideB;
    }
}
