package gr.aueb.cf.ch17.copy;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Copy Constructor
    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
