package gojava.hw4.calculatesquare;


public class Rectangle implements Squarable {
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
