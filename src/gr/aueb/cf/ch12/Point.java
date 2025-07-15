package gr.aueb.cf.ch12;

public class Point {
    private int x;
    private int y;
    private static int numberOfpoints = 0; // Τα static πεδία ανήκουν στην κλάση και όχι στα instances.

    public Point() {
        numberOfpoints++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        numberOfpoints++;
    }

    public static int getNumberOfpoints() {
        return numberOfpoints;
    }

    public static void setNumberOfpoints(int numberOfpoints) {
        Point.numberOfpoints = numberOfpoints; // από static μόνο static . Δε μπορώ να αναφερθώ στα χ και y.
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}
