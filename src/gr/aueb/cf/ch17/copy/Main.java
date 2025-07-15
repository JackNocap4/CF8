package gr.aueb.cf.ch17.copy;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(1, 2);

        Point copy = new Point(p);

        System.out.println("Point: (" + p.getX() + ", " + p.getY() + ")");
        System.out.println("Copy: (" + copy.getX() + ", " + copy.getY() + ")");
    }
}
