package gojava.hw4.pointdistance;

public class Point {
    //declared as final
    public final int x1;
    public final int y1;

    Point(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    //added Getter
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }
}
