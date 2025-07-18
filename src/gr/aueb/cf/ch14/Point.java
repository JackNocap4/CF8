package gr.aueb.cf.ch14;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Static Factory Method
    public static Point getInstance() {
        return new Point();
    }

    public static Point getRandomInstance() {
        Random random = new Random(System.nanoTime());
        return new Point(random.nextInt(10) + 1, random.nextInt(10) + 1);  //(10, 10)
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
