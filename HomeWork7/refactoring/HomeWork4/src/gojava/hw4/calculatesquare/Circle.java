package gojava.hw4.calculatesquare;


public class Circle implements Squarable {

    //added as  constant and renamed
    private static final double PI = 3.1415;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        /* removed unused code */
    }

    @Override
    public double calculateSquare() {
        return PI * (radius * radius);
    }

    //added Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
