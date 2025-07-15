package gr.aueb.cf.ch14;

public class PointMain {

    public static void main(String[] args) {

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomInstance(); // Οι static μέθοδοι ανήκουνε στην κλάση γι'αυτό καλούνται με το όνομα της κλάσης.

        CodingFactory cf1 = CodingFactory.getInstance();
        CodingFactory cf2 = CodingFactory.getInstance();
        CodingFactory cf3 = CodingFactory.getInstance();


        System.out.println("Point p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point p2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("cf1 == cf2: " + (cf1 == cf2));
        System.out.println("cf2 == cf3: " + (cf2 == cf3));
    }
}
