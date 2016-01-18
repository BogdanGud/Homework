package gojava.hw4.calculatesquare;


public class Triangle implements Squarable {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double calculateSquare() {
        return (side / 2) * height;
    }

    //added Getter and Setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
