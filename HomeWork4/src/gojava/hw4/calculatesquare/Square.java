package gojava.hw4.calculatesquare;


public class Square {
    public double squareTriangle(double side, double height) {
        return (side / 2) * height;
    }

    public double squareRectangle(double sideA, double sideB) {
        return sideA * sideB;
    }

    public double squareCircle(double radius) {
        double pi = 3.1415;
        return pi * (radius * radius);
    }
}
